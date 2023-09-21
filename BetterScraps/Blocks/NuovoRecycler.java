package BetterScraps.Blocks;

import BetterScraps.CreativeTab;
import com.sun.org.apache.xpath.internal.objects.XNull;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

@Override
public class NuovoRecycler extends TileEntity implements IInventory {

        int getSizeInventory();
            return 0;
        /**
         * Returns the stack in slot i
         */
        ItemStack getStackInSlot(int var1);
            return null;


        ItemStack decrStackSize(int var1, int var2);
            return null;

        ItemStack getStackInSlotOnClosing(int var1);
            return null;

        void setInventorySlotContents(int var1, ItemStack var2);
            return null;
        String getInvName();
            return null;

        int getInventoryStackLimit();
            return 0;

        boolean isUseableByPlayer(EntityPlayer var1);
            return false;

        void openChest();

        void closeChest();
    }
}