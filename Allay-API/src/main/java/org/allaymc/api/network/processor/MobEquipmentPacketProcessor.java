package org.allaymc.api.network.processor;

import org.allaymc.api.entity.interfaces.player.EntityPlayer;
import org.allaymc.api.network.DataPacketProcessor;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacketType;
import org.cloudburstmc.protocol.bedrock.packet.MobEquipmentPacket;

/**
 * Allay Project 11/22/2023
 *
 * @author Cool_Loong
 */
public class MobEquipmentPacketProcessor extends DataPacketProcessor<MobEquipmentPacket> {
    @Override
    public void handle(EntityPlayer player, MobEquipmentPacket pk) {
        var handSlot = pk.getHotbarSlot();
        player.setHandSlot(handSlot);
    }

    @Override
    public BedrockPacketType getPacketType() {
        return BedrockPacketType.MOB_EQUIPMENT;
    }
}
