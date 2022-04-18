// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse {
    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
     * 
     */
    private final List<String> documents;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse(@CustomType.Parameter("documents") List<String> documents) {
        this.documents = documents;
    }

    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
     * 
    */
    public List<String> documents() {
        return this.documents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> documents;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documents = defaults.documents;
        }

        public Builder documents(List<String> documents) {
            this.documents = Objects.requireNonNull(documents);
            return this;
        }
        public Builder documents(String... documents) {
            return documents(List.of(documents));
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse(documents);
        }
    }
}
