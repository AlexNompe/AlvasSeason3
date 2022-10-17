package net.mcreator.alvas_season_three.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.item.ExperienceOrbEntity;

import net.mcreator.alvas_season_three.AlvasSeason3Mod;

import java.util.Random;
import java.util.Map;

public class TinOreBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AlvasSeason3Mod.LOGGER.warn("Failed to load dependency world for procedure TinOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AlvasSeason3Mod.LOGGER.warn("Failed to load dependency x for procedure TinOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AlvasSeason3Mod.LOGGER.warn("Failed to load dependency y for procedure TinOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AlvasSeason3Mod.LOGGER.warn("Failed to load dependency z for procedure TinOreBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !world.isRemote()) {
			((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) (MathHelper.nextInt(new Random(), 1, 3))));
		}
	}
}
