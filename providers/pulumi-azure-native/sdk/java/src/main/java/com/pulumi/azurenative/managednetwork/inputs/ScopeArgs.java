// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.azurenative.managednetwork.inputs.ResourceIdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scope of a Managed Network
 * 
 */
public final class ScopeArgs extends ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

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

    private ScopeArgs() {}

    private ScopeArgs(ScopeArgs $) {
        this.managementGroups = $.managementGroups;
        this.subnets = $.subnets;
        this.subscriptions = $.subscriptions;
        this.virtualNetworks = $.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeArgs $;

        public Builder() {
            $ = new ScopeArgs();
        }

        public Builder(ScopeArgs defaults) {
            $ = new ScopeArgs(Objects.requireNonNull(defaults));
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

        public ScopeArgs build() {
            return $;
        }
    }

}
