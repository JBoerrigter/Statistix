package de.jaschaboerrigter.statistix.utils.block;

import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public final class ModBlocks {

    public static final PokerTable POKER_TABLE = new PokerTable();

    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        POKER_TABLE.setRegistryName(ModConfig.MOD_ID, "poker_table");

        registry.register(POKER_TABLE);
    }

    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new BlockItem(POKER_TABLE, ModItems.getDefaultProperties())
                .setRegistryName(POKER_TABLE.getRegistryName()));
    }

}
