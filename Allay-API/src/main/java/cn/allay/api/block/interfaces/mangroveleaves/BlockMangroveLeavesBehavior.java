package cn.allay.api.block.interfaces.mangroveleaves;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockMangroveLeavesBehavior extends BlockBehavior {
    BlockType<BlockMangroveLeavesBehavior> MANGROVE_LEAVES_TYPE = BlockTypeBuilder
            .builder(BlockMangroveLeavesBehavior.class)
            .vanillaBlock(VanillaBlockId.MANGROVE_LEAVES)
            .setProperties(VanillaBlockPropertyTypes.PERSISTENT_BIT, VanillaBlockPropertyTypes.UPDATE_BIT)
            .build();
}