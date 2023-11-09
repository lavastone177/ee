package org.allaymc.api.entity.component.attribute;

import org.allaymc.api.component.annotation.ComponentIdentifier;
import org.allaymc.api.entity.attribute.Attribute;
import org.allaymc.api.entity.attribute.AttributeType;
import org.allaymc.api.identifier.Identifier;
import com.google.common.collect.Lists;

import java.util.*;

/**
 * Allay Project 2023/7/9
 *
 * @author daoge_cmd
 */
public class EntityAttributeComponentImpl implements EntityAttributeComponent {

    @ComponentIdentifier
    public static final Identifier IDENTIFIER = new Identifier("minecraft:entity_attribute_component");

    protected final Map<AttributeType, Attribute> attributes = new EnumMap<>(AttributeType.class);

    public EntityAttributeComponentImpl(List<AttributeType> attributeTypes) {
        attributeTypes.forEach(this::addAttribute);
    }

    public static List<AttributeType> basicAttributes() {
        return Lists.newArrayList(
                AttributeType.HEALTH,
                AttributeType.ABSORPTION,
                AttributeType.ATTACK_DAMAGE,
                AttributeType.FOLLOW_RANGE,
                AttributeType.MOVEMENT,
                AttributeType.KNOCKBACK_RESISTENCE
        );
    }

    @Override
    public void addAttribute(AttributeType attributeType) {
        this.attributes.put(attributeType, attributeType.newAttributeInstance());
    }

    @Override
    public Collection<Attribute> getAttributes() {
        return Collections.unmodifiableCollection(attributes.values());
    }

    @Override
    public Attribute getAttribute(AttributeType attributeType) {
        return attributes.get(attributeType);
    }

    @Override
    public void setAttribute(AttributeType attributeType, float value) {
        Attribute attribute = this.attributes.get(attributeType);
        if (attribute != null)
            attribute.setCurrentValue(value);
    }

    @Override
    public void setAttribute(Attribute attribute) {
        this.attributes.put(AttributeType.valueOf(attribute.getKey()), attribute);
    }

    @Override
    public float getAttributeValue(AttributeType attributeType) {
        return this.getAttribute(attributeType).getCurrentValue();
    }
}