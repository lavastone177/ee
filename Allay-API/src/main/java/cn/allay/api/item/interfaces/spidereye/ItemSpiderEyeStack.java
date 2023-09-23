package cn.allay.api.item.interfaces.spidereye;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemSpiderEyeStack extends ItemStack {
    ItemType<ItemSpiderEyeStack> SPIDER_EYE_TYPE = ItemTypeBuilder
            .builder(ItemSpiderEyeStack.class)
            .vanillaItem(VanillaItemId.SPIDER_EYE)
            .build();
}