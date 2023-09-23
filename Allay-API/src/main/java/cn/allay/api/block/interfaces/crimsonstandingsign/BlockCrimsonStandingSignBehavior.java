package cn.allay.api.block.interfaces.crimsonstandingsign;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockCrimsonStandingSignBehavior extends BlockBehavior {
    BlockType<BlockCrimsonStandingSignBehavior> CRIMSON_STANDING_SIGN_TYPE = BlockTypeBuilder
            .builder(BlockCrimsonStandingSignBehavior.class)
            .vanillaBlock(VanillaBlockId.CRIMSON_STANDING_SIGN)
            .setProperties(VanillaBlockPropertyTypes.GROUND_SIGN_DIRECTION)
            .build();
}