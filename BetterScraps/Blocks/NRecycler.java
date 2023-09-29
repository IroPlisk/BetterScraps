package BetterScraps.Blocks;

import BetterScraps.Entity.TileEntityNuovoRecycler;
import BetterScraps.CreativeTab;
import BetterScraps.GUIs.GUIHandler;
import BetterScraps.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NRecycler extends BlockContainer {


    public NRecycler(int id) {
        super(id, Material.iron);
        this.setBlockName("Riciclatore");
        this.setTextureFile("/enhancedgeology/textures/rocce.png");
        this.setCreativeTab(CreativeTab.BetterScraps);
        this.setHardness(1.7F);
        this.setResistance(15.0F);


    }

    public TileEntity createNewTileEntity(World world) {
        return new TileEntityNuovoRecycler();
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileEntityNuovoRecycler();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        // Check if the player is sneaking (shift-right-click) to avoid conflicts
        if (!player.isSneaking()) {
            // Open the GUI here
            player.openGui(Main.instance, GUIHandler.YOUR_FURNACE_GUI_ID, world, x, y, z);
            return true;
        }
        return false;
    }

}

