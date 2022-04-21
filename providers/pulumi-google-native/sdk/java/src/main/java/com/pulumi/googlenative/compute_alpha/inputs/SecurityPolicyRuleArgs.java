// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.SecurityPolicyRuleDirection;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleHttpHeaderActionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleMatcherArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleRateLimitOptionsArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleRedirectOptionsArgs;
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
public final class SecurityPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleArgs Empty = new SecurityPolicyRuleArgs();

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<SecurityPolicyRuleDirection> direction;

    public Optional<Output<SecurityPolicyRuleDirection>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<SecurityPolicyRuleHttpHeaderActionArgs> headerAction;

    public Optional<Output<SecurityPolicyRuleHttpHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    @Import(name="match")
    private @Nullable Output<SecurityPolicyRuleMatcherArgs> match;

    public Optional<Output<SecurityPolicyRuleMatcherArgs>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @Import(name="preview")
    private @Nullable Output<Boolean> preview;

    public Optional<Output<Boolean>> preview() {
        return Optional.ofNullable(this.preview);
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * 
     */
    @Import(name="rateLimitOptions")
    private @Nullable Output<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions;

    public Optional<Output<SecurityPolicyRuleRateLimitOptionsArgs>> rateLimitOptions() {
        return Optional.ofNullable(this.rateLimitOptions);
    }

    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    @Import(name="redirectOptions")
    private @Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions;

    public Optional<Output<SecurityPolicyRuleRedirectOptionsArgs>> redirectOptions() {
        return Optional.ofNullable(this.redirectOptions);
    }

    /**
     * This must be specified for redirect actions. Cannot be specified for any other actions.
     * 
     */
    @Import(name="redirectTarget")
    private @Nullable Output<String> redirectTarget;

    public Optional<Output<String>> redirectTarget() {
        return Optional.ofNullable(this.redirectTarget);
    }

    /**
     * Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    @Import(name="ruleNumber")
    private @Nullable Output<String> ruleNumber;

    public Optional<Output<String>> ruleNumber() {
        return Optional.ofNullable(this.ruleNumber);
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
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

    private SecurityPolicyRuleArgs() {}

    private SecurityPolicyRuleArgs(SecurityPolicyRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.enableLogging = $.enableLogging;
        this.headerAction = $.headerAction;
        this.match = $.match;
        this.preview = $.preview;
        this.priority = $.priority;
        this.rateLimitOptions = $.rateLimitOptions;
        this.redirectOptions = $.redirectOptions;
        this.redirectTarget = $.redirectTarget;
        this.ruleNumber = $.ruleNumber;
        this.targetResources = $.targetResources;
        this.targetServiceAccounts = $.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleArgs();
        }

        public Builder(SecurityPolicyRuleArgs defaults) {
            $ = new SecurityPolicyRuleArgs(Objects.requireNonNull(defaults));
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

        public Builder direction(@Nullable Output<SecurityPolicyRuleDirection> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(SecurityPolicyRuleDirection direction) {
            return direction(Output.of(direction));
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder headerAction(@Nullable Output<SecurityPolicyRuleHttpHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(SecurityPolicyRuleHttpHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        public Builder match(@Nullable Output<SecurityPolicyRuleMatcherArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(SecurityPolicyRuleMatcherArgs match) {
            return match(Output.of(match));
        }

        public Builder preview(@Nullable Output<Boolean> preview) {
            $.preview = preview;
            return this;
        }

        public Builder preview(Boolean preview) {
            return preview(Output.of(preview));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder rateLimitOptions(@Nullable Output<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions) {
            $.rateLimitOptions = rateLimitOptions;
            return this;
        }

        public Builder rateLimitOptions(SecurityPolicyRuleRateLimitOptionsArgs rateLimitOptions) {
            return rateLimitOptions(Output.of(rateLimitOptions));
        }

        public Builder redirectOptions(@Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions) {
            $.redirectOptions = redirectOptions;
            return this;
        }

        public Builder redirectOptions(SecurityPolicyRuleRedirectOptionsArgs redirectOptions) {
            return redirectOptions(Output.of(redirectOptions));
        }

        public Builder redirectTarget(@Nullable Output<String> redirectTarget) {
            $.redirectTarget = redirectTarget;
            return this;
        }

        public Builder redirectTarget(String redirectTarget) {
            return redirectTarget(Output.of(redirectTarget));
        }

        public Builder ruleNumber(@Nullable Output<String> ruleNumber) {
            $.ruleNumber = ruleNumber;
            return this;
        }

        public Builder ruleNumber(String ruleNumber) {
            return ruleNumber(Output.of(ruleNumber));
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

        public SecurityPolicyRuleArgs build() {
            return $;
        }
    }

}
