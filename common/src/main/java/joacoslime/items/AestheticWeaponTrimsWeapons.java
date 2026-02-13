package joacoslime.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import joacoslime.AestheticWeaponTrims;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;

import java.util.function.Supplier;

import static joacoslime.items.AestheticWeaponTrimsItems.ITEMS;
import static joacoslime.tabs.AestheticWeaponTrimsCreativeTabs.AWT_TAB;
import static net.minecraft.world.item.Item.BASE_ATTACK_DAMAGE_ID;
import static net.minecraft.world.item.Item.BASE_ATTACK_SPEED_ID;

public class AestheticWeaponTrimsWeapons {
    private static final ResourceLocation BASE_ENTITY_INTERACTION_RANGE_ID = ResourceLocation.withDefaultNamespace("entity_interaction_range");
    private static final double BASE_ITEM_ATTACK_SPEED = -3.0F; // 1 attack speed

    public static RegistrySupplier<Item> AMETHYST_SOOT_DAGGER;
    public static RegistrySupplier<Item> BLIZZARD_DAGGER;
    public static RegistrySupplier<Item> BRONZE_DAGGER;
    public static RegistrySupplier<Item> CUTESY_DAGGER;
    public static RegistrySupplier<Item> FLESH_DAGGER;
    public static RegistrySupplier<Item> HEAVEN_DAGGER;
    public static RegistrySupplier<Item> INFERNO_DAGGER;
    public static RegistrySupplier<Item> MEDICAL_DAGGER;
    public static RegistrySupplier<Item> QUARTZ_DAGGER;
    public static RegistrySupplier<Item> REDSTONE_SOOT_DAGGER;
    public static RegistrySupplier<Item> STEEL_DAGGER;
    public static RegistrySupplier<Item> TERRA_DAGGER;
    public static RegistrySupplier<Item> NEON_DAGGER;
    public static RegistrySupplier<Item> VOID_DAGGER;
    public static RegistrySupplier<Item> AMETHYST_SOOT_GLAIVE;
    public static RegistrySupplier<Item> BLIZZARD_GLAIVE;
    public static RegistrySupplier<Item> BRONZE_GLAIVE;
    public static RegistrySupplier<Item> CUTESY_GLAIVE;
    public static RegistrySupplier<Item> FLESH_GLAIVE;
    public static RegistrySupplier<Item> HEAVEN_GLAIVE;
    public static RegistrySupplier<Item> INFERNO_GLAIVE;
    public static RegistrySupplier<Item> MEDICAL_GLAIVE;
    public static RegistrySupplier<Item> QUARTZ_GLAIVE;
    public static RegistrySupplier<Item> REDSTONE_SOOT_GLAIVE;
    public static RegistrySupplier<Item> STEEL_GLAIVE;
    public static RegistrySupplier<Item> TERRA_GLAIVE;
    public static RegistrySupplier<Item> NEON_GLAIVE;
    public static RegistrySupplier<Item> VOID_GLAIVE;
    public static RegistrySupplier<Item> AMETHYST_SOOT_SWORD;
    public static RegistrySupplier<Item> BLIZZARD_SWORD;
    public static RegistrySupplier<Item> BRONZE_1_SWORD;
    public static RegistrySupplier<Item> BRONZE_2_SWORD;
    public static RegistrySupplier<Item> CUTESY_1_SWORD;
    public static RegistrySupplier<Item> CUTESY_2_SWORD;
    public static RegistrySupplier<Item> FLESH_SWORD;
    public static RegistrySupplier<Item> HEAVEN_SWORD;
    public static RegistrySupplier<Item> INFERNO_SWORD;
    public static RegistrySupplier<Item> MEDICAL_SWORD;
    public static RegistrySupplier<Item> QUARTZ_1_SWORD;
    public static RegistrySupplier<Item> QUARTZ_2_SWORD;
    public static RegistrySupplier<Item> REDSTONE_SOOT_SWORD;
    public static RegistrySupplier<Item> STEEL_1_SWORD;
    public static RegistrySupplier<Item> STEEL_2_SWORD;
    public static RegistrySupplier<Item> TERRA_SWORD;
    public static RegistrySupplier<Item> NEON_SWORD;
    public static RegistrySupplier<Item> VOID_SWORD;

