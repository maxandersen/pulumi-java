// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LoadBalancerConfigurationPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerConfigurationResponse {
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the Load balancer
     * 
     */
    private final String name;
    /**
     * Properties of the load balancer configuration.
     * 
     */
    private final LoadBalancerConfigurationPropertiesResponse properties;

    @CustomType.Constructor
    private LoadBalancerConfigurationResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") LoadBalancerConfigurationPropertiesResponse properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    /**
     * Resource Id
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the Load balancer
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Properties of the load balancer configuration.
     * 
    */
    public LoadBalancerConfigurationPropertiesResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private LoadBalancerConfigurationPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(LoadBalancerConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public LoadBalancerConfigurationResponse build() {
            return new LoadBalancerConfigurationResponse(id, name, properties);
        }
    }
}
