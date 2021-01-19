package de.jaschaboerrigter.statistix.data.server;

import java.util.function.Consumer;
import de.jaschaboerrigter.statistix.utils.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        ShapedRecipeBuilder
            .shapedRecipe(ModBlocks.POKER_TABLE)
            .key('w', Blocks.OAK_LOG)
            .key('p', Blocks.OAK_PLANKS)
            .key('c', Items.GREEN_CARPET)
            .patternLine("ccc")
            .patternLine("ppp")
            .patternLine("www")
            .addCriterion("has_item", hasItem(Blocks.OAK_LOG))
            .build(consumer);

    }

}
