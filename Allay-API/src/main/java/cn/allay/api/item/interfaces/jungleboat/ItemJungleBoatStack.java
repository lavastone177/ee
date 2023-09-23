package cn.allay.api.item.interfaces.jungleboat;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemJungleBoatStack extends ItemStack {
    ItemType<ItemJungleBoatStack> JUNGLE_BOAT_TYPE = ItemTypeBuilder
            .builder(ItemJungleBoatStack.class)
            .vanillaItem(VanillaItemId.JUNGLE_BOAT)
            .build();
}