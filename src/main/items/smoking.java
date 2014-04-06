package solucraft.items;

import solucraft.SoluCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class smoking extends ItemArmor {

	public smoking(ArmorMaterial material, int id, int placement, int mods) {
		super(material, id, placement);
		this.setCreativeTab(SoluCraft.tabSoluCraftItems);
		
		if (mods == 1 && placement == 1){
			setTextureName("solucraft:doctor"); 
		} else if (placement == 2){
			setTextureName("solucraft:legs");
		} else if (placement == 3){
			setTextureName("solucraft:boots");
		} else if (placement == 0){
			setTextureName("solucraft:glass");
		} else if (placement == 1){
				setTextureName("solucraft:chest");
		}
	}
	
	
	public String getArmorTexture(ItemStack stack , Entity entity, int slot , String type){
		if (stack.getItem() == ModItems.chest || stack.getItem() == ModItems.boots || stack.getItem() == ModItems.glass){
			return ("solucraft:textures/models/armor/smoking_1.png");
		}
		if (stack.getItem() == ModItems.legs){
			return ("solucraft:textures/modeles/armor/smoking_2.png");
		} 
		if (stack.getItem() == ModItems.chestDoctor){
			return ("solucraft:textures/models/armor/doctor.png");
		}
		else{
			return null;
		}
	}
}
