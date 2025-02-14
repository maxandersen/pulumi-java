// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The logic app action that should be triggered. To learn more about Microsoft Defender for Cloud&#39;s Workflow Automation capabilities, visit https://aka.ms/ASCWorkflowAutomationLearnMore
 * 
 */
public final class AutomationActionLogicAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationActionLogicAppArgs Empty = new AutomationActionLogicAppArgs();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is &#39;LogicApp&#39;.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return The type of the action that will be triggered by the Automation
     * Expected value is &#39;LogicApp&#39;.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
     */
    @Import(name="logicAppResourceId")
    private @Nullable Output<String> logicAppResourceId;

    /**
     * @return The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
     */
    public Optional<Output<String>> logicAppResourceId() {
        return Optional.ofNullable(this.logicAppResourceId);
    }

    /**
     * The Logic App trigger URI endpoint (it will not be included in any response).
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The Logic App trigger URI endpoint (it will not be included in any response).
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private AutomationActionLogicAppArgs() {}

    private AutomationActionLogicAppArgs(AutomationActionLogicAppArgs $) {
        this.actionType = $.actionType;
        this.logicAppResourceId = $.logicAppResourceId;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionLogicAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionLogicAppArgs $;

        public Builder() {
            $ = new AutomationActionLogicAppArgs();
        }

        public Builder(AutomationActionLogicAppArgs defaults) {
            $ = new AutomationActionLogicAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The type of the action that will be triggered by the Automation
         * Expected value is &#39;LogicApp&#39;.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The type of the action that will be triggered by the Automation
         * Expected value is &#39;LogicApp&#39;.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param logicAppResourceId The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
         * 
         * @return builder
         * 
         */
        public Builder logicAppResourceId(@Nullable Output<String> logicAppResourceId) {
            $.logicAppResourceId = logicAppResourceId;
            return this;
        }

        /**
         * @param logicAppResourceId The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
         * 
         * @return builder
         * 
         */
        public Builder logicAppResourceId(String logicAppResourceId) {
            return logicAppResourceId(Output.of(logicAppResourceId));
        }

        /**
         * @param uri The Logic App trigger URI endpoint (it will not be included in any response).
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The Logic App trigger URI endpoint (it will not be included in any response).
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public AutomationActionLogicAppArgs build() {
            $.actionType = Codegen.stringProp("actionType").output().arg($.actionType).require();
            return $;
        }
    }

}
