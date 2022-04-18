// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The route definition for an action implemented by the custom resource provider.
 * 
 */
public final class CustomRPActionRouteDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomRPActionRouteDefinitionResponse Empty = new CustomRPActionRouteDefinitionResponse();

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a path (e.g. 'https://testendpoint/{requestPath}')
     * 
     */
    @Import(name="endpoint", required=true)
      private final String endpoint;

    public String endpoint() {
        return this.endpoint;
    }

    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The routing types that are supported for action requests.
     * 
     */
    @Import(name="routingType")
      private final @Nullable String routingType;

    public Optional<String> routingType() {
        return this.routingType == null ? Optional.empty() : Optional.ofNullable(this.routingType);
    }

    public CustomRPActionRouteDefinitionResponse(
        String endpoint,
        String name,
        @Nullable String routingType) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routingType = routingType;
    }

    private CustomRPActionRouteDefinitionResponse() {
        this.endpoint = null;
        this.name = null;
        this.routingType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPActionRouteDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String name;
        private @Nullable String routingType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPActionRouteDefinitionResponse defaults) {
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
        }        public CustomRPActionRouteDefinitionResponse build() {
            return new CustomRPActionRouteDefinitionResponse(endpoint, name, routingType);
        }
    }
}
