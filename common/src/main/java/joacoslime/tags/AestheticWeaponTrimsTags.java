package joacoslime.tags;

import joacoslime.AestheticWeaponTrims;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AestheticWeaponTrimsTags {
    public static final TagKey<Item> DAGGERS = createTag("daggers");
    public static final TagKey<Item> SWORDS = createTag("swords");
    public static final TagKey<Item> GLAIVES = createTag("glaives");
    public static final TagKey<Item> TRIMS = createTag("glaives");
    public static final TagKey<Item> PATTERNS = createTag("glaives");

    private static TagKey<Item> createTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AestheticWeaponTrims.MOD_ID, name));
    }
}
