package cn.allay.api.item.interfaces.sprucebutton;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemSpruceButtonStack extends ItemStack {
    ItemType<ItemSpruceButtonStack> SPRUCE_BUTTON_TYPE = ItemTypeBuilder
            .builder(ItemSpruceButtonStack.class)
            .vanillaItem(VanillaItemId.SPRUCE_BUTTON)
            .build();
}