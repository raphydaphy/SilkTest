package com.raphydaphy.silktest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CommandRegistry;
import net.minecraft.server.command.ServerCommandManager;
import net.minecraft.text.StringTextComponent;

public class SilkTest implements ModInitializer
{

	@Override
	public void onInitialize()
	{
		CommandRegistry.INSTANCE.register(false, dispatcher -> dispatcher.register(ServerCommandManager.literal("silk-test").executes(command ->
		{
			command.getSource().sendFeedback(new StringTextComponent("It worked!"), false);
			return 1;
		})));
	}
}
