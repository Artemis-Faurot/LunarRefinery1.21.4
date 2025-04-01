package net.artemis.lunar.item.armor;

import net.artemis.lunar.materials.armor.LunarRefineryArmorMaterials;
import net.artemis.lunar.materials.armor.LuniteArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.equipment.EquipmentType;

public class LuniteChestplate extends ArmorItem {
    public LuniteChestplate(Settings settings) {
        super(LunarRefineryArmorMaterials.LUNITE, EquipmentType.CHESTPLATE, settings);
    }

    public static final String name = "lunite_chestplate";
    public static final String displayName = "Lunite Chestplate";
    public static final Settings settings = new Settings()
            .maxCount(1)
            .maxDamage(
                    EquipmentType.CHESTPLATE.getMaxDamage(
                            LuniteArmorMaterial.LUNITE_BASE_DURABILITY
                    )
            );
}
