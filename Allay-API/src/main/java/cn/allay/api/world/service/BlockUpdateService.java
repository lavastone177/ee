package cn.allay.api.world.service;

import cn.allay.api.block.data.BlockFace;
import org.joml.Vector3ic;

import java.time.Duration;

public interface BlockUpdateService {
    void tick(long tick);

    void scheduleBlockUpdate(Vector3ic pos, Duration duration);

    void neighborBlockUpdate(Vector3ic pos, Vector3ic changedNeighbour, BlockFace blockFace);
}
