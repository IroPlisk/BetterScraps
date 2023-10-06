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

public class ScrapBoxGemma extends Item {
    public ScrapBoxGemma(int par1) {
        super(par1);
        this.setTextureFile("BetterScraps/textures/Items.png");
        this.setIconIndex(18);
        this.setCreativeTab(CreativeTab.tabRedstone);
        this.setItemName("sbg");
        this.setMaxStackSize(64);
    }

    public boolean onItemRightClick(ItemStack itemStack, EntityPlayer player, World world) {
        int diceRoll = world.rand.nextInt(6) + 1; // Simulate a 6-sided dice roll.
        ItemStack rewardItem;
        if (diceRoll == 1) {
            // Common item
            rewardItem = new ItemStack(Item.redstone);
        } else if (diceRoll == 2 || diceRoll == 3) {
            // Uncommon item
            rewardItem = new ItemStack(Items.scrapg);
        } else if (diceRoll == 4 || diceRoll == 5) {
            // Rare item
            rewardItem = new ItemStack(Item.emerald);
        } else {
            // Legendary item
            rewardItem = new ItemStack(Item.diamond);
        }

        // Consume one die item from the player's inventory.
        itemStack.stackSize--;
        return true;
    }
}