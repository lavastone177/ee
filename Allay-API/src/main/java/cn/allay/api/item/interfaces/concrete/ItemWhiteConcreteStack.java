package cn.allay.api.item.interfaces.concrete;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWhiteConcreteStack extends ItemStack {
  ItemType<ItemWhiteConcreteStack> WHITE_CONCRETE_TYPE = ItemTypeBuilder
          .builder(ItemWhiteConcreteStack.class)
          .vanillaItem(VanillaItemId.WHITE_CONCRETE)
          .build();
}