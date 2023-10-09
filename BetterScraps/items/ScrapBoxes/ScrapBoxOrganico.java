package BetterScraps.items.ScrapBoxes;

import BetterScraps.CreativeTab;
import BetterScraps.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class ScrapBoxOrganico extends Item {
    public ScrapBoxOrganico(int par1, int textureID) {
        super(par1);
        this.setTextureFile("/BetterScraps/textures/Items.png");
        this.setIconIndex(textureID);
        this.setCreativeTab(CreativeTab.BetterScraps);
        this.setItemName("sbo"); // NO
        this.setMaxStackSize(64);
    }

    final ItemStack CS = ic2.api.Items.getItem("cropSeed");

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
                             float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            int diceRoll = world.rand.nextInt(6) + 1; // Simulate a 6-sided dice roll.
            ItemStack rewardItem;

            if (diceRoll == 1) {
                // Common item
                rewardItem = new ItemStack(Item.wheat);
            } else if (diceRoll == 2 || diceRoll == 3) {
                // Uncommon item
                rewardItem = new ItemStack(Items.scrapo);
            } else if (diceRoll == 4 || diceRoll == 5) {
                // Rare item
                rewardItem = new ItemStack(Item.bone);
            } else {
                // Legendary item
                rewardItem = CS;
            }

            // Consume one dice item from the player's inventory.
            itemStack.stackSize--;

            // Give the reward item to the player.
            if (player.inventory.addItemStackToInventory(rewardItem)) {
                // If the player's inventory is full, drop the reward item in the world.
                player.dropPlayerItemWithRandomChoice(rewardItem, false);
            }
        }
        return false;
    }
}