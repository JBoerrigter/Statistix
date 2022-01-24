package de.jboerrigter.statistix.Utils.Config;

import net.minecraft.util.Identifier;

public final class ModConfig {

    public static final String MOD_ID = "statistix";
    public static final String CREATIVE_TAB = "statistix";

    public static Identifier getId(String name){
        return new Identifier(MOD_ID, name);
    }

}
