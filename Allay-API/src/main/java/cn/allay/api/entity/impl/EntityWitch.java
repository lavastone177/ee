package cn.allay.api.entity.impl;

import cn.allay.api.data.VanillaEntityId;
import cn.allay.api.entity.Entity;
import cn.allay.api.entity.type.EntityType;
import cn.allay.api.entity.type.EntityTypeBuilder;
import cn.allay.api.entity.type.EntityTypeRegistry;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityWitch extends Entity {
  EntityType<EntityWitch> TYPE = EntityTypeBuilder
          .builder(EntityWitch.class)
          .vanillaEntity(VanillaEntityId.WITCH)
          .addBasicComponents()
          .build()        .register(EntityTypeRegistry.getRegistry());
}