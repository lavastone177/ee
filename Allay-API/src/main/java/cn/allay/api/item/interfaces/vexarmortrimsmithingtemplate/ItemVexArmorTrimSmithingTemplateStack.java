package cn.allay.api.item.interfaces.vexarmortrimsmithingtemplate;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemVexArmorTrimSmithingTemplateStack extends ItemStack {
    ItemType<ItemVexArmorTrimSmithingTemplateStack> VEX_ARMOR_TRIM_SMITHING_TEMPLATE_TYPE = ItemTypeBuilder
            .builder(ItemVexArmorTrimSmithingTemplateStack.class)
            .vanillaItem(VanillaItemId.VEX_ARMOR_TRIM_SMITHING_TEMPLATE)
            .build();
}