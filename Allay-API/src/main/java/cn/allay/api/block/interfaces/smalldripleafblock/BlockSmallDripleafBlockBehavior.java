package cn.allay.api.block.interfaces.smalldripleafblock;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockSmallDripleafBlockBehavior extends BlockBehavior {
    BlockType<BlockSmallDripleafBlockBehavior> SMALL_DRIPLEAF_BLOCK_TYPE = BlockTypeBuilder
            .builder(BlockSmallDripleafBlockBehavior.class)
            .vanillaBlock(VanillaBlockId.SMALL_DRIPLEAF_BLOCK)
            .setProperties(VanillaBlockPropertyTypes.DIRECTION, VanillaBlockPropertyTypes.UPPER_BLOCK_BIT)
            .build();
}