// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse {
    /**
     * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
     * 
     */
    private final Map<String,String> metadata;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse(@OutputCustomType.Parameter("metadata") Map<String,String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse(metadata);
        }
    }
}
