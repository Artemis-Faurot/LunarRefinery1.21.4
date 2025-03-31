package net.artemis.lunar.item.items;

import net.minecraft.item.Item;

public class PulseCore extends Item {
    public PulseCore(Settings settings) {
        super(settings);
    }

    public static final String name = "pulse_core";
    public static final String displayName = "Pulse Core";
    public static final Settings settings = new Settings()
            .maxCount(64);
}
