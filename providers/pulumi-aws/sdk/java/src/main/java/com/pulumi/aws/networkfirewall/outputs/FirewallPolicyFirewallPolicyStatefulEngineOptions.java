// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyStatefulEngineOptions {
    /**
     * @return Indicates how to manage the order of stateful rule evaluation for the policy. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    private final String ruleOrder;

    @CustomType.Constructor
    private FirewallPolicyFirewallPolicyStatefulEngineOptions(@CustomType.Parameter("ruleOrder") String ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    /**
     * @return Indicates how to manage the order of stateful rule evaluation for the policy. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    public String ruleOrder() {
        return this.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatefulEngineOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulEngineOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder ruleOrder(String ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }        public FirewallPolicyFirewallPolicyStatefulEngineOptions build() {
            return new FirewallPolicyFirewallPolicyStatefulEngineOptions(ruleOrder);
        }
    }
}
