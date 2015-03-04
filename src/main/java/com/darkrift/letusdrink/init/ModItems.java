package com.darkrift.letusdrink.init;

import com.darkrift.letusdrink.item.ItemLUD;
import com.darkrift.letusdrink.item.ItemPint;
import com.darkrift.letusdrink.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    // Instanciate items here !
    public static final ItemLUD pint = new ItemPint();

    public static void init()
    {
        // Add items to game registry here
        GameRegistry.registerItem(pint, "pint");
    }
}
