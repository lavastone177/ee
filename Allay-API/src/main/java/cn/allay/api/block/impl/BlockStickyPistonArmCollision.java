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
public interface BlockStickyPistonArmCollision extends Block {
    BlockType<BlockStickyPistonArmCollision> TYPE = BlockTypeBuilder
            .builder(BlockStickyPistonArmCollision.class)
            .vanillaBlock(VanillaBlockId.STICKY_PISTON_ARM_COLLISION, true)
            .withProperties(VanillaBlockPropertyTypes.FACING_DIRECTION)
            .addBasicComponents()
            .build();
}
