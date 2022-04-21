// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.FirewallPolicyRuleDirection;
import com.pulumi.googlenative.compute_beta.inputs.FirewallPolicyRuleMatcherArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class FirewallPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleArgs Empty = new FirewallPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either &#34;allow&#34; or &#34;deny()&#34; where valid values for status are 403, 404, and 502.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The direction in which this rule applies.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<FirewallPolicyRuleDirection> direction;

    public Optional<Output<FirewallPolicyRuleDirection>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    @Import(name="match")
    private @Nullable Output<FirewallPolicyRuleMatcherArgs> match;

    public Optional<Output<FirewallPolicyRuleMatcherArgs>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources")
    private @Nullable Output<List<String>> targetResources;

    public Optional<Output<List<String>>> targetResources() {
        return Optional.ofNullable(this.targetResources);
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
    private @Nullable Output<List<String>> targetServiceAccounts;

    public Optional<Output<List<String>>> targetServiceAccounts() {
        return Optional.ofNullable(this.targetServiceAccounts);
    }

    private FirewallPolicyRuleArgs() {}

    private FirewallPolicyRuleArgs(FirewallPolicyRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.disabled = $.disabled;
        this.enableLogging = $.enableLogging;
        this.match = $.match;
        this.priority = $.priority;
        this.targetResources = $.targetResources;
        this.targetServiceAccounts = $.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleArgs();
        }

        public Builder(FirewallPolicyRuleArgs defaults) {
            $ = new FirewallPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder direction(@Nullable Output<FirewallPolicyRuleDirection> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(FirewallPolicyRuleDirection direction) {
            return direction(Output.of(direction));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder match(@Nullable Output<FirewallPolicyRuleMatcherArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(FirewallPolicyRuleMatcherArgs match) {
            return match(Output.of(match));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder targetResources(@Nullable Output<List<String>> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        public Builder targetResources(List<String> targetResources) {
            return targetResources(Output.of(targetResources));
        }

        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }

        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            return targetServiceAccounts(Output.of(targetServiceAccounts));
        }

        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        public FirewallPolicyRuleArgs build() {
            return $;
        }
    }

}
