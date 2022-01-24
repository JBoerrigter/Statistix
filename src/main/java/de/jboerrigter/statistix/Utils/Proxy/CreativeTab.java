package de.jboerrigter.statistix.Utils.Proxy;

import de.jboerrigter.statistix.Utils.Block.ModBlocks;
import de.jboerrigter.statistix.Utils.Config.ModConfig;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {

    public static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab() {
        super(0, ModConfig.CREATIVE_TAB);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.POKER_TABLE);
    }
}
