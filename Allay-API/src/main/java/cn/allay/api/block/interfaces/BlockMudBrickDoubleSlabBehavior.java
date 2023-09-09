package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockMudBrickDoubleSlabBehavior extends BlockBehavior {
    BlockType<BlockMudBrickDoubleSlabBehavior> MUD_BRICK_DOUBLE_SLAB_TYPE = BlockTypeBuilder
            .builder(BlockMudBrickDoubleSlabBehavior.class)
            .vanillaBlock(VanillaBlockId.MUD_BRICK_DOUBLE_SLAB)
            .setProperties(VanillaBlockPropertyTypes.TOP_SLOT_BIT)
            .build();
}