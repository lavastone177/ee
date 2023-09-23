package cn.allay.api.item.interfaces.strippedcrimsonhyphae;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemStrippedCrimsonHyphaeStack extends ItemStack {
    ItemType<ItemStrippedCrimsonHyphaeStack> STRIPPED_CRIMSON_HYPHAE_TYPE = ItemTypeBuilder
            .builder(ItemStrippedCrimsonHyphaeStack.class)
            .vanillaItem(VanillaItemId.STRIPPED_CRIMSON_HYPHAE)
            .build();
}