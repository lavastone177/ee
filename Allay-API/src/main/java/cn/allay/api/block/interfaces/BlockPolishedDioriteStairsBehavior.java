package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.component.attribute.BlockAttributeComponentImpl;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;
import cn.allay.api.math.voxelshape.CommonShapes;

import java.util.function.Supplier;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockPolishedDioriteStairsBehavior extends BlockBehavior {
    BlockType<BlockPolishedDioriteStairsBehavior> POLISHED_DIORITE_STAIRS_TYPE = BlockTypeBuilder
            .builder(BlockPolishedDioriteStairsBehavior.class)
            .vanillaBlock(VanillaBlockId.POLISHED_DIORITE_STAIRS)
            .setProperties(VanillaBlockPropertyTypes.UPSIDE_DOWN_BIT, VanillaBlockPropertyTypes.WEIRDO_DIRECTION).addComponent(BlockAttributeComponentImpl.ofRedefinedAABB(CommonShapes::buildStairShape)).build();
}