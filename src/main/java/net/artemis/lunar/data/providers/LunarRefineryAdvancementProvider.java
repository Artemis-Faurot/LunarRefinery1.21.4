package net.artemis.lunar.data.providers;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.items.LunarRefineryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class LunarRefineryAdvancementProvider extends FabricAdvancementProvider {
    public LunarRefineryAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry getPulsePowder = Advancement.Builder.create()
                .display(
                        LunarRefineryItems.PULSE_POWDER,
                        Text.literal("Lunar Engineer"),
                        Text.literal("You're ready to begin your adventure with Lunar Refinery!"),
                        Identifier.ofVanilla("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_pulse_powder", InventoryChangedCriterion.Conditions.items(LunarRefineryItems.PULSE_POWDER))
                .build(consumer, LunarRefinery.MOD_ID + ":get_pulse_powder");
    }
}
