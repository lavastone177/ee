package cn.allay.api.block.impl;

import cn.allay.api.block.Block;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * Author: daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement38 extends Block {
    BlockType<BlockElement38> TYPE = BlockTypeBuilder
            .builder(BlockElement38.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_38, true)
            .addBasicComponents()
            .build();
}
