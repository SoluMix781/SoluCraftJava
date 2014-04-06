package solucraft.entity;

import solucraft.SoluCraft;
import cpw.mods.fml.common.registry.EntityRegistry;

public class SEntity {
	
	public static void init(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityGrenade.class, "Grenade", 0x008521, 0x00FF08);
		
	}
	
	public static void createEntity(Class entityclass, String entName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityclass, entName, randomId);
		EntityRegistry.registerModEntity(entityclass, entName, randomId, SoluCraft.instance, 64, 1, true);
	}

}
