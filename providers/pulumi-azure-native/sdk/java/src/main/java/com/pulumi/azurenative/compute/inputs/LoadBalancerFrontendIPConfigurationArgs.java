// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LoadBalancerFrontendIPConfigurationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerFrontendIPConfigurationArgs extends ResourceArgs {

    public static final LoadBalancerFrontendIPConfigurationArgs Empty = new LoadBalancerFrontendIPConfigurationArgs();

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Properties of load balancer frontend ip configuration.
     * 
     */
    @Import(name="properties", required=true)
    private Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties;

    /**
     * @return Properties of load balancer frontend ip configuration.
     * 
     */
    public Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties() {
        return this.properties;
    }

    private LoadBalancerFrontendIPConfigurationArgs() {}

    private LoadBalancerFrontendIPConfigurationArgs(LoadBalancerFrontendIPConfigurationArgs $) {
        this.name = $.name;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerFrontendIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerFrontendIPConfigurationArgs $;

        public Builder() {
            $ = new LoadBalancerFrontendIPConfigurationArgs();
        }

        public Builder(LoadBalancerFrontendIPConfigurationArgs defaults) {
            $ = new LoadBalancerFrontendIPConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Properties of load balancer frontend ip configuration.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of load balancer frontend ip configuration.
         * 
         * @return builder
         * 
         */
        public Builder properties(LoadBalancerFrontendIPConfigurationPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public LoadBalancerFrontendIPConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
