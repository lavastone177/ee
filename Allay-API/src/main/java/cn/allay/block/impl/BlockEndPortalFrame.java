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
public interface BlockEndPortalFrame extends Block {
    BlockType<BlockEndPortalFrame> TYPE = BlockTypeBuilder
            .builder(BlockEndPortalFrame.class)
            .vanillaBlock(VanillaBlockId.END_PORTAL_FRAME)
            .property(VanillaBlockPropertyTypes.DIRECTION,
                    VanillaBlockPropertyTypes.END_PORTAL_EYE_BIT)
            .build();
}