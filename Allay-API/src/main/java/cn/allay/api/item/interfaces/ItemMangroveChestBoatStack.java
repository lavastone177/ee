package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMangroveChestBoatStack extends ItemStack {
    ItemType<ItemMangroveChestBoatStack> MANGROVE_CHEST_BOAT_TYPE = ItemTypeBuilder
            .builder(ItemMangroveChestBoatStack.class)
            .vanillaItem(VanillaItemId.MANGROVE_CHEST_BOAT)
            .build();
}