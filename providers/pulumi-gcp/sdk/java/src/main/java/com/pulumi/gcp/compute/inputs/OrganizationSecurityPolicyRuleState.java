// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyRuleState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyRuleState Empty = new OrganizationSecurityPolicyRuleState();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either
     * &#34;allow&#34;, &#34;deny&#34; or &#34;goto_next&#34;.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * A description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The direction in which this rule applies. If unspecified an INGRESS rule is created.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<String> direction;

    public Output<String> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the
     * configured export destination in Stackdriver.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> enableLogging() {
        return this.enableLogging == null ? Codegen.empty() : this.enableLogging;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * 
     */
    @Import(name="match")
      private final @Nullable Output<OrganizationSecurityPolicyRuleMatchGetArgs> match;

    public Output<OrganizationSecurityPolicyRuleMatchGetArgs> match() {
        return this.match == null ? Codegen.empty() : this.match;
    }

    /**
     * The ID of the OrganizationSecurityPolicy this rule applies to.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> policyId() {
        return this.policyId == null ? Codegen.empty() : this.policyId;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @Import(name="preview")
      private final @Nullable Output<Boolean> preview;

    public Output<Boolean> preview() {
        return this.preview == null ? Codegen.empty() : this.preview;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a value
     * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
     * highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies.
     * This field allows you to control which network&#39;s VMs get
     * this rule. If this field is left blank, all VMs
     * within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources")
      private final @Nullable Output<List<String>> targetResources;

    public Output<List<String>> targetResources() {
        return this.targetResources == null ? Codegen.empty() : this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of
     * instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
      private final @Nullable Output<List<String>> targetServiceAccounts;

    public Output<List<String>> targetServiceAccounts() {
        return this.targetServiceAccounts == null ? Codegen.empty() : this.targetServiceAccounts;
    }

    public OrganizationSecurityPolicyRuleState(
        @Nullable Output<String> action,
        @Nullable Output<String> description,
        @Nullable Output<String> direction,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<OrganizationSecurityPolicyRuleMatchGetArgs> match,
        @Nullable Output<String> policyId,
        @Nullable Output<Boolean> preview,
        @Nullable Output<Integer> priority,
        @Nullable Output<List<String>> targetResources,
        @Nullable Output<List<String>> targetServiceAccounts) {
        this.action = action;
        this.description = description;
        this.direction = direction;
        this.enableLogging = enableLogging;
        this.match = match;
        this.policyId = policyId;
        this.preview = preview;
        this.priority = priority;
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    private OrganizationSecurityPolicyRuleState() {
        this.action = Codegen.empty();
        this.description = Codegen.empty();
        this.direction = Codegen.empty();
        this.enableLogging = Codegen.empty();
        this.match = Codegen.empty();
        this.policyId = Codegen.empty();
        this.preview = Codegen.empty();
        this.priority = Codegen.empty();
        this.targetResources = Codegen.empty();
        this.targetServiceAccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> description;
        private @Nullable Output<String> direction;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<OrganizationSecurityPolicyRuleMatchGetArgs> match;
        private @Nullable Output<String> policyId;
        private @Nullable Output<Boolean> preview;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<List<String>> targetResources;
        private @Nullable Output<List<String>> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.enableLogging = defaults.enableLogging;
    	      this.match = defaults.match;
    	      this.policyId = defaults.policyId;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder direction(@Nullable Output<String> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Codegen.ofNullable(enableLogging);
            return this;
        }
        public Builder match(@Nullable Output<OrganizationSecurityPolicyRuleMatchGetArgs> match) {
            this.match = match;
            return this;
        }
        public Builder match(@Nullable OrganizationSecurityPolicyRuleMatchGetArgs match) {
            this.match = Codegen.ofNullable(match);
            return this;
        }
        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = Codegen.ofNullable(policyId);
            return this;
        }
        public Builder preview(@Nullable Output<Boolean> preview) {
            this.preview = preview;
            return this;
        }
        public Builder preview(@Nullable Boolean preview) {
            this.preview = Codegen.ofNullable(preview);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder targetResources(@Nullable Output<List<String>> targetResources) {
            this.targetResources = targetResources;
            return this;
        }
        public Builder targetResources(@Nullable List<String> targetResources) {
            this.targetResources = Codegen.ofNullable(targetResources);
            return this;
        }
        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }
        public Builder targetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Codegen.ofNullable(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }        public OrganizationSecurityPolicyRuleState build() {
            return new OrganizationSecurityPolicyRuleState(action, description, direction, enableLogging, match, policyId, preview, priority, targetResources, targetServiceAccounts);
        }
    }
}
