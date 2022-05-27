// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs;
import com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs;
import com.pulumi.azure.sentinel.inputs.AutomationRuleConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleState Empty = new AutomationRuleState();

    /**
     * One or more `action_incident` blocks as defined below.
     * 
     */
    @Import(name="actionIncidents")
    private @Nullable Output<List<AutomationRuleActionIncidentArgs>> actionIncidents;

    /**
     * @return One or more `action_incident` blocks as defined below.
     * 
     */
    public Optional<Output<List<AutomationRuleActionIncidentArgs>>> actionIncidents() {
        return Optional.ofNullable(this.actionIncidents);
    }

    /**
     * One or more `action_playbook` blocks as defined below.
     * 
     */
    @Import(name="actionPlaybooks")
    private @Nullable Output<List<AutomationRuleActionPlaybookArgs>> actionPlaybooks;

    /**
     * @return One or more `action_playbook` blocks as defined below.
     * 
     */
    public Optional<Output<List<AutomationRuleActionPlaybookArgs>>> actionPlaybooks() {
        return Optional.ofNullable(this.actionPlaybooks);
    }

    /**
     * One or more `condition` blocks as defined below.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<AutomationRuleConditionArgs>> conditions;

    /**
     * @return One or more `condition` blocks as defined below.
     * 
     */
    public Optional<Output<List<AutomationRuleConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The display name which should be used for this Sentinel Automation Rule.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name which should be used for this Sentinel Automation Rule.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Whether this Sentinel Automation Rule is enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether this Sentinel Automation Rule is enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The time in RFC3339 format of kind `UTC` that determines when this Automation Rule should expire and be disabled.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return The time in RFC3339 format of kind `UTC` that determines when this Automation Rule should expire and be disabled.
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The ID of the Log Analytics Workspace where this Sentinel applies to. Changing this forces a new Sentinel Automation Rule to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace where this Sentinel applies to. Changing this forces a new Sentinel Automation Rule to be created.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * The UUID which should be used for this Sentinel Automation Rule. Changing this forces a new Sentinel Automation Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The UUID which should be used for this Sentinel Automation Rule. Changing this forces a new Sentinel Automation Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The order of this Sentinel Automation Rule. Possible values varies between `1` and `1000`.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return The order of this Sentinel Automation Rule. Possible values varies between `1` and `1000`.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    private AutomationRuleState() {}

    private AutomationRuleState(AutomationRuleState $) {
        this.actionIncidents = $.actionIncidents;
        this.actionPlaybooks = $.actionPlaybooks;
        this.conditions = $.conditions;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.expiration = $.expiration;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleState $;

        public Builder() {
            $ = new AutomationRuleState();
        }

        public Builder(AutomationRuleState defaults) {
            $ = new AutomationRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionIncidents One or more `action_incident` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionIncidents(@Nullable Output<List<AutomationRuleActionIncidentArgs>> actionIncidents) {
            $.actionIncidents = actionIncidents;
            return this;
        }

        /**
         * @param actionIncidents One or more `action_incident` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionIncidents(List<AutomationRuleActionIncidentArgs> actionIncidents) {
            return actionIncidents(Output.of(actionIncidents));
        }

        /**
         * @param actionIncidents One or more `action_incident` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionIncidents(AutomationRuleActionIncidentArgs... actionIncidents) {
            return actionIncidents(List.of(actionIncidents));
        }

        /**
         * @param actionPlaybooks One or more `action_playbook` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionPlaybooks(@Nullable Output<List<AutomationRuleActionPlaybookArgs>> actionPlaybooks) {
            $.actionPlaybooks = actionPlaybooks;
            return this;
        }

        /**
         * @param actionPlaybooks One or more `action_playbook` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionPlaybooks(List<AutomationRuleActionPlaybookArgs> actionPlaybooks) {
            return actionPlaybooks(Output.of(actionPlaybooks));
        }

        /**
         * @param actionPlaybooks One or more `action_playbook` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder actionPlaybooks(AutomationRuleActionPlaybookArgs... actionPlaybooks) {
            return actionPlaybooks(List.of(actionPlaybooks));
        }

        /**
         * @param conditions One or more `condition` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<AutomationRuleConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions One or more `condition` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<AutomationRuleConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions One or more `condition` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(AutomationRuleConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param displayName The display name which should be used for this Sentinel Automation Rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name which should be used for this Sentinel Automation Rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Whether this Sentinel Automation Rule is enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this Sentinel Automation Rule is enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expiration The time in RFC3339 format of kind `UTC` that determines when this Automation Rule should expire and be disabled.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration The time in RFC3339 format of kind `UTC` that determines when this Automation Rule should expire and be disabled.
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace where this Sentinel applies to. Changing this forces a new Sentinel Automation Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace where this Sentinel applies to. Changing this forces a new Sentinel Automation Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The UUID which should be used for this Sentinel Automation Rule. Changing this forces a new Sentinel Automation Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The UUID which should be used for this Sentinel Automation Rule. Changing this forces a new Sentinel Automation Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param order The order of this Sentinel Automation Rule. Possible values varies between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order of this Sentinel Automation Rule. Possible values varies between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public AutomationRuleState build() {
            return $;
        }
    }

}
