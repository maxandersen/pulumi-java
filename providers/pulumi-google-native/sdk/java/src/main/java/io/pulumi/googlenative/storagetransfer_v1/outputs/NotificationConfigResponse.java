// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NotificationConfigResponse {
    /**
     * Event types for which a notification is desired. If empty, send notifications for all event types.
     * 
     */
    private final List<String> eventTypes;
    /**
     * The desired format of the notification message payloads.
     * 
     */
    private final String payloadFormat;
    /**
     * The `Topic.name` of the Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format results in an INVALID_ARGUMENT error.
     * 
     */
    private final String pubsubTopic;

    @OutputCustomType.Constructor
    private NotificationConfigResponse(
        @OutputCustomType.Parameter("eventTypes") List<String> eventTypes,
        @OutputCustomType.Parameter("payloadFormat") String payloadFormat,
        @OutputCustomType.Parameter("pubsubTopic") String pubsubTopic) {
        this.eventTypes = eventTypes;
        this.payloadFormat = payloadFormat;
        this.pubsubTopic = pubsubTopic;
    }

    /**
     * Event types for which a notification is desired. If empty, send notifications for all event types.
     * 
    */
    public List<String> getEventTypes() {
        return this.eventTypes;
    }
    /**
     * The desired format of the notification message payloads.
     * 
    */
    public String getPayloadFormat() {
        return this.payloadFormat;
    }
    /**
     * The `Topic.name` of the Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format results in an INVALID_ARGUMENT error.
     * 
    */
    public String getPubsubTopic() {
        return this.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> eventTypes;
        private String payloadFormat;
        private String pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypes = defaults.eventTypes;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder setEventTypes(List<String> eventTypes) {
            this.eventTypes = Objects.requireNonNull(eventTypes);
            return this;
        }

        public Builder setPayloadFormat(String payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }

        public Builder setPubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(eventTypes, payloadFormat, pubsubTopic);
        }
    }
}
