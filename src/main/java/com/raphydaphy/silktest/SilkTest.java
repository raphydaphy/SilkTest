package com.raphydaphy.silktest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CommandRegistry;
import net.minecraft.nbt.Tag;
import net.minecraft.server.command.ServerCommandManager;
import net.minecraft.text.StringTextComponent;

public class SilkTest implements ModInitializer
{

	@Override
	public void onInitialize()
	{
		CommandRegistry.INSTANCE.register(false, dispatcher -> dispatcher.register(ServerCommandManager.literal("silk-test").executes(command ->
		{
			Tag tag = Tag.createTag((byte)10);
			command.getSource().sendFeedback(new StringTextComponent("It worked! " + tag), false);
			return 1;
		})));
	}
}