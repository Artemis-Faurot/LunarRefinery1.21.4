package net.artemis.lunar.item.tools;

import net.artemis.lunar.item.materials.LunarRefineryToolMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class LunitePickaxeItem extends PickaxeItem {
    public LunitePickaxeItem(Item.Settings settings) {
        super(LunarRefineryToolMaterials.LUNITE_TOOL_MATERIAL, 3.0F, -2.4F, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (entity instanceof LivingEntity livingEntity) {
            if (livingEntity instanceof PlayerEntity playerEntity) {
                if (playerEntity.getMainHandStack().getItem() == this) {
                    if (!world.isClient) {
                        long time = world.getTimeOfDay() % 24000;

                        if (time >= 13000 && time <= 23000) {
                            ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 220, 1, true, false));
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("Grants Haste at night").formatted(Formatting.AQUA));
    }
}
