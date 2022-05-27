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
public final class LinuxVirtualMachineScaleSetTerminationNotification {
    /**
     * @return Should the termination notification be enabled on this Virtual Machine Scale Set? Defaults to `false`.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Length of time (in minutes, between 5 and 15) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private LinuxVirtualMachineScaleSetTerminationNotification(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.enabled = enabled;
        this.timeout = timeout;
    }

    /**
     * @return Should the termination notification be enabled on this Virtual Machine Scale Set? Defaults to `false`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Length of time (in minutes, between 5 and 15) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetTerminationNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxVirtualMachineScaleSetTerminationNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeout = defaults.timeout;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public LinuxVirtualMachineScaleSetTerminationNotification build() {
            return new LinuxVirtualMachineScaleSetTerminationNotification(enabled, timeout);
        }
    }
}
