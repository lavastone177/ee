package cn.allay.api.block.interfaces.redconcrete;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockRedConcreteBehavior extends BlockBehavior {
    BlockType<BlockRedConcreteBehavior> RED_CONCRETE_TYPE = BlockTypeBuilder
            .builder(BlockRedConcreteBehavior.class)
            .vanillaBlock(VanillaBlockId.RED_CONCRETE)
            .build();
}