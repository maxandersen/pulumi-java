// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicResponse {
    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/*{@literal /}topics/*`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private TopicResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/*{@literal /}topics/*`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public TopicResponse build() {
            return new TopicResponse(name);
        }
    }
}
