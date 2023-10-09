package BetterScraps;

import BetterScraps.Blocks.Blocchi;
import BetterScraps.GUIs.GUIHandler;
import BetterScraps.Recipes.RicetteScrapbox;
import BetterScraps.items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//@Mod(name = "Enhanced Geology", version = "1.0", modid = "BetterScraps", dependencies = "required-after:IC2;")

@Mod(modid = "69", name = "BetterScraps", version = "1.0", dependencies = "required-after:IC2;")
public class Main {

    @Mod.Instance("69") // Replace "modid" with your actual mod ID
    public static Main instance;
    public static GUIHandler guiHandler;


    public String getVersion() {
        return "1.0";
    }


    public void load() {


    }

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[BetterScraps] Sesso Meduso :] --TheMineGamer31");
    }


    @Init
    public void init(FMLInitializationEvent event) {
        Blocchi.InizializzaStiBlocchi();
        Blocchi.RegistraStiBlocchi();
        Blocchi.ParlaComeMangi();
        Items.initItems();
        Items.registerLanguages();
        guiHandler = new GUIHandler();
        NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        RicetteScrapbox.AggiungiCrafting();
    }


}
