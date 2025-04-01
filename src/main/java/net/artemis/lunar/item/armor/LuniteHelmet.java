package net.artemis.lunar.item.armor;

import net.artemis.lunar.materials.armor.LunarRefineryArmorMaterials;
import net.artemis.lunar.materials.armor.LuniteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class LuniteHelmet extends ArmorItem {
    public LuniteHelmet(Settings settings) {
        super(LunarRefineryArmorMaterials.LUNITE, EquipmentType.HELMET, settings);
    }

    public static final String name = "lunite_helmet";
    public static final String displayName = "Lunite Helmet";
    public static final Settings settings = new Settings()
            .maxCount(1)
            .maxDamage(
                    EquipmentType.HELMET.getMaxDamage(
                            LuniteArmorMaterial.LUNITE_BASE_DURABILITY
                    )
            );

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (!(entity instanceof LivingEntity && slot == EquipmentSlot.HEAD.getEntitySlotId())) { return; }
        if (world.isClient) { return; }

        ((LivingEntity) entity).addStatusEffect(
                new StatusEffectInstance(
                        StatusEffects.NIGHT_VISION,
                        220,
                        0,
                        true,
                        false
                )
        );
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("Grants Night Vision when worn").formatted(Formatting.AQUA));
    }
}
