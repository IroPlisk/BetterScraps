package BetterScraps.Entity;

import BetterScraps.Blocks.Blocchi;

import BetterScraps.Container.ContainerRecycler;
import ic2.api.Direction;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.IWrenchable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityNuovoRecycler extends TileEntity implements IEnergySink, IWrenchable, IInventory {


    @Override
    public int getSizeInventory() {
        return 2;
    }

    @Override
    public ItemStack getStackInSlot(int var1) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int var1, int var2) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int var1) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {

    }

    @Override
    public String getInvName() {
        return null;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

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
        return true;
    }

    @Override
    public float getWrenchDropRate() {
        return 1.0f;
    }

    @Override
    public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
        return new ItemStack(Blocchi.nrecycler);
    }

    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
        return true;
    }

    @Override
    public int demandsEnergy() {
        return 32;
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

    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return entityPlayer.getDistanceSq(this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5) <= 64;
    }

    @Override
    public void openChest() {

    }

    @Override
    public void closeChest() {

    }

    public int getSmeltingProgressScaled(int i) {
        return 30;
    }

    public int getBurnTimeRemainingScaled(int i) {
        return 30;
    }
}
