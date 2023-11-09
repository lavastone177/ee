package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemLeatherHorseArmorStack extends ItemStack {
  ItemType<ItemLeatherHorseArmorStack> LEATHER_HORSE_ARMOR_TYPE = ItemTypeBuilder
          .builder(ItemLeatherHorseArmorStack.class)
          .vanillaItem(VanillaItemId.LEATHER_HORSE_ARMOR)
          .build();
}