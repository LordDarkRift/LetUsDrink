package com.darkrift.letusdrink.init;

import com.darkrift.letusdrink.item.ItemLGD;
import com.darkrift.letusdrink.item.ItemPint;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    // Instanciate items here !
    public static final ItemLGD pint = new ItemPint();

    public static void init()
    {
        // Add items to game registry here
        GameRegistry.registerItem(pint, "pint");
    }
}
