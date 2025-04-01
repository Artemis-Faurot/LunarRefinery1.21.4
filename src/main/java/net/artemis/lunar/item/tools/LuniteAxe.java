package net.artemis.lunar.item.tools;

import net.artemis.lunar.materials.tools.LunarRefineryToolMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class LuniteAxe extends AxeItem {
    public LuniteAxe(Settings settings) {
        super(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, 5.5F, -3.05F, settings);
    }

    public static final String name = "lunite_axe";
    public static final String displayName = "Lunite Axe";
    public static final Settings settings = new Settings()
            .maxCount(1);

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (!(entity instanceof LivingEntity livingEntity)) { return; }
        if (!(livingEntity instanceof PlayerEntity playerEntity)) { return; }
        if (!(playerEntity.getMainHandStack().getItem() == this)) { return; }
        if (world.isClient) { return; }

        long time = world.getTimeOfDay() % 24000;

        if (!(time >= 13000 && time <= 23000)) {
            if (!livingEntity.hasStatusEffect(StatusEffects.HASTE)) { return; }
            livingEntity.removeStatusEffect(StatusEffects.HASTE);
            return;
        }

        ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 220, 1, true, false));
    }

    @Override
    public boolean hasGlint(ItemStack stack) { return false; }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("Grants Haste at night").formatted(Formatting.AQUA));
    }
}
