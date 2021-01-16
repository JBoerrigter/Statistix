package de.jaschaboerrigter.statistix.data.client;

import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
// import net.minecraftforge.client.model.generators.ModelFile;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ModConfig.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("poker_table", modLoc("block/poker_table_bottom"));
        // ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        // getBuilder("poker_table").parent(itemGenerated).texture("layer0", "item/poker_table");
    }
    
}
