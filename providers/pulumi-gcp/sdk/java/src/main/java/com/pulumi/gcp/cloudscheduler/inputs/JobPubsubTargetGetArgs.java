// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPubsubTargetGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobPubsubTargetGetArgs Empty = new JobPubsubTargetGetArgs();

    /**
     * Attributes for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,String>> attributes;

    public Output<Map<String,String>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * The message payload for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * A base64-encoded string.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> data() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    /**
     * The full resource name for the Cloud Pub/Sub topic to which
     * messages will be published when a job is delivered. ~&gt;**NOTE:**
     * The topic name must be in the same format as required by PubSub&#39;s
     * PublishRequest.name, e.g. `projects/my-project/topics/my-topic`.
     * 
     */
    @Import(name="topicName", required=true)
      private final Output<String> topicName;

    public Output<String> topicName() {
        return this.topicName;
    }

    public JobPubsubTargetGetArgs(
        @Nullable Output<Map<String,String>> attributes,
        @Nullable Output<String> data,
        Output<String> topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private JobPubsubTargetGetArgs() {
        this.attributes = Codegen.empty();
        this.data = Codegen.empty();
        this.topicName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPubsubTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> attributes;
        private @Nullable Output<String> data;
        private Output<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPubsubTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder topicName(Output<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Output.of(Objects.requireNonNull(topicName));
            return this;
        }        public JobPubsubTargetGetArgs build() {
            return new JobPubsubTargetGetArgs(attributes, data, topicName);
        }
    }
}
