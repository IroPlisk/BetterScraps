// questa è una classe che ho fatto per la vecchia mod, si può benissimo cambiare ed editare
/* package BetterScraps.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


import java.util.Random;


public class ItemRandomOLD extends net.minecraft.item.Item {

    private Random random;

    public ItemRandomOLD(int par1) {
        super(-256);
        this.setTextureFile("/BetterScraps/textures/Items.png");
        this.setIconIndex(0);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setItemName("8 Ball");
        this.setMaxStackSize(1);
        random = new Random();
    }


    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
                             float hitX, float hitY, float hitZ) {

        int cas = random.nextInt(6);

        if (cas == 1) {
            player.sendChatToPlayer("Probabilmente");
            return true;
        } else if (rndm == 2) {
            player.sendChatToPlayer("Si");
            return true;
        } else
            return false;
    }
}


*/