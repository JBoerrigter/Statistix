package de.jboerrigter.statistix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jboerrigter.statistix.Utils.Block.ModBlocks;
import de.jboerrigter.statistix.Utils.Config.ModConfig;
import net.fabricmc.api.ModInitializer;

public class Statistix implements ModInitializer {

    // This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(ModConfig.MOD_ID);

    @Override
    public void onInitialize() {
		LOGGER.info("Initialize Blocks");
		ModBlocks.registerBlocks();

		LOGGER.info("Initialize BlockItems");
		ModBlocks.registerBlockItems();
    }
    
}
