package net.artemis.lunar.block;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.block.blocks.BlockOfLunite;
import net.artemis.lunar.block.blocks.BlockOfRawLunite;
import net.artemis.lunar.block.blocks.DeepslateLuniteOre;
import net.artemis.lunar.block.blocks.LuniteOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.IntProvider;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LunarRefineryBlocks {
    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LunarRefinery.MOD_ID, name));
    }
    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LunarRefinery.MOD_ID, name));
    }
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }
    private static Block register(String name, BiFunction<IntProvider, AbstractBlock.Settings, ExperienceDroppingBlock> blockFactory, IntProvider experience, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        ExperienceDroppingBlock block = blockFactory.apply(experience, settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static Block LUNITE_ORE = register(LuniteOre.name, LuniteOre::new, LuniteOre.settings, true);
    public static Block DEEPSLATE_LUNITE_ORE = register(DeepslateLuniteOre.name, DeepslateLuniteOre::new, DeepslateLuniteOre.settings, true);
    public static Block BLOCK_OF_RAW_LUNITE = register(BlockOfRawLunite.name, BlockOfRawLunite::new, BlockOfRawLunite.settings, true);
    public static Block BLOCK_OF_LUNITE = register(BlockOfLunite.name, BlockOfLunite::new, BlockOfLunite.settings, true);

    public static void initialize() {}
}
