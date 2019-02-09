package org.icannt.mobtest;

import org.icannt.mobtest.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 09/02/18.
 */

@Mod(modid = MobTest.MOD_ID,
	name = MobTest.MOD_NAME,
	version = MobTest.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies = "required-after:forge@[14.23.2.2611,)")

public class MobTest {

    public static final String MOD_ID = "mobtest";
    public static final String MOD_NAME = "Mob Test";
    public static final String VERSION = "1.12.2-1.0";
    
    public static final int ENTITY_NETHERFISH = 667; 
    
    @SidedProxy(clientSide = "org.icannt.mobtest.proxy.ClientProxy", serverSide = "org.icannt.mobtest.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance(MOD_ID)
    public static MobTest instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}