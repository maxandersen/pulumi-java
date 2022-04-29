// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.ConfigurationType;
import com.pulumi.azurenative.network.inputs.NetworkManagerPropertiesNetworkManagerScopesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerArgs extends ResourceArgs {

    public static final NetworkManagerArgs Empty = new NetworkManagerArgs();

    /**
     * A description of the network manager.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the network manager.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the network manager.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A friendly name for the network manager.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName")
    private @Nullable Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Optional<Output<String>> networkManagerName() {
        return Optional.ofNullable(this.networkManagerName);
    }

    /**
     * Scope Access.
     * 
     */
    @Import(name="networkManagerScopeAccesses")
    private @Nullable Output<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses;

    /**
     * @return Scope Access.
     * 
     */
    public Optional<Output<List<Either<String,ConfigurationType>>>> networkManagerScopeAccesses() {
        return Optional.ofNullable(this.networkManagerScopeAccesses);
    }

    /**
     * Scope of Network Manager.
     * 
     */
    @Import(name="networkManagerScopes")
    private @Nullable Output<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes;

    /**
     * @return Scope of Network Manager.
     * 
     */
    public Optional<Output<NetworkManagerPropertiesNetworkManagerScopesArgs>> networkManagerScopes() {
        return Optional.ofNullable(this.networkManagerScopes);
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

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkManagerArgs() {}

    private NetworkManagerArgs(NetworkManagerArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.id = $.id;
        this.location = $.location;
        this.networkManagerName = $.networkManagerName;
        this.networkManagerScopeAccesses = $.networkManagerScopeAccesses;
        this.networkManagerScopes = $.networkManagerScopes;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerArgs $;

        public Builder() {
            $ = new NetworkManagerArgs();
        }

        public Builder(NetworkManagerArgs defaults) {
            $ = new NetworkManagerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A friendly name for the network manager.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A friendly name for the network manager.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(@Nullable Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
        }

        /**
         * @param networkManagerScopeAccesses Scope Access.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerScopeAccesses(@Nullable Output<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses) {
            $.networkManagerScopeAccesses = networkManagerScopeAccesses;
            return this;
        }

        /**
         * @param networkManagerScopeAccesses Scope Access.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerScopeAccesses(List<Either<String,ConfigurationType>> networkManagerScopeAccesses) {
            return networkManagerScopeAccesses(Output.of(networkManagerScopeAccesses));
        }

        /**
         * @param networkManagerScopeAccesses Scope Access.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerScopeAccesses(Either<String,ConfigurationType>... networkManagerScopeAccesses) {
            return networkManagerScopeAccesses(List.of(networkManagerScopeAccesses));
        }

        /**
         * @param networkManagerScopes Scope of Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerScopes(@Nullable Output<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes) {
            $.networkManagerScopes = networkManagerScopes;
            return this;
        }

        /**
         * @param networkManagerScopes Scope of Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerScopes(NetworkManagerPropertiesNetworkManagerScopesArgs networkManagerScopes) {
            return networkManagerScopes(Output.of(networkManagerScopes));
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

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkManagerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
