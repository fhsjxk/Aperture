package com.radiance.mixins.vulkan_render_integration;

import com.radiance.mixin_related.extensions.vulkan_render_integration.IParticleExt;
import net.minecraft.client.particle.Particle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Particle.class)
public class ParticleMixins implements IParticleExt {

    @Shadow
    protected double x;

    @Shadow
    protected double y;

    @Shadow
    protected double z;

    @Override
    public double neoVoxelRT$getX() {
        return x;
    }

    @Override
    public double neoVoxelRT$getY() {
        return y;
    }

    @Override
    public double neoVoxelRT$getZ() {
        return z;
    }
}
