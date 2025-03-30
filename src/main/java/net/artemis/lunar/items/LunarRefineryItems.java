package net.artemis.lunar.items;

import net.artemis.lunar.LunarRefinery;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class LunarRefineryItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LunarRefinery.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    // Items
    public static final Item RAW_LUNITE = register("raw_lunite", Item::new, new Item.Settings().maxCount(64));
    public static final Item LUNITE_INGOT = register("lunite_ingot", Item::new, new Item.Settings().maxCount(64));
    public static final Item LUNITE_DUST = register("lunite_dust", Item::new, new Item.Settings().maxCount(16));

    // Armor
    public static final Item LUNITE_HELMET = register(
            "lunite_helmet",
            settings -> new LuniteHelmetItem(LunarRefineryArmorMaterials.LUNITE, settings),
            new Item.Settings()
                    .maxCount(1)
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY))
    );
    public static final Item LUNITE_CHESTPLATE = register(
            "lunite_chestplate",
            settings -> new ArmorItem(LunarRefineryArmorMaterials.LUNITE, EquipmentType.CHESTPLATE, settings),
            new Item.Settings()
                    .maxCount(1)
                    .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY))
    );
    public static final Item LUNITE_LEGGINGS = register(
            "lunite_leggings",
            settings -> new ArmorItem(LunarRefineryArmorMaterials.LUNITE, EquipmentType.LEGGINGS, settings),
            new Item.Settings()
                    .maxCount(1)
                    .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY))
    );
    public static final Item LUNITE_BOOTS = register(
            "lunite_boots",
            settings -> new LuniteBootsItem(LunarRefineryArmorMaterials.LUNITE, settings),
            new Item.Settings()
                    .maxCount(1)
                    .maxDamage(EquipmentType.BOOTS.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY))
    );

    // Tools

    public static void initialize() {}
}
