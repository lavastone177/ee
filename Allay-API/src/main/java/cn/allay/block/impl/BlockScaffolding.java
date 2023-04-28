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
public interface BlockScaffolding extends Block {
    BlockType<BlockScaffolding> TYPE = BlockTypeBuilder
            .builder(BlockScaffolding.class)
            .vanillaBlock(VanillaBlockId.SCAFFOLDING)
            .property(VanillaBlockPropertyTypes.STABILITY,
                    VanillaBlockPropertyTypes.STABILITY_CHECK)
            .build();
}