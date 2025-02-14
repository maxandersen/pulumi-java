// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.inputs.AutomationRuleModifyPropertiesActionArgs;
import com.pulumi.azurenative.securityinsights.inputs.AutomationRuleRunPlaybookActionArgs;
import com.pulumi.azurenative.securityinsights.inputs.AutomationRuleTriggeringLogicArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleArgs Empty = new AutomationRuleArgs();

    /**
     * The actions to execute when the automation rule is triggered
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions;

    /**
     * @return The actions to execute when the automation rule is triggered
     * 
     */
    public Output<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions() {
        return this.actions;
    }

    /**
     * Automation rule ID
     * 
     */
    @Import(name="automationRuleId")
    private @Nullable Output<String> automationRuleId;

    /**
     * @return Automation rule ID
     * 
     */
    public Optional<Output<String>> automationRuleId() {
        return Optional.ofNullable(this.automationRuleId);
    }

    /**
     * The display name of the automation  rule
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the automation  rule
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The order of execution of the automation rule
     * 
     */
    @Import(name="order", required=true)
    private Output<Integer> order;

    /**
     * @return The order of execution of the automation rule
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The triggering logic of the automation rule
     * 
     */
    @Import(name="triggeringLogic", required=true)
    private Output<AutomationRuleTriggeringLogicArgs> triggeringLogic;

    /**
     * @return The triggering logic of the automation rule
     * 
     */
    public Output<AutomationRuleTriggeringLogicArgs> triggeringLogic() {
        return this.triggeringLogic;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private AutomationRuleArgs() {}

    private AutomationRuleArgs(AutomationRuleArgs $) {
        this.actions = $.actions;
        this.automationRuleId = $.automationRuleId;
        this.displayName = $.displayName;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.order = $.order;
        this.resourceGroupName = $.resourceGroupName;
        this.triggeringLogic = $.triggeringLogic;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleArgs $;

        public Builder() {
            $ = new AutomationRuleArgs();
        }

        public Builder(AutomationRuleArgs defaults) {
            $ = new AutomationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The actions to execute when the automation rule is triggered
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The actions to execute when the automation rule is triggered
         * 
         * @return builder
         * 
         */
        public Builder actions(List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The actions to execute when the automation rule is triggered
         * 
         * @return builder
         * 
         */
        public Builder actions(Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param automationRuleId Automation rule ID
         * 
         * @return builder
         * 
         */
        public Builder automationRuleId(@Nullable Output<String> automationRuleId) {
            $.automationRuleId = automationRuleId;
            return this;
        }

        /**
         * @param automationRuleId Automation rule ID
         * 
         * @return builder
         * 
         */
        public Builder automationRuleId(String automationRuleId) {
            return automationRuleId(Output.of(automationRuleId));
        }

        /**
         * @param displayName The display name of the automation  rule
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the automation  rule
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        /**
         * @param order The order of execution of the automation rule
         * 
         * @return builder
         * 
         */
        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order of execution of the automation rule
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param triggeringLogic The triggering logic of the automation rule
         * 
         * @return builder
         * 
         */
        public Builder triggeringLogic(Output<AutomationRuleTriggeringLogicArgs> triggeringLogic) {
            $.triggeringLogic = triggeringLogic;
            return this;
        }

        /**
         * @param triggeringLogic The triggering logic of the automation rule
         * 
         * @return builder
         * 
         */
        public Builder triggeringLogic(AutomationRuleTriggeringLogicArgs triggeringLogic) {
            return triggeringLogic(Output.of(triggeringLogic));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public AutomationRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggeringLogic = Objects.requireNonNull($.triggeringLogic, "expected parameter 'triggeringLogic' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
