package net.artemis.lunar.item.items;

import net.minecraft.item.Item;

public class LuniteDust extends Item {
    public LuniteDust(Settings settings) {
        super(settings);
    }

    public static final String name = "lunite_dust";
    public static final String displayName = "Lunite Dust";
    public static final Settings settings = new Settings()
            .maxCount(64);
}
