package cn.allay.api.entity.interfaces.wanderingtrader;

import cn.allay.api.data.VanillaEntityId;
import cn.allay.api.entity.Entity;
import cn.allay.api.entity.type.EntityType;
import cn.allay.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityWanderingTrader extends Entity {
  EntityType<EntityWanderingTrader> WANDERING_TRADER_TYPE = EntityTypeBuilder
          .builder(EntityWanderingTrader.class)
          .vanillaEntity(VanillaEntityId.WANDERING_TRADER)
          .build();
}