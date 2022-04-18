// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1beta1a.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTopicArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicArgs Empty = new GetTopicArgs();

    @Import(name="topicId", required=true)
      private final String topicId;

    public String topicId() {
        return this.topicId;
    }

    public GetTopicArgs(String topicId) {
        this.topicId = Objects.requireNonNull(topicId, "expected parameter 'topicId' to be non-null");
    }

    private GetTopicArgs() {
        this.topicId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topicId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicId = defaults.topicId;
        }

        public Builder topicId(String topicId) {
            this.topicId = Objects.requireNonNull(topicId);
            return this;
        }        public GetTopicArgs build() {
            return new GetTopicArgs(topicId);
        }
    }
}
