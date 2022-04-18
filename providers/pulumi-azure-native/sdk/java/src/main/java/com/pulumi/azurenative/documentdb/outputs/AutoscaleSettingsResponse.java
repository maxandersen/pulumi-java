// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleSettingsResponse {
    /**
     * Represents maximum throughput, the resource can scale up to.
     * 
     */
    private final @Nullable Integer maxThroughput;

    @CustomType.Constructor
    private AutoscaleSettingsResponse(@CustomType.Parameter("maxThroughput") @Nullable Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
    }

    /**
     * Represents maximum throughput, the resource can scale up to.
     * 
    */
    public Optional<Integer> maxThroughput() {
        return Optional.ofNullable(this.maxThroughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxThroughput = defaults.maxThroughput;
        }

        public Builder maxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }        public AutoscaleSettingsResponse build() {
            return new AutoscaleSettingsResponse(maxThroughput);
        }
    }
}
