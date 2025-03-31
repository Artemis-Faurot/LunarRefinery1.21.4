package net.artemis.lunar.data.providers;

import net.artemis.lunar.LunarRefinery;
import net.artemis.lunar.blocks.LunarRefineryBlocks;
import net.artemis.lunar.items.LunarRefineryArmorMaterials;
import net.artemis.lunar.items.LunarRefineryItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.util.Identifier;

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

        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_HELMET, LunarRefineryArmorMaterials.LUNITE_ARMOR_MATERIAL_KEY, "lunite_helmet", false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_CHESTPLATE, LunarRefineryArmorMaterials.LUNITE_ARMOR_MATERIAL_KEY, "lunite_chestplate", false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_LEGGINGS, LunarRefineryArmorMaterials.LUNITE_ARMOR_MATERIAL_KEY, "lunite_leggings", false);
        itemModelGenerator.registerArmor(LunarRefineryItems.LUNITE_BOOTS, LunarRefineryArmorMaterials.LUNITE_ARMOR_MATERIAL_KEY, "lunite_boots", false);

        itemModelGenerator.register(LunarRefineryItems.LUNITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(LunarRefineryItems.LUNITE_HOE, Models.HANDHELD);
    }
}
