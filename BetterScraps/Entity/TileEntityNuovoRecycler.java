package BetterScraps.Entity;

import ic2.api.Direction;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.IWrenchable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TileEntityNuovoRecycler extends TileEntity implements IEnergySink, IWrenchable {


    @Override
    public boolean wrenchCanSetFacing(EntityPlayer entityPlayer, int side) {
        return false;
    }

    @Override
    public short getFacing() {
        return 0;
    }

    @Override
    public void setFacing(short facing) {

    }

    @Override
    public boolean wrenchCanRemove(EntityPlayer entityPlayer) {
        return false;
    }

    @Override
    public float getWrenchDropRate() {
        return 0;
    }

    @Override
    public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
        return false;
    }

    @Override
    public int demandsEnergy() {
        return 0;
    }

    @Override
    public int injectEnergy(Direction directionFrom, int amount) {
        return 32;
    }

    @Override
    public int getMaxSafeInput() {
        return 32;
    }

    @Override
    public boolean isAddedToEnergyNet() {
        return false;
    }
}
