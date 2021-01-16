package de.jaschaboerrigter.statistix;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModConfig.MOD_ID)
public class Statistix {

    public Statistix() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addGenericListener(Block.class, ModBlocks::registerBlocks);
        eventBus.addGenericListener(Item.class, ModBlocks::registerBlockItems);
    }

}
