// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Azure Automation Runbook notification receiver.
 * 
 */
public final class AutomationRunbookReceiverArgs extends ResourceArgs {

    public static final AutomationRunbookReceiverArgs Empty = new AutomationRunbookReceiverArgs();

    /**
     * The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     * 
     */
    @Import(name="automationAccountId", required=true)
    private Output<String> automationAccountId;

    /**
     * @return The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     * 
     */
    public Output<String> automationAccountId() {
        return this.automationAccountId;
    }

    /**
     * Indicates whether this instance is global runbook.
     * 
     */
    @Import(name="isGlobalRunbook", required=true)
    private Output<Boolean> isGlobalRunbook;

    /**
     * @return Indicates whether this instance is global runbook.
     * 
     */
    public Output<Boolean> isGlobalRunbook() {
        return this.isGlobalRunbook;
    }

    /**
     * Indicates name of the webhook.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Indicates name of the webhook.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name for this runbook.
     * 
     */
    @Import(name="runbookName", required=true)
    private Output<String> runbookName;

    /**
     * @return The name for this runbook.
     * 
     */
    public Output<String> runbookName() {
        return this.runbookName;
    }

    /**
     * The URI where webhooks should be sent.
     * 
     */
    @Import(name="serviceUri")
    private @Nullable Output<String> serviceUri;

    /**
     * @return The URI where webhooks should be sent.
     * 
     */
    public Optional<Output<String>> serviceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
    private @Nullable Output<Boolean> useCommonAlertSchema;

    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Output<Boolean>> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    /**
     * The resource id for webhook linked to this runbook.
     * 
     */
    @Import(name="webhookResourceId", required=true)
    private Output<String> webhookResourceId;

    /**
     * @return The resource id for webhook linked to this runbook.
     * 
     */
    public Output<String> webhookResourceId() {
        return this.webhookResourceId;
    }

    private AutomationRunbookReceiverArgs() {}

    private AutomationRunbookReceiverArgs(AutomationRunbookReceiverArgs $) {
        this.automationAccountId = $.automationAccountId;
        this.isGlobalRunbook = $.isGlobalRunbook;
        this.name = $.name;
        this.runbookName = $.runbookName;
        this.serviceUri = $.serviceUri;
        this.useCommonAlertSchema = $.useCommonAlertSchema;
        this.webhookResourceId = $.webhookResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRunbookReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRunbookReceiverArgs $;

        public Builder() {
            $ = new AutomationRunbookReceiverArgs();
        }

        public Builder(AutomationRunbookReceiverArgs defaults) {
            $ = new AutomationRunbookReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountId The Azure automation account Id which holds this runbook and authenticate to Azure resource.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountId(Output<String> automationAccountId) {
            $.automationAccountId = automationAccountId;
            return this;
        }

        /**
         * @param automationAccountId The Azure automation account Id which holds this runbook and authenticate to Azure resource.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountId(String automationAccountId) {
            return automationAccountId(Output.of(automationAccountId));
        }

        /**
         * @param isGlobalRunbook Indicates whether this instance is global runbook.
         * 
         * @return builder
         * 
         */
        public Builder isGlobalRunbook(Output<Boolean> isGlobalRunbook) {
            $.isGlobalRunbook = isGlobalRunbook;
            return this;
        }

        /**
         * @param isGlobalRunbook Indicates whether this instance is global runbook.
         * 
         * @return builder
         * 
         */
        public Builder isGlobalRunbook(Boolean isGlobalRunbook) {
            return isGlobalRunbook(Output.of(isGlobalRunbook));
        }

        /**
         * @param name Indicates name of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Indicates name of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runbookName The name for this runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(Output<String> runbookName) {
            $.runbookName = runbookName;
            return this;
        }

        /**
         * @param runbookName The name for this runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(String runbookName) {
            return runbookName(Output.of(runbookName));
        }

        /**
         * @param serviceUri The URI where webhooks should be sent.
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(@Nullable Output<String> serviceUri) {
            $.serviceUri = serviceUri;
            return this;
        }

        /**
         * @param serviceUri The URI where webhooks should be sent.
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(String serviceUri) {
            return serviceUri(Output.of(serviceUri));
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            $.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            return useCommonAlertSchema(Output.of(useCommonAlertSchema));
        }

        /**
         * @param webhookResourceId The resource id for webhook linked to this runbook.
         * 
         * @return builder
         * 
         */
        public Builder webhookResourceId(Output<String> webhookResourceId) {
            $.webhookResourceId = webhookResourceId;
            return this;
        }

        /**
         * @param webhookResourceId The resource id for webhook linked to this runbook.
         * 
         * @return builder
         * 
         */
        public Builder webhookResourceId(String webhookResourceId) {
            return webhookResourceId(Output.of(webhookResourceId));
        }

        public AutomationRunbookReceiverArgs build() {
            $.automationAccountId = Objects.requireNonNull($.automationAccountId, "expected parameter 'automationAccountId' to be non-null");
            $.isGlobalRunbook = Objects.requireNonNull($.isGlobalRunbook, "expected parameter 'isGlobalRunbook' to be non-null");
            $.runbookName = Objects.requireNonNull($.runbookName, "expected parameter 'runbookName' to be non-null");
            $.useCommonAlertSchema = Codegen.booleanProp("useCommonAlertSchema").output().arg($.useCommonAlertSchema).def(false).getNullable();
            $.webhookResourceId = Objects.requireNonNull($.webhookResourceId, "expected parameter 'webhookResourceId' to be non-null");
            return $;
        }
    }

}
