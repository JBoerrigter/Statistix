package de.jboerrigter.statistix.Utils.Block;

import de.jboerrigter.statistix.Utils.Config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block POKER_TABLE = new PokerTable();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, getId(PokerTable.BLOCK_ID), POKER_TABLE);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, getId(PokerTable.BLOCK_ID), new BlockItem(POKER_TABLE, ModItems.getDefaultSettings()));
    }

    private static Identifier getId(String name) {
        return new Identifier(ModConfig.MOD_ID, name);
    }

}
