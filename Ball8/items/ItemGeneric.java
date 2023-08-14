package Ball8.items;

import Ball8.CreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemGeneric extends Item {
	
	String toolTip;
	
	/**
	 * Registra un oggetto generico
	 * @param id ID dell'oggetto
	 * @param textureId ID della texture
	 * @param itemName nome oggetto
	 * @param maxStackSize Max stack size
	 * @return Item.
	 */

	public ItemGeneric(int id, int textureId, String itemName, int maxStackSize, String toolTip) {
		super(id-256);
		this.setTextureFile("/Ball8/textures/Items.png");
		this.setIconIndex(textureId);
		this.setCreativeTab(CreativeTab.tabMisc);
		this.setItemName(itemName);
		this.setMaxStackSize(maxStackSize);
		this.toolTip = toolTip;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		par3List.add("\247b" + this.toolTip);
	}

}
