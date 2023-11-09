package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockOchreFroglightBehavior extends BlockBehavior {
  BlockType<BlockOchreFroglightBehavior> OCHRE_FROGLIGHT_TYPE = BlockTypeBuilder
          .builder(BlockOchreFroglightBehavior.class)
          .vanillaBlock(VanillaBlockId.OCHRE_FROGLIGHT)
          .setProperties(VanillaBlockPropertyTypes.PILLAR_AXIS)
          .build();
}