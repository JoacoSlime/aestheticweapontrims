package joacoslime.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import joacoslime.AestheticWeaponTrims;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;
import java.util.function.Supplier;

import static joacoslime.tabs.AestheticWeaponTrimsCreativeTabs.AWT_TAB;

@SuppressWarnings("ALL")
public class AestheticWeaponTrimsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(AestheticWeaponTrims.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> AMETHYST_SOOT_TRIM;
    public static RegistrySupplier<Item> BLIZZARD_TRIM;
    public static RegistrySupplier<Item> BRONZE_TRIM;
    public static RegistrySupplier<Item> CUTESY_TRIM;
    public static RegistrySupplier<Item> FLESH_TRIM;
    public static RegistrySupplier<Item> HEAVEN_TRIM;
    public static RegistrySupplier<Item> INFERNO_TRIM;
    public static RegistrySupplier<Item> MEDICAL_TRIM;
    public static RegistrySupplier<Item> QUARTZ_TRIM;
    public static RegistrySupplier<Item> REDSTONE_SOOT_TRIM;
    public static RegistrySupplier<Item> STEEL_TRIM;
    public static RegistrySupplier<Item> TERRA_TRIM;
    public static RegistrySupplier<Item> NEON_TRIM;
    public static RegistrySupplier<Item> VOID_TRIM;
    public static RegistrySupplier<Item> DAGGER_WEAPON_PATTERN;
    public static RegistrySupplier<Item> GLAIVE_WEAPON_PATTERN;
    public static RegistrySupplier<Item> SWORD_WEAPON_PATTERN;


    private static ChatFormatting TITLE_FORMAT;
    private static Component WEAPON_TRIM_APPLIES_TO;
    private static Component WEAPON_TRIM_INGREDIENTS;
    private static Component WEAPON_TRIM_BASE_SLOT_DESCRIPTION;
    private static Component WEAPON_TRIM_ADDITIONS_SLOT_DESCRIPTION;
    private static List<ResourceLocation> EMPTY_SLOT_SWORD;
    private static List<ResourceLocation> EMPTY_SLOT_PATTERN;

    public static void init() {
        TITLE_FORMAT = ChatFormatting.GRAY;
        ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
        WEAPON_TRIM_APPLIES_TO = Component.translatable(
                Util.makeDescriptionId(
                        "item",
                        ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, "smithing_template.weapon_trim.applies_to")
                )
        ).withStyle(DESCRIPTION_FORMAT);
        WEAPON_TRIM_INGREDIENTS = Component.translatable(
                Util.makeDescriptionId(
                        "item",
                        ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, "smithing_template.weapon_trim.ingredients")
                )
        ).withStyle(DESCRIPTION_FORMAT);
        WEAPON_TRIM_BASE_SLOT_DESCRIPTION = Component.translatable(
                Util.makeDescriptionId(
                        "item",
                        ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, "smithing_template.weapon_trim.base_slot_description")
                )
        );
        WEAPON_TRIM_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
                Util.makeDescriptionId(
                        "item",
                        ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, "smithing_template.weapon_trim.additions_slot_description")
                )
        );
        EMPTY_SLOT_SWORD = List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_sword"));
        EMPTY_SLOT_PATTERN = List.of(); // ResourceLocation.withDefaultNamespace("container/loom/pattern_slot"));

        AMETHYST_SOOT_TRIM = registerItem("amethyst_soot_trim", () -> createTrim("amethyst_soot"));
        BLIZZARD_TRIM = registerItem("blizzard_trim", () -> createTrim("blizzard"));
        BRONZE_TRIM = registerItem("bronze_trim", () -> createTrim("bronze"));
        CUTESY_TRIM = registerItem("cutesy_trim", () -> createTrim("cutesy"));
        FLESH_TRIM = registerItem("flesh_trim", () -> createTrim("flesh"));
        HEAVEN_TRIM = registerItem("heaven_trim", () -> createTrim("heaven"));
        INFERNO_TRIM = registerItem("inferno_trim", () -> createTrim("inferno"));
        MEDICAL_TRIM = registerItem("medical_trim", () -> createTrim("medical"));
        QUARTZ_TRIM = registerItem("quartz_trim", () -> createTrim("quartz"));
        REDSTONE_SOOT_TRIM = registerItem("redstone_soot_trim", () -> createTrim("redstone_soot"));
        STEEL_TRIM = registerItem("steel_trim", () -> createTrim("steel"));
        TERRA_TRIM = registerItem("terra_trim", () -> createTrim("terra"));
        NEON_TRIM = registerItem("neon_trim", () -> createTrim("neon"));
        VOID_TRIM = registerItem("void_trim", () -> createTrim("void"));
        DAGGER_WEAPON_PATTERN = registerItem("dagger_weapon_pattern", () -> new Item(new Item.Properties().arch$tab(AWT_TAB)));
        GLAIVE_WEAPON_PATTERN = registerItem("glaive_weapon_pattern", () -> new Item(new Item.Properties().arch$tab(AWT_TAB)));
        SWORD_WEAPON_PATTERN = registerItem("sword_weapon_pattern", () -> new Item(new Item.Properties().arch$tab(AWT_TAB)));

        ITEMS.register();
    }

    public static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, name), item);
    }

    public static SmithingTemplateItem createTrim(String name) {

        return new SmithingTemplateItem(
                WEAPON_TRIM_APPLIES_TO,
                WEAPON_TRIM_INGREDIENTS,
                Component.translatable(Util.makeDescriptionId("trim_pattern",
                        ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, name)
                )).withStyle(TITLE_FORMAT),
                WEAPON_TRIM_BASE_SLOT_DESCRIPTION,
                WEAPON_TRIM_ADDITIONS_SLOT_DESCRIPTION,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_PATTERN
        );
    }
}
