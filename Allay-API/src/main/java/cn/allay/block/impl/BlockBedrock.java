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
public interface BlockBedrock extends Block {
    BlockType<BlockBedrock> TYPE = BlockTypeBuilder
            .builder(BlockBedrock.class)
            .vanillaBlock(VanillaBlockId.BEDROCK)
            .property(VanillaBlockPropertyTypes.INFINIBURN_BIT)
            .build();
}