// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomaticRepairsPolicyResponse {
    /**
     * Specifies whether automatic repairs should be enabled on the virtual machine scale set. The default value is false.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The amount of time for which automatic repairs are suspended due to a state change on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes (PT30M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     * 
     */
    private final @Nullable String gracePeriod;

    @CustomType.Constructor
    private AutomaticRepairsPolicyResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("gracePeriod") @Nullable String gracePeriod) {
        this.enabled = enabled;
        this.gracePeriod = gracePeriod;
    }

    /**
     * Specifies whether automatic repairs should be enabled on the virtual machine scale set. The default value is false.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The amount of time for which automatic repairs are suspended due to a state change on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes (PT30M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     * 
    */
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticRepairsPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String gracePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticRepairsPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.gracePeriod = defaults.gracePeriod;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }        public AutomaticRepairsPolicyResponse build() {
            return new AutomaticRepairsPolicyResponse(enabled, gracePeriod);
        }
    }
}
