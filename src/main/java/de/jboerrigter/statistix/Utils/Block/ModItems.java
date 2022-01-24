package de.jboerrigter.statistix.Utils.Block;

import de.jboerrigter.statistix.Utils.Proxy.StatistixTab;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

public final class ModItems {
    
    public static Settings getDefaultSettings() {
        return new Item.Settings().group(StatistixTab.ITEM_GROUP);
    }

}
