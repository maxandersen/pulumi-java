// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2NotificationConfigMessageFormat;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines notification behavior.
 * 
 */
public final class GoogleCloudDialogflowV2NotificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2NotificationConfigArgs Empty = new GoogleCloudDialogflowV2NotificationConfigArgs();

    /**
     * Format of message.
     * 
     */
    @Import(name="messageFormat")
    private @Nullable Output<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat;

    public Optional<Output<GoogleCloudDialogflowV2NotificationConfigMessageFormat>> messageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }

    /**
     * Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private GoogleCloudDialogflowV2NotificationConfigArgs() {}

    private GoogleCloudDialogflowV2NotificationConfigArgs(GoogleCloudDialogflowV2NotificationConfigArgs $) {
        this.messageFormat = $.messageFormat;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2NotificationConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2NotificationConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2NotificationConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2NotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageFormat(@Nullable Output<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat) {
            $.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(GoogleCloudDialogflowV2NotificationConfigMessageFormat messageFormat) {
            return messageFormat(Output.of(messageFormat));
        }

        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public GoogleCloudDialogflowV2NotificationConfigArgs build() {
            return $;
        }
    }

}
