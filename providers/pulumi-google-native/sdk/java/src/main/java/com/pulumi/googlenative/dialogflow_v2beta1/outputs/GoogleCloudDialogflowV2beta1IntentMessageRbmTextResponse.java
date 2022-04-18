// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse {
    /**
     * Optional. One or more suggestions to show to the user.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> rbmSuggestion;
    /**
     * Text sent and displayed to the user.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse(
        @CustomType.Parameter("rbmSuggestion") List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> rbmSuggestion,
        @CustomType.Parameter("text") String text) {
        this.rbmSuggestion = rbmSuggestion;
        this.text = text;
    }

    /**
     * Optional. One or more suggestions to show to the user.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> rbmSuggestion() {
        return this.rbmSuggestion;
    }
    /**
     * Text sent and displayed to the user.
     * 
    */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> rbmSuggestion;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rbmSuggestion = defaults.rbmSuggestion;
    	      this.text = defaults.text;
        }

        public Builder rbmSuggestion(List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> rbmSuggestion) {
            this.rbmSuggestion = Objects.requireNonNull(rbmSuggestion);
            return this;
        }
        public Builder rbmSuggestion(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse... rbmSuggestion) {
            return rbmSuggestion(List.of(rbmSuggestion));
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse(rbmSuggestion, text);
        }
    }
}
