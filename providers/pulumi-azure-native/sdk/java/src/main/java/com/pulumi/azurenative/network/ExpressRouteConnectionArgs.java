// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringIdArgs;
import com.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteConnectionArgs Empty = new ExpressRouteConnectionArgs();

    /**
     * Authorization key to establish the connection.
     * 
     */
    @Import(name="authorizationKey")
    private @Nullable Output<String> authorizationKey;

    public Optional<Output<String>> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }

    /**
     * The name of the connection subresource.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Enable internet security.
     * 
     */
    @Import(name="enableInternetSecurity")
    private @Nullable Output<Boolean> enableInternetSecurity;

    public Optional<Output<Boolean>> enableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * The ExpressRoute circuit peering.
     * 
     */
    @Import(name="expressRouteCircuitPeering", required=true)
    private Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering;

    public Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    @Import(name="expressRouteGatewayBypass")
    private @Nullable Output<Boolean> expressRouteGatewayBypass;

    public Optional<Output<Boolean>> expressRouteGatewayBypass() {
        return Optional.ofNullable(this.expressRouteGatewayBypass);
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @Import(name="expressRouteGatewayName", required=true)
    private Output<String> expressRouteGatewayName;

    public Output<String> expressRouteGatewayName() {
        return this.expressRouteGatewayName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Import(name="routingConfiguration")
    private @Nullable Output<RoutingConfigurationArgs> routingConfiguration;

    public Optional<Output<RoutingConfigurationArgs>> routingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * The routing weight associated to the connection.
     * 
     */
    @Import(name="routingWeight")
    private @Nullable Output<Integer> routingWeight;

    public Optional<Output<Integer>> routingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }

    private ExpressRouteConnectionArgs() {}

    private ExpressRouteConnectionArgs(ExpressRouteConnectionArgs $) {
        this.authorizationKey = $.authorizationKey;
        this.connectionName = $.connectionName;
        this.enableInternetSecurity = $.enableInternetSecurity;
        this.expressRouteCircuitPeering = $.expressRouteCircuitPeering;
        this.expressRouteGatewayBypass = $.expressRouteGatewayBypass;
        this.expressRouteGatewayName = $.expressRouteGatewayName;
        this.id = $.id;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.routingConfiguration = $.routingConfiguration;
        this.routingWeight = $.routingWeight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteConnectionArgs $;

        public Builder() {
            $ = new ExpressRouteConnectionArgs();
        }

        public Builder(ExpressRouteConnectionArgs defaults) {
            $ = new ExpressRouteConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            $.authorizationKey = authorizationKey;
            return this;
        }

        public Builder authorizationKey(String authorizationKey) {
            return authorizationKey(Output.of(authorizationKey));
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        public Builder enableInternetSecurity(@Nullable Output<Boolean> enableInternetSecurity) {
            $.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder enableInternetSecurity(Boolean enableInternetSecurity) {
            return enableInternetSecurity(Output.of(enableInternetSecurity));
        }

        public Builder expressRouteCircuitPeering(Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering) {
            $.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        public Builder expressRouteCircuitPeering(ExpressRouteCircuitPeeringIdArgs expressRouteCircuitPeering) {
            return expressRouteCircuitPeering(Output.of(expressRouteCircuitPeering));
        }

        public Builder expressRouteGatewayBypass(@Nullable Output<Boolean> expressRouteGatewayBypass) {
            $.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }

        public Builder expressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
            return expressRouteGatewayBypass(Output.of(expressRouteGatewayBypass));
        }

        public Builder expressRouteGatewayName(Output<String> expressRouteGatewayName) {
            $.expressRouteGatewayName = expressRouteGatewayName;
            return this;
        }

        public Builder expressRouteGatewayName(String expressRouteGatewayName) {
            return expressRouteGatewayName(Output.of(expressRouteGatewayName));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder routingConfiguration(@Nullable Output<RoutingConfigurationArgs> routingConfiguration) {
            $.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder routingConfiguration(RoutingConfigurationArgs routingConfiguration) {
            return routingConfiguration(Output.of(routingConfiguration));
        }

        public Builder routingWeight(@Nullable Output<Integer> routingWeight) {
            $.routingWeight = routingWeight;
            return this;
        }

        public Builder routingWeight(Integer routingWeight) {
            return routingWeight(Output.of(routingWeight));
        }

        public ExpressRouteConnectionArgs build() {
            $.expressRouteCircuitPeering = Objects.requireNonNull($.expressRouteCircuitPeering, "expected parameter 'expressRouteCircuitPeering' to be non-null");
            $.expressRouteGatewayName = Objects.requireNonNull($.expressRouteGatewayName, "expected parameter 'expressRouteGatewayName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
