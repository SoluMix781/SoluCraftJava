package solucraft.proxy;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.ItemSnowball;
import solucraft.entity.EntityGrenade;
import solucraft.items.ModItems;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	

    public void registerRenderThings(){
    	RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(ModItems.grenade));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	

}
