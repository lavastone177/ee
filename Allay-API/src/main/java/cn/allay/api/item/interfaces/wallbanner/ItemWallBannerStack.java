package cn.allay.api.item.interfaces.wallbanner;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWallBannerStack extends ItemStack {
    ItemType<ItemWallBannerStack> WALL_BANNER_TYPE = ItemTypeBuilder
            .builder(ItemWallBannerStack.class)
            .vanillaItem(VanillaItemId.WALL_BANNER)
            .build();
}