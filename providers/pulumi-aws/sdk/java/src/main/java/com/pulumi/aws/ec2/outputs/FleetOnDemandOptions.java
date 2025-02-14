// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetOnDemandOptions {
    /**
     * @return How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    private final @Nullable String allocationStrategy;

    @CustomType.Constructor
    private FleetOnDemandOptions(@CustomType.Parameter("allocationStrategy") @Nullable String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * @return How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    public Optional<String> allocationStrategy() {
        return Optional.ofNullable(this.allocationStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetOnDemandOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetOnDemandOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }        public FleetOnDemandOptions build() {
            return new FleetOnDemandOptions(allocationStrategy);
        }
    }
}
