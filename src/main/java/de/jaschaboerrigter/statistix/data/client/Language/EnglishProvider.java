package de.jaschaboerrigter.statistix.data.client.Language;

import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import de.jaschaboerrigter.statistix.utils.config.ModConfig;
import de.jaschaboerrigter.statistix.utils.proxy.CreativeTab;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, ModConfig.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(CreativeTab.INSTANCE.getTranslationKey(), "Statistix");
        add(ModBlocks.POKER_TABLE, "Pokertable");
    }

}
