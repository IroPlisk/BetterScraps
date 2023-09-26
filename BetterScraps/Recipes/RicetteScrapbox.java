package BetterScraps.Recipes;


import cpw.mods.fml.common.registry.GameRegistry;
import BetterScraps.Blocks.NuovoRecycler;
import BetterScraps.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static BetterScraps.items.Items.scrapm;

public class RicetteScrapbox {

    public static void AggiungiCrafting() {

        // gli scrappettini
        final ItemStack scrapmetallico = new ItemStack(scrapm);

        // scrap box della ic2
        final ItemStack SB = ic2.api.Items.getItem("scrapBox");

        GameRegistry.addShapedRecipe(new ItemStack(Items.scrapbm, 1, 0), new Object[]{
                "###", "#D#", "###", '#', scrapmetallico, 'D', SB
        });
    }
}
