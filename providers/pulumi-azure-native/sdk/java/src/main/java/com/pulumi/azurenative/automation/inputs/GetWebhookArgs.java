// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetWebhookArgs extends InvokeArgs {

    public static final GetWebhookArgs Empty = new GetWebhookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The webhook name.
     * 
     */
    @Import(name="webhookName", required=true)
    private String webhookName;

    /**
     * @return The webhook name.
     * 
     */
    public String webhookName() {
        return this.webhookName;
    }

    private GetWebhookArgs() {}

    private GetWebhookArgs(GetWebhookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.webhookName = $.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhookArgs $;

        public Builder() {
            $ = new GetWebhookArgs();
        }

        public Builder(GetWebhookArgs defaults) {
            $ = new GetWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param webhookName The webhook name.
         * 
         * @return builder
         * 
         */
        public Builder webhookName(String webhookName) {
            $.webhookName = webhookName;
            return this;
        }

        public GetWebhookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.webhookName = Objects.requireNonNull($.webhookName, "expected parameter 'webhookName' to be non-null");
            return $;
        }
    }

}
