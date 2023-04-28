package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockYellowFlower extends Block {
    BlockType<BlockYellowFlower> TYPE = BlockTypeBuilder
            .builder(BlockYellowFlower.class)
            .vanillaBlock(VanillaBlockId.YELLOW_FLOWER)
            .build();
}