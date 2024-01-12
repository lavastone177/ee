package org.allaymc.api.entity.interfaces;

import org.allaymc.api.container.Container;
import org.allaymc.api.container.FullContainerType;
import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.component.common.EntityContainerViewerComponent;
import org.allaymc.api.entity.component.common.EntityDamageComponent;
import org.allaymc.api.entity.component.player.EntityPlayerAttributeComponent;
import org.allaymc.api.entity.component.player.EntityPlayerBaseComponent;
import org.allaymc.api.entity.component.player.EntityPlayerContainerHolderComponent;
import org.allaymc.api.entity.component.player.EntityPlayerNetworkComponent;
import org.allaymc.api.entity.init.SimpleEntityInitInfo;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.utils.MathUtils;
import org.cloudburstmc.protocol.bedrock.data.inventory.ContainerSlotType;

import static org.allaymc.api.container.Container.EMPTY_SLOT_PLACE_HOLDER;
import static org.allaymc.api.entity.component.EntityComponentImplFactory.getFactory;
import static org.allaymc.api.entity.component.common.EntityAttributeComponent.basicPlayerAttributes;
import static org.allaymc.api.item.interfaces.ItemAirStack.AIR_TYPE;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityPlayer extends
        Entity,
        EntityPlayerBaseComponent,
        EntityPlayerNetworkComponent,
        EntityPlayerAttributeComponent,
        EntityPlayerContainerHolderComponent,
        EntityContainerViewerComponent,
        EntityDamageComponent {
  EntityType<EntityPlayer> PLAYER_TYPE = EntityTypeBuilder
          .builder(EntityPlayer.class)
          .vanillaEntity(VanillaEntityId.PLAYER)
          .addComponent(getFactory().createEntityPlayerBaseComponent())
          .addComponent(getFactory().createEntityPlayerNetworkComponent())
          .addComponent(getFactory().createEntityAttributeComponent(basicPlayerAttributes()))
          .addComponent(getFactory().createEntityPlayerContainerHolderComponent())
          .addComponent(getFactory().createEntityPlayerContainerViewerComponent())
          .addComponent(getFactory().createEntityDamageComponent())
          .build();

  default <T extends Container> T getReachableContainer(FullContainerType<?> slotType) {
    var container = getOpenedContainer(slotType);
    if (container == null) container = getContainer(slotType);
    return (T) container;
  }

  default <T extends Container> T getReachableContainerBySlotType(ContainerSlotType slotType) {
    var container = getOpenedContainerBySlotType(slotType);
    if (container == null) container = getContainerBySlotType(slotType);
    return (T) container;
  }

  default boolean tryDropItemInHand(int count) {
    return tryDropItem(FullContainerType.PLAYER_INVENTORY, getContainer(FullContainerType.PLAYER_INVENTORY).getHandSlot(), count);
  }

  default boolean tryDropItem(FullContainerType<?> containerType, int slot, int count) {
    var container = getReachableContainer(containerType);
    if (container == null) return false;
    var item = container.getItemStack(slot);
    if (item.getItemType() == AIR_TYPE) {
      return false;
    }
    if (item.getCount() < count) {
      return false;
    }
    forceDropItem(container, slot, count);
    return true;
  }

  default void forceDropItem(Container container, int slot, int count) {
    var item = container.getItemStack(slot);
    ItemStack droppedItemStack;
    if (item.getCount() > count) {
      item.setCount(item.getCount() - count);
      container.onSlotChange(slot);
      droppedItemStack = item.copy();
      droppedItemStack.setCount(count);
    } else {
      droppedItemStack = item;
      item = EMPTY_SLOT_PLACE_HOLDER;
      container.setItemStack(slot, item);
    }
    dropItemInPlayerPos(droppedItemStack);
  }

  default void dropItemInPlayerPos(ItemStack itemStack) {
    var playerLoc = getLocation();
    var dimension = playerLoc.dimension();
    var entityItem = EntityItem.ITEM_TYPE.createEntity(
            SimpleEntityInitInfo
                    .builder()
                    .dimension(dimension)
                    .pos(playerLoc.x(), playerLoc.y() + this.getEyeHeight() - 0.25f, playerLoc.z())
                    .motion(MathUtils.getDirectionVector(playerLoc.yaw(), playerLoc.pitch()).mul(0.5f))
                    .build()
    );
    entityItem.setItemStack(itemStack);
    entityItem.setPickupDelay(40);
    dimension.getEntityUpdateService().addEntity(entityItem);
  }
}

