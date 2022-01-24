package de.jboerrigter.statistix.Utils.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class PokerTable extends Block {

    public static final String BLOCK_ID = "poker_table";

    public PokerTable() {
        super(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    }
    
}
