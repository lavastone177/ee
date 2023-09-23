package cn.allay.api.item.interfaces.brownmushroom;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBrownMushroomStack extends ItemStack {
    ItemType<ItemBrownMushroomStack> BROWN_MUSHROOM_TYPE = ItemTypeBuilder
            .builder(ItemBrownMushroomStack.class)
            .vanillaItem(VanillaItemId.BROWN_MUSHROOM)
            .build();
}