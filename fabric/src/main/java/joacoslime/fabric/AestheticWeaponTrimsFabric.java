package joacoslime.fabric;

import joacoslime.items.AestheticWeaponTrimsItems;
import joacoslime.tabs.AestheticWeaponTrimsCreativeTabs;
import net.fabricmc.api.ModInitializer;

import joacoslime.AestheticWeaponTrims;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public final class AestheticWeaponTrimsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        AestheticWeaponTrims.init();

        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.AMETHYST_SOOT_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.BLIZZARD_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.BRONZE_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.CUTESY_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.FLESH_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.HEAVEN_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.INFERNO_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.MEDICAL_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.QUARTZ_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.REDSTONE_SOOT_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.STEEL_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.TERRA_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.NEON_TRIM.get()));
        ItemGroupEvents.modifyEntriesEvent(AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey())
                .register((itemGroup) -> itemGroup.accept(AestheticWeaponTrimsItems.VOID_TRIM.get()));
    }
}
