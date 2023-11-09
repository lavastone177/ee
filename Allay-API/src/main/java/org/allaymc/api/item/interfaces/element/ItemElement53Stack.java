package org.allaymc.api.item.interfaces.element;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement53Stack extends ItemStack {
  ItemType<ItemElement53Stack> ELEMENT_53_TYPE = ItemTypeBuilder
          .builder(ItemElement53Stack.class)
          .vanillaItem(VanillaItemId.ELEMENT_53)
          .build();
}