// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkRoutingConfigResponse {
    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    private final String routingMode;

    @CustomType.Constructor
    private NetworkRoutingConfigResponse(@CustomType.Parameter("routingMode") String routingMode) {
        this.routingMode = routingMode;
    }

    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
    */
    public String routingMode() {
        return this.routingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRoutingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String routingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRoutingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingMode = defaults.routingMode;
        }

        public Builder routingMode(String routingMode) {
            this.routingMode = Objects.requireNonNull(routingMode);
            return this;
        }        public NetworkRoutingConfigResponse build() {
            return new NetworkRoutingConfigResponse(routingMode);
        }
    }
}
