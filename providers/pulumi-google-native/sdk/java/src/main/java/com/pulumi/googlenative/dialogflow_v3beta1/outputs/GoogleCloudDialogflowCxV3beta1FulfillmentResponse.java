// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ResponseMessageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentResponse {
    /**
     * @return Conditional cases for this fulfillment.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases;
    /**
     * @return The list of rich message responses to present to the user.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages;
    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    private final Boolean returnPartialResponses;
    /**
     * @return Set parameter values before executing the webhook.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions;
    /**
     * @return The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by Dialogflow when the associated webhook is called. The tag is typically used by the webhook service to identify which fulfillment is being called, but it could be used for other purposes. This field is required if `webhook` is specified.
     * 
     */
    private final String tag;
    /**
     * @return The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    private final String webhook;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1FulfillmentResponse(
        @CustomType.Parameter("conditionalCases") List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases,
        @CustomType.Parameter("messages") List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages,
        @CustomType.Parameter("returnPartialResponses") Boolean returnPartialResponses,
        @CustomType.Parameter("setParameterActions") List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions,
        @CustomType.Parameter("tag") String tag,
        @CustomType.Parameter("webhook") String webhook) {
        this.conditionalCases = conditionalCases;
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.setParameterActions = setParameterActions;
        this.tag = tag;
        this.webhook = webhook;
    }

    /**
     * @return Conditional cases for this fulfillment.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases() {
        return this.conditionalCases;
    }
    /**
     * @return The list of rich message responses to present to the user.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages() {
        return this.messages;
    }
    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    public Boolean returnPartialResponses() {
        return this.returnPartialResponses;
    }
    /**
     * @return Set parameter values before executing the webhook.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions() {
        return this.setParameterActions;
    }
    /**
     * @return The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by Dialogflow when the associated webhook is called. The tag is typically used by the webhook service to identify which fulfillment is being called, but it could be used for other purposes. This field is required if `webhook` is specified.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    public String webhook() {
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

        public Builder conditionalCases(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases) {
            this.conditionalCases = Objects.requireNonNull(conditionalCases);
            return this;
        }
        public Builder conditionalCases(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse... conditionalCases) {
            return conditionalCases(List.of(conditionalCases));
        }
        public Builder messages(List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }
        public Builder messages(GoogleCloudDialogflowCxV3beta1ResponseMessageResponse... messages) {
            return messages(List.of(messages));
        }
        public Builder returnPartialResponses(Boolean returnPartialResponses) {
            this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses);
            return this;
        }
        public Builder setParameterActions(List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions) {
            this.setParameterActions = Objects.requireNonNull(setParameterActions);
            return this;
        }
        public Builder setParameterActions(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse... setParameterActions) {
            return setParameterActions(List.of(setParameterActions));
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder webhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1FulfillmentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentResponse(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}
