package net.artemis.lunar.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class LuniteOre extends Block {
    public LuniteOre(Settings settings) {
        super(settings);
    }

    public static final String name = "lunite_ore";
    public static final String displayName = "Lunite Ore";
    public static final Settings settings = Settings.create()
            .strength(3.0F, 3.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool();
}
