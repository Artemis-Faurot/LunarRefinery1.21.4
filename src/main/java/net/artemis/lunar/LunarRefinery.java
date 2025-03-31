package net.artemis.lunar;

import net.artemis.lunar.blocks.LunarRefineryBlocks;
import net.artemis.lunar.items.LunarRefineryItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LunarRefinery implements ModInitializer {
	public static final String MOD_ID = "lunar-refinery";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	protected static final RegistryKey<PlacedFeature> LUNITE_ORE_GENERATION = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "lunite_ore_generation"));

	public static final RegistryKey<ItemGroup> LUNAR_REFINERY_GROUP_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "item_group"));
	protected static final ItemGroup LUNAR_REFINERY_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(LunarRefineryItems.LUNITE_DUST))
			.displayName(Text.translatable("itemgroup.lunar-refinery"))
			.build();

	@Override
	public void onInitialize() {
		LunarRefineryItems.initialize();
		LunarRefineryBlocks.initialize();

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, LUNITE_ORE_GENERATION);
		Registry.register(Registries.ITEM_GROUP, LUNAR_REFINERY_GROUP_KEY, LUNAR_REFINERY_ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(LUNAR_REFINERY_GROUP_KEY).register(itemGroup -> {
			itemGroup.add(LunarRefineryBlocks.LUNITE_ORE);
			itemGroup.add(LunarRefineryBlocks.DEEPSLATE_LUNITE_ORE);

			itemGroup.add(LunarRefineryItems.RAW_LUNITE);
			itemGroup.add(LunarRefineryItems.LUNITE_INGOT);

			itemGroup.add(LunarRefineryBlocks.BLOCK_OF_RAW_LUNITE);
			itemGroup.add(LunarRefineryBlocks.BLOCK_OF_LUNITE);

			itemGroup.add(LunarRefineryItems.LUNITE_HELMET);
			itemGroup.add(LunarRefineryItems.LUNITE_CHESTPLATE);
			itemGroup.add(LunarRefineryItems.LUNITE_LEGGINGS);
			itemGroup.add(LunarRefineryItems.LUNITE_BOOTS);

			itemGroup.add(LunarRefineryItems.LUNITE_SWORD);
			itemGroup.add(LunarRefineryItems.LUNITE_SHOVEL);
			itemGroup.add(LunarRefineryItems.LUNITE_PICKAXE);
			itemGroup.add(LunarRefineryItems.LUNITE_AXE);
			itemGroup.add(LunarRefineryItems.LUNITE_HOE);

			itemGroup.add(LunarRefineryItems.LUNITE_DUST);
			itemGroup.add(LunarRefineryItems.PULSE_POWDER);

			itemGroup.add(LunarRefineryItems.PULSE_CORE);
		});

		ServerLivingEntityEvents.AFTER_DEATH.register((LivingEntity entity, DamageSource source) -> {
			World world = entity.getWorld();

			if (!world.isClient && entity instanceof HostileEntity) {
				if (source.getAttacker() instanceof PlayerEntity player) {
					if (player.getMainHandStack().getItem() == LunarRefineryItems.LUNITE_SWORD) {
						if (world.getRandom().nextFloat() < 0.25F) {
							entity.dropStack((ServerWorld) world, new ItemStack(LunarRefineryItems.LUNITE_DUST), 1.0F);
						}
					}
				}
			}
		});
	}
}