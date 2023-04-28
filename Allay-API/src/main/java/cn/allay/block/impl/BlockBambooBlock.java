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
public interface BlockBambooBlock extends Block {
    BlockType<BlockBambooBlock> TYPE = BlockTypeBuilder
            .builder(BlockBambooBlock.class)
            .vanillaBlock(VanillaBlockId.BAMBOO_BLOCK)
            .property(VanillaBlockPropertyTypes.PILLAR_AXIS)
            .build();
}