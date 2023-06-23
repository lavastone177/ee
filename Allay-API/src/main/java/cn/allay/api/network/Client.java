package cn.allay.api.network;

import org.cloudburstmc.protocol.bedrock.packet.BedrockPacket;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacketHandler;

/**
 * @author daoge_cmd
 * @date 2023/6/23
 * Allay Project
 * <br>
 * 描述一个玩家客户端，玩家客户端可以持有一个EntityHuman并操控它
 */
public interface Client extends BedrockPacketHandler {
    NetworkProcessor getNetworkProcessor();

    void sendPacket(BedrockPacket packet);

    void sendPacketImmediately(BedrockPacket packet);

    void disconnect(String reason);

    void disconnect(String reason, boolean hideReason);
}
