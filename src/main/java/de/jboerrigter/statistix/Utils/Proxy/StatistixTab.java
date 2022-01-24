package de.jboerrigter.statistix.Utils.Proxy;

import java.util.List;

import de.jboerrigter.statistix.Utils.Block.ModBlocks;
import de.jboerrigter.statistix.Utils.Config.ModConfig;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class StatistixTab {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
            .create(ModConfig.getId(ModConfig.CREATIVE_TAB))
            .icon(StatistixTab::registerItemGroupIcon)
            .appendItems(StatistixTab::registerItemGroup)
            .build();

    private static ItemStack registerItemGroupIcon() {
        return new ItemStack(ModBlocks.POKER_TABLE);
    }

    private static void registerItemGroup(List<ItemStack> items) {
        items.add(new ItemStack(ModBlocks.POKER_TABLE));
    }

}
