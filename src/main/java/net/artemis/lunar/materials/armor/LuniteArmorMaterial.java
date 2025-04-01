package net.artemis.lunar.materials.armor;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.item.LunarRefineryItemTags;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class LuniteArmorMaterial {
    public static final RegistryKey<EquipmentAsset> LUNITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(LunarRefinery.MOD_ID, "lunite"));
    public static final int LUNITE_BASE_DURABILITY = 24;

    public static final Map<EquipmentType, Integer> DEFENSE = Map.of(
        EquipmentType.BOOTS, 3,
        EquipmentType.LEGGINGS, 6,
        EquipmentType.CHESTPLATE, 7,
        EquipmentType.HELMET, 3,
        EquipmentType.BODY, 8
    );
    public static final Integer ENCHANTMENT_VALUE = 10;
    public static final RegistryEntry<SoundEvent> EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    public static final Float TOUGHNESS = 1.0F;
    public static final Float KNOCKBACK_RESISTANCE = 0.0F;
    public static final TagKey<Item> REPAIR_INGREDIENT = LunarRefineryItemTags.REPAIRS_LUNITE;
}
