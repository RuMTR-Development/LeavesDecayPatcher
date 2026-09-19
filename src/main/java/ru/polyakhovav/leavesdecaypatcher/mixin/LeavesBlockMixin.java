package ru.polyakhovav.leavesdecaypatcher.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.polyakhovav.leavesdecaypatcher.ModGameRules;

@Mixin(LeavesBlock.class)
public class LeavesBlockMixin {
    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    public void randomTick(
            BlockState state,
            ServerLevel level,
            BlockPos pos,

            //#if MC >= 1.19
            net.minecraft.util.RandomSource random,
            //#else
            //$$ java.util.Random random,
            //#endif

            CallbackInfo ci
    ) {
        if (level.getGameRules().getBoolean(ModGameRules.LEAVES_DECAY)) {
            return;
        }

        ci.cancel();
    }
}
