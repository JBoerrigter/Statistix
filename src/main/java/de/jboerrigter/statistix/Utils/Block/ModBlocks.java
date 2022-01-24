package de.jboerrigter.statistix.Utils.Block;

import de.jboerrigter.statistix.Utils.Config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block POKER_TABLE = new PokerTable();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, ModConfig.getId(PokerTable.BLOCK_ID), POKER_TABLE);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, ModConfig.getId(PokerTable.BLOCK_ID), new BlockItem(POKER_TABLE, ModItems.getDefaultSettings()));
    }

}
