package org.allaymc.api.item.interfaces.copper;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWaxedExposedChiseledCopperStack extends ItemStack {
  ItemType<ItemWaxedExposedChiseledCopperStack> WAXED_EXPOSED_CHISELED_COPPER_TYPE = ItemTypeBuilder
          .builder(ItemWaxedExposedChiseledCopperStack.class)
          .vanillaItem(VanillaItemId.WAXED_EXPOSED_CHISELED_COPPER)
          .build();
}