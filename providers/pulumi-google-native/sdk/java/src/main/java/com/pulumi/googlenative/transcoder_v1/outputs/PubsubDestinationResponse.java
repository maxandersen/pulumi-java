// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PubsubDestinationResponse {
    /**
     * The name of the Pub/Sub topic to publish job completion notification to. For example: `projects/{project}/topics/{topic}`.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private PubsubDestinationResponse(@CustomType.Parameter("topic") String topic) {
        this.topic = topic;
    }

    /**
     * The name of the Pub/Sub topic to publish job completion notification to. For example: `projects/{project}/topics/{topic}`.
     * 
    */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public PubsubDestinationResponse build() {
            return new PubsubDestinationResponse(topic);
        }
    }
}
