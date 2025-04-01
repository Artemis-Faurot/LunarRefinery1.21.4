package net.artemis.lunar.data.providers;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.block.LunarRefineryBlocks;
import net.artemis.lunar.block.blocks.BlockOfLunite;
import net.artemis.lunar.block.blocks.BlockOfRawLunite;
import net.artemis.lunar.block.blocks.DeepslateLuniteOre;
import net.artemis.lunar.block.blocks.LuniteOre;
import net.artemis.lunar.item.LunarRefineryItems;
import net.artemis.lunar.item.armor.LuniteBoots;
import net.artemis.lunar.item.armor.LuniteChestplate;
import net.artemis.lunar.item.armor.LuniteHelmet;
import net.artemis.lunar.item.armor.LuniteLeggings;
import net.artemis.lunar.item.items.*;
import net.artemis.lunar.item.tools.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class LunarRefineryEnglishLanguageProvider extends FabricLanguageProvider {
    public LunarRefineryEnglishLanguageProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(LunarRefinery.LUNAR_REFINERY_GROUP_KEY, "Lunar Refinery");

        translationBuilder.add(LunarRefineryItems.LUNITE_DUST, LuniteDust.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_INGOT, LuniteIngot.displayName);
        translationBuilder.add(LunarRefineryItems.RAW_LUNITE, RawLunite.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_HELMET, LuniteHelmet.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_CHESTPLATE, LuniteChestplate.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_LEGGINGS, LuniteLeggings.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_BOOTS, LuniteBoots.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_SWORD, LuniteSword.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_SHOVEL, LuniteShovel.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_PICKAXE, LunitePickaxe.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_AXE, LuniteAxe.displayName);
        translationBuilder.add(LunarRefineryItems.LUNITE_HOE, LuniteHoe.displayName);
        translationBuilder.add(LunarRefineryItems.PULSE_POWDER, PulsePowder.displayName);
        translationBuilder.add(LunarRefineryItems.PULSE_CORE, PulseCore.displayName);

        translationBuilder.add(LunarRefineryBlocks.LUNITE_ORE, LuniteOre.displayName);
        translationBuilder.add(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE, DeepslateLuniteOre.displayName);
        translationBuilder.add(LunarRefineryBlocks.BLOCK_OF_LUNITE, BlockOfLunite.displayName);
        translationBuilder.add(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE, BlockOfRawLunite.displayName);

        translationBuilder.add(Identifier.of("item." + LunarRefinery.MOD_ID, LuniteOre.name), LuniteOre.displayName);
        translationBuilder.add(Identifier.of("item." + LunarRefinery.MOD_ID, DeepslateLuniteOre.name), DeepslateLuniteOre.displayName);
        translationBuilder.add(Identifier.of("item." + LunarRefinery.MOD_ID, BlockOfLunite.name), BlockOfLunite.displayName);
        translationBuilder.add(Identifier.of("item." + LunarRefinery.MOD_ID, BlockOfRawLunite.name), BlockOfRawLunite.displayName);
    }
}
