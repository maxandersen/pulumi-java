// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LoadBalancerConfigurationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the load balancer configuration.
 * 
 */
public final class LoadBalancerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerConfigurationArgs Empty = new LoadBalancerConfigurationArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Load balancer
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Load balancer
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Properties of the load balancer configuration.
     * 
     */
    @Import(name="properties", required=true)
    private Output<LoadBalancerConfigurationPropertiesArgs> properties;

    /**
     * @return Properties of the load balancer configuration.
     * 
     */
    public Output<LoadBalancerConfigurationPropertiesArgs> properties() {
        return this.properties;
    }

    private LoadBalancerConfigurationArgs() {}

    private LoadBalancerConfigurationArgs(LoadBalancerConfigurationArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerConfigurationArgs $;

        public Builder() {
            $ = new LoadBalancerConfigurationArgs();
        }

        public Builder(LoadBalancerConfigurationArgs defaults) {
            $ = new LoadBalancerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Load balancer
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Load balancer
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Properties of the load balancer configuration.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<LoadBalancerConfigurationPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of the load balancer configuration.
         * 
         * @return builder
         * 
         */
        public Builder properties(LoadBalancerConfigurationPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public LoadBalancerConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
