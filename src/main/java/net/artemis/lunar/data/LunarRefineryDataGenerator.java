package net.artemis.lunar.data;

import net.artemis.lunar.data.providers.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LunarRefineryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(LunarRefineryAdvancementProvider::new);
		pack.addProvider(LunarRefineryBlockLootTableProvider::new);
		pack.addProvider(LunarRefineryBlockTagProvider::new);
		pack.addProvider(LunarRefineryItemTagProvider::new);
		pack.addProvider(LunarRefineryEnglishLanguageProvider::new);
		pack.addProvider(LunarRefineryModelProvider::new);
		pack.addProvider(LunarRefineryRecipeProvider::new);
	}
}
