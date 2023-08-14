package BetterScraps.items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
    // elementari
    public static net.minecraft.item.Item ball8, cocco;


    public static void initItems() {
        ball8 = new ItemGeneric(15008, 1, "burro", 1, "errore");
        cocco = new Item(15009);
    }

    public static void registerLanguages() {

        LanguageRegistry.addName(ball8, "burro");
        LanguageRegistry.addName(cocco, "big ball");
    }

    ;

};
