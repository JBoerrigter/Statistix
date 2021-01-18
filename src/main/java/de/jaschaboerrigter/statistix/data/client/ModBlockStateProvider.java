package de.jaschaboerrigter.statistix.data.client;

import java.util.Objects;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ModConfig.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        horizontalBlock(ModBlocks.POKER_TABLE,
                models().orientableWithBottom(Objects.requireNonNull(ModBlocks.POKER_TABLE.getRegistryName()).getPath(),
                        modLoc("block/poker_table_side"), modLoc("block/poker_table_side"),
                        modLoc("block/poker_table_bottom"), modLoc("block/poker_table_top")));
    }
}
