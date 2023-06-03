package cn.allay.api.data;

import cn.allay.api.entity.type.EntityType;
import cn.allay.api.entity.type.EntityTypeRegistry;
import cn.allay.api.identifier.Identifier;
import lombok.Getter;

/**
 * Author: daoge_cmd | Cool_Loong<br>
 * Automatically generated by {@code cn.allay.codegen.VanillaEntityIdEnumGen} <br>
 * Allay Project <br>
 */
public enum VanillaEntityId {
    ALLAY("minecraft:allay"),

    ARMOR_STAND("minecraft:armor_stand"),

    ARROW("minecraft:arrow"),

    AXOLOTL("minecraft:axolotl"),

    BAT("minecraft:bat"),

    BEE("minecraft:bee"),

    BLAZE("minecraft:blaze"),

    BOAT("minecraft:boat"),

    CAT("minecraft:cat"),

    CAVE_SPIDER("minecraft:cave_spider"),

    CHEST_BOAT("minecraft:chest_boat"),

    CHEST_MINECART("minecraft:chest_minecart"),

    CHICKEN("minecraft:chicken"),

    COD("minecraft:cod"),

    COMMAND_BLOCK_MINECART("minecraft:command_block_minecart"),

    COW("minecraft:cow"),

    CREEPER("minecraft:creeper"),

    DOLPHIN("minecraft:dolphin"),

    DONKEY("minecraft:donkey"),

    DROWNED("minecraft:drowned"),

    EGG("minecraft:egg"),

    ELDER_GUARDIAN("minecraft:elder_guardian"),

    ELDER_GUARDIAN_GHOST("minecraft:elder_guardian_ghost"),

    ENDER_CRYSTAL("minecraft:ender_crystal"),

    ENDER_DRAGON("minecraft:ender_dragon"),

    ENDERMAN("minecraft:enderman"),

    ENDERMITE("minecraft:endermite"),

    EVOCATION_FANG("minecraft:evocation_fang"),

    EVOCATION_ILLAGER("minecraft:evocation_illager"),

    FIREWORKS_ROCKET("minecraft:fireworks_rocket"),

    FOX("minecraft:fox"),

    FROG("minecraft:frog"),

    GHAST("minecraft:ghast"),

    GLOW_SQUID("minecraft:glow_squid"),

    GOAT("minecraft:goat"),

    GUARDIAN("minecraft:guardian"),

    HOGLIN("minecraft:hoglin"),

    HOPPER_MINECART("minecraft:hopper_minecart"),

    HORSE("minecraft:horse"),

    HUSK("minecraft:husk"),

    IRON_GOLEM("minecraft:iron_golem"),

    LEASH_KNOT("minecraft:leash_knot"),

    LIGHTNING_BOLT("minecraft:lightning_bolt"),

    LLAMA("minecraft:llama"),

    MAGMA_CUBE("minecraft:magma_cube"),

    MINECART("minecraft:minecart"),

    MOOSHROOM("minecraft:mooshroom"),

    MULE("minecraft:mule"),

    NPC("minecraft:npc"),

    OCELOT("minecraft:ocelot"),

    PANDA("minecraft:panda"),

    PARROT("minecraft:parrot"),

    PHANTOM("minecraft:phantom"),

    PIG("minecraft:pig"),

    PIGLIN("minecraft:piglin"),

    PIGLIN_BRUTE("minecraft:piglin_brute"),

    PILLAGER("minecraft:pillager"),

    POLAR_BEAR("minecraft:polar_bear"),

    PUFFERFISH("minecraft:pufferfish"),

    RABBIT("minecraft:rabbit"),

    RAVAGER("minecraft:ravager"),

    SALMON("minecraft:salmon"),

    SHEEP("minecraft:sheep"),

    SHULKER("minecraft:shulker"),

    SILVERFISH("minecraft:silverfish"),

    SKELETON("minecraft:skeleton"),

    SKELETON_HORSE("minecraft:skeleton_horse"),

    SLIME("minecraft:slime"),

    SNOW_GOLEM("minecraft:snow_golem"),

    SNOWBALL("minecraft:snowball"),

    SPIDER("minecraft:spider"),

    SPLASH_POTION("minecraft:splash_potion"),

    SQUID("minecraft:squid"),

    STRAY("minecraft:stray"),

    STRIDER("minecraft:strider"),

    TADPOLE("minecraft:tadpole"),

    TNT("minecraft:tnt"),

    TNT_MINECART("minecraft:tnt_minecart"),

    TRADER_LLAMA("minecraft:trader_llama"),

    TROPICALFISH("minecraft:tropicalfish"),

    TURTLE("minecraft:turtle"),

    VEX("minecraft:vex"),

    VILLAGER("minecraft:villager"),

    VINDICATOR("minecraft:vindicator"),

    WANDERING_TRADER("minecraft:wandering_trader"),

    WARDEN("minecraft:warden"),

    WITCH("minecraft:witch"),

    WITHER("minecraft:wither"),

    WITHER_SKELETON("minecraft:wither_skeleton"),

    WOLF("minecraft:wolf"),

    XP_BOTTLE("minecraft:xp_bottle"),

    XP_ORB("minecraft:xp_orb"),

    ZOGLIN("minecraft:zoglin"),

    ZOMBIE("minecraft:zombie"),

    ZOMBIE_HORSE("minecraft:zombie_horse"),

    ZOMBIE_PIGMAN("minecraft:zombie_pigman"),

    ZOMBIE_VILLAGER("minecraft:zombie_villager");

    @Getter
    private final Identifier identifier;

    VanillaEntityId(String identifier) {
        this.identifier = new Identifier(identifier);
    }

    public EntityType<?> getEntityType() {
        return EntityTypeRegistry.getRegistry().get(this.getIdentifier());
    }
}
