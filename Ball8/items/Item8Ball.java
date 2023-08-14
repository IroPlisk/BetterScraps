package Ball8.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


import java.util.Random;

import static Ball8.items.Item8Ball.RandomNumber.rndm;


public class Item8Ball extends Item {

    private Random random;

    public Item8Ball(int par1) {
        super(-256);
        this.setTextureFile("/Ball8/textures/Items.png");
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


        