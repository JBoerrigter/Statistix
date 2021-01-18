package de.jaschaboerrigter.statistix.data.client;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ModConfig.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // BlockItems
        getBuilder(ModBlocks.POKER_TABLE.getRegistryName().getPath()).parent(
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.POKER_TABLE.getRegistryName().getPath())));

    }
}
