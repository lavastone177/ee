package cn.allay.api.block.interfaces.element58;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement58Behavior extends BlockBehavior {
    BlockType<BlockElement58Behavior> ELEMENT_58_TYPE = BlockTypeBuilder
            .builder(BlockElement58Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_58)
            .build();
}