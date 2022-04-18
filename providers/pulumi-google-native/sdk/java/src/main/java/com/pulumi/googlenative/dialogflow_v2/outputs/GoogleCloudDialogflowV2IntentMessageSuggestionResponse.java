// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageSuggestionResponse {
    /**
     * The text shown the in the suggestion chip.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageSuggestionResponse(@CustomType.Parameter("title") String title) {
        this.title = title;
    }

    /**
     * The text shown the in the suggestion chip.
     * 
    */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.title = defaults.title;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageSuggestionResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionResponse(title);
        }
    }
}
