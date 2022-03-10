// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleHttpHeaderActionResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleMatcherResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleRateLimitOptionsResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleResponse {
    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    private final String action;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final String direction;
    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    private final Boolean enableLogging;
    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    private final SecurityPolicyRuleHttpHeaderActionResponse headerAction;
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    private final String kind;
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    private final SecurityPolicyRuleMatcherResponse match;
    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    private final Boolean preview;
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    private final Integer priority;
    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRedirectOptionsResponse redirectOptions;
    /**
     * Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    private final String ruleNumber;
    /**
     * Calculation of the complexity of a single firewall security policy rule.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final List<String> targetResources;
    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    private final List<String> targetServiceAccounts;

    @OutputCustomType.Constructor
    private SecurityPolicyRuleResponse(
        @OutputCustomType.Parameter("action") String action,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("direction") String direction,
        @OutputCustomType.Parameter("enableLogging") Boolean enableLogging,
        @OutputCustomType.Parameter("headerAction") SecurityPolicyRuleHttpHeaderActionResponse headerAction,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("match") SecurityPolicyRuleMatcherResponse match,
        @OutputCustomType.Parameter("preview") Boolean preview,
        @OutputCustomType.Parameter("priority") Integer priority,
        @OutputCustomType.Parameter("rateLimitOptions") SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions,
        @OutputCustomType.Parameter("redirectOptions") SecurityPolicyRuleRedirectOptionsResponse redirectOptions,
        @OutputCustomType.Parameter("ruleNumber") String ruleNumber,
        @OutputCustomType.Parameter("ruleTupleCount") Integer ruleTupleCount,
        @OutputCustomType.Parameter("targetResources") List<String> targetResources,
        @OutputCustomType.Parameter("targetServiceAccounts") List<String> targetServiceAccounts) {
        this.action = action;
        this.description = description;
        this.direction = direction;
        this.enableLogging = enableLogging;
        this.headerAction = headerAction;
        this.kind = kind;
        this.match = match;
        this.preview = preview;
        this.priority = priority;
        this.rateLimitOptions = rateLimitOptions;
        this.redirectOptions = redirectOptions;
        this.ruleNumber = ruleNumber;
        this.ruleTupleCount = ruleTupleCount;
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
    */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    /**
     * Optional, additional actions that are performed on headers.
     * 
    */
    public SecurityPolicyRuleHttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
    */
    public SecurityPolicyRuleMatcherResponse getMatch() {
        return this.match;
    }
    /**
     * If set to true, the specified action is not enforced.
     * 
    */
    public Boolean getPreview() {
        return this.preview;
    }
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
    */
    public SecurityPolicyRuleRateLimitOptionsResponse getRateLimitOptions() {
        return this.rateLimitOptions;
    }
    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
    */
    public SecurityPolicyRuleRedirectOptionsResponse getRedirectOptions() {
        return this.redirectOptions;
    }
    /**
     * Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
    */
    public String getRuleNumber() {
        return this.ruleNumber;
    }
    /**
     * Calculation of the complexity of a single firewall security policy rule.
     * 
    */
    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
    */
    public List<String> getTargetResources() {
        return this.targetResources;
    }
    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
    */
    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private String direction;
        private Boolean enableLogging;
        private SecurityPolicyRuleHttpHeaderActionResponse headerAction;
        private String kind;
        private SecurityPolicyRuleMatcherResponse match;
        private Boolean preview;
        private Integer priority;
        private SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
        private SecurityPolicyRuleRedirectOptionsResponse redirectOptions;
        private String ruleNumber;
        private Integer ruleTupleCount;
        private List<String> targetResources;
        private List<String> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.enableLogging = defaults.enableLogging;
    	      this.headerAction = defaults.headerAction;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
    	      this.redirectOptions = defaults.redirectOptions;
    	      this.ruleNumber = defaults.ruleNumber;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setEnableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder setHeaderAction(SecurityPolicyRuleHttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMatch(SecurityPolicyRuleMatcherResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setPreview(Boolean preview) {
            this.preview = Objects.requireNonNull(preview);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRateLimitOptions(SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions) {
            this.rateLimitOptions = Objects.requireNonNull(rateLimitOptions);
            return this;
        }

        public Builder setRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
            this.redirectOptions = Objects.requireNonNull(redirectOptions);
            return this;
        }

        public Builder setRuleNumber(String ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }

        public Builder setRuleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder setTargetResources(List<String> targetResources) {
            this.targetResources = Objects.requireNonNull(targetResources);
            return this;
        }

        public Builder setTargetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public SecurityPolicyRuleResponse build() {
            return new SecurityPolicyRuleResponse(action, description, direction, enableLogging, headerAction, kind, match, preview, priority, rateLimitOptions, redirectOptions, ruleNumber, ruleTupleCount, targetResources, targetServiceAccounts);
        }
    }
}
