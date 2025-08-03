package com.unrectified.spawnbfvehicles;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = SpawnBfVehicles.MOD_ID)
public class BonjourCommand {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
                Commands.literal("bonjour")
                        .executes(context -> {
                            System.out.println("[TrucMod] Tentative de discard bloquée !");
                            context.getSource().sendSuccess(() -> Component.literal("§aBonjour !"), false);
                            return 1;
                        })
        );
    }
}
