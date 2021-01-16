package de.jaschaboerrigter.statistix.utils.block;

import de.jaschaboerrigter.statistix.utils.proxy.CreativeTab;
import net.minecraft.item.Item.Properties;

public final class ModItems {
    
    public static Properties getDefaultProperties() {
        return new Properties().group(CreativeTab.INSTANCE);
    }

}
