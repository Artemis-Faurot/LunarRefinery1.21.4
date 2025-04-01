package net.artemis.lunar.item;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.item.armor.LuniteBoots;
import net.artemis.lunar.item.armor.LuniteChestplate;
import net.artemis.lunar.item.armor.LuniteHelmet;
import net.artemis.lunar.item.armor.LuniteLeggings;
import net.artemis.lunar.item.tools.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.artemis.lunar.item.items.*;

import java.util.List;
import java.util.function.Function;

public class LunarRefineryItems {
    public static void initialize() {}
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LunarRefinery.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    // Items
    public static final Item RAW_LUNITE = register(RawLunite.name, RawLunite::new, RawLunite.settings);
    public static final Item LUNITE_INGOT = register(LuniteIngot.name, LuniteIngot::new, LuniteIngot.settings);
    public static final Item LUNITE_DUST = register(LuniteDust.name, LuniteDust::new, LuniteDust.settings);
    public static final Item PULSE_POWDER = register(PulsePowder.name, PulsePowder::new, PulsePowder.settings);
    public static final Item PULSE_CORE = register(PulseCore.name, PulseCore::new, PulseCore.settings);

    // Armor
    public static final Item LUNITE_HELMET = register(LuniteHelmet.name, LuniteHelmet::new, LuniteHelmet.settings);
    public static final Item LUNITE_CHESTPLATE = register(LuniteChestplate.name, LuniteChestplate::new, LuniteChestplate.settings);
    public static final Item LUNITE_LEGGINGS = register(LuniteLeggings.name, LuniteLeggings::new, LuniteLeggings.settings);
    public static final Item LUNITE_BOOTS = register(LuniteBoots.name, LuniteBoots::new, LuniteBoots.settings);

    // Tools
    public static final Item LUNITE_SWORD = register(LuniteSword.name, LuniteSword::new, LuniteSword.settings);
    public static final Item LUNITE_SHOVEL = register(LuniteShovel.name, LuniteShovel::new, LuniteShovel.settings);
    public static final Item LUNITE_PICKAXE = register(LunitePickaxe.name, LunitePickaxe::new, LunitePickaxe.settings);
    public static final Item LUNITE_AXE = register(LuniteAxe.name, LuniteAxe::new, LuniteAxe.settings);
    public static final Item LUNITE_HOE = register(LuniteHoe.name, LuniteHoe::new, LuniteHoe.settings);

    // Lists
    public static List<Item> LuniteTools = List.of(
            LUNITE_SWORD,
            LUNITE_SHOVEL,
            LUNITE_PICKAXE,
            LUNITE_AXE,
            LUNITE_HOE
    );
}
