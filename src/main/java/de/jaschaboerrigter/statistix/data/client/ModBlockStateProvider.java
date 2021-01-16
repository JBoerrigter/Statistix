package de.jaschaboerrigter.statistix.data.client;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.data.DataGenerator;
// import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ModConfig.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.PokerTable);
        
        // BlockModelBuilder builder = models().orientableWithBottom(
        //     ModBlocks.PokerTable.getRegistryName().getPath(), 
        //     modLoc("block/poker_table_side"),   // Side
        //     modLoc("block/poker_table_side"),   // Front
        //     modLoc("block/poker_table_bottom"), // Bottom
        //     modLoc("block/poker_table_top"));   // Top

        // horizontalBlock(ModBlocks.PokerTable, builder);

    }
    
}
