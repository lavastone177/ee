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
public interface BlockChest extends Block {
    BlockType<BlockChest> TYPE = BlockTypeBuilder
            .builder(BlockChest.class)
            .vanillaBlock(VanillaBlockId.CHEST)
            .property(VanillaBlockPropertyTypes.FACING_DIRECTION)
            .build();
}