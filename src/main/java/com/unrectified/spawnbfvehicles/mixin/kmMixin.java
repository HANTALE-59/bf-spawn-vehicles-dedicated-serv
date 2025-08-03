
package com.unrectified.spawnbfvehicles.mixin;

import com.boehmod.blockfront.ko;
import net.minecraft.server.level.ServerLevel;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin({ko.class})
public class kmMixin {
    @Overwrite
    public void a(@NotNull ServerLevel var1) {
    }
}
