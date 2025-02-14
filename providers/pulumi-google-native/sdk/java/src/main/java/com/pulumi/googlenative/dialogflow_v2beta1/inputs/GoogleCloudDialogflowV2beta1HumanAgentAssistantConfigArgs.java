// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Human Agent Assistant to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs();

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="endUserSuggestionConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig;

    /**
     * @return Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs>> endUserSuggestionConfig() {
        return Optional.ofNullable(this.endUserSuggestionConfig);
    }

    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    @Import(name="humanAgentSuggestionConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig;

    /**
     * @return Configuration for agent assistance of human agent participant.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs>> humanAgentSuggestionConfig() {
        return Optional.ofNullable(this.humanAgentSuggestionConfig);
    }

    /**
     * Configuration for message analysis.
     * 
     */
    @Import(name="messageAnalysisConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig;

    /**
     * @return Configuration for message analysis.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs>> messageAnalysisConfig() {
        return Optional.ofNullable(this.messageAnalysisConfig);
    }

    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;

    /**
     * @return Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs $) {
        this.endUserSuggestionConfig = $.endUserSuggestionConfig;
        this.humanAgentSuggestionConfig = $.humanAgentSuggestionConfig;
        this.messageAnalysisConfig = $.messageAnalysisConfig;
        this.notificationConfig = $.notificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endUserSuggestionConfig Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder endUserSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig) {
            $.endUserSuggestionConfig = endUserSuggestionConfig;
            return this;
        }

        /**
         * @param endUserSuggestionConfig Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder endUserSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs endUserSuggestionConfig) {
            return endUserSuggestionConfig(Output.of(endUserSuggestionConfig));
        }

        /**
         * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig) {
            $.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
            return this;
        }

        /**
         * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs humanAgentSuggestionConfig) {
            return humanAgentSuggestionConfig(Output.of(humanAgentSuggestionConfig));
        }

        /**
         * @param messageAnalysisConfig Configuration for message analysis.
         * 
         * @return builder
         * 
         */
        public Builder messageAnalysisConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig) {
            $.messageAnalysisConfig = messageAnalysisConfig;
            return this;
        }

        /**
         * @param messageAnalysisConfig Configuration for message analysis.
         * 
         * @return builder
         * 
         */
        public Builder messageAnalysisConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs messageAnalysisConfig) {
            return messageAnalysisConfig(Output.of(messageAnalysisConfig));
        }

        /**
         * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs build() {
            return $;
        }
    }

}
