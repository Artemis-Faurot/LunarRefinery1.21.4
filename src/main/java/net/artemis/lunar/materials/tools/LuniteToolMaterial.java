package net.artemis.lunar.materials.tools;

import net.artemis.lunar.block.LunarRefineryBlockTags;
import net.artemis.lunar.item.LunarRefineryItemTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

public class LuniteToolMaterial {
    public static final TagKey<Block> INCORRECT_BLOCKS_FOR_DROPS = LunarRefineryBlockTags.INCORRECT_FOR_LUNITE_TOOL;
    public static final Integer DURABILITY = 906;
    public static final Float SPEED = 7.0F;
    public static final Float ATTACK_DAMAGE_BONUS = 2.5F;
    public static final Integer ENCHANTMENT_VALUE = 12;
    public static final TagKey<Item> REPAIR_ITEMS = LunarRefineryItemTags.REPAIRS_LUNITE;
}
