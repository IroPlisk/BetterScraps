package BetterScraps.Blocks;

import BetterScraps.CreativeTab;
import com.sun.org.apache.xpath.internal.objects.XNull;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class NuovoRecycler {
    public static Block nrecycler;

    public static void InizializzaStiBlocchi() {
        nrecycler = new NRecycler(148); // questo poi da cambiare in base agli ID liberi, da chiedere a Lego11 (credo)
    }

    public static void RegistraStiBlocchi() {
        GameRegistry.registerBlock(nrecycler, ItemBlock.class, nrecycler.getBlockName());
    }

    public static void ParlaComeMangi() {
        LanguageRegistry.addName(new ItemStack(nrecycler), "Advanced Recycler");
    }
}


