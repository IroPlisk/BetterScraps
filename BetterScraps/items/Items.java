package BetterScraps.items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
    // elementari
    public static net.minecraft.item.Item ball8, cocco, scrapm, scrapt, scrapg, scrapr, scrapo;


    public static void initItems() {
        /* scrap metallico */
        scrapm = new ItemGeneric(15010, 0, "scrapmet", 64, "");
        /* scrap terroso */
        scrapt = new ItemGeneric(15011, 1, "scrapter", 64, "");
        /* scrap gemma */
        scrapg = new ItemGeneric(15012, 2, "scrapgem", 64, "");
        /* scrap radioattivo */
        scrapr = new ItemGeneric(15013, 3, "scraprad", 64, "");
        /* scrap organico */
        scrapo = new ItemGeneric(15014, 4, "scraporg", 64, "");
        ball8 = new ItemGeneric(15008, 10, "burro", 1, "errore");
        //  cocco = new ItemRandomOLD(15009);
    }

    public static void registerLanguages() {

        LanguageRegistry.addName(ball8, "burro");
        //   LanguageRegistry.addName(cocco, "big ball");
        LanguageRegistry.addName(scrapm, "Scrap metallico");
        LanguageRegistry.addName(scrapt, "Scrap terroso");
        LanguageRegistry.addName(scrapg, "Scrap gemma");
        LanguageRegistry.addName(scrapr, "Scrap radioattivo");
        LanguageRegistry.addName(scrapo, "Scrap organico");
    }

    ;

};
