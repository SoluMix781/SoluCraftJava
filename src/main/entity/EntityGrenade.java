package solucraft.entity;

import ibxm.Player;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends EntityThrowable{
	
	public EntityGrenade(World par1){
		super(par1);
	}
	
	public EntityGrenade(World world, EntityLivingBase entity){
		super(world,entity);
		
	}

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		
		for(int i = 0 ; i < 10 ; i++){
			this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 0.9F, 0.9F, 0.9F);
		}
		
		if(!worldObj.isRemote){
			this.worldObj.createExplosion((Entity) null, this.posX, this.posY, this.posZ, 4.5F, true);
	   }
		
	}

}
