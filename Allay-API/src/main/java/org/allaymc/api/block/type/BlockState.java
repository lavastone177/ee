package org.allaymc.api.block.type;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.component.attribute.BlockAttributes;
import org.allaymc.api.block.property.type.BlockPropertyType;
import org.allaymc.api.item.ItemStack;
import org.cloudburstmc.nbt.NbtMap;
import org.cloudburstmc.protocol.bedrock.data.definitions.BlockDefinition;
import org.cloudburstmc.protocol.bedrock.data.definitions.SimpleBlockDefinition;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.List;
import java.util.Map;

/**
 * Allay Project 2023/4/29
 *
 * @author daoge_cmd
 */
public interface BlockState {

    int VERSION = (1 << 24) | //major
                  (20 << 16) | //minor
                  (40 << 8) | //patch
                  (3); //revision

    BlockType<?> getBlockType();

    int blockStateHash();

    long specialValue();

    @UnmodifiableView
    Map<BlockPropertyType<?>, BlockPropertyType.BlockPropertyValue<?, ?, ?>> getPropertyValues();

    <DATATYPE, PROPERTY extends BlockPropertyType<DATATYPE>> DATATYPE getPropertyValue(PROPERTY property);

    BlockState setProperty(BlockPropertyType.BlockPropertyValue<?, ?, ?> propertyValue);

    <DATATYPE, PROPERTY extends BlockPropertyType<DATATYPE>> BlockState setProperty(PROPERTY property, DATATYPE value);

    BlockState setProperties(List<BlockPropertyType.BlockPropertyValue<?, ?, ?>> propertyValues);

    long unsignedBlockStateHash();

    NbtMap getBlockStateTag();

    ItemStack toItemStack();

    //TODO: 确认是否只需要实现BlockDefinition::getRuntimeId(), 现有实现较为复杂且低效
    default SimpleBlockDefinition toNetworkBlockDefinition() {
        var statesBuilder = NbtMap.builder();
        for (var propertyValue : getPropertyValues().values()) {
            statesBuilder.put(
                    propertyValue.getPropertyType().getName(),
                    propertyValue.getSerializedValue()
            );
        }
        return new SimpleBlockDefinition(
                getBlockType().getIdentifier().toString(),
                blockStateHash(),
                statesBuilder.build()
        );
    }

    default BlockDefinition toNetworkBlockDefinitionRuntime() {
        return this::blockStateHash;
    }

    default BlockBehavior getBehavior() {
        return getBlockType().getBlockBehavior();
    }

    default BlockAttributes getBlockAttributes() {
        return getBehavior().getBlockAttributes(this);
    }
}