package cn.allay.item.impl;

import cn.allay.item.ItemStack;
import cn.allay.item.data.VanillaItemId;
import cn.allay.item.type.ItemType;
import cn.allay.item.type.ItemTypeBuilder;
import cn.allay.item.type.ItemTypeRegistry;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPiglinBannerPattern extends ItemStack {
    ItemType<ItemPiglinBannerPattern> TYPE = ItemTypeBuilder
            .builder(ItemPiglinBannerPattern.class)
            .vanillaItem(VanillaItemId.PIGLIN_BANNER_PATTERN, true)
            .addBasicComponents()
            .build().register(ItemTypeRegistry.getRegistry());
}