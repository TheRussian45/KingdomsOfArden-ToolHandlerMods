package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChasm extends WeaponMod {
	public ModChasm() {
		super("Chasm", "Attacks deal 2 Bonus Magic Damage", 24, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		return;
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		Skill.damageEntity((LivingEntity) event.getEntity(), event.getDamager().getEntity(), 2.0, DamageCause.MAGIC);
	}

}
