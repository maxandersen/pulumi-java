// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationArgs Empty = new NotificationArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * A set of key/value attribute pairs to attach to each Cloud PubSub message published for this notification subscription
     * 
     */
    @Import(name="customAttributes")
      private final @Nullable Output<Map<String,String>> customAttributes;

    public Output<Map<String,String>> customAttributes() {
        return this.customAttributes == null ? Codegen.empty() : this.customAttributes;
    }

    /**
     * List of event type filters for this notification config. If not specified, Cloud Storage will send notifications for all event types. The valid types are: `"OBJECT_FINALIZE"`, `"OBJECT_METADATA_UPDATE"`, `"OBJECT_DELETE"`, `"OBJECT_ARCHIVE"`
     * 
     */
    @Import(name="eventTypes")
      private final @Nullable Output<List<String>> eventTypes;

    public Output<List<String>> eventTypes() {
        return this.eventTypes == null ? Codegen.empty() : this.eventTypes;
    }

    /**
     * Specifies a prefix path filter for this notification config. Cloud Storage will only send notifications for objects in this bucket whose names begin with the specified prefix.
     * 
     */
    @Import(name="objectNamePrefix")
      private final @Nullable Output<String> objectNamePrefix;

    public Output<String> objectNamePrefix() {
        return this.objectNamePrefix == null ? Codegen.empty() : this.objectNamePrefix;
    }

    /**
     * The desired content of the Payload. One of `"JSON_API_V1"` or `"NONE"`.
     * 
     */
    @Import(name="payloadFormat", required=true)
      private final Output<String> payloadFormat;

    public Output<String> payloadFormat() {
        return this.payloadFormat;
    }

    /**
     * The Cloud PubSub topic to which this subscription publishes. Expects either the
     * topic name, assumed to belong to the default GCP provider project, or the project-level name,
     * i.e. `projects/my-gcp-project/topics/my-topic` or `my-topic`. If the project is not set in the provider,
     * you will need to use the project-level name.
     * 
     */
    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> topic() {
        return this.topic;
    }

    public NotificationArgs(
        Output<String> bucket,
        @Nullable Output<Map<String,String>> customAttributes,
        @Nullable Output<List<String>> eventTypes,
        @Nullable Output<String> objectNamePrefix,
        Output<String> payloadFormat,
        Output<String> topic) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.customAttributes = customAttributes;
        this.eventTypes = eventTypes;
        this.objectNamePrefix = objectNamePrefix;
        this.payloadFormat = Objects.requireNonNull(payloadFormat, "expected parameter 'payloadFormat' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private NotificationArgs() {
        this.bucket = Codegen.empty();
        this.customAttributes = Codegen.empty();
        this.eventTypes = Codegen.empty();
        this.objectNamePrefix = Codegen.empty();
        this.payloadFormat = Codegen.empty();
        this.topic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Map<String,String>> customAttributes;
        private @Nullable Output<List<String>> eventTypes;
        private @Nullable Output<String> objectNamePrefix;
        private Output<String> payloadFormat;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.customAttributes = defaults.customAttributes;
    	      this.eventTypes = defaults.eventTypes;
    	      this.objectNamePrefix = defaults.objectNamePrefix;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.topic = defaults.topic;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder customAttributes(@Nullable Output<Map<String,String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(@Nullable Map<String,String> customAttributes) {
            this.customAttributes = Codegen.ofNullable(customAttributes);
            return this;
        }
        public Builder eventTypes(@Nullable Output<List<String>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public Builder eventTypes(@Nullable List<String> eventTypes) {
            this.eventTypes = Codegen.ofNullable(eventTypes);
            return this;
        }
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        public Builder objectNamePrefix(@Nullable Output<String> objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            return this;
        }
        public Builder objectNamePrefix(@Nullable String objectNamePrefix) {
            this.objectNamePrefix = Codegen.ofNullable(objectNamePrefix);
            return this;
        }
        public Builder payloadFormat(Output<String> payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }
        public Builder payloadFormat(String payloadFormat) {
            this.payloadFormat = Output.of(Objects.requireNonNull(payloadFormat));
            return this;
        }
        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Output.of(Objects.requireNonNull(topic));
            return this;
        }        public NotificationArgs build() {
            return new NotificationArgs(bucket, customAttributes, eventTypes, objectNamePrefix, payloadFormat, topic);
        }
    }
}
