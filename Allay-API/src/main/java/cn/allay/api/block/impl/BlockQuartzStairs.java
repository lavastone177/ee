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
public interface BlockQuartzStairs extends Block {
    BlockType<BlockQuartzStairs> TYPE = BlockTypeBuilder
            .builder(BlockQuartzStairs.class)
            .vanillaBlock(VanillaBlockId.QUARTZ_STAIRS, true)
            .withProperties(VanillaBlockPropertyTypes.UPSIDE_DOWN_BIT,
                    VanillaBlockPropertyTypes.WEIRDO_DIRECTION)
            .addBasicComponents()
            .build();
}
