package net.artemis.lunar.items;

import net.artemis.lunar.LunarRefinery;
import net.minecraft.item.*;
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
    public static final Item LUNITE_DUST = register("lunite_dust", Item::new, new Item.Settings().maxCount(64));
    public static final Item PULSE_POWDER = register("pulse_powder", Item::new, new Item.Settings().maxCount(64));
    public static final Item PULSE_CORE = register("pulse_core", Item::new, new Item.Settings().maxCount(64));

    // Armor
    public static final Item LUNITE_HELMET = register("lunite_helmet", LuniteHelmetItem::new, new Item.Settings().maxCount(1).maxDamage(EquipmentType.HELMET.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY)));
    public static final Item LUNITE_CHESTPLATE = register("lunite_chestplate", settings -> new ArmorItem(LunarRefineryArmorMaterials.LUNITE, EquipmentType.CHESTPLATE, settings), new Item.Settings().maxCount(1).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY)));
    public static final Item LUNITE_LEGGINGS = register("lunite_leggings", settings -> new ArmorItem(LunarRefineryArmorMaterials.LUNITE, EquipmentType.LEGGINGS, settings), new Item.Settings().maxCount(1).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY)));
    public static final Item LUNITE_BOOTS = register("lunite_boots", LuniteBootsItem::new, new Item.Settings().maxCount(1).maxDamage(EquipmentType.BOOTS.getMaxDamage(LunarRefineryArmorMaterials.LUNITE_BASE_DURABILITY)));

    // Tools
    public static final Item LUNITE_SWORD = register("lunite_sword", settings -> new SwordItem(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, 3.0F, -2.4F, settings), new Item.Settings().maxCount(1));
    public static final Item LUNITE_SHOVEL = register("lunite_shovel", settings -> new ShovelItem(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, 1.5F, -3.0F, settings), new Item.Settings().maxCount(1));
    public static final Item LUNITE_PICKAXE = register("lunite_pickaxe", LunitePickaxeItem::new, new Item.Settings().maxCount(1));
    public static final Item LUNITE_AXE = register("lunite_axe", settings -> new AxeItem(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, 5.5F, -3.05F, settings), new Item.Settings().maxCount(1));
    public static final Item LUNITE_HOE = register("lunite_hoe", settings -> new HoeItem(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, -2.5F, -0.5F, settings), new Item.Settings().maxCount(1));

    public static void initialize() {}
}
