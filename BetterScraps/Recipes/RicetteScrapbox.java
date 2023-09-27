package BetterScraps.Recipes;


import cpw.mods.fml.common.registry.GameRegistry;
import BetterScraps.items.Items;
import net.minecraft.item.ItemStack;

import static BetterScraps.items.Items.*;

public class RicetteScrapbox {

    public static void AggiungiCrafting() {

        // gli scrappettini
        final ItemStack scrapmetallico = new ItemStack(scrapm);
        final ItemStack scrapterroso = new ItemStack(scrapt);
        final ItemStack scrapgemma = new ItemStack(scrapg);
        final ItemStack scrapradioattivo = new ItemStack(scrapr);
        final ItemStack scraporganico = new ItemStack(scrapo);


        // scrap box della ic2
        final ItemStack SB = ic2.api.Items.getItem("scrapBox");

        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbm, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scrapmetallico, 'D', SB
        });
        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbt, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scrapterroso, 'D', SB
        });
        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbg, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scrapgemma, 'D', SB
        });
        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbr, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scrapradioattivo, 'D', SB
        });
        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbo, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scraporganico, 'D', SB
        });
    }
}
