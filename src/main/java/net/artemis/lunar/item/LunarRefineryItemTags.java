package net.artemis.lunar.item;

import net.artemis.lunar.LunarRefinery;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class LunarRefineryItemTags {
    public static final TagKey<Item> REPAIRS_LUNITE = TagKey.of(RegistryKeys.ITEM, Identifier.of(LunarRefinery.MOD_ID, "repairs_lunite"));
}
