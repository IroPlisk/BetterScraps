package BetterScraps;

import java.io.File;

import BetterScraps.Blocks.NuovoRecycler;
import BetterScraps.Recipes.RicetteScrapbox;
import BetterScraps.items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.src.BaseMod;

@Mod(name = "Enhanced Geology", version = "1.0", modid = "BetterScraps", dependencies = "required-after:IC2;")
public class Main extends BaseMod {

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public void load() {


    }

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[BetterScraps] Sesso Meduso :] --TheMineGamer31");
    }


    @Init
    public void init(FMLInitializationEvent event) {
        NuovoRecycler.InizializzaStiBlocchi();
        NuovoRecycler.RegistraStiBlocchi();
        NuovoRecycler.ParlaComeMangi();
        Items.initItems();
        Items.registerLanguages();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        RicetteScrapbox.AggiungiCrafting();
    }
}
