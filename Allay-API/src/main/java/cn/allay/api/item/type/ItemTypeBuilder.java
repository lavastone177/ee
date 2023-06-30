package cn.allay.api.item.type;

import cn.allay.api.ApiInstanceHolder;
import cn.allay.api.component.interfaces.ComponentProvider;
import cn.allay.api.data.VanillaItemId;
import cn.allay.api.identifier.Identifier;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.component.ItemComponentImpl;

import java.util.List;

/**
 * Allay Project 2023/5/19
 *
 * @author daoge_cmd
 */
public interface ItemTypeBuilder<T extends ItemStack> {
    ApiInstanceHolder<ItemTypeBuilderFactory> FACTORY = ApiInstanceHolder.of();

    static <T extends ItemStack> ItemTypeBuilder<T> builder(Class<T> clazz) {
        return FACTORY.get().create(clazz);
    }

    ItemTypeBuilder<T> namespace(Identifier identifier);

    ItemTypeBuilder<T> namespace(String identifier);

    ItemTypeBuilder<T> vanillaItem(VanillaItemId vanillaItemId);

    ItemTypeBuilder<T> vanillaItem(VanillaItemId vanillaItemId, boolean initVanillaItemAttributeComponent);

    ItemTypeBuilder<T> setComponents(List<ComponentProvider<? extends ItemComponentImpl>> componentProviders);

    ItemTypeBuilder<T> addComponents(List<ComponentProvider<? extends ItemComponentImpl>> componentProviders);

    ItemTypeBuilder<T> addComponent(ComponentProvider<? extends ItemComponentImpl> componentProvider);

    ItemTypeBuilder<T> addBasicComponents();

    ItemType<T> build();

    interface ItemTypeBuilderFactory {
        <T extends ItemStack> ItemTypeBuilder<T> create(Class<T> clazz);
    }
}
