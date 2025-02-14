// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayPrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayPrivateEndpointConnectionArgs Empty = new ApplicationGatewayPrivateEndpointConnectionArgs();

    /**
     * The name of the application gateway.
     * 
     */
    @Import(name="applicationGatewayName", required=true)
    private Output<String> applicationGatewayName;

    /**
     * @return The name of the application gateway.
     * 
     */
    public Output<String> applicationGatewayName() {
        return this.applicationGatewayName;
    }

    /**
     * The name of the application gateway private endpoint connection.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    /**
     * @return The name of the application gateway private endpoint connection.
     * 
     */
    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the private endpoint connection on an application gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the private endpoint connection on an application gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Optional<Output<PrivateLinkServiceConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ApplicationGatewayPrivateEndpointConnectionArgs() {}

    private ApplicationGatewayPrivateEndpointConnectionArgs(ApplicationGatewayPrivateEndpointConnectionArgs $) {
        this.applicationGatewayName = $.applicationGatewayName;
        this.connectionName = $.connectionName;
        this.id = $.id;
        this.name = $.name;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new ApplicationGatewayPrivateEndpointConnectionArgs();
        }

        public Builder(ApplicationGatewayPrivateEndpointConnectionArgs defaults) {
            $ = new ApplicationGatewayPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayName The name of the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayName(Output<String> applicationGatewayName) {
            $.applicationGatewayName = applicationGatewayName;
            return this;
        }

        /**
         * @param applicationGatewayName The name of the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayName(String applicationGatewayName) {
            return applicationGatewayName(Output.of(applicationGatewayName));
        }

        /**
         * @param connectionName The name of the application gateway private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName The name of the application gateway private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the private endpoint connection on an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the private endpoint connection on an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ApplicationGatewayPrivateEndpointConnectionArgs build() {
            $.applicationGatewayName = Objects.requireNonNull($.applicationGatewayName, "expected parameter 'applicationGatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
