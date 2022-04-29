// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.PrivateLinkConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppServiceEnvironmentPrivateEndpointConnectionArgs extends ResourceArgs {

    public static final AppServiceEnvironmentPrivateEndpointConnectionArgs Empty = new AppServiceEnvironmentPrivateEndpointConnectionArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the App Service Environment.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the App Service Environment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * The state of a private link connection
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return The state of a private link connection
     * 
     */
    public Optional<Output<PrivateLinkConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private AppServiceEnvironmentPrivateEndpointConnectionArgs() {}

    private AppServiceEnvironmentPrivateEndpointConnectionArgs(AppServiceEnvironmentPrivateEndpointConnectionArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServiceEnvironmentPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServiceEnvironmentPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new AppServiceEnvironmentPrivateEndpointConnectionArgs();
        }

        public Builder(AppServiceEnvironmentPrivateEndpointConnectionArgs defaults) {
            $ = new AppServiceEnvironmentPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateLinkServiceConnectionState The state of a private link connection
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState The state of a private link connection
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public AppServiceEnvironmentPrivateEndpointConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
