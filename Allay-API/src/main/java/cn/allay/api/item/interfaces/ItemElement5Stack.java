package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement5Stack extends ItemStack {
    ItemType<ItemElement5Stack> ELEMENT_5_TYPE = ItemTypeBuilder
            .builder(ItemElement5Stack.class)
            .vanillaItem(VanillaItemId.ELEMENT_5)
            .build();
}