// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.azurenative.managednetwork.inputs.ScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkArgs Empty = new ManagedNetworkArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName")
    private @Nullable Output<String> managedNetworkName;

    public Optional<Output<String>> managedNetworkName() {
        return Optional.ofNullable(this.managedNetworkName);
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
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
     */
    @Import(name="scope")
    private @Nullable Output<ScopeArgs> scope;

    public Optional<Output<ScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ManagedNetworkArgs() {}

    private ManagedNetworkArgs(ManagedNetworkArgs $) {
        this.location = $.location;
        this.managedNetworkName = $.managedNetworkName;
        this.resourceGroupName = $.resourceGroupName;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedNetworkArgs $;

        public Builder() {
            $ = new ManagedNetworkArgs();
        }

        public Builder(ManagedNetworkArgs defaults) {
            $ = new ManagedNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder managedNetworkName(@Nullable Output<String> managedNetworkName) {
            $.managedNetworkName = managedNetworkName;
            return this;
        }

        public Builder managedNetworkName(String managedNetworkName) {
            return managedNetworkName(Output.of(managedNetworkName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(ScopeArgs scope) {
            return scope(Output.of(scope));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ManagedNetworkArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
