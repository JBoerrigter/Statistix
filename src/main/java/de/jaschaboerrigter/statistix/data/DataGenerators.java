package de.jaschaboerrigter.statistix.data;

import de.jaschaboerrigter.statistix.data.client.*;
import de.jaschaboerrigter.statistix.data.client.Language.EnglishProvider;
import de.jaschaboerrigter.statistix.data.client.Language.GermanProvider;
import de.jaschaboerrigter.statistix.data.server.*;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class DataGenerators {


    public static void gatherData(GatherDataEvent evt) {
        if (evt.includeServer()) {
            evt.getGenerator().addProvider(new ModRecipeProvider(evt.getGenerator()));
        }

        if (evt.includeClient()) {
            evt.getGenerator().addProvider(new ModBlockStateProvider(evt.getGenerator(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(new ModItemModelProvider(evt.getGenerator(), evt.getExistingFileHelper()));
            
            // Languages
            evt.getGenerator().addProvider(new EnglishProvider(evt.getGenerator()));
            evt.getGenerator().addProvider(new GermanProvider(evt.getGenerator()));
        }
    }
}
