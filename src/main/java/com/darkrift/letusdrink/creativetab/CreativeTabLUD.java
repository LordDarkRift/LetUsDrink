package com.darkrift.letusdrink.creativetab;

import com.darkrift.letusdrink.init.ModItems;
import com.darkrift.letusdrink.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLUD
{
    public static final CreativeTabs LUD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.pint;
        }
    };
}
