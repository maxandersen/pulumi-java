// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ResponseMessageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentResponse {
    /**
     * Conditional cases for this fulfillment.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases;
    /**
     * The list of rich message responses to present to the user.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages;
    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    private final Boolean returnPartialResponses;
    /**
     * Set parameter values before executing the webhook.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions;
    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if `webhook` is specified.
     * 
     */
    private final String tag;
    /**
     * The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    private final String webhook;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1FulfillmentResponse(
        @OutputCustomType.Parameter("conditionalCases") List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases,
        @OutputCustomType.Parameter("messages") List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages,
        @OutputCustomType.Parameter("returnPartialResponses") Boolean returnPartialResponses,
        @OutputCustomType.Parameter("setParameterActions") List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions,
        @OutputCustomType.Parameter("tag") String tag,
        @OutputCustomType.Parameter("webhook") String webhook) {
        this.conditionalCases = conditionalCases;
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.setParameterActions = setParameterActions;
        this.tag = tag;
        this.webhook = webhook;
    }

    /**
     * Conditional cases for this fulfillment.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> getConditionalCases() {
        return this.conditionalCases;
    }
    /**
     * The list of rich message responses to present to the user.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> getMessages() {
        return this.messages;
    }
    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
    */
    public Boolean getReturnPartialResponses() {
        return this.returnPartialResponses;
    }
    /**
     * Set parameter values before executing the webhook.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> getSetParameterActions() {
        return this.setParameterActions;
    }
    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if `webhook` is specified.
     * 
    */
    public String getTag() {
        return this.tag;
    }
    /**
     * The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
    */
    public String getWebhook() {
        return this.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases;
        private List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages;
        private Boolean returnPartialResponses;
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions;
        private String tag;
        private String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setConditionalCases(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases) {
            this.conditionalCases = Objects.requireNonNull(conditionalCases);
            return this;
        }

        public Builder setMessages(List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setReturnPartialResponses(Boolean returnPartialResponses) {
            this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses);
            return this;
        }

        public Builder setSetParameterActions(List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions) {
            this.setParameterActions = Objects.requireNonNull(setParameterActions);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setWebhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FulfillmentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentResponse(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}
