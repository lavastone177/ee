package cn.allay.api.item.interfaces.mudbrickstairs;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.component.base.ItemBaseComponentImpl;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMudBrickStairsStack extends ItemStack {
    ItemType<ItemMudBrickStairsStack> MUD_BRICK_STAIRS_TYPE = ItemTypeBuilder
            .builder(ItemMudBrickStairsStack.class)
            .vanillaItem(VanillaItemId.MUD_BRICK_STAIRS)
            .addComponent(ItemBaseComponentImpl::new, ItemBaseComponentImpl.class)
            .build();
}