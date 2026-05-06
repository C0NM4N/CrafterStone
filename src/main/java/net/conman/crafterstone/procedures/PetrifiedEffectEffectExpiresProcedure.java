package net.conman.crafterstone.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.dries007.tfc.common.player.IPlayerInfo;
import net.dries007.tfc.common.player.PlayerInfo;

public class PetrifiedEffectEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level0)
			_level0.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level0, 4, "", Component.literal(""), _level0.getServer(), null).withSuppressedOutput(),
					"effect give @p cold_sweat:grace 300 255 true");
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 30, 1, false, false));
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(20);
		((LivingEntity) entity).getAttribute(BuiltInRegistries.ATTRIBUTE.getHolder(ResourceLocation.parse("minecraft:generic.scale")).get()).setBaseValue(1);
		if (entity instanceof Player plr) 
		{final IPlayerInfo info = IPlayerInfo.get(plr);
		info.setThirst(100);
		}
	}
}