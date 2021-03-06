package org.icannt.mobtest.lib;

import org.icannt.mobtest.entity.EntityNetherfish;
import org.icannt.mobtest.entity.render.RenderNetherfish;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by ICannt on 09/02/18.
 */
public class RenderHandler {

	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherfish.class, new IRenderFactory<EntityNetherfish>() {
			@Override
			public Render<? super EntityNetherfish> createRenderFor(RenderManager manager) {
				return new RenderNetherfish(manager);
			}
		});
	}
}
