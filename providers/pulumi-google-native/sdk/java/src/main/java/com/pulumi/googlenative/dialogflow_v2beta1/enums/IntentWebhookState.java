// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    @EnumType
    public enum IntentWebhookState {
        /**
         * Webhook is disabled in the agent and in the intent.
         * 
         */
        WebhookStateUnspecified("WEBHOOK_STATE_UNSPECIFIED"),
        /**
         * Webhook is enabled in the agent and in the intent.
         * 
         */
        WebhookStateEnabled("WEBHOOK_STATE_ENABLED"),
        /**
         * Webhook is enabled in the agent and in the intent. Also, each slot filling prompt is forwarded to the webhook.
         * 
         */
        WebhookStateEnabledForSlotFilling("WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING");

        private final String value;

        IntentWebhookState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntentWebhookState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
