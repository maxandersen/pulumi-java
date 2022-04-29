// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.Action;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual network rule.
 * 
 */
public final class VirtualNetworkRuleArgs extends ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * The action of virtual network rule.
     * 
     */
    @Import(name="action")
    private @Nullable Output<Either<String,Action>> action;

    /**
     * @return The action of virtual network rule.
     * 
     */
    public Optional<Output<Either<String,Action>>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @Import(name="virtualNetworkResourceId", required=true)
    private Output<String> virtualNetworkResourceId;

    /**
     * @return Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    public Output<String> virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    private VirtualNetworkRuleArgs() {}

    private VirtualNetworkRuleArgs(VirtualNetworkRuleArgs $) {
        this.action = $.action;
        this.virtualNetworkResourceId = $.virtualNetworkResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkRuleArgs $;

        public Builder() {
            $ = new VirtualNetworkRuleArgs();
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
            $ = new VirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action of virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<Either<String,Action>> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action of virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Either<String,Action> action) {
            return action(Output.of(action));
        }

        /**
         * @param action The action of virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Either.ofLeft(action));
        }

        /**
         * @param action The action of virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Action action) {
            return action(Either.ofRight(action));
        }

        /**
         * @param virtualNetworkResourceId Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkResourceId(Output<String> virtualNetworkResourceId) {
            $.virtualNetworkResourceId = virtualNetworkResourceId;
            return this;
        }

        /**
         * @param virtualNetworkResourceId Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            return virtualNetworkResourceId(Output.of(virtualNetworkResourceId));
        }

        public VirtualNetworkRuleArgs build() {
            $.action = Codegen.stringProp("action").left(Action.class).output().arg($.action).def("Allow").getNullable();
            $.virtualNetworkResourceId = Objects.requireNonNull($.virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
            return $;
        }
    }

}
