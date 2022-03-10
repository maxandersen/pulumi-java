// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse {
    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
     * 
     */
    private final List<String> knowledgeBases;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(@OutputCustomType.Parameter("knowledgeBases") List<String> knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
    }

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
     * 
    */
    public List<String> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> knowledgeBases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBases = defaults.knowledgeBases;
        }

        public Builder setKnowledgeBases(List<String> knowledgeBases) {
            this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(knowledgeBases);
        }
    }
}
