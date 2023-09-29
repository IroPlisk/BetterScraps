package BetterScraps.Container;

import BetterScraps.Entity.TileEntityNuovoRecycler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerRecycler extends Container {

    private TileEntityNuovoRecycler furnaceInventory;

    public ContainerRecycler(InventoryPlayer inventoryPlayer, TileEntityNuovoRecycler tileEntityFurnace) {
        furnaceInventory = tileEntityFurnace;

        // Add input slot (slot 0)
        addSlotToContainer(new Slot(tileEntityFurnace, 0, 56, 17));

        // Add output slot (slot 1)
        addSlotToContainer(new Slot(tileEntityFurnace, 1, 116, 35));

        // Add fuel slot (slot 2)
        addSlotToContainer(new Slot(tileEntityFurnace, 2, 56, 53));

        // Add player inventory slots
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        // Add player hotbar slots
        for (int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return furnaceInventory.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotNumber) {
        // Implement item transfer logic here
        ItemStack itemstack = null;
        Slot slot = (Slot) inventorySlots.get(slotNumber);

        if (slot != null && slot.getHasStack()) {
            ItemStack stackInSlot = slot.getStack();
            itemstack = stackInSlot.copy();

            if (slotNumber == 1) {
                // If transferring from the output slot, try to move to player inventory/hotbar first
                if (!mergeItemStack(stackInSlot, 3, 39, true)) {
                    return null;
                }
            } else if (slotNumber != 0 && slotNumber != 2) {
                // If transferring from player inventory or hotbar, try to move to input or fuel slot
                if (!mergeItemStack(stackInSlot, 0, 2, false)) {
                    return null;
                }
            } else if (!mergeItemStack(stackInSlot, 3, 39, false)) {
                return null;
            }

            if (stackInSlot.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }

            if (stackInSlot.stackSize == itemstack.stackSize) {
                return null;
            }

            transferStackInSlot(player, slotNumber);
        }

        return itemstack;
    }
}

