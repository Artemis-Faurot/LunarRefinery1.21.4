package net.artemis.lunar.data.providers;

import net.artemis.lunar.block.LunarRefineryBlocks;
import net.artemis.lunar.item.LunarRefineryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.concurrent.CompletableFuture;

public class LunarRefineryBlockLootTableProvider extends FabricBlockLootTableProvider {
    public LunarRefineryBlockLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    public <T> RegistryEntry.Reference<T> getEntityOrThrow(RegistryKey<T> key) {
        return registries.getOptional(key.getRegistryRef()).flatMap((registry) -> registry.getOptional(key)).orElseThrow(() -> new IllegalStateException("Missing element " + String.valueOf(key)));
    }

    @Override
    public void generate() {
        addDrop(LunarRefineryBlocks.LUNITE_ORE, LootTable.builder()
                .pool(addSurvivesExplosionCondition(
                        LunarRefineryItems.RAW_LUNITE,
                        LootPool.builder()
                                .rolls(new ConstantLootNumberProvider(1))
                                .with(ItemEntry.builder(LunarRefineryItems.RAW_LUNITE))
                ))
        );

        addDrop(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE, LootTable.builder()
                .pool(addSurvivesExplosionCondition(
                        LunarRefineryItems.RAW_LUNITE,
                        LootPool.builder()
                                .rolls(new ConstantLootNumberProvider(1))
                                .with(ItemEntry.builder(LunarRefineryItems.RAW_LUNITE))
                ))
        );

        addDrop(LunarRefineryBlocks.BLOCK_OF_LUNITE);
        addDrop(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE);
    }
}
