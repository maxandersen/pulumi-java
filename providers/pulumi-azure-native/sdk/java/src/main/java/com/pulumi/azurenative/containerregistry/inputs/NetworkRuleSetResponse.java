// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.IPRuleResponse;
import com.pulumi.azurenative.containerregistry.inputs.VirtualNetworkRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network rule set for a container registry.
 * 
 */
public final class NetworkRuleSetResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetResponse Empty = new NetworkRuleSetResponse();

    /**
     * The default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
      private final String defaultAction;

    public String defaultAction() {
        return this.defaultAction;
    }

    /**
     * The IP ACL rules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable List<IPRuleResponse> ipRules;

    public List<IPRuleResponse> ipRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    /**
     * The virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    public List<VirtualNetworkRuleResponse> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public NetworkRuleSetResponse(
        String defaultAction,
        @Nullable List<IPRuleResponse> ipRules,
        @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.defaultAction = defaultAction == null ? "Allow" : Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetResponse() {
        this.defaultAction = null;
        this.ipRules = List.of();
        this.virtualNetworkRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultAction;
        private @Nullable List<IPRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder ipRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(IPRuleResponse... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
