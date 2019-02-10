package org.icannt.mobtest.proxy;

import org.icannt.mobtest.lib.EntityInit;
import org.icannt.mobtest.lib.RenderHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 09/02/18.
 */
@Mod.EventBusSubscriber
public abstract class CommonProxy {
	
    public void preInit(FMLPreInitializationEvent event) {
    	EntityInit.registerEntities();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}