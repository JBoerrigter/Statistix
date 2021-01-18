package de.jaschaboerrigter.statistix.utils.proxy;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {

    public static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab() {
        super(ModConfig.CREATIVE_TAB);
        setNoTitle();
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.POKER_TABLE);
    }
}
