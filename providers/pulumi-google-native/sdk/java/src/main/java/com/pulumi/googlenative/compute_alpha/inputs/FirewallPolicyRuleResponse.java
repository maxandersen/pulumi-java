// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleMatcherResponse;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class FirewallPolicyRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleResponse Empty = new FirewallPolicyRuleResponse();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either &#34;allow&#34; or &#34;deny()&#34; where valid values for status are 403, 404, and 502.
     * 
     */
    @Import(name="action", required=true)
    private String action;

    public String action() {
        return this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * The direction in which this rule applies.
     * 
     */
    @Import(name="direction", required=true)
    private String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled", required=true)
    private Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    @Import(name="enableLogging", required=true)
    private Boolean enableLogging;

    public Boolean enableLogging() {
        return this.enableLogging;
    }

    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    @Import(name="match", required=true)
    private FirewallPolicyRuleMatcherResponse match;

    public FirewallPolicyRuleMatcherResponse match() {
        return this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority", required=true)
    private Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * Calculation of the complexity of a single firewall policy rule.
     * 
     */
    @Import(name="ruleTupleCount", required=true)
    private Integer ruleTupleCount;

    public Integer ruleTupleCount() {
        return this.ruleTupleCount;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources", required=true)
    private List<String> targetResources;

    public List<String> targetResources() {
        return this.targetResources;
    }

    /**
     * A list of secure tags that controls which instances the firewall rule applies to. If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * 
     */
    @Import(name="targetSecureTags", required=true)
    private List<FirewallPolicyRuleSecureTagResponse> targetSecureTags;

    public List<FirewallPolicyRuleSecureTagResponse> targetSecureTags() {
        return this.targetSecureTags;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts", required=true)
    private List<String> targetServiceAccounts;

    public List<String> targetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    private FirewallPolicyRuleResponse() {}

    private FirewallPolicyRuleResponse(FirewallPolicyRuleResponse $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.disabled = $.disabled;
        this.enableLogging = $.enableLogging;
        this.kind = $.kind;
        this.match = $.match;
        this.priority = $.priority;
        this.ruleTupleCount = $.ruleTupleCount;
        this.targetResources = $.targetResources;
        this.targetSecureTags = $.targetSecureTags;
        this.targetServiceAccounts = $.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleResponse $;

        public Builder() {
            $ = new FirewallPolicyRuleResponse();
        }

        public Builder(FirewallPolicyRuleResponse defaults) {
            $ = new FirewallPolicyRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder action(String action) {
            $.action = action;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder direction(String direction) {
            $.direction = direction;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder match(FirewallPolicyRuleMatcherResponse match) {
            $.match = match;
            return this;
        }

        public Builder priority(Integer priority) {
            $.priority = priority;
            return this;
        }

        public Builder ruleTupleCount(Integer ruleTupleCount) {
            $.ruleTupleCount = ruleTupleCount;
            return this;
        }

        public Builder targetResources(List<String> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }

        public Builder targetSecureTags(List<FirewallPolicyRuleSecureTagResponse> targetSecureTags) {
            $.targetSecureTags = targetSecureTags;
            return this;
        }

        public Builder targetSecureTags(FirewallPolicyRuleSecureTagResponse... targetSecureTags) {
            return targetSecureTags(List.of(targetSecureTags));
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        public FirewallPolicyRuleResponse build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            $.enableLogging = Objects.requireNonNull($.enableLogging, "expected parameter 'enableLogging' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.ruleTupleCount = Objects.requireNonNull($.ruleTupleCount, "expected parameter 'ruleTupleCount' to be non-null");
            $.targetResources = Objects.requireNonNull($.targetResources, "expected parameter 'targetResources' to be non-null");
            $.targetSecureTags = Objects.requireNonNull($.targetSecureTags, "expected parameter 'targetSecureTags' to be non-null");
            $.targetServiceAccounts = Objects.requireNonNull($.targetServiceAccounts, "expected parameter 'targetServiceAccounts' to be non-null");
            return $;
        }
    }

}
