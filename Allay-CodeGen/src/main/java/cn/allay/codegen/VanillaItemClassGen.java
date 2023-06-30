package cn.allay.codegen;

import cn.allay.dependence.VanillaItemId;
import com.squareup.javapoet.*;
import lombok.SneakyThrows;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Allay Project 2023/5/20
 *
 * @author daoge_cmd
 */
public class VanillaItemClassGen {

    public static final ClassName ITEM_CLASS_NAME = ClassName.get("cn.allay.api.item", "ItemStack");
    public static final ClassName VANILLA_ITEM_ID_CLASS_NAME = ClassName.get("cn.allay.api.data", "VanillaItemId");
    public static final ClassName ITEM_TYPE_CLASS_NAME = ClassName.get("cn.allay.api.item.type", "ItemType");
    public static final ClassName ITEM_TYPE_BUILDER_CLASS_NAME = ClassName.get("cn.allay.api.item.type", "ItemTypeBuilder");
    public static Path FILE_OUTPUT_PATH_BASE = Path.of("Allay-API/src/main/java/cn/allay/api/item/impl");

    private static final TypeSpec.Builder TYPES_CLASS = TypeSpec.interfaceBuilder("VanillaItemTypes")
            .addModifiers(Modifier.PUBLIC)
            .addJavadoc(
                    "@author daoge_cmd <br>\n" +
                    "Allay Project <br>\n");

    public static void main(String[] args) {
        generate();
    }

    @SneakyThrows
    public static void generate() {
        if (!Files.exists(FILE_OUTPUT_PATH_BASE)) Files.createDirectories(FILE_OUTPUT_PATH_BASE);
        for (var item : VanillaItemId.values()) {
            var typeName = item.getIdentifier().path().replace(".", "_");
            var className = item == VanillaItemId.NETHERBRICK ? "ItemNetherbrick0" : "Item" + Utils.convertToPascalCase(typeName);
            var path = FILE_OUTPUT_PATH_BASE.resolve(className + ".java");
            if (!Files.exists(path)) {
                System.out.println("Generating " + className + ".java ...");
                generateItemClass(item, className, path);
            }
            generateItemType(item, className);
            var typesJavaFile = JavaFile
                    .builder("cn.allay.api.item.type", TYPES_CLASS.build())
                    .build();
            Files.writeString(Path.of("Allay-API/src/main/java/cn/allay/api/item/type/VanillaItemTypes.java"), typesJavaFile.toString());
        }
    }

    private static void generateItemType(VanillaItemId vanillaItemId, String classNameStr) {
        var className = ClassName.get("cn.allay.api.item.impl", classNameStr);
        var initializer = CodeBlock.builder();
        initializer
                .add("$T\n        .builder($T.class)\n", ITEM_TYPE_BUILDER_CLASS_NAME, className)
                .add("        .vanillaItem($T.$N, true)\n", VANILLA_ITEM_ID_CLASS_NAME, vanillaItemId.name())
                .add("        .addBasicComponents()\n")
                .add("        .build()");
        TYPES_CLASS.addField(
                FieldSpec
                        .builder(ParameterizedTypeName.get(ITEM_TYPE_CLASS_NAME, className), vanillaItemId.name() + "_TYPE")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                        .initializer(initializer.build())
                        .build());
    }

    private static void generateItemClass(VanillaItemId vanillaItemId, String className, Path path) throws IOException {
        TypeSpec.Builder codeBuilder = TypeSpec.interfaceBuilder(className)
                .addSuperinterface(ITEM_CLASS_NAME)
                .addJavadoc(
                        "@author daoge_cmd <br>\n" +
                        "Allay Project <br>\n")
                .addModifiers(Modifier.PUBLIC);
        var javaFile = JavaFile.builder("cn.allay.api.item.impl", codeBuilder.build()).build();
        Files.writeString(path, javaFile.toString());
    }
}
