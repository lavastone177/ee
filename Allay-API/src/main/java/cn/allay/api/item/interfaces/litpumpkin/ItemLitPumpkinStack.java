package cn.allay.api.item.interfaces.litpumpkin;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemLitPumpkinStack extends ItemStack {
    ItemType<ItemLitPumpkinStack> LIT_PUMPKIN_TYPE = ItemTypeBuilder
            .builder(ItemLitPumpkinStack.class)
            .vanillaItem(VanillaItemId.LIT_PUMPKIN)
            .build();
}