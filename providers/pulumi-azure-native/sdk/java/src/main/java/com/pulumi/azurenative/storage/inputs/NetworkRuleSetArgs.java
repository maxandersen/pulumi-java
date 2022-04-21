// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.Bypass;
import com.pulumi.azurenative.storage.enums.DefaultAction;
import com.pulumi.azurenative.storage.inputs.IPRuleArgs;
import com.pulumi.azurenative.storage.inputs.ResourceAccessRuleArgs;
import com.pulumi.azurenative.storage.inputs.VirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network rule set
 * 
 */
public final class NetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, &#34;Logging, Metrics&#34;), or None to bypass none of those traffics.
     * 
     */
    @Import(name="bypass")
    private @Nullable Output<Either<String,Bypass>> bypass;

    public Optional<Output<Either<String,Bypass>>> bypass() {
        return Optional.ofNullable(this.bypass);
    }

    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
    private Output<DefaultAction> defaultAction;

    public Output<DefaultAction> defaultAction() {
        return this.defaultAction;
    }

    /**
     * Sets the IP ACL rules
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<IPRuleArgs>> ipRules;

    public Optional<Output<List<IPRuleArgs>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * Sets the resource access rules
     * 
     */
    @Import(name="resourceAccessRules")
    private @Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules;

    public Optional<Output<List<ResourceAccessRuleArgs>>> resourceAccessRules() {
        return Optional.ofNullable(this.resourceAccessRules);
    }

    /**
     * Sets the virtual network rules
     * 
     */
    @Import(name="virtualNetworkRules")
    private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Optional<Output<List<VirtualNetworkRuleArgs>>> virtualNetworkRules() {
        return Optional.ofNullable(this.virtualNetworkRules);
    }

    private NetworkRuleSetArgs() {}

    private NetworkRuleSetArgs(NetworkRuleSetArgs $) {
        this.bypass = $.bypass;
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.resourceAccessRules = $.resourceAccessRules;
        this.virtualNetworkRules = $.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRuleSetArgs $;

        public Builder() {
            $ = new NetworkRuleSetArgs();
        }

        public Builder(NetworkRuleSetArgs defaults) {
            $ = new NetworkRuleSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder bypass(@Nullable Output<Either<String,Bypass>> bypass) {
            $.bypass = bypass;
            return this;
        }

        public Builder bypass(Either<String,Bypass> bypass) {
            return bypass(Output.of(bypass));
        }

        public Builder defaultAction(Output<DefaultAction> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        public Builder defaultAction(DefaultAction defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        public Builder ipRules(@Nullable Output<List<IPRuleArgs>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        public Builder ipRules(List<IPRuleArgs> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        public Builder ipRules(IPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }

        public Builder resourceAccessRules(@Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules) {
            $.resourceAccessRules = resourceAccessRules;
            return this;
        }

        public Builder resourceAccessRules(List<ResourceAccessRuleArgs> resourceAccessRules) {
            return resourceAccessRules(Output.of(resourceAccessRules));
        }

        public Builder resourceAccessRules(ResourceAccessRuleArgs... resourceAccessRules) {
            return resourceAccessRules(List.of(resourceAccessRules));
        }

        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            $.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder virtualNetworkRules(List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            return virtualNetworkRules(Output.of(virtualNetworkRules));
        }

        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }

        public NetworkRuleSetArgs build() {
            $.bypass = Codegen.stringProp("bypass").left(Bypass.class).output().arg($.bypass).def("AzureServices").getNullable();
            $.defaultAction = Codegen.objectProp("defaultAction", DefaultAction.class).output().arg($.defaultAction).def(DefaultAction.Allow).require();
            return $;
        }
    }

}
