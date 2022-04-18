// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetBaselineEbsBandwidthMbpsRequest extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetBaselineEbsBandwidthMbpsRequest Empty = new SpotFleetBaselineEbsBandwidthMbpsRequest();

    @Import(name="max")
      private final @Nullable Integer max;

    public Optional<Integer> max() {
        return this.max == null ? Optional.empty() : Optional.ofNullable(this.max);
    }

    @Import(name="min")
      private final @Nullable Integer min;

    public Optional<Integer> min() {
        return this.min == null ? Optional.empty() : Optional.ofNullable(this.min);
    }

    public SpotFleetBaselineEbsBandwidthMbpsRequest(
        @Nullable Integer max,
        @Nullable Integer min) {
        this.max = max;
        this.min = min;
    }

    private SpotFleetBaselineEbsBandwidthMbpsRequest() {
        this.max = null;
        this.min = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetBaselineEbsBandwidthMbpsRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetBaselineEbsBandwidthMbpsRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }        public SpotFleetBaselineEbsBandwidthMbpsRequest build() {
            return new SpotFleetBaselineEbsBandwidthMbpsRequest(max, min);
        }
    }
}
