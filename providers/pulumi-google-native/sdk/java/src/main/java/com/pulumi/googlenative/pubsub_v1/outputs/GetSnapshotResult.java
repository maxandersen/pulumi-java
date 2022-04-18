// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSnapshotResult {
    /**
     * The snapshot is guaranteed to exist up until this time. A newly-created snapshot expires no later than 7 days from the time of its creation. Its exact lifetime is determined at creation by the existing backlog in the source subscription. Specifically, the lifetime of the snapshot is `7 days - (age of oldest unacked message in the subscription)`. For example, consider a subscription whose oldest unacked message is 3 days old. If a snapshot is created from this subscription, the snapshot -- which will always capture this 3-day-old backlog as long as the snapshot exists -- will expire in 4 days. The service will refuse to create a snapshot that would expire in less than 1 hour after creation.
     * 
     */
    private final String expireTime;
    /**
     * See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels).
     * 
     */
    private final Map<String,String> labels;
    /**
     * The name of the snapshot.
     * 
     */
    private final String name;
    /**
     * The name of the topic from which this snapshot is retaining messages.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("topic") String topic) {
        this.expireTime = expireTime;
        this.labels = labels;
        this.name = name;
        this.topic = topic;
    }

    /**
     * The snapshot is guaranteed to exist up until this time. A newly-created snapshot expires no later than 7 days from the time of its creation. Its exact lifetime is determined at creation by the existing backlog in the source subscription. Specifically, the lifetime of the snapshot is `7 days - (age of oldest unacked message in the subscription)`. For example, consider a subscription whose oldest unacked message is 3 days old. If a snapshot is created from this subscription, the snapshot -- which will always capture this 3-day-old backlog as long as the snapshot exists -- will expire in 4 days. The service will refuse to create a snapshot that would expire in less than 1 hour after creation.
     * 
    */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels).
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The name of the snapshot.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The name of the topic from which this snapshot is retaining messages.
     * 
    */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.topic = defaults.topic;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GetSnapshotResult build() {
            return new GetSnapshotResult(expireTime, labels, name, topic);
        }
    }
}
