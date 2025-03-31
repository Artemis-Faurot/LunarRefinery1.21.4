package net.artemis.lunar.item.materials;

import net.artemis.lunar.blocks.LunarRefineryBlockTags;
import net.artemis.lunar.item.LunarRefineryItemTags;
import net.minecraft.item.ToolMaterial;

public class LunarRefineryToolMaterials {
    public static final ToolMaterial LUNITE_TOOL_MATERIAL = new ToolMaterial(
            LunarRefineryBlockTags.INCORRECT_FOR_LUNITE_TOOL,
            906,
            7.0F,
            2.5F,
            12,
            LunarRefineryItemTags.REPAIRS_LUNITE
    );
}
