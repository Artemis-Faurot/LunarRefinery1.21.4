package net.artemis.lunar.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class DeepslateLuniteOre extends Block {
    public DeepslateLuniteOre(Settings settings) {
        super(settings);
    }

    public static final String name = "deepslate_lunite_ore";
    public static final String displayName = "Deepslate Lunite Ore";
    public static final Settings settings = Settings.create()
            .strength(4.5F, 6.0F)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool();
}
