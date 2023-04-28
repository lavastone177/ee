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
public interface BlockStoneBlockSlab2 extends Block {
    BlockType<BlockStoneBlockSlab2> TYPE = BlockTypeBuilder
            .builder(BlockStoneBlockSlab2.class)
            .vanillaBlock(VanillaBlockId.STONE_BLOCK_SLAB2)
            .property(VanillaBlockPropertyTypes.STONE_SLAB_TYPE_2,
                    VanillaBlockPropertyTypes.TOP_SLOT_BIT)
            .build();
}