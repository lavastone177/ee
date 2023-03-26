package cn.allay.block.component;

import cn.allay.block.data.ToolType;
import cn.allay.identifier.Identifier;
import cn.allay.math.aabb.AxisAlignedBBRO;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Author: daoge_cmd <br>
 * Date: 2023/3/25 <br>
 * Allay Project <br>
 */
@Builder
@Getter
@Accessors(fluent = true)
public class BlockDataComponentImpl implements BlockDataComponent, BlockComponentImpl {

    protected static final Identifier IDENTIFIER = new Identifier("minecraft:block_data");

    @Builder.Default protected boolean fallable = false;
    @Builder.Default protected float friction = 0.6f;
    @Builder.Default protected float hardness = 1;
    @Builder.Default protected float resistance = 15;
    @Builder.Default protected boolean solid = true;
    @Builder.Default protected boolean pushesOutItems = true;
    @Builder.Default protected float translucency = 0;
    @Builder.Default protected int burnChance = 0;
    @Builder.Default protected int burnAbility = 0;
    @SerializedName("filterLight")
    @Builder.Default protected int lightFilterFactor = 15;
    @Builder.Default protected boolean experimental = false;
    @Builder.Default protected boolean flammable = false;
    @Builder.Default protected boolean replaceable = false;
    @SerializedName("emitLight")
    @Builder.Default protected int emitLightFactor = 0;
    @Builder.Default protected boolean diggable = true;
    @Builder.Default protected boolean powerSource = false;
    @SerializedName("breakFalling")
    @Builder.Default protected boolean canBreakFallingBlock = false;
    @SerializedName("blockWater")
    @Builder.Default protected boolean canBlockWater = true;
    @Builder.Default protected boolean canBeSilkTouched = true;
    @Builder.Default protected boolean blockSolid = true;
    @SerializedName("blockMotion")
    @Builder.Default protected boolean canBeMovingBlock = true;
    @Builder.Default protected boolean comparatorSignal = false;
    @Builder.Default protected boolean pushUpFalling = false;
    @Builder.Default protected boolean waterlogFlowing = false;
    @Builder.Default  protected boolean waterlogSolid = false;
    @Builder.Default protected int color = 0;
    @SerializedName("aabb")
    @Builder.Default protected AxisAlignedBBRO axisAlignedBB = AxisAlignedBBRO.of(0, 0, 0, 1, 1, 1);
    @Builder.Default protected ToolType targetTool = ToolType.NONE;

    @Override
    public Identifier getNamespaceId() {
        return IDENTIFIER;
    }
}
