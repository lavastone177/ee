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
public interface BlockStainedGlassPane extends Block {
    BlockType<BlockStainedGlassPane> TYPE = BlockTypeBuilder
            .builder(BlockStainedGlassPane.class)
            .vanillaBlock(VanillaBlockId.STAINED_GLASS_PANE)
            .property(VanillaBlockPropertyTypes.COLOR)
            .build();
}