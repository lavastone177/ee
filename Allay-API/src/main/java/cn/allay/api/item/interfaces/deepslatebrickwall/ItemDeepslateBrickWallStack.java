package cn.allay.api.item.interfaces.deepslatebrickwall;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemDeepslateBrickWallStack extends ItemStack {
    ItemType<ItemDeepslateBrickWallStack> DEEPSLATE_BRICK_WALL_TYPE = ItemTypeBuilder
            .builder(ItemDeepslateBrickWallStack.class)
            .vanillaItem(VanillaItemId.DEEPSLATE_BRICK_WALL)
            .build();
}