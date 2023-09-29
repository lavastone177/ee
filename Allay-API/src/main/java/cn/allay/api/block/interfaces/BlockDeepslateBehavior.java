package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockDeepslateBehavior extends BlockBehavior {
  BlockType<BlockDeepslateBehavior> DEEPSLATE_TYPE = BlockTypeBuilder
          .builder(BlockDeepslateBehavior.class)
          .vanillaBlock(VanillaBlockId.DEEPSLATE)
          .setProperties(VanillaBlockPropertyTypes.PILLAR_AXIS)
          .build();
}