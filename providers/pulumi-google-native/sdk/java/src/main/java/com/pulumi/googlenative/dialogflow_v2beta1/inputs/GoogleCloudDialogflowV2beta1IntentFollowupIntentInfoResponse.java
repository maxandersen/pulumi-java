// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a single followup intent in the chain.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse Empty = new GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse();

    /**
     * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
     * 
     */
    @Import(name="followupIntentName", required=true)
      private final String followupIntentName;

    public String followupIntentName() {
        return this.followupIntentName;
    }

    /**
     * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
     * 
     */
    @Import(name="parentFollowupIntentName", required=true)
      private final String parentFollowupIntentName;

    public String parentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }

    public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse(
        String followupIntentName,
        String parentFollowupIntentName) {
        this.followupIntentName = Objects.requireNonNull(followupIntentName, "expected parameter 'followupIntentName' to be non-null");
        this.parentFollowupIntentName = Objects.requireNonNull(parentFollowupIntentName, "expected parameter 'parentFollowupIntentName' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse() {
        this.followupIntentName = null;
        this.parentFollowupIntentName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String followupIntentName;
        private String parentFollowupIntentName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followupIntentName = defaults.followupIntentName;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
        }

        public Builder followupIntentName(String followupIntentName) {
            this.followupIntentName = Objects.requireNonNull(followupIntentName);
            return this;
        }
        public Builder parentFollowupIntentName(String parentFollowupIntentName) {
            this.parentFollowupIntentName = Objects.requireNonNull(parentFollowupIntentName);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse(followupIntentName, parentFollowupIntentName);
        }
    }
}
