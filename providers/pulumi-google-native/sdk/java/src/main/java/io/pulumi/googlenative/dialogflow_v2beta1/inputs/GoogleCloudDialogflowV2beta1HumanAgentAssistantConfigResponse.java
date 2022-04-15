// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigResponse;
import java.util.Objects;


/**
 * Defines the Human Agent Assistant to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse();

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="endUserSuggestionConfig", required=true)
      private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig() {
        return this.endUserSuggestionConfig;
    }

    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    @Import(name="humanAgentSuggestionConfig", required=true)
      private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig() {
        return this.humanAgentSuggestionConfig;
    }

    /**
     * Configuration for message analysis.
     * 
     */
    @Import(name="messageAnalysisConfig", required=true)
      private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig() {
        return this.messageAnalysisConfig;
    }

    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    @Import(name="notificationConfig", required=true)
      private final GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;

    public GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig() {
        return this.notificationConfig;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig,
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig,
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig,
        GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
        this.endUserSuggestionConfig = Objects.requireNonNull(endUserSuggestionConfig, "expected parameter 'endUserSuggestionConfig' to be non-null");
        this.humanAgentSuggestionConfig = Objects.requireNonNull(humanAgentSuggestionConfig, "expected parameter 'humanAgentSuggestionConfig' to be non-null");
        this.messageAnalysisConfig = Objects.requireNonNull(messageAnalysisConfig, "expected parameter 'messageAnalysisConfig' to be non-null");
        this.notificationConfig = Objects.requireNonNull(notificationConfig, "expected parameter 'notificationConfig' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse() {
        this.endUserSuggestionConfig = null;
        this.humanAgentSuggestionConfig = null;
        this.messageAnalysisConfig = null;
        this.notificationConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;
        private GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endUserSuggestionConfig = defaults.endUserSuggestionConfig;
    	      this.humanAgentSuggestionConfig = defaults.humanAgentSuggestionConfig;
    	      this.messageAnalysisConfig = defaults.messageAnalysisConfig;
    	      this.notificationConfig = defaults.notificationConfig;
        }

        public Builder endUserSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig) {
            this.endUserSuggestionConfig = Objects.requireNonNull(endUserSuggestionConfig);
            return this;
        }
        public Builder humanAgentSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig) {
            this.humanAgentSuggestionConfig = Objects.requireNonNull(humanAgentSuggestionConfig);
            return this;
        }
        public Builder messageAnalysisConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig) {
            this.messageAnalysisConfig = Objects.requireNonNull(messageAnalysisConfig);
            return this;
        }
        public Builder notificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(endUserSuggestionConfig, humanAgentSuggestionConfig, messageAnalysisConfig, notificationConfig);
        }
    }
}
