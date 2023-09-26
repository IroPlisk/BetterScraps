package BetterScraps.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import BetterScraps.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NRecycler extends Block {
    public NRecycler(int id) {
        super(id, Material.iron);
        this.setBlockName("Riciclatore");
        this.setTextureFile("/enhancedgeology/textures/rocce.png");
        this.setCreativeTab(CreativeTab.BetterScraps);
        this.setHardness(1.7F);
        this.setResistance(15.0F);

    }
}

