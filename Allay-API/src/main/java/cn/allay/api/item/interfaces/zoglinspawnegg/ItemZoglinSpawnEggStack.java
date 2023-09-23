package cn.allay.api.item.interfaces.zoglinspawnegg;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemZoglinSpawnEggStack extends ItemStack {
    ItemType<ItemZoglinSpawnEggStack> ZOGLIN_SPAWN_EGG_TYPE = ItemTypeBuilder
            .builder(ItemZoglinSpawnEggStack.class)
            .vanillaItem(VanillaItemId.ZOGLIN_SPAWN_EGG)
            .build();
}