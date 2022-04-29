// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.inputs;

import com.pulumi.azurenative.customproviders.enums.ActionRouting;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The route definition for an action implemented by the custom resource provider.
 * 
 */
public final class CustomRPActionRouteDefinitionArgs extends ResourceArgs {

    public static final CustomRPActionRouteDefinitionArgs Empty = new CustomRPActionRouteDefinitionArgs();

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The routing types that are supported for action requests.
     * 
     */
    @Import(name="routingType")
    private @Nullable Output<Either<String,ActionRouting>> routingType;

    /**
     * @return The routing types that are supported for action requests.
     * 
     */
    public Optional<Output<Either<String,ActionRouting>>> routingType() {
        return Optional.ofNullable(this.routingType);
    }

    private CustomRPActionRouteDefinitionArgs() {}

    private CustomRPActionRouteDefinitionArgs(CustomRPActionRouteDefinitionArgs $) {
        this.endpoint = $.endpoint;
        this.name = $.name;
        this.routingType = $.routingType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomRPActionRouteDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomRPActionRouteDefinitionArgs $;

        public Builder() {
            $ = new CustomRPActionRouteDefinitionArgs();
        }

        public Builder(CustomRPActionRouteDefinitionArgs defaults) {
            $ = new CustomRPActionRouteDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param name The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingType The routing types that are supported for action requests.
         * 
         * @return builder
         * 
         */
        public Builder routingType(@Nullable Output<Either<String,ActionRouting>> routingType) {
            $.routingType = routingType;
            return this;
        }

        /**
         * @param routingType The routing types that are supported for action requests.
         * 
         * @return builder
         * 
         */
        public Builder routingType(Either<String,ActionRouting> routingType) {
            return routingType(Output.of(routingType));
        }

        /**
         * @param routingType The routing types that are supported for action requests.
         * 
         * @return builder
         * 
         */
        public Builder routingType(String routingType) {
            return routingType(Either.ofLeft(routingType));
        }

        /**
         * @param routingType The routing types that are supported for action requests.
         * 
         * @return builder
         * 
         */
        public Builder routingType(ActionRouting routingType) {
            return routingType(Either.ofRight(routingType));
        }

        public CustomRPActionRouteDefinitionArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
