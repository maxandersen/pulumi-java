// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1.inputs.ConditionResponse;
import com.pulumi.googlenative.gameservices_v1.inputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A rule to be applied in a Policy.
 * 
 */
public final class RuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuleResponse Empty = new RuleResponse();

    /**
     * Required
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String action() {
        return this.action;
    }

    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    @Import(name="conditions", required=true)
      private final List<ConditionResponse> conditions;

    public List<ConditionResponse> conditions() {
        return this.conditions;
    }

    /**
     * Human-readable description of the rule.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    @Import(name="in", required=true)
      private final List<String> in;

    public List<String> in() {
        return this.in;
    }

    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    @Import(name="logConfig", required=true)
      private final List<LogConfigResponse> logConfig;

    public List<LogConfigResponse> logConfig() {
        return this.logConfig;
    }

    /**
     * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    @Import(name="notIn", required=true)
      private final List<String> notIn;

    public List<String> notIn() {
        return this.notIn;
    }

    /**
     * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
     * 
     */
    @Import(name="permissions", required=true)
      private final List<String> permissions;

    public List<String> permissions() {
        return this.permissions;
    }

    public RuleResponse(
        String action,
        List<ConditionResponse> conditions,
        String description,
        List<String> in,
        List<LogConfigResponse> logConfig,
        List<String> notIn,
        List<String> permissions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.in = Objects.requireNonNull(in, "expected parameter 'in' to be non-null");
        this.logConfig = Objects.requireNonNull(logConfig, "expected parameter 'logConfig' to be non-null");
        this.notIn = Objects.requireNonNull(notIn, "expected parameter 'notIn' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private RuleResponse() {
        this.action = null;
        this.conditions = List.of();
        this.description = null;
        this.in = List.of();
        this.logConfig = List.of();
        this.notIn = List.of();
        this.permissions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ConditionResponse> conditions;
        private String description;
        private List<String> in;
        private List<LogConfigResponse> logConfig;
        private List<String> notIn;
        private List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.in = defaults.in;
    	      this.logConfig = defaults.logConfig;
    	      this.notIn = defaults.notIn;
    	      this.permissions = defaults.permissions;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder conditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder in(List<String> in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }
        public Builder in(String... in) {
            return in(List.of(in));
        }
        public Builder logConfig(List<LogConfigResponse> logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }
        public Builder logConfig(LogConfigResponse... logConfig) {
            return logConfig(List.of(logConfig));
        }
        public Builder notIn(List<String> notIn) {
            this.notIn = Objects.requireNonNull(notIn);
            return this;
        }
        public Builder notIn(String... notIn) {
            return notIn(List.of(notIn));
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }        public RuleResponse build() {
            return new RuleResponse(action, conditions, description, in, logConfig, notIn, permissions);
        }
    }
}
