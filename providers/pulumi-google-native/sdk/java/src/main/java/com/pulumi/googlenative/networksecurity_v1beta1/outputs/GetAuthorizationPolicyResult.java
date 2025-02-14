// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.RuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAuthorizationPolicyResult {
    /**
     * @return The action to take when a rule match is found. Possible values are &#34;ALLOW&#34; or &#34;DENY&#34;.
     * 
     */
    private final String action;
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    private final String description;
    /**
     * @return Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    private final String name;
    /**
     * @return Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    private final List<RuleResponse> rules;
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetAuthorizationPolicyResult(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rules") List<RuleResponse> rules,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.action = action;
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.rules = rules;
        this.updateTime = updateTime;
    }

    /**
     * @return The action to take when a rule match is found. Possible values are &#34;ALLOW&#34; or &#34;DENY&#34;.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    public List<RuleResponse> rules() {
        return this.rules;
    }
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private String name;
        private List<RuleResponse> rules;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rules(List<RuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(RuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetAuthorizationPolicyResult build() {
            return new GetAuthorizationPolicyResult(action, createTime, description, labels, name, rules, updateTime);
        }
    }
}
