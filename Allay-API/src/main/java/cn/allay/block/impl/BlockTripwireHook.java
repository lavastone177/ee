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
public interface BlockTripwireHook extends Block {
    BlockType<BlockTripwireHook> TYPE = BlockTypeBuilder
            .builder(BlockTripwireHook.class)
            .vanillaBlock(VanillaBlockId.TRIPWIRE_HOOK)
            .property(VanillaBlockPropertyTypes.ATTACHED_BIT,
                    VanillaBlockPropertyTypes.DIRECTION,
                    VanillaBlockPropertyTypes.POWERED_BIT)
            .build();
}