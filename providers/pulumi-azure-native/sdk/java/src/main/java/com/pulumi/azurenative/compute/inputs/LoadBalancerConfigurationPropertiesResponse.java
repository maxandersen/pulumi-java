// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LoadBalancerFrontendIPConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerConfigurationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigurationPropertiesResponse Empty = new LoadBalancerConfigurationPropertiesResponse();

    /**
     * Specifies the frontend IP to be used for the load balancer. Only IPv4 frontend IP address is supported. Each load balancer configuration must have exactly one frontend IP configuration.
     * 
     */
    @Import(name="frontendIPConfigurations", required=true)
    private List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations;

    public List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    private LoadBalancerConfigurationPropertiesResponse() {}

    private LoadBalancerConfigurationPropertiesResponse(LoadBalancerConfigurationPropertiesResponse $) {
        this.frontendIPConfigurations = $.frontendIPConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerConfigurationPropertiesResponse $;

        public Builder() {
            $ = new LoadBalancerConfigurationPropertiesResponse();
        }

        public Builder(LoadBalancerConfigurationPropertiesResponse defaults) {
            $ = new LoadBalancerConfigurationPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder frontendIPConfigurations(List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder frontendIPConfigurations(LoadBalancerFrontendIPConfigurationResponse... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        public LoadBalancerConfigurationPropertiesResponse build() {
            $.frontendIPConfigurations = Objects.requireNonNull($.frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
            return $;
        }
    }

}
