package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.property.vanilla.VanillaBlockPropertyTypes;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockBrownMushroomBlock extends Block {
    BlockType<BlockBrownMushroomBlock> TYPE = BlockTypeBuilder
            .builder(BlockBrownMushroomBlock.class)
            .vanillaBlock(VanillaBlockId.BROWN_MUSHROOM_BLOCK)
            .property(VanillaBlockPropertyTypes.HUGE_MUSHROOM_BITS)
            .build();
}