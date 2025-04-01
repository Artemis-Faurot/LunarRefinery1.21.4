package net.artemis.lunar.data.providers;

import net.artemis.lunar.block.LunarRefineryBlocks;
import net.artemis.lunar.item.armor.LuniteBoots;
import net.artemis.lunar.item.armor.LuniteChestplate;
import net.artemis.lunar.item.armor.LuniteHelmet;
import net.artemis.lunar.item.armor.LuniteLeggings;
import net.artemis.lunar.item.LunarRefineryItems;
import net.artemis.lunar.materials.armor.LuniteArmorMaterial;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class LunarRefineryModelProvider extends FabricModelProvider {
    public LunarRefineryModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(LunarRefineryBlocks.LUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LunarRefineryBlocks.BLOCK_OF_LUNITE);
        blockStateModelGenerator.registerSimpleCubeAll(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(LunarRefineryItems.LUNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(LunarRefineryItems.RAW_LUNITE, Models.GENERATED);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_DUST, Models.GENERATED);
        itemModelGenerator.register(LunarRefineryItems.PULSE_POWDER, Models.GENERATED);
        itemModelGenerator.register(LunarRefineryItems.PULSE_CORE, Models.GENERATED);

        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_HELMET, LuniteArmorMaterial.LUNITE_ARMOR_MATERIAL_KEY, LuniteHelmet.name, false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_CHESTPLATE, LuniteArmorMaterial.LUNITE_ARMOR_MATERIAL_KEY, LuniteChestplate.name, false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_LEGGINGS, LuniteArmorMaterial.LUNITE_ARMOR_MATERIAL_KEY, LuniteLeggings.name, false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_BOOTS, LuniteArmorMaterial.LUNITE_ARMOR_MATERIAL_KEY, LuniteBoots.name, false);

        itemModelGenerator.register(LunarRefineryItems.LUNITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_HOE, Models.HANDHELD);
    }
}
