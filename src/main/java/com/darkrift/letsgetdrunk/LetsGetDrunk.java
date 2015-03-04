package com.darkrift.letsgetdrunk;

import com.darkrift.letsgetdrunk.proxy.IProxy;
import com.darkrift.letsgetdrunk.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsGetDrunk
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsGetDrunk instance;

    @SidedProxy(clientSide = "com.darkrift.letsgetdrunk.proxy.ClientProxy", serverSide = "com.darkrift.letsgetdrunk.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
