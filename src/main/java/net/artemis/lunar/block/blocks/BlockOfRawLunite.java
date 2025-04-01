package net.artemis.lunar.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BlockOfRawLunite extends Block {
    public BlockOfRawLunite(Settings settings) {
        super(settings);
    }

    public static final String name = "block_of_raw_lunite";
    public static final String displayName = "Block of Raw Lunite";
    public static final Settings settings = Settings.create()
            .strength(5.0F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool();
}
