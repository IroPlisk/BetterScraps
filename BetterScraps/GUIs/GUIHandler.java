package BetterScraps.GUIs;

import BetterScraps.Container.ContainerRecycler;
import BetterScraps.Entity.TileEntityNuovoRecycler;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.google.common.io.ByteArrayDataOutput;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GUIHandler implements IGuiHandler {

    // Define your GUI IDs as constants
    public static final int YOUR_FURNACE_GUI_ID = 420;
    // Add more GUI IDs for other GUIs if needed

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        // Return the appropriate server-side container based on the GUI ID
        switch (ID) {
            case YOUR_FURNACE_GUI_ID:
                return new ContainerRecycler(player.inventory, (TileEntityNuovoRecycler) world.getBlockTileEntity(x, y, z));
            // Add cases for other GUIs if you have them
            default:
                return null; // Return null if no matching GUI ID is found
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        // Return the appropriate client-side GUI based on the GUI ID
        switch (ID) {
            case YOUR_FURNACE_GUI_ID:
                return new RecyclerGUI(player.inventory, (TileEntityNuovoRecycler) world.getBlockTileEntity(x, y, z));
            // Add cases for other GUIs if you have them
            default:
                return null; // Return null if no matching GUI ID is found
        }
    }
}


