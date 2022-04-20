// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatefulEngineOptions;
import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReference;
import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatelessCustomAction;
import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatelessRuleGroupReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyFirewallPolicy {
    /**
     * Set of actions to take on a packet if it does not match any stateful rules in the policy. This can only be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. You can specify one of either or neither values of `aws:drop_strict` or `aws:drop_established`, as well as any combination of `aws:alert_strict` and `aws:alert_established`.
     * 
     */
    private final @Nullable List<String> statefulDefaultActions;
    /**
     * A configuration block that defines options on how the policy handles stateful rules. See Stateful Engine Options below for details.
     * 
     */
    private final @Nullable FirewallPolicyFirewallPolicyStatefulEngineOptions statefulEngineOptions;
    /**
     * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
     * 
     */
    private final @Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences;
    /**
     * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy&#39;s `stateless_default_actions`. See Stateless Custom Action below for details.
     * 
     */
    private final @Nullable List<FirewallPolicyFirewallPolicyStatelessCustomAction> statelessCustomActions;
    /**
     * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    private final List<String> statelessDefaultActions;
    /**
     * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    private final List<String> statelessFragmentDefaultActions;
    /**
     * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
     * 
     */
    private final @Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences;

    @CustomType.Constructor
    private FirewallPolicyFirewallPolicy(
        @CustomType.Parameter("statefulDefaultActions") @Nullable List<String> statefulDefaultActions,
        @CustomType.Parameter("statefulEngineOptions") @Nullable FirewallPolicyFirewallPolicyStatefulEngineOptions statefulEngineOptions,
        @CustomType.Parameter("statefulRuleGroupReferences") @Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences,
        @CustomType.Parameter("statelessCustomActions") @Nullable List<FirewallPolicyFirewallPolicyStatelessCustomAction> statelessCustomActions,
        @CustomType.Parameter("statelessDefaultActions") List<String> statelessDefaultActions,
        @CustomType.Parameter("statelessFragmentDefaultActions") List<String> statelessFragmentDefaultActions,
        @CustomType.Parameter("statelessRuleGroupReferences") @Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences) {
        this.statefulDefaultActions = statefulDefaultActions;
        this.statefulEngineOptions = statefulEngineOptions;
        this.statefulRuleGroupReferences = statefulRuleGroupReferences;
        this.statelessCustomActions = statelessCustomActions;
        this.statelessDefaultActions = statelessDefaultActions;
        this.statelessFragmentDefaultActions = statelessFragmentDefaultActions;
        this.statelessRuleGroupReferences = statelessRuleGroupReferences;
    }

    /**
     * Set of actions to take on a packet if it does not match any stateful rules in the policy. This can only be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. You can specify one of either or neither values of `aws:drop_strict` or `aws:drop_established`, as well as any combination of `aws:alert_strict` and `aws:alert_established`.
     * 
    */
    public List<String> statefulDefaultActions() {
        return this.statefulDefaultActions == null ? List.of() : this.statefulDefaultActions;
    }
    /**
     * A configuration block that defines options on how the policy handles stateful rules. See Stateful Engine Options below for details.
     * 
    */
    public Optional<FirewallPolicyFirewallPolicyStatefulEngineOptions> statefulEngineOptions() {
        return Optional.ofNullable(this.statefulEngineOptions);
    }
    /**
     * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
     * 
    */
    public List<FirewallPolicyFirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences() {
        return this.statefulRuleGroupReferences == null ? List.of() : this.statefulRuleGroupReferences;
    }
    /**
     * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy&#39;s `stateless_default_actions`. See Stateless Custom Action below for details.
     * 
    */
    public List<FirewallPolicyFirewallPolicyStatelessCustomAction> statelessCustomActions() {
        return this.statelessCustomActions == null ? List.of() : this.statelessCustomActions;
    }
    /**
     * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
    */
    public List<String> statelessDefaultActions() {
        return this.statelessDefaultActions;
    }
    /**
     * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
    */
    public List<String> statelessFragmentDefaultActions() {
        return this.statelessFragmentDefaultActions;
    }
    /**
     * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
     * 
    */
    public List<FirewallPolicyFirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences() {
        return this.statelessRuleGroupReferences == null ? List.of() : this.statelessRuleGroupReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> statefulDefaultActions;
        private @Nullable FirewallPolicyFirewallPolicyStatefulEngineOptions statefulEngineOptions;
        private @Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences;
        private @Nullable List<FirewallPolicyFirewallPolicyStatelessCustomAction> statelessCustomActions;
        private List<String> statelessDefaultActions;
        private List<String> statelessFragmentDefaultActions;
        private @Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statefulDefaultActions = defaults.statefulDefaultActions;
    	      this.statefulEngineOptions = defaults.statefulEngineOptions;
    	      this.statefulRuleGroupReferences = defaults.statefulRuleGroupReferences;
    	      this.statelessCustomActions = defaults.statelessCustomActions;
    	      this.statelessDefaultActions = defaults.statelessDefaultActions;
    	      this.statelessFragmentDefaultActions = defaults.statelessFragmentDefaultActions;
    	      this.statelessRuleGroupReferences = defaults.statelessRuleGroupReferences;
        }

        public Builder statefulDefaultActions(@Nullable List<String> statefulDefaultActions) {
            this.statefulDefaultActions = statefulDefaultActions;
            return this;
        }
        public Builder statefulDefaultActions(String... statefulDefaultActions) {
            return statefulDefaultActions(List.of(statefulDefaultActions));
        }
        public Builder statefulEngineOptions(@Nullable FirewallPolicyFirewallPolicyStatefulEngineOptions statefulEngineOptions) {
            this.statefulEngineOptions = statefulEngineOptions;
            return this;
        }
        public Builder statefulRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = statefulRuleGroupReferences;
            return this;
        }
        public Builder statefulRuleGroupReferences(FirewallPolicyFirewallPolicyStatefulRuleGroupReference... statefulRuleGroupReferences) {
            return statefulRuleGroupReferences(List.of(statefulRuleGroupReferences));
        }
        public Builder statelessCustomActions(@Nullable List<FirewallPolicyFirewallPolicyStatelessCustomAction> statelessCustomActions) {
            this.statelessCustomActions = statelessCustomActions;
            return this;
        }
        public Builder statelessCustomActions(FirewallPolicyFirewallPolicyStatelessCustomAction... statelessCustomActions) {
            return statelessCustomActions(List.of(statelessCustomActions));
        }
        public Builder statelessDefaultActions(List<String> statelessDefaultActions) {
            this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions);
            return this;
        }
        public Builder statelessDefaultActions(String... statelessDefaultActions) {
            return statelessDefaultActions(List.of(statelessDefaultActions));
        }
        public Builder statelessFragmentDefaultActions(List<String> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions);
            return this;
        }
        public Builder statelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
            return statelessFragmentDefaultActions(List.of(statelessFragmentDefaultActions));
        }
        public Builder statelessRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = statelessRuleGroupReferences;
            return this;
        }
        public Builder statelessRuleGroupReferences(FirewallPolicyFirewallPolicyStatelessRuleGroupReference... statelessRuleGroupReferences) {
            return statelessRuleGroupReferences(List.of(statelessRuleGroupReferences));
        }        public FirewallPolicyFirewallPolicy build() {
            return new FirewallPolicyFirewallPolicy(statefulDefaultActions, statefulEngineOptions, statefulRuleGroupReferences, statelessCustomActions, statelessDefaultActions, statelessFragmentDefaultActions, statelessRuleGroupReferences);
        }
    }
}
