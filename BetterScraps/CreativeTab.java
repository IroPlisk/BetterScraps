package BetterScraps;


import BetterScraps.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

    private String name;
    public static CreativeTabs BetterScraps = new CreativeTab(CreativeTabs.getNextID(), "BetterScraps");

    public CreativeTab(int par1, String par2Str) {
        super(par1, par2Str);
        this.name = par2Str;
    }

    @Override
    public String toString() {
        return super.getTabLabel();
    }

    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        if (this.name == BetterScraps.getTabLabel()) {
            return new ItemStack(Items.scrapm);
        }
        return null;
    }


    @Override
    public String getTranslatedTabLabel() {
        return this.name;
    }

}


