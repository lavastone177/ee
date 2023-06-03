package cn.allay.api.block.impl;

import cn.allay.api.block.Block;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * Author: daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockBedrock extends Block {
    BlockType<BlockBedrock> TYPE = BlockTypeBuilder
            .builder(BlockBedrock.class)
            .vanillaBlock(VanillaBlockId.BEDROCK, true)
            .withProperties(VanillaBlockPropertyTypes.INFINIBURN_BIT)
            .addBasicComponents()
            .build();
}
