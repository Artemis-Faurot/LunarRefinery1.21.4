package net.artemis.lunar.data.providers;

import net.artemis.lunar.blocks.LunarRefineryBlocks;
import net.artemis.lunar.items.LunarRefineryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LunarRefineryRecipeProvider extends FabricRecipeProvider {
    public LunarRefineryRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            private void generateSmelting() {
                offerSmelting(
                        List.of(LunarRefineryItems.RAW_LUNITE),
                        RecipeCategory.TOOLS,
                        LunarRefineryItems.LUNITE_INGOT,
                        0.7f,
                        200,
                        "smelting"
                );
            }

            private void generateBlasting() {
                offerBlasting(
                        List.of(LunarRefineryItems.RAW_LUNITE),
                        RecipeCategory.TOOLS,
                        LunarRefineryItems.LUNITE_INGOT,
                        0.7f,
                        100,
                        "blasting"
                );
            }

            private void generateCrafting() {
                createShaped(RecipeCategory.TOOLS, LunarRefineryBlocks.BLOCK_OF_LUNITE, 1)
                        .pattern("LLL")
                        .pattern("LLL")
                        .pattern("LLL")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(LunarRefineryItems.LUNITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE, 1)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', LunarRefineryItems.RAW_LUNITE)
                        .criterion(hasItem(LunarRefineryItems.RAW_LUNITE), conditionsFromItem(LunarRefineryItems.RAW_LUNITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_HELMET, 1)
                        .pattern("LLL")
                        .pattern("L L")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(LunarRefineryItems.LUNITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_CHESTPLATE, 1)
                        .pattern("L L")
                        .pattern("LLL")
                        .pattern("LLL")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(LunarRefineryItems.LUNITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_LEGGINGS, 1)
                        .pattern("LLL")
                        .pattern("L L")
                        .pattern("L L")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(LunarRefineryItems.LUNITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_BOOTS, 1)
                        .pattern("L L")
                        .pattern("L L")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(LunarRefineryItems.LUNITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_SWORD, 1)
                        .pattern("L")
                        .pattern("L")
                        .pattern("S")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_SHOVEL, 1)
                        .pattern("L")
                        .pattern("S")
                        .pattern("S")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_PICKAXE, 1)
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_AXE, 1)
                        .pattern("LL")
                        .pattern("LS")
                        .pattern(" S")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_HOE, 1)
                        .pattern("LL")
                        .pattern(" S")
                        .pattern(" S")
                        .input('L', LunarRefineryItems.LUNITE_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_INGOT), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.TOOLS, LunarRefineryItems.LUNITE_INGOT, 9)
                        .input(LunarRefineryBlocks.BLOCK_OF_LUNITE, 1)
                        .criterion(hasItem(LunarRefineryBlocks.BLOCK_OF_LUNITE), conditionsFromItem(LunarRefineryBlocks.BLOCK_OF_LUNITE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.TOOLS, LunarRefineryItems.RAW_LUNITE, 9)
                        .input(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE, 1)
                        .criterion(hasItem(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE), conditionsFromItem(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, LunarRefineryItems.PULSE_POWDER, 2)
                        .input(LunarRefineryItems.LUNITE_DUST)
                        .input(Items.REDSTONE)
                        .criterion(hasItem(LunarRefineryItems.LUNITE_DUST), conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);
            }

            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
                generateSmelting();
                generateBlasting();
                generateCrafting();
            }
        };
    }

    @Override
    public String getName() {
        return "LunarRefineryRecipeProvider";
    }
}
