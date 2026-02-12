package joacoslime.tabs;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import joacoslime.AestheticWeaponTrims;
import joacoslime.items.AestheticWeaponTrimsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AestheticWeaponTrimsCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(AestheticWeaponTrims.MOD_ID, Registries.CREATIVE_MODE_TAB);;
    public static RegistrySupplier<CreativeModeTab> AWT_TAB;

    public static void init() {
        AWT_TAB = TABS.register(
            "awt_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.awt_tab"), // Tab Name
                    () -> new ItemStack(AestheticWeaponTrimsItems.AMETHYST_SOOT_TRIM) // Icon
            )
        );

        TABS.register();
    }
}
