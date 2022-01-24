package de.jboerrigter.statistix.Utils.Block;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Settings;

public final class ModItems {
    
    public static Settings getDefaultSettings() {
        return new Item.Settings().group(ItemGroup.MISC);
    }

}
