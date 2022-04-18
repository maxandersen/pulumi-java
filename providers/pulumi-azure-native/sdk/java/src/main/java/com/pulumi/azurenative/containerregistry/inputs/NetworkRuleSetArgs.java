// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.DefaultAction;
import com.pulumi.azurenative.containerregistry.inputs.IPRuleArgs;
import com.pulumi.azurenative.containerregistry.inputs.VirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network rule set for a container registry.
 * 
 */
public final class NetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * The default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
      private final Output<Either<String,DefaultAction>> defaultAction;

    public Output<Either<String,DefaultAction>> defaultAction() {
        return this.defaultAction;
    }

    /**
     * The IP ACL rules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable Output<List<IPRuleArgs>> ipRules;

    public Output<List<IPRuleArgs>> ipRules() {
        return this.ipRules == null ? Codegen.empty() : this.ipRules;
    }

    /**
     * The virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? Codegen.empty() : this.virtualNetworkRules;
    }

    public NetworkRuleSetArgs(
        Output<Either<String,DefaultAction>> defaultAction,
        @Nullable Output<List<IPRuleArgs>> ipRules,
        @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.defaultAction = defaultAction == null ? Output.ofLeft("Allow") : Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetArgs() {
        this.defaultAction = Codegen.empty();
        this.ipRules = Codegen.empty();
        this.virtualNetworkRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,DefaultAction>> defaultAction;
        private @Nullable Output<List<IPRuleArgs>> ipRules;
        private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(Output<Either<String,DefaultAction>> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder defaultAction(Either<String,DefaultAction> defaultAction) {
            this.defaultAction = Output.of(Objects.requireNonNull(defaultAction));
            return this;
        }
        public Builder ipRules(@Nullable Output<List<IPRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(@Nullable List<IPRuleArgs> ipRules) {
            this.ipRules = Codegen.ofNullable(ipRules);
            return this;
        }
        public Builder ipRules(IPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Codegen.ofNullable(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetArgs build() {
            return new NetworkRuleSetArgs(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
