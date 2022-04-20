// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.RouterNatRuleActionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterNatRuleResponse {
    /**
     * The action to be enforced for traffic that matches this rule.
     * 
     */
    private final RouterNatRuleActionResponse action;
    /**
     * An optional description of this rule.
     * 
     */
    private final String description;
    /**
     * CEL expression that specifies the match condition that egress traffic from a VM is evaluated against. If it evaluates to true, the corresponding `action` is enforced. The following examples are valid match expressions for public NAT: &#34;inIpRange(destination.ip, &#39;1.1.0.0/16&#39;) || inIpRange(destination.ip, &#39;2.2.0.0/16&#39;)&#34; &#34;destination.ip == &#39;1.1.0.1&#39; || destination.ip == &#39;8.8.8.8&#39;&#34; The following example is a valid match expression for private NAT: &#34;nexthop.hub == &#39;https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1&#39;&#34;
     * 
     */
    private final String match;
    /**
     * An integer uniquely identifying a rule in the list. The rule number must be a positive value between 0 and 65000, and must be unique among rules within a NAT.
     * 
     */
    private final Integer ruleNumber;

    @CustomType.Constructor
    private RouterNatRuleResponse(
        @CustomType.Parameter("action") RouterNatRuleActionResponse action,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("match") String match,
        @CustomType.Parameter("ruleNumber") Integer ruleNumber) {
        this.action = action;
        this.description = description;
        this.match = match;
        this.ruleNumber = ruleNumber;
    }

    /**
     * The action to be enforced for traffic that matches this rule.
     * 
    */
    public RouterNatRuleActionResponse action() {
        return this.action;
    }
    /**
     * An optional description of this rule.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * CEL expression that specifies the match condition that egress traffic from a VM is evaluated against. If it evaluates to true, the corresponding `action` is enforced. The following examples are valid match expressions for public NAT: &#34;inIpRange(destination.ip, &#39;1.1.0.0/16&#39;) || inIpRange(destination.ip, &#39;2.2.0.0/16&#39;)&#34; &#34;destination.ip == &#39;1.1.0.1&#39; || destination.ip == &#39;8.8.8.8&#39;&#34; The following example is a valid match expression for private NAT: &#34;nexthop.hub == &#39;https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1&#39;&#34;
     * 
    */
    public String match() {
        return this.match;
    }
    /**
     * An integer uniquely identifying a rule in the list. The rule number must be a positive value between 0 and 65000, and must be unique among rules within a NAT.
     * 
    */
    public Integer ruleNumber() {
        return this.ruleNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterNatRuleActionResponse action;
        private String description;
        private String match;
        private Integer ruleNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.match = defaults.match;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        public Builder action(RouterNatRuleActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder match(String match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder ruleNumber(Integer ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }        public RouterNatRuleResponse build() {
            return new RouterNatRuleResponse(action, description, match, ruleNumber);
        }
    }
}
