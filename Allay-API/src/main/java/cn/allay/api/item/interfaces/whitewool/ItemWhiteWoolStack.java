package cn.allay.api.item.interfaces.whitewool;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWhiteWoolStack extends ItemStack {
    ItemType<ItemWhiteWoolStack> WHITE_WOOL_TYPE = ItemTypeBuilder
            .builder(ItemWhiteWoolStack.class)
            .vanillaItem(VanillaItemId.WHITE_WOOL)
            .build();
}