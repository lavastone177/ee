package cn.allay.api.block.interfaces.element27;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement27Behavior extends BlockBehavior {
    BlockType<BlockElement27Behavior> ELEMENT_27_TYPE = BlockTypeBuilder
            .builder(BlockElement27Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_27)
            .build();
}