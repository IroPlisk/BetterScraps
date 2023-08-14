package Ball8.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Ball8.items.Item8Ball;

public class Items {
    // elementari
    public static Item ball8, cocco;


    public static void initItems() {
        ball8 = new ItemGeneric(15008, 1, "burro", 1, "errore");
        cocco = new Item8Ball(15009);
    }

    public static void registerLanguages() {

        LanguageRegistry.addName(ball8, "burro");
        LanguageRegistry.addName(cocco, "big ball");
    };

};
