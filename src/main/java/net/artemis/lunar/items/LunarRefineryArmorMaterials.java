package net.artemis.lunar.items;

import net.artemis.lunar.LunarRefinery;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.Map;

public class LunarRefineryArmorMaterials {
//    ArmorMaterial IRON = new ArmorMaterial(15, (Map) Util.make(new EnumMap(EquipmentType.class), (map) -> {
//        map.put(EquipmentType.BOOTS, 2);
//        map.put(EquipmentType.LEGGINGS, 5);
//        map.put(EquipmentType.CHESTPLATE, 6);
//        map.put(EquipmentType.HELMET, 2);
//        map.put(EquipmentType.BODY, 5);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.REPAIRS_IRON_ARMOR, EquipmentAssetKeys.IRON);
//    ArmorMaterial DIAMOND = new ArmorMaterial(33, (Map)Util.make(new EnumMap(EquipmentType.class), (map) -> {
//        map.put(EquipmentType.BOOTS, 3);
//        map.put(EquipmentType.LEGGINGS, 6);
//        map.put(EquipmentType.CHESTPLATE, 8);
//        map.put(EquipmentType.HELMET, 3);
//        map.put(EquipmentType.BODY, 11);
//    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ItemTags.REPAIRS_DIAMOND_ARMOR, EquipmentAssetKeys.DIAMOND);

    public static final RegistryKey<EquipmentAsset> LUNITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(LunarRefinery.MOD_ID, "lunite"));
    public static final int LUNITE_BASE_DURABILITY = 24;

    public static final ArmorMaterial LUNITE = new ArmorMaterial(LUNITE_BASE_DURABILITY,
            Map.of(
                    EquipmentType.BOOTS, 3,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.HELMET, 3,
                    EquipmentType.BODY, 8
            ),
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F,
            0.0F,
            LunarRefineryItemTags.REPAIRS_LUNITE,
            LUNITE_ARMOR_MATERIAL_KEY
        );
}
