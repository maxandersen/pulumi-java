// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.outputs;

import com.pulumi.azurenative.containerinstance.outputs.GpuResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceLimitsResponse {
    /**
     * @return The CPU limit of this container instance.
     * 
     */
    private final @Nullable Double cpu;
    /**
     * @return The GPU limit of this container instance.
     * 
     */
    private final @Nullable GpuResourceResponse gpu;
    /**
     * @return The memory limit in GB of this container instance.
     * 
     */
    private final @Nullable Double memoryInGB;

    @CustomType.Constructor
    private ResourceLimitsResponse(
        @CustomType.Parameter("cpu") @Nullable Double cpu,
        @CustomType.Parameter("gpu") @Nullable GpuResourceResponse gpu,
        @CustomType.Parameter("memoryInGB") @Nullable Double memoryInGB) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
    }

    /**
     * @return The CPU limit of this container instance.
     * 
     */
    public Optional<Double> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * @return The GPU limit of this container instance.
     * 
     */
    public Optional<GpuResourceResponse> gpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * @return The memory limit in GB of this container instance.
     * 
     */
    public Optional<Double> memoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable GpuResourceResponse gpu;
        private @Nullable Double memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder gpu(@Nullable GpuResourceResponse gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder memoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }        public ResourceLimitsResponse build() {
            return new ResourceLimitsResponse(cpu, gpu, memoryInGB);
        }
    }
}
