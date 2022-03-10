// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse {
    /**
     * The list of simple responses.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse(@OutputCustomType.Parameter("simpleResponses") List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses) {
        this.simpleResponses = simpleResponses;
    }

    /**
     * The list of simple responses.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> getSimpleResponses() {
        return this.simpleResponses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleResponses = defaults.simpleResponses;
        }

        public Builder setSimpleResponses(List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse(simpleResponses);
        }
    }
}
