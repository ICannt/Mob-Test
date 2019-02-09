package org.icannt.mobtest.entity.render;

import org.icannt.mobtest.MobTest;
import org.icannt.mobtest.entity.EntityNetherfish;

import net.minecraft.client.model.ModelSilverfish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by ICannt on 09/02/18.
 */
public class RenderNetherfish extends RenderLiving<EntityNetherfish> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(MobTest.MOD_ID, "textures/entity/netherfish.png");
	
	public RenderNetherfish(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelSilverfish(), 0.3F);
	}
	
	@Override
	protected float getDeathMaxRotation(EntityNetherfish entityLivingBaseIn) {
		return 180.0F;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityNetherfish entity) {
		return TEXTURES;
	}


}
