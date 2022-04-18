// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.ConditionResponse;
import com.pulumi.googlenative.compute_v1.outputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String action;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<ConditionResponse> conditions;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String description;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> ins;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<LogConfigResponse> logConfigs;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> notIns;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> permissions;

    @CustomType.Constructor
    private RuleResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("conditions") List<ConditionResponse> conditions,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("ins") List<String> ins,
        @CustomType.Parameter("logConfigs") List<LogConfigResponse> logConfigs,
        @CustomType.Parameter("notIns") List<String> notIns,
        @CustomType.Parameter("permissions") List<String> permissions) {
        this.action = action;
        this.conditions = conditions;
        this.description = description;
        this.ins = ins;
        this.logConfigs = logConfigs;
        this.notIns = notIns;
        this.permissions = permissions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String action() {
        return this.action;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<ConditionResponse> conditions() {
        return this.conditions;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> ins() {
        return this.ins;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<LogConfigResponse> logConfigs() {
        return this.logConfigs;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> notIns() {
        return this.notIns;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> permissions() {
        return this.permissions;
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
        private List<String> ins;
        private List<LogConfigResponse> logConfigs;
        private List<String> notIns;
        private List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.ins = defaults.ins;
    	      this.logConfigs = defaults.logConfigs;
    	      this.notIns = defaults.notIns;
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
        public Builder ins(List<String> ins) {
            this.ins = Objects.requireNonNull(ins);
            return this;
        }
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }
        public Builder logConfigs(List<LogConfigResponse> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }
        public Builder logConfigs(LogConfigResponse... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        public Builder notIns(List<String> notIns) {
            this.notIns = Objects.requireNonNull(notIns);
            return this;
        }
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }        public RuleResponse build() {
            return new RuleResponse(action, conditions, description, ins, logConfigs, notIns, permissions);
        }
    }
}
