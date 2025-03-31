package net.artemis.lunar.data.providers;

import net.artemis.lunar.blocks.LunarRefineryBlockTags;
import net.artemis.lunar.blocks.LunarRefineryBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class LunarRefineryBlockTagProvider extends FabricTagProvider<Block> {
    public LunarRefineryBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(LunarRefineryBlocks.LUNITE_ORE)
                .add(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE)
                .add(LunarRefineryBlocks.BLOCK_OF_LUNITE)
                .add(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(LunarRefineryBlocks.LUNITE_ORE)
                .add(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE)
                .add(LunarRefineryBlocks.BLOCK_OF_LUNITE)
                .add(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE);

        getOrCreateTagBuilder(LunarRefineryBlockTags.INCORRECT_FOR_LUNITE_TOOL)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.COMMAND_BLOCK)
                .add(Blocks.CHAIN_COMMAND_BLOCK)
                .add(Blocks.REPEATING_COMMAND_BLOCK)
                .add(Blocks.BARRIER)
                .add(Blocks.STRUCTURE_BLOCK)
                .add(Blocks.STRUCTURE_VOID);
    }
}
