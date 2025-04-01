package net.artemis.lunar.item.armor;

import net.artemis.lunar.materials.armor.LunarRefineryArmorMaterials;
import net.artemis.lunar.materials.armor.LuniteArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.equipment.EquipmentType;

public class LuniteLeggings extends ArmorItem {
    public LuniteLeggings(Settings settings) {
        super(LunarRefineryArmorMaterials.LUNITE, EquipmentType.LEGGINGS, settings);
    }

    public static final String name = "lunite_leggings";
    public static final String displayName = "Lunite Leggings";
    public static final Settings settings = new Settings()
            .maxCount(1)
            .maxDamage(
                    EquipmentType.LEGGINGS.getMaxDamage(
                            LuniteArmorMaterial.LUNITE_BASE_DURABILITY
                    )
            );
}
