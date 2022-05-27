// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxVirtualMachineScaleSetAutomaticInstanceRepair {
    /**
     * @return Should the automatic instance repair be enabled on this Virtual Machine Scale Set?
     * 
     */
    private final Boolean enabled;
    /**
     * @return Amount of time (in minutes, between 30 and 90, defaults to 30 minutes) for which automatic repairs will be delayed. The grace period starts right after the VM is found unhealthy. The time duration should be specified in ISO 8601 format.
     * 
     */
    private final @Nullable String gracePeriod;

    @CustomType.Constructor
    private LinuxVirtualMachineScaleSetAutomaticInstanceRepair(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("gracePeriod") @Nullable String gracePeriod) {
        this.enabled = enabled;
        this.gracePeriod = gracePeriod;
    }

    /**
     * @return Should the automatic instance repair be enabled on this Virtual Machine Scale Set?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Amount of time (in minutes, between 30 and 90, defaults to 30 minutes) for which automatic repairs will be delayed. The grace period starts right after the VM is found unhealthy. The time duration should be specified in ISO 8601 format.
     * 
     */
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetAutomaticInstanceRepair defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String gracePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxVirtualMachineScaleSetAutomaticInstanceRepair defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.gracePeriod = defaults.gracePeriod;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }        public LinuxVirtualMachineScaleSetAutomaticInstanceRepair build() {
            return new LinuxVirtualMachineScaleSetAutomaticInstanceRepair(enabled, gracePeriod);
        }
    }
}
