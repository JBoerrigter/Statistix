package de.jaschaboerrigter.statistix.utils.block;

import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public final class ModBlocks {

    public static final Block PokerTable = new Block(Properties.create(Material.WOOD));

    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        PokerTable.setRegistryName(ModConfig.MOD_ID, "poker_table");

        registry.register(PokerTable);
    }

    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new BlockItem(PokerTable, ModItems.getDefaultProperties()).setRegistryName(PokerTable.getRegistryName()));
    }

}
