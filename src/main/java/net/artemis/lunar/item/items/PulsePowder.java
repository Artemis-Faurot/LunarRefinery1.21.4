package net.artemis.lunar.item.items;

import net.minecraft.item.Item;

public class PulsePowder extends Item {
    public PulsePowder(Settings settings) {
        super(settings);
    }

    public static final String name = "pulse_powder";
    public static final String displayName = "Pulse Powder";
    public static final Settings settings = new Settings()
            .maxCount(64);
}
