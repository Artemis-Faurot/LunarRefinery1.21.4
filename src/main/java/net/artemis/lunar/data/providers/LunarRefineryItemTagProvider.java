package net.artemis.lunar.data.providers;

import net.artemis.lunar.item.LunarRefineryItemTags;
import net.artemis.lunar.item.LunarRefineryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LunarRefineryItemTagProvider extends FabricTagProvider<Item> {
    public LunarRefineryItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(LunarRefineryItemTags.REPAIRS_LUNITE)
                .add(LunarRefineryItems.LUNITE_INGOT);
    }
}
