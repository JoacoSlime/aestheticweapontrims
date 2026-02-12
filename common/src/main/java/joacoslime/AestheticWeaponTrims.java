package joacoslime;

import joacoslime.items.AestheticWeaponTrimsItems;
import joacoslime.items.AestheticWeaponTrimsWeapons;
import joacoslime.tabs.AestheticWeaponTrimsCreativeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AestheticWeaponTrims {
    public static final String MOD_ID = "aestheticweapontrims";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        // Write common init code here.
        LOGGER.info("Mod loaded.");

        AestheticWeaponTrimsCreativeTabs.init();
        AestheticWeaponTrimsItems.init();
        AestheticWeaponTrimsWeapons.init();
    }
}
