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
public interface BlockHayBlock extends Block {
    BlockType<BlockHayBlock> TYPE = BlockTypeBuilder
            .builder(BlockHayBlock.class)
            .vanillaBlock(VanillaBlockId.HAY_BLOCK, true)
            .withProperties(VanillaBlockPropertyTypes.DEPRECATED,
                    VanillaBlockPropertyTypes.PILLAR_AXIS)
            .addBasicComponents()
            .build();
}
