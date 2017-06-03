package com.example.examplemod;

import com.example.examplemod.common.ArrowNock;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SeansMod.MODID, version = SeansMod.VERSION)
public class SeansMod {
	public static final String MODID = "seansmod";
	public static final String VERSION = "1.0";

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(ArrowNock.class);
	}
}