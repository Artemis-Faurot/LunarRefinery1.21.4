package net.artemis.lunar.item.items;

import net.minecraft.item.Item;

public class LuniteIngot extends Item {
    public LuniteIngot(Settings settings) {
        super(settings);
    }

    public static final String name = "lunite_ingot";
    public static final String displayName = "Lunite Ingot";
    public static final Settings settings = new Settings()
            .maxCount(64);
}

