package net.artemis.lunar.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class LuniteHelmetItem extends ArmorItem {
    public LuniteHelmetItem(Settings settings) {
        super(LunarRefineryArmorMaterials.LUNITE, EquipmentType.HELMET, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (entity instanceof LivingEntity livingEntity && slot == EquipmentSlot.HEAD.getEntitySlotId()) {
            if (!world.isClient) {
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 220, 0, true, false));
            }
        }
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
