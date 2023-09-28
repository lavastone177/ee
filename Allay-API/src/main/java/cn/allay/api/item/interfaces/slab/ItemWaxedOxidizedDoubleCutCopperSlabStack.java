package cn.allay.api.item.interfaces.slab;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWaxedOxidizedDoubleCutCopperSlabStack extends ItemStack {
  ItemType<ItemWaxedOxidizedDoubleCutCopperSlabStack> WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB_TYPE = ItemTypeBuilder
          .builder(ItemWaxedOxidizedDoubleCutCopperSlabStack.class)
          .vanillaItem(VanillaItemId.WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB)
          .build();
}