package net.artemis.lunar.item.items;

import net.minecraft.item.Item;

public class RawLunite extends Item {
    public RawLunite(Settings settings) {
        super(settings);
    }

    public static final String name = "raw_lunite";
    public static final String displayName = "Raw Lunite";
    public static final Settings settings = new Settings()
            .maxCount(64);
}
