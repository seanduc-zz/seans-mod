package com.example.examplemod.common;

import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArrowNock {
    @SubscribeEvent
    public static void arrowNocked(ArrowNockEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        player.swingArm(EnumHand.OFF_HAND);
        player.move(MoverType.SELF, 0, 10.0, 0);
    	System.out.println("Arrow nocked!");
    }
}