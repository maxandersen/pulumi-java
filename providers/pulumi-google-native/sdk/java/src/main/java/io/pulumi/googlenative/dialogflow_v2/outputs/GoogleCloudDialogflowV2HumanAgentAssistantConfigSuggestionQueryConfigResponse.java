// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse {
    /**
     * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
     * 
     */
    private final Double confidenceThreshold;
    /**
     * Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse contextFilterSettings;
    /**
     * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse dialogflowQuerySource;
    /**
     * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse documentQuerySource;
    /**
     * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse knowledgeBaseQuerySource;
    /**
     * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
     * 
     */
    private final Integer maxResults;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse(
        @CustomType.Parameter("confidenceThreshold") Double confidenceThreshold,
        @CustomType.Parameter("contextFilterSettings") GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse contextFilterSettings,
        @CustomType.Parameter("dialogflowQuerySource") GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse dialogflowQuerySource,
        @CustomType.Parameter("documentQuerySource") GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse documentQuerySource,
        @CustomType.Parameter("knowledgeBaseQuerySource") GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse knowledgeBaseQuerySource,
        @CustomType.Parameter("maxResults") Integer maxResults) {
        this.confidenceThreshold = confidenceThreshold;
        this.contextFilterSettings = contextFilterSettings;
        this.dialogflowQuerySource = dialogflowQuerySource;
        this.documentQuerySource = documentQuerySource;
        this.knowledgeBaseQuerySource = knowledgeBaseQuerySource;
        this.maxResults = maxResults;
    }

    /**
     * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
     * 
    */
    public Double confidenceThreshold() {
        return this.confidenceThreshold;
    }
    /**
     * Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse contextFilterSettings() {
        return this.contextFilterSettings;
    }
    /**
     * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse dialogflowQuerySource() {
        return this.dialogflowQuerySource;
    }
    /**
     * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse documentQuerySource() {
        return this.documentQuerySource;
    }
    /**
     * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse knowledgeBaseQuerySource() {
        return this.knowledgeBaseQuerySource;
    }
    /**
     * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
     * 
    */
    public Integer maxResults() {
        return this.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceThreshold;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse contextFilterSettings;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse dialogflowQuerySource;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse documentQuerySource;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse knowledgeBaseQuerySource;
        private Integer maxResults;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceThreshold = defaults.confidenceThreshold;
    	      this.contextFilterSettings = defaults.contextFilterSettings;
    	      this.dialogflowQuerySource = defaults.dialogflowQuerySource;
    	      this.documentQuerySource = defaults.documentQuerySource;
    	      this.knowledgeBaseQuerySource = defaults.knowledgeBaseQuerySource;
    	      this.maxResults = defaults.maxResults;
        }

        public Builder confidenceThreshold(Double confidenceThreshold) {
            this.confidenceThreshold = Objects.requireNonNull(confidenceThreshold);
            return this;
        }
        public Builder contextFilterSettings(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse contextFilterSettings) {
            this.contextFilterSettings = Objects.requireNonNull(contextFilterSettings);
            return this;
        }
        public Builder dialogflowQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceResponse dialogflowQuerySource) {
            this.dialogflowQuerySource = Objects.requireNonNull(dialogflowQuerySource);
            return this;
        }
        public Builder documentQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse documentQuerySource) {
            this.documentQuerySource = Objects.requireNonNull(documentQuerySource);
            return this;
        }
        public Builder knowledgeBaseQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse knowledgeBaseQuerySource) {
            this.knowledgeBaseQuerySource = Objects.requireNonNull(knowledgeBaseQuerySource);
            return this;
        }
        public Builder maxResults(Integer maxResults) {
            this.maxResults = Objects.requireNonNull(maxResults);
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse(confidenceThreshold, contextFilterSettings, dialogflowQuerySource, documentQuerySource, knowledgeBaseQuerySource, maxResults);
        }
    }
}
