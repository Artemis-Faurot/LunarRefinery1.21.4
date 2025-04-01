package net.artemis.lunar.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BlockOfLunite extends Block {
    public BlockOfLunite(Settings settings) {
        super(settings);
    }

    public static final String name = "block_of_lunite";
    public static final String displayName = "Block of Lunite";
    public static final Settings settings = Settings.create()
            .strength(5.0F, 6.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool();
}
