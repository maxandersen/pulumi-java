// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A fulfillment can do one or more of the following actions at the same time: * Generate rich message responses. * Set parameter values. * Call the webhook. Fulfillments can be called at various stages in the Page or Form lifecycle. For example, when a DetectIntentRequest drives a session to enter a new page, the page&#39;s entry fulfillment can add a static response to the QueryResult in the returning DetectIntentResponse, call the webhook (for example, to load user data from a database), or both.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentArgs();

    /**
     * Conditional cases for this fulfillment.
     * 
     */
    @Import(name="conditionalCases")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs>> conditionalCases;

    public Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs>> conditionalCases() {
        return this.conditionalCases == null ? Codegen.empty() : this.conditionalCases;
    }

    /**
     * The list of rich message responses to present to the user.
     * 
     */
    @Import(name="messages")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3ResponseMessageArgs>> messages;

    public Output<List<GoogleCloudDialogflowCxV3ResponseMessageArgs>> messages() {
        return this.messages == null ? Codegen.empty() : this.messages;
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @Import(name="returnPartialResponses")
      private final @Nullable Output<Boolean> returnPartialResponses;

    public Output<Boolean> returnPartialResponses() {
        return this.returnPartialResponses == null ? Codegen.empty() : this.returnPartialResponses;
    }

    /**
     * Set parameter values before executing the webhook.
     * 
     */
    @Import(name="setParameterActions")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs>> setParameterActions;

    public Output<List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs>> setParameterActions() {
        return this.setParameterActions == null ? Codegen.empty() : this.setParameterActions;
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if `webhook` is specified.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> tag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    /**
     * The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @Import(name="webhook")
      private final @Nullable Output<String> webhook;

    public Output<String> webhook() {
        return this.webhook == null ? Codegen.empty() : this.webhook;
    }

    public GoogleCloudDialogflowCxV3FulfillmentArgs(
        @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs>> conditionalCases,
        @Nullable Output<List<GoogleCloudDialogflowCxV3ResponseMessageArgs>> messages,
        @Nullable Output<Boolean> returnPartialResponses,
        @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs>> setParameterActions,
        @Nullable Output<String> tag,
        @Nullable Output<String> webhook) {
        this.conditionalCases = conditionalCases;
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.setParameterActions = setParameterActions;
        this.tag = tag;
        this.webhook = webhook;
    }

    private GoogleCloudDialogflowCxV3FulfillmentArgs() {
        this.conditionalCases = Codegen.empty();
        this.messages = Codegen.empty();
        this.returnPartialResponses = Codegen.empty();
        this.setParameterActions = Codegen.empty();
        this.tag = Codegen.empty();
        this.webhook = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs>> conditionalCases;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3ResponseMessageArgs>> messages;
        private @Nullable Output<Boolean> returnPartialResponses;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs>> setParameterActions;
        private @Nullable Output<String> tag;
        private @Nullable Output<String> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder conditionalCases(@Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs>> conditionalCases) {
            this.conditionalCases = conditionalCases;
            return this;
        }
        public Builder conditionalCases(@Nullable List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> conditionalCases) {
            this.conditionalCases = Codegen.ofNullable(conditionalCases);
            return this;
        }
        public Builder conditionalCases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs... conditionalCases) {
            return conditionalCases(List.of(conditionalCases));
        }
        public Builder messages(@Nullable Output<List<GoogleCloudDialogflowCxV3ResponseMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }
        public Builder messages(@Nullable List<GoogleCloudDialogflowCxV3ResponseMessageArgs> messages) {
            this.messages = Codegen.ofNullable(messages);
            return this;
        }
        public Builder messages(GoogleCloudDialogflowCxV3ResponseMessageArgs... messages) {
            return messages(List.of(messages));
        }
        public Builder returnPartialResponses(@Nullable Output<Boolean> returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }
        public Builder returnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = Codegen.ofNullable(returnPartialResponses);
            return this;
        }
        public Builder setParameterActions(@Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs>> setParameterActions) {
            this.setParameterActions = setParameterActions;
            return this;
        }
        public Builder setParameterActions(@Nullable List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs> setParameterActions) {
            this.setParameterActions = Codegen.ofNullable(setParameterActions);
            return this;
        }
        public Builder setParameterActions(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs... setParameterActions) {
            return setParameterActions(List.of(setParameterActions));
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }
        public Builder webhook(@Nullable Output<String> webhook) {
            this.webhook = webhook;
            return this;
        }
        public Builder webhook(@Nullable String webhook) {
            this.webhook = Codegen.ofNullable(webhook);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentArgs build() {
            return new GoogleCloudDialogflowCxV3FulfillmentArgs(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}
