// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains ServiceProviderProperties in an ExpressRouteCircuit.
 * 
 */
public final class ExpressRouteCircuitServiceProviderPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitServiceProviderPropertiesResponse Empty = new ExpressRouteCircuitServiceProviderPropertiesResponse();

    /**
     * The BandwidthInMbps.
     * 
     */
    @Import(name="bandwidthInMbps")
      private final @Nullable Integer bandwidthInMbps;

    public Optional<Integer> bandwidthInMbps() {
        return this.bandwidthInMbps == null ? Optional.empty() : Optional.ofNullable(this.bandwidthInMbps);
    }

    /**
     * The peering location.
     * 
     */
    @Import(name="peeringLocation")
      private final @Nullable String peeringLocation;

    public Optional<String> peeringLocation() {
        return this.peeringLocation == null ? Optional.empty() : Optional.ofNullable(this.peeringLocation);
    }

    /**
     * The serviceProviderName.
     * 
     */
    @Import(name="serviceProviderName")
      private final @Nullable String serviceProviderName;

    public Optional<String> serviceProviderName() {
        return this.serviceProviderName == null ? Optional.empty() : Optional.ofNullable(this.serviceProviderName);
    }

    public ExpressRouteCircuitServiceProviderPropertiesResponse(
        @Nullable Integer bandwidthInMbps,
        @Nullable String peeringLocation,
        @Nullable String serviceProviderName) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.peeringLocation = peeringLocation;
        this.serviceProviderName = serviceProviderName;
    }

    private ExpressRouteCircuitServiceProviderPropertiesResponse() {
        this.bandwidthInMbps = null;
        this.peeringLocation = null;
        this.serviceProviderName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandwidthInMbps;
        private @Nullable String peeringLocation;
        private @Nullable String serviceProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.serviceProviderName = defaults.serviceProviderName;
        }

        public Builder bandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }
        public Builder peeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }
        public Builder serviceProviderName(@Nullable String serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            return this;
        }        public ExpressRouteCircuitServiceProviderPropertiesResponse build() {
            return new ExpressRouteCircuitServiceProviderPropertiesResponse(bandwidthInMbps, peeringLocation, serviceProviderName);
        }
    }
}
