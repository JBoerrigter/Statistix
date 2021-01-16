package de.jaschaboerrigter.statistix.data;

import de.jaschaboerrigter.statistix.data.client.ModBlockStateProvider;
import de.jaschaboerrigter.statistix.data.client.ModItemModelProvider;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ModConfig.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if ( event.includeClient() ) {

            generator.addProvider(new ModBlockStateProvider(generator, fileHelper));
            generator.addProvider(new ModItemModelProvider(generator, fileHelper));

        }

    }

}
