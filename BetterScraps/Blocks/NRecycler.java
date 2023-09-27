package BetterScraps.Blocks;

import BetterScraps.Entity.TileEntityNuovoRecycler;
import BetterScraps.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NRecycler extends Block {


    public NRecycler(int id) {
        super(id, Material.iron);
        this.setBlockName("Riciclatore");
        this.setTextureFile("/enhancedgeology/textures/rocce.png");
        this.setCreativeTab(CreativeTab.BetterScraps);
        this.setHardness(1.7F);
        this.setResistance(15.0F);


    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileEntityNuovoRecycler();
    }
}

