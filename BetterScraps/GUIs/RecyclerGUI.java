package BetterScraps.GUIs;

import BetterScraps.Container.ContainerRecycler;
import BetterScraps.Entity.TileEntityNuovoRecycler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

public class RecyclerGUI extends GuiContainer {

    private TileEntityNuovoRecycler furnaceInventory;
    int yourFurnaceGuiID = GUIHandler.YOUR_FURNACE_GUI_ID;

    public RecyclerGUI(InventoryPlayer inventoryPlayer, TileEntityNuovoRecycler tileEntityFurnace) {
        super(new ContainerRecycler(inventoryPlayer, tileEntityFurnace));
        furnaceInventory = tileEntityFurnace;
        xSize = 176;
        ySize = 166; // Adjust dimensions to match your GUI
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        // Draw your GUI text or labels here
        fontRenderer.drawString("Sesso meduso :]", 8, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, ySize - 96 + 2, 0x404040);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        // Draw your GUI background here (usually a texture)
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        // Bind your custom GUI texture using the registered ID
        int textureID = yourFurnaceGuiID; //
        mc.renderEngine.bindTexture(mc.renderEngine.getTexture("/home/lorenzo/Documents/BetterElectrics/mcp/src/minecraft/BetterScraps/textures/TestGUI.png"));

        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;

        // Draw the main GUI texture
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);

        // Draw progress arrow if smelting
        int cookProgressScaled = furnaceInventory.getSmeltingProgressScaled(24); // Your custom method to get progress
        drawTexturedModalRect(x + 79, y + 34, 176, 14, cookProgressScaled + 1, 16);

        // Draw fuel gauge if burning
        int burnTimeRemainingScaled = furnaceInventory.getBurnTimeRemainingScaled(12); // Your custom method
        drawTexturedModalRect(x + 56, y + 36 + 12 - burnTimeRemainingScaled, 176, 12 - burnTimeRemainingScaled, 14, burnTimeRemainingScaled + 2);
    }
}
