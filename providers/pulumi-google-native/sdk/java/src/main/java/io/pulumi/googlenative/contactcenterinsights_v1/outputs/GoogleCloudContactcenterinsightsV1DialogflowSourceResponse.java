// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1DialogflowSourceResponse {
    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
     */
    private final String audioUri;
    /**
     * The name of the Dialogflow conversation that this conversation resource is derived from. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
     */
    private final String dialogflowConversation;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1DialogflowSourceResponse(
        @CustomType.Parameter("audioUri") String audioUri,
        @CustomType.Parameter("dialogflowConversation") String dialogflowConversation) {
        this.audioUri = audioUri;
        this.dialogflowConversation = dialogflowConversation;
    }

    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
    */
    public String audioUri() {
        return this.audioUri;
    }
    /**
     * The name of the Dialogflow conversation that this conversation resource is derived from. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
    */
    public String dialogflowConversation() {
        return this.dialogflowConversation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1DialogflowSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audioUri;
        private String dialogflowConversation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1DialogflowSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
    	      this.dialogflowConversation = defaults.dialogflowConversation;
        }

        public Builder audioUri(String audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }
        public Builder dialogflowConversation(String dialogflowConversation) {
            this.dialogflowConversation = Objects.requireNonNull(dialogflowConversation);
            return this;
        }        public GoogleCloudContactcenterinsightsV1DialogflowSourceResponse build() {
            return new GoogleCloudContactcenterinsightsV1DialogflowSourceResponse(audioUri, dialogflowConversation);
        }
    }
}
