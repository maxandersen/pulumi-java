// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.ActionListResponse;
import com.pulumi.azurenative.insights.outputs.AlertRuleAllOfConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActivityLogAlertResult {
    /**
     * The actions that will activate when the condition is met.
     * 
     */
    private final ActionListResponse actions;
    /**
     * The condition that will cause this alert to activate.
     * 
     */
    private final AlertRuleAllOfConditionResponse condition;
    /**
     * A description of this Activity Log Alert rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The resource Id.
     * 
     */
    private final String id;
    /**
     * The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be &#39;global&#39;.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
     */
    private final List<String> scopes;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetActivityLogAlertResult(
        @CustomType.Parameter("actions") ActionListResponse actions,
        @CustomType.Parameter("condition") AlertRuleAllOfConditionResponse condition,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scopes") List<String> scopes,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.actions = actions;
        this.condition = condition;
        this.description = description;
        this.enabled = enabled;
        this.id = id;
        this.location = location;
        this.name = name;
        this.scopes = scopes;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The actions that will activate when the condition is met.
     * 
    */
    public ActionListResponse actions() {
        return this.actions;
    }
    /**
     * The condition that will cause this alert to activate.
     * 
    */
    public AlertRuleAllOfConditionResponse condition() {
        return this.condition;
    }
    /**
     * A description of this Activity Log Alert rule.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be &#39;global&#39;.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
    */
    public List<String> scopes() {
        return this.scopes;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityLogAlertResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionListResponse actions;
        private AlertRuleAllOfConditionResponse condition;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable String location;
        private String name;
        private List<String> scopes;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityLogAlertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder actions(ActionListResponse actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder condition(AlertRuleAllOfConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetActivityLogAlertResult build() {
            return new GetActivityLogAlertResult(actions, condition, description, enabled, id, location, name, scopes, tags, type);
        }
    }
}
