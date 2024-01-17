package me.jellysquid.mods.sodium.mixin.features.fast_biome_colors;

import org.spongepowered.asm.mixin.Mixin;

import me.jellysquid.mods.sodium.client.render.vanilla.block.BlockColorSettings;
import me.jellysquid.mods.sodium.client.render.vanilla.block.DefaultBlockColorSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

@Mixin(Fluid.class)
public class MixinFluid implements BlockColorSettings<FluidState> {
    @Override
    public boolean useSmoothColorBlending(BlockAndTintGetter view, FluidState state, BlockPos pos) {
        return DefaultBlockColorSettings.isSmoothBlendingAvailable(state.getType());
    }
}