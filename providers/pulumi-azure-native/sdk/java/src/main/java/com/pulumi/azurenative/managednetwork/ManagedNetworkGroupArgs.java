// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.azurenative.managednetwork.enums.Kind;
import com.pulumi.azurenative.managednetwork.inputs.ResourceIdArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedNetworkGroupArgs extends ResourceArgs {

    public static final ManagedNetworkGroupArgs Empty = new ManagedNetworkGroupArgs();

    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Either<String,Kind>> kind;

    /**
     * @return Responsibility role under which this Managed Network Group will be created
     * 
     */
    public Optional<Output<Either<String,Kind>>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Managed Network Group.
     * 
     */
    @Import(name="managedNetworkGroupName")
    private @Nullable Output<String> managedNetworkGroupName;

    /**
     * @return The name of the Managed Network Group.
     * 
     */
    public Optional<Output<String>> managedNetworkGroupName() {
        return Optional.ofNullable(this.managedNetworkGroupName);
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName", required=true)
    private Output<String> managedNetworkName;

    /**
     * @return The name of the Managed Network.
     * 
     */
    public Output<String> managedNetworkName() {
        return this.managedNetworkName;
    }

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Import(name="managementGroups")
    private @Nullable Output<List<ResourceIdArgs>> managementGroups;

    /**
     * @return The collection of management groups covered by the Managed Network
     * 
     */
    public Optional<Output<List<ResourceIdArgs>>> managementGroups() {
        return Optional.ofNullable(this.managementGroups);
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
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<ResourceIdArgs>> subnets;

    /**
     * @return The collection of  subnets covered by the Managed Network
     * 
     */
    public Optional<Output<List<ResourceIdArgs>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Import(name="subscriptions")
    private @Nullable Output<List<ResourceIdArgs>> subscriptions;

    /**
     * @return The collection of subscriptions covered by the Managed Network
     * 
     */
    public Optional<Output<List<ResourceIdArgs>>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Import(name="virtualNetworks")
    private @Nullable Output<List<ResourceIdArgs>> virtualNetworks;

    /**
     * @return The collection of virtual nets covered by the Managed Network
     * 
     */
    public Optional<Output<List<ResourceIdArgs>>> virtualNetworks() {
        return Optional.ofNullable(this.virtualNetworks);
    }

    private ManagedNetworkGroupArgs() {}

    private ManagedNetworkGroupArgs(ManagedNetworkGroupArgs $) {
        this.kind = $.kind;
        this.location = $.location;
        this.managedNetworkGroupName = $.managedNetworkGroupName;
        this.managedNetworkName = $.managedNetworkName;
        this.managementGroups = $.managementGroups;
        this.resourceGroupName = $.resourceGroupName;
        this.subnets = $.subnets;
        this.subscriptions = $.subscriptions;
        this.virtualNetworks = $.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedNetworkGroupArgs $;

        public Builder() {
            $ = new ManagedNetworkGroupArgs();
        }

        public Builder(ManagedNetworkGroupArgs defaults) {
            $ = new ManagedNetworkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Responsibility role under which this Managed Network Group will be created
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Responsibility role under which this Managed Network Group will be created
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind Responsibility role under which this Managed Network Group will be created
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind Responsibility role under which this Managed Network Group will be created
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedNetworkGroupName The name of the Managed Network Group.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkGroupName(@Nullable Output<String> managedNetworkGroupName) {
            $.managedNetworkGroupName = managedNetworkGroupName;
            return this;
        }

        /**
         * @param managedNetworkGroupName The name of the Managed Network Group.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkGroupName(String managedNetworkGroupName) {
            return managedNetworkGroupName(Output.of(managedNetworkGroupName));
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(Output<String> managedNetworkName) {
            $.managedNetworkName = managedNetworkName;
            return this;
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(String managedNetworkName) {
            return managedNetworkName(Output.of(managedNetworkName));
        }

        /**
         * @param managementGroups The collection of management groups covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder managementGroups(@Nullable Output<List<ResourceIdArgs>> managementGroups) {
            $.managementGroups = managementGroups;
            return this;
        }

        /**
         * @param managementGroups The collection of management groups covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder managementGroups(List<ResourceIdArgs> managementGroups) {
            return managementGroups(Output.of(managementGroups));
        }

        /**
         * @param managementGroups The collection of management groups covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder managementGroups(ResourceIdArgs... managementGroups) {
            return managementGroups(List.of(managementGroups));
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
         * @param subnets The collection of  subnets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<ResourceIdArgs>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The collection of  subnets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<ResourceIdArgs> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The collection of  subnets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subnets(ResourceIdArgs... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param subscriptions The collection of subscriptions covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subscriptions(@Nullable Output<List<ResourceIdArgs>> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        /**
         * @param subscriptions The collection of subscriptions covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subscriptions(List<ResourceIdArgs> subscriptions) {
            return subscriptions(Output.of(subscriptions));
        }

        /**
         * @param subscriptions The collection of subscriptions covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subscriptions(ResourceIdArgs... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        /**
         * @param virtualNetworks The collection of virtual nets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(@Nullable Output<List<ResourceIdArgs>> virtualNetworks) {
            $.virtualNetworks = virtualNetworks;
            return this;
        }

        /**
         * @param virtualNetworks The collection of virtual nets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(List<ResourceIdArgs> virtualNetworks) {
            return virtualNetworks(Output.of(virtualNetworks));
        }

        /**
         * @param virtualNetworks The collection of virtual nets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(ResourceIdArgs... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }

        public ManagedNetworkGroupArgs build() {
            $.managedNetworkName = Objects.requireNonNull($.managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
