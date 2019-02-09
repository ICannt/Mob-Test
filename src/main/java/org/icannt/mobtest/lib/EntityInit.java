package org.icannt.mobtest.lib;

import org.icannt.mobtest.MobTest;
import org.icannt.mobtest.entity.EntityNetherfish;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by ICannt on 09/02/18.
 */
public class EntityInit {

	public static void registerEntities() {
		registerEntity("netherfish", EntityNetherfish.class, MobTest.ENTITY_NETHERFISH, 50, 12124160, 16767232);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colorP, int colorS) {
		EntityRegistry.registerModEntity(new ResourceLocation(MobTest.MOD_ID + ":" + name), entity, name, id, MobTest.instance, range, 1, true, colorP, colorS);
	}
}
