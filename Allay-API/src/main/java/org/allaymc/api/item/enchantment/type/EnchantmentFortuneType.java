package org.allaymc.api.item.enchantment.type;

import org.allaymc.api.identifier.Identifier;
import org.allaymc.api.item.enchantment.Rarity;
import org.allaymc.api.item.enchantment.AbstractEnchantmentType;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public class EnchantmentFortuneType extends AbstractEnchantmentType {
    public static final EnchantmentFortuneType FORTUNE_TYPE = new EnchantmentFortuneType();
  private EnchantmentFortuneType() {
    super(new Identifier("minecraft:fortune"), 18, 3, Rarity.RARE);
  }
}