package solucraft.items;

import solucraft.SoluCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class smoking extends ItemArmor {

	public smoking(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		this.setCreativeTab(SoluCraft.tabSoluCraft);
		
		       if (placement == 1){
			setTextureName("solucraft:chest");
		} else if (placement == 2){
			setTextureName("solucraft:legs");
		} else if (placement == 3){
			setTextureName("solucraft:boots");
		} else if (placement == 0){
			setTextureName("solucraft:glass");
		}
	}
	
	
	public String getArmorTexture(ItemStack stack , Entity entity, int slot , String type){
		if (stack.getItem() == ModItems.chest || stack.getItem() == ModItems.boots || stack.getItem() == ModItems.glass){
			return ("solucraft:textures/models/armor/smoking_1.png");
		}
		if (stack.getItem() == ModItems.legs){
			return ("solucraft:textures/modeles/armor/smoking_2.png");
		} 
		else{
			return null;
		}
	}
}
