package com.example.examplemod.common;

import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArrowNock {
    @SubscribeEvent
    public static void arrowNocked(ArrowNockEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        
        MinecraftForge.EVENT_BUS.post(new PlayerInteractEvent.RightClickBlock(player, null, null, null, null));
    	System.out.println("Arrow nocked! right click block.");
    }
}