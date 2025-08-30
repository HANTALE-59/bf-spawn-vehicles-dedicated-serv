
package com.unrectified.spawnbfvehicles.mixin;

import com.boehmod.blockfront.mg;
import net.minecraft.server.level.ServerLevel;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(mg.class)
public class mgMixin {
    @Overwrite
    public static void a(@NotNull net.neoforged.neoforge.event.tick.EntityTickEvent.Post var0) {
        // Ne rien faire → empêche discard()
    }
}

