package net.mcreator.alvas_season_three.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.alvas_season_three.AlvasSeason3Mod;

import java.util.Map;

public class AncientCurseOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AlvasSeason3Mod.LOGGER.warn("Failed to load dependency entity for procedure AncientCurseOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		((LivingEntity) entity).getAttribute(net.minecraft.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(0.1);
	}
}
