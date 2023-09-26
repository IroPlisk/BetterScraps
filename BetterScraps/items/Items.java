package BetterScraps.items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
    // elementari
    public static net.minecraft.item.Item scrapm, scrapt, scrapg, scrapr, scrapo, scrapbm, scrapbt, scrapbg, scrapbr, scrapbo;


    public static void initItems() {
        // scrap metallico
        scrapm = new ItemGeneric(15010, 0, "scrapmet", 64, "");
        // scrap terroso
        scrapt = new ItemGeneric(15011, 1, "scrapter", 64, "");
        // scrap gemma
        scrapg = new ItemGeneric(15012, 2, "scrapgem", 64, "");
        // scrap radioattivo
        scrapr = new ItemGeneric(15013, 3, "scraprad", 64, "Perchè sento un sapore metallico in bocca?");
        // scrap organico
        scrapo = new ItemGeneric(15014, 4, "scraporg", 64, "");
        // scrap box metallico
        scrapbm = new ItemGeneric(15015, 16, "scrapboxmet", 64, "");
        // scrap box terroso
        scrapbt = new ItemGeneric(15016, 17, "scrapboxter", 64, "");
        // scrap box gemma
        scrapbg = new ItemGeneric(15017, 18, "scrapboxmgem", 64, "");
        // scrap box radioattivo
        scrapbr = new ItemGeneric(15018, 19, "scrapboxrad", 64, "Non sono 3.6, sono 15 mila Rontgen");
        // scrap box organico
        scrapbo = new ItemGeneric(15019, 20, "scrapboxorg", 64, "");
    }

    public static void registerLanguages() {
        LanguageRegistry.addName(scrapm, "Scrap metallico");
        LanguageRegistry.addName(scrapt, "Scrap terroso");
        LanguageRegistry.addName(scrapg, "Scrap gemma");
        LanguageRegistry.addName(scrapr, "Scrap radioattivo");
        LanguageRegistry.addName(scrapo, "Scrap organico");
        LanguageRegistry.addName(scrapbm, "Scrap Box Metallico");
        LanguageRegistry.addName(scrapbt, "Scrap Box Terroso");
        LanguageRegistry.addName(scrapbg, "Scrap Box Gemma");
        LanguageRegistry.addName(scrapbr, "Scrap Box Radioattivo");
        LanguageRegistry.addName(scrapbo, "Scrap Box Organico");
    }

    ;

};