    public static void init() {
        ItemAttributeModifiers dagger_attributes = ItemAttributeModifiers.builder()
                .add( // Attack Damage
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(
                                BASE_ATTACK_DAMAGE_ID,
                                1.0F + Tiers.NETHERITE.getAttackDamageBonus(),
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add( // Attack Speed
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(
                                BASE_ATTACK_SPEED_ID,
                                BASE_ITEM_ATTACK_SPEED+1.2F,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add( // Attack Range
                        Attributes.ENTITY_INTERACTION_RANGE,
                        new AttributeModifier(
                                BASE_ENTITY_INTERACTION_RANGE_ID,
                                -1.0F,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
        ItemAttributeModifiers glaive_attributes = ItemAttributeModifiers.builder()
                .add( // Attack Damage
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(
                                BASE_ATTACK_DAMAGE_ID,
                                5.0F + Tiers.NETHERITE.getAttackDamageBonus(),
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add( // Attack Speed
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(
                                BASE_ATTACK_SPEED_ID,
                                BASE_ITEM_ATTACK_SPEED+0.38F,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add( // Attack Range
                        Attributes.ENTITY_INTERACTION_RANGE,
                        new AttributeModifier(
                                BASE_ENTITY_INTERACTION_RANGE_ID,
                                1.5F,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
        ItemAttributeModifiers sword_attributes = ItemAttributeModifiers.builder()
                .add( // Attack Damage
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(
                                BASE_ATTACK_DAMAGE_ID,
                                3.5F + Tiers.NETHERITE.getAttackDamageBonus(),
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add( // Attack Speed
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(
                                BASE_ATTACK_SPEED_ID,
                                BASE_ITEM_ATTACK_SPEED+0.6F,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();

        // Daggers
        AMETHYST_SOOT_DAGGER = registerItem("amethyst_soot_dagger", () -> createWeapon(dagger_attributes));
        BLIZZARD_DAGGER = registerItem("blizzard_dagger", () -> createWeapon(dagger_attributes));
        BRONZE_DAGGER = registerItem("bronze_dagger", () -> createWeapon(dagger_attributes));
        CUTESY_DAGGER = registerItem("cutesy_dagger", () -> createWeapon(dagger_attributes));
        FLESH_DAGGER = registerItem("flesh_dagger", () -> createWeapon(dagger_attributes));
        HEAVEN_DAGGER = registerItem("heaven_dagger", () -> createWeapon(dagger_attributes));
        INFERNO_DAGGER = registerItem("inferno_dagger", () -> createWeapon(dagger_attributes));
        MEDICAL_DAGGER = registerItem("medical_dagger", () -> createWeapon(dagger_attributes));
        QUARTZ_DAGGER = registerItem("quartz_dagger", () -> createWeapon(dagger_attributes));
        REDSTONE_SOOT_DAGGER = registerItem("redstone_soot_dagger", () -> createWeapon(dagger_attributes));
        STEEL_DAGGER = registerItem("steel_dagger", () -> createWeapon(dagger_attributes));
        TERRA_DAGGER = registerItem("terra_dagger", () -> createWeapon(dagger_attributes));
        NEON_DAGGER = registerItem("neon_dagger", () -> createWeapon(dagger_attributes));
        VOID_DAGGER = registerItem("void_dagger", () -> createWeapon(dagger_attributes));

        // Glaives
        AMETHYST_SOOT_GLAIVE = registerItem("amethyst_soot_glaive", () -> createWeapon(glaive_attributes));
        BLIZZARD_GLAIVE = registerItem("blizzard_glaive", () -> createWeapon(glaive_attributes));
        BRONZE_GLAIVE = registerItem("bronze_glaive", () -> createWeapon(glaive_attributes));
        CUTESY_GLAIVE = registerItem("cutesy_glaive", () -> createWeapon(glaive_attributes));
        FLESH_GLAIVE = registerItem("flesh_glaive", () -> createWeapon(glaive_attributes));
        HEAVEN_GLAIVE = registerItem("heaven_glaive", () -> createWeapon(glaive_attributes));
        INFERNO_GLAIVE = registerItem("inferno_glaive", () -> createWeapon(glaive_attributes));
        MEDICAL_GLAIVE = registerItem("medical_glaive", () -> createWeapon(glaive_attributes));
        QUARTZ_GLAIVE = registerItem("quartz_glaive", () -> createWeapon(glaive_attributes));
        REDSTONE_SOOT_GLAIVE = registerItem("redstone_soot_glaive", () -> createWeapon(glaive_attributes));
        STEEL_GLAIVE = registerItem("steel_glaive", () -> createWeapon(glaive_attributes));
        TERRA_GLAIVE = registerItem("terra_glaive", () -> createWeapon(glaive_attributes));
        NEON_GLAIVE = registerItem("neon_glaive", () -> createWeapon(glaive_attributes));
        VOID_GLAIVE = registerItem("void_glaive", () -> createWeapon(glaive_attributes));

        // Swords
        AMETHYST_SOOT_SWORD = registerItem("amethyst_soot_sword", () -> createWeapon(sword_attributes));
        BLIZZARD_SWORD = registerItem("blizzard_sword", () -> createWeapon(sword_attributes));
        BRONZE_1_SWORD = registerItem("bronze_1_sword", () -> createWeapon(sword_attributes));
        BRONZE_2_SWORD = registerItem("bronze_2_sword", () -> createWeapon(sword_attributes));
        CUTESY_1_SWORD = registerItem("cutesy_1_sword", () -> createWeapon(sword_attributes));
        CUTESY_2_SWORD = registerItem("cutesy_2_sword", () -> createWeapon(sword_attributes));
        FLESH_SWORD = registerItem("flesh_sword", () -> createWeapon(sword_attributes));
        HEAVEN_SWORD = registerItem("heaven_sword", () -> createWeapon(sword_attributes));
        INFERNO_SWORD = registerItem("inferno_sword", () -> createWeapon(sword_attributes));
        MEDICAL_SWORD = registerItem("medical_sword", () -> createWeapon(sword_attributes));
        QUARTZ_1_SWORD = registerItem("quartz_1_sword", () -> createWeapon(sword_attributes));
        QUARTZ_2_SWORD = registerItem("quartz_2_sword", () -> createWeapon(sword_attributes));
        REDSTONE_SOOT_SWORD = registerItem("redstone_soot_sword", () -> createWeapon(sword_attributes));
        STEEL_1_SWORD = registerItem("steel_1_sword", () -> createWeapon(sword_attributes));
        STEEL_2_SWORD = registerItem("steel_2_sword", () -> createWeapon(sword_attributes));
        TERRA_SWORD = registerItem("terra_sword", () -> createWeapon(sword_attributes));
        NEON_SWORD = registerItem("neon_sword", () -> createWeapon(sword_attributes));
        VOID_SWORD = registerItem("void_sword", () -> createWeapon(sword_attributes));
    }

    public static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, name), item);
    }

    private static SwordItem createWeapon(ItemAttributeModifiers attribute_modifiers) {
        return new SwordItem(Tiers.NETHERITE,
                new Item.Properties()
                        .arch$tab(AWT_TAB)
                        .attributes(attribute_modifiers));
    }
}
