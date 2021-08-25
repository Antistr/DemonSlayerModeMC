package net.mcreator.demonslayer.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetPoisonDeGlycinePotion;
import net.mcreator.demonslayer.entity.MonstreDemonEntity;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@DemonSlayerModElements.ModElement.Tag
public class SouffleDeLInsecteActifProcedure extends DemonSlayerModElements.ModElement {
	public SouffleDeLInsecteActifProcedure(DemonSlayerModElements instance) {
		super(instance, 82);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure SouffleDeLInsecteActif!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure SouffleDeLInsecteActif!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) - (0 / 2d),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()) - (0 / 2d),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) - (0 / 2d),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) + (0 / 2d),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()) + (0 / 2d),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + (0 / 2d)),
						null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world
								.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
								.getPos().getZ())))
				.findFirst().orElse(null)) != null)
				|| (((Entity) world
						.getEntitiesWithinAABB(MonstreDemonEntity.CustomEntity.class,
								new AxisAlignedBB(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX())
												- (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY())
												- (0 / 2d),
										(entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getZ()) - (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX())
												+ (0 / 2d),
										(entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getY()) + (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())
												+ (0 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
						.findFirst().orElse(null)) != null))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(
									(entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
															entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX()) - (0 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY())
											- (0 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getZ())
											- (0 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX()) + (0 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY()) + (0 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
													entity.getLook(1f).z * 5),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + (0 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
					.findFirst().orElse(null)) instanceof LivingEntity)
				((LivingEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(
										(entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX()) - (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY())
												- (0 / 2d),
										(entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f)
																.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getZ()) - (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX())
												+ (0 / 2d),
										(entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f)
																.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getY()) + (0 / 2d),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())
												+ (0 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
						.findFirst().orElse(null)))
								.addPotionEffect(new EffectInstance(EffetPoisonDeGlycinePotion.potion, (int) 200, (int) 0, (true), (true)));
		}
	}
}
