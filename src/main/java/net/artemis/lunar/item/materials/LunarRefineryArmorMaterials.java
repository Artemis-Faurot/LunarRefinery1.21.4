package net.artemis.lunar.item.materials;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.item.LunarRefineryItemTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class LunarRefineryArmorMaterials {
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
