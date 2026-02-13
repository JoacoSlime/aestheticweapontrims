package joacoslime.neoforge;

import joacoslime.items.AestheticWeaponTrimsItems;
import joacoslime.tabs.AestheticWeaponTrimsCreativeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import joacoslime.AestheticWeaponTrims;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(AestheticWeaponTrims.MOD_ID)
public final class AestheticWeaponTrimsNeoForge {
    public AestheticWeaponTrimsNeoForge(IEventBus eventBus, ModContainer container) {
        // Run our common setup.
        AestheticWeaponTrims.init();

        eventBus.addListener(AestheticWeaponTrimsNeoForge::buildContents);
    }


    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == AestheticWeaponTrimsCreativeTabs.AWT_TAB.getKey()) {
            event.accept(AestheticWeaponTrimsItems.AMETHYST_SOOT_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.BLIZZARD_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.BRONZE_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.CUTESY_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.FLESH_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.HEAVEN_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.INFERNO_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.MEDICAL_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.QUARTZ_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.REDSTONE_SOOT_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.STEEL_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.TERRA_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.NEON_TRIM.get());
            event.accept(AestheticWeaponTrimsItems.VOID_TRIM.get());
        }
    }
}