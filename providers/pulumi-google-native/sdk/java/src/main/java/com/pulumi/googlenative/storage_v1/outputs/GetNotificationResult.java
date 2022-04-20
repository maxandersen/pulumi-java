// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNotificationResult {
    /**
     * An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription.
     * 
     */
    private final Map<String,String> customAttributes;
    /**
     * HTTP 1.1 Entity tag for this subscription notification.
     * 
     */
    private final String etag;
    /**
     * If present, only send notifications about listed event types. If empty, sent notifications for all event types.
     * 
     */
    private final List<String> eventTypes;
    /**
     * The kind of item this is. For notifications, this is always storage#notification.
     * 
     */
    private final String kind;
    /**
     * If present, only apply this notification configuration to object names that begin with this prefix.
     * 
     */
    private final String objectNamePrefix;
    /**
     * The desired content of the Payload.
     * 
     */
    private final String payloadFormat;
    /**
     * The canonical URL of this notification.
     * 
     */
    private final String selfLink;
    /**
     * The Cloud PubSub topic to which this subscription publishes. Formatted as: &#39;//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}&#39;
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private GetNotificationResult(
        @CustomType.Parameter("customAttributes") Map<String,String> customAttributes,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("eventTypes") List<String> eventTypes,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("objectNamePrefix") String objectNamePrefix,
        @CustomType.Parameter("payloadFormat") String payloadFormat,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("topic") String topic) {
        this.customAttributes = customAttributes;
        this.etag = etag;
        this.eventTypes = eventTypes;
        this.kind = kind;
        this.objectNamePrefix = objectNamePrefix;
        this.payloadFormat = payloadFormat;
        this.selfLink = selfLink;
        this.topic = topic;
    }

    /**
     * An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription.
     * 
    */
    public Map<String,String> customAttributes() {
        return this.customAttributes;
    }
    /**
     * HTTP 1.1 Entity tag for this subscription notification.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * If present, only send notifications about listed event types. If empty, sent notifications for all event types.
     * 
    */
    public List<String> eventTypes() {
        return this.eventTypes;
    }
    /**
     * The kind of item this is. For notifications, this is always storage#notification.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * If present, only apply this notification configuration to object names that begin with this prefix.
     * 
    */
    public String objectNamePrefix() {
        return this.objectNamePrefix;
    }
    /**
     * The desired content of the Payload.
     * 
    */
    public String payloadFormat() {
        return this.payloadFormat;
    }
    /**
     * The canonical URL of this notification.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The Cloud PubSub topic to which this subscription publishes. Formatted as: &#39;//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}&#39;
     * 
    */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customAttributes;
        private String etag;
        private List<String> eventTypes;
        private String kind;
        private String objectNamePrefix;
        private String payloadFormat;
        private String selfLink;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAttributes = defaults.customAttributes;
    	      this.etag = defaults.etag;
    	      this.eventTypes = defaults.eventTypes;
    	      this.kind = defaults.kind;
    	      this.objectNamePrefix = defaults.objectNamePrefix;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.selfLink = defaults.selfLink;
    	      this.topic = defaults.topic;
        }

        public Builder customAttributes(Map<String,String> customAttributes) {
            this.customAttributes = Objects.requireNonNull(customAttributes);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder eventTypes(List<String> eventTypes) {
            this.eventTypes = Objects.requireNonNull(eventTypes);
            return this;
        }
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder objectNamePrefix(String objectNamePrefix) {
            this.objectNamePrefix = Objects.requireNonNull(objectNamePrefix);
            return this;
        }
        public Builder payloadFormat(String payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GetNotificationResult build() {
            return new GetNotificationResult(customAttributes, etag, eventTypes, kind, objectNamePrefix, payloadFormat, selfLink, topic);
        }
    }
}
