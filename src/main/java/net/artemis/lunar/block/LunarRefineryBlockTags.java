package net.artemis.lunar.block;

import net.artemis.lunar.LunarRefinery;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class LunarRefineryBlockTags {
    public static final TagKey<Block> INCORRECT_FOR_LUNITE_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(LunarRefinery.MOD_ID, "incorrect_for_lunite_tool"));
}
