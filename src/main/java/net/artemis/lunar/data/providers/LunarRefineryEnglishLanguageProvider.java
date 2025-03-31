package net.artemis.lunar.data.providers;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.blocks.LunarRefineryBlocks;
import net.artemis.lunar.item.LunarRefineryItems;
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

        translationBuilder.add(LunarRefineryItems.LUNITE_DUST, "Lunite Dust");
        translationBuilder.add(LunarRefineryItems.LUNITE_INGOT, "Lunite Ingot");
        translationBuilder.add(LunarRefineryItems.RAW_LUNITE, "Raw Lunite");
        translationBuilder.add(LunarRefineryItems.LUNITE_HELMET, "Lunite Helmet");
        translationBuilder.add(LunarRefineryItems.LUNITE_CHESTPLATE, "Lunite Chestplate");
        translationBuilder.add(LunarRefineryItems.LUNITE_LEGGINGS, "Lunite Leggings");
        translationBuilder.add(LunarRefineryItems.LUNITE_BOOTS, "Lunite Boots");
        translationBuilder.add(LunarRefineryItems.LUNITE_SWORD, "Lunite Sword");
        translationBuilder.add(LunarRefineryItems.LUNITE_SHOVEL, "Lunite Shovel");
        translationBuilder.add(LunarRefineryItems.LUNITE_PICKAXE, "Lunite Pickaxe");
        translationBuilder.add(LunarRefineryItems.LUNITE_AXE, "Lunite Axe");
        translationBuilder.add(LunarRefineryItems.LUNITE_HOE, "Lunite Hoe");
        translationBuilder.add(LunarRefineryItems.PULSE_POWDER, "Pulse Powder");
        translationBuilder.add(LunarRefineryItems.PULSE_CORE, "Pulse Core");

        translationBuilder.add(LunarRefineryBlocks.LUNITE_ORE, "Lunite Ore");
        translationBuilder.add(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE, "Deepslate Lunite Ore");
        translationBuilder.add(LunarRefineryBlocks.BLOCK_OF_LUNITE, "Block of Lunite");
        translationBuilder.add(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE, "Block of Raw Lunite");

        translationBuilder.add(
                Identifier.of("item." + LunarRefinery.MOD_ID, "lunite_ore"),
                "Lunite Ore"
        );
        translationBuilder.add(
                Identifier.of("item." + LunarRefinery.MOD_ID, "deepslate_lunite_ore"),
                "Deepslate Lunite Ore"
        );
        translationBuilder.add(
                Identifier.of("item." + LunarRefinery.MOD_ID, "block_of_lunite"),
                "Block of Lunite"
        );
        translationBuilder.add(
                Identifier.of("item." + LunarRefinery.MOD_ID, "block_of_raw_lunite"),
                "Block of Raw Lunite"
        );
    }
}
