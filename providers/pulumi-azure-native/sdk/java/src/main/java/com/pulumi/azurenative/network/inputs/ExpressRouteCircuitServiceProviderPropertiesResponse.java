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
    private @Nullable Integer bandwidthInMbps;

    public Optional<Integer> bandwidthInMbps() {
        return Optional.ofNullable(this.bandwidthInMbps);
    }

    /**
     * The peering location.
     * 
     */
    @Import(name="peeringLocation")
    private @Nullable String peeringLocation;

    public Optional<String> peeringLocation() {
        return Optional.ofNullable(this.peeringLocation);
    }

    /**
     * The serviceProviderName.
     * 
     */
    @Import(name="serviceProviderName")
    private @Nullable String serviceProviderName;

    public Optional<String> serviceProviderName() {
        return Optional.ofNullable(this.serviceProviderName);
    }

    private ExpressRouteCircuitServiceProviderPropertiesResponse() {}

    private ExpressRouteCircuitServiceProviderPropertiesResponse(ExpressRouteCircuitServiceProviderPropertiesResponse $) {
        this.bandwidthInMbps = $.bandwidthInMbps;
        this.peeringLocation = $.peeringLocation;
        this.serviceProviderName = $.serviceProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitServiceProviderPropertiesResponse $;

        public Builder() {
            $ = new ExpressRouteCircuitServiceProviderPropertiesResponse();
        }

        public Builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
            $ = new ExpressRouteCircuitServiceProviderPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder bandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            $.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder peeringLocation(@Nullable String peeringLocation) {
            $.peeringLocation = peeringLocation;
            return this;
        }

        public Builder serviceProviderName(@Nullable String serviceProviderName) {
            $.serviceProviderName = serviceProviderName;
            return this;
        }

        public ExpressRouteCircuitServiceProviderPropertiesResponse build() {
            return $;
        }
    }

}
