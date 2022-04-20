// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomRPResourceTypeRouteDefinitionResponse {
    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
     * 
     */
    private final String endpoint;
    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
     * 
     */
    private final String name;
    /**
     * The routing types that are supported for resource requests.
     * 
     */
    private final @Nullable String routingType;

    @CustomType.Constructor
    private CustomRPResourceTypeRouteDefinitionResponse(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("routingType") @Nullable String routingType) {
        this.endpoint = endpoint;
        this.name = name;
        this.routingType = routingType;
    }

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
     * 
    */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The routing types that are supported for resource requests.
     * 
    */
    public Optional<String> routingType() {
        return Optional.ofNullable(this.routingType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String name;
        private @Nullable String routingType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.routingType = defaults.routingType;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder routingType(@Nullable String routingType) {
            this.routingType = routingType;
            return this;
        }        public CustomRPResourceTypeRouteDefinitionResponse build() {
            return new CustomRPResourceTypeRouteDefinitionResponse(endpoint, name, routingType);
        }
    }
}
