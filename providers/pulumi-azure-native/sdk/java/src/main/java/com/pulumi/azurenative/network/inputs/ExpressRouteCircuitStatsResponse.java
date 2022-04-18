// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains stats associated with the peering.
 * 
 */
public final class ExpressRouteCircuitStatsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitStatsResponse Empty = new ExpressRouteCircuitStatsResponse();

    /**
     * The Primary BytesIn of the peering.
     * 
     */
    @Import(name="primarybytesIn")
      private final @Nullable Double primarybytesIn;

    public Optional<Double> primarybytesIn() {
        return this.primarybytesIn == null ? Optional.empty() : Optional.ofNullable(this.primarybytesIn);
    }

    /**
     * The primary BytesOut of the peering.
     * 
     */
    @Import(name="primarybytesOut")
      private final @Nullable Double primarybytesOut;

    public Optional<Double> primarybytesOut() {
        return this.primarybytesOut == null ? Optional.empty() : Optional.ofNullable(this.primarybytesOut);
    }

    /**
     * The secondary BytesIn of the peering.
     * 
     */
    @Import(name="secondarybytesIn")
      private final @Nullable Double secondarybytesIn;

    public Optional<Double> secondarybytesIn() {
        return this.secondarybytesIn == null ? Optional.empty() : Optional.ofNullable(this.secondarybytesIn);
    }

    /**
     * The secondary BytesOut of the peering.
     * 
     */
    @Import(name="secondarybytesOut")
      private final @Nullable Double secondarybytesOut;

    public Optional<Double> secondarybytesOut() {
        return this.secondarybytesOut == null ? Optional.empty() : Optional.ofNullable(this.secondarybytesOut);
    }

    public ExpressRouteCircuitStatsResponse(
        @Nullable Double primarybytesIn,
        @Nullable Double primarybytesOut,
        @Nullable Double secondarybytesIn,
        @Nullable Double secondarybytesOut) {
        this.primarybytesIn = primarybytesIn;
        this.primarybytesOut = primarybytesOut;
        this.secondarybytesIn = secondarybytesIn;
        this.secondarybytesOut = secondarybytesOut;
    }

    private ExpressRouteCircuitStatsResponse() {
        this.primarybytesIn = null;
        this.primarybytesOut = null;
        this.secondarybytesIn = null;
        this.secondarybytesOut = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double primarybytesIn;
        private @Nullable Double primarybytesOut;
        private @Nullable Double secondarybytesIn;
        private @Nullable Double secondarybytesOut;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primarybytesIn = defaults.primarybytesIn;
    	      this.primarybytesOut = defaults.primarybytesOut;
    	      this.secondarybytesIn = defaults.secondarybytesIn;
    	      this.secondarybytesOut = defaults.secondarybytesOut;
        }

        public Builder primarybytesIn(@Nullable Double primarybytesIn) {
            this.primarybytesIn = primarybytesIn;
            return this;
        }
        public Builder primarybytesOut(@Nullable Double primarybytesOut) {
            this.primarybytesOut = primarybytesOut;
            return this;
        }
        public Builder secondarybytesIn(@Nullable Double secondarybytesIn) {
            this.secondarybytesIn = secondarybytesIn;
            return this;
        }
        public Builder secondarybytesOut(@Nullable Double secondarybytesOut) {
            this.secondarybytesOut = secondarybytesOut;
            return this;
        }        public ExpressRouteCircuitStatsResponse build() {
            return new ExpressRouteCircuitStatsResponse(primarybytesIn, primarybytesOut, secondarybytesIn, secondarybytesOut);
        }
    }
}
