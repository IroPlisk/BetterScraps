package Ball8;
// import Ball8.main.handlers.CraftingHandler; <--da aggiungere ricette
import Ball8.items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.src.BaseMod;

@Mod(name= "Ball8", version="0.0.1", modid= "Ball8")
public class Main extends BaseMod{
	
	//@SidedProxy(clientSide="betterelectrics.main.proxies.ClientProxy", serverSide="betterelectrics.main.proxies.ServerProxy")
	//public static CommonProxy proxy;
	
	@Override
	public String getVersion() {
		return "0.0.1";
	}

	@Override
	public void load() {

		
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		//proxy.init(event);
		//Blocks.initBlocks();
		//Blocks.registerBlocks();
		//Blocks.registerLanguages();
		Items.initItems();
		Items.registerLanguages();
		//TileEntities.registerTileEntities();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	    //proxy.postInit(event);
		//CraftingHandler.AddCraftings();
	}
}
