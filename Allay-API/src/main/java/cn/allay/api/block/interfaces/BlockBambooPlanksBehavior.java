package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockBambooPlanksBehavior extends BlockBehavior {
    BlockType<BlockBambooPlanksBehavior> BAMBOO_PLANKS_TYPE = BlockTypeBuilder
            .builder(BlockBambooPlanksBehavior.class)
            .vanillaBlock(VanillaBlockId.BAMBOO_PLANKS)
            .build();
}