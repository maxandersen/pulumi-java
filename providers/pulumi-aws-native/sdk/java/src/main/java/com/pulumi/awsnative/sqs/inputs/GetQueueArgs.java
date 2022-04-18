// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sqs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQueueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueArgs Empty = new GetQueueArgs();

    /**
     * URL of the source queue.
     * 
     */
    @Import(name="queueUrl", required=true)
      private final String queueUrl;

    public String queueUrl() {
        return this.queueUrl;
    }

    public GetQueueArgs(String queueUrl) {
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
    }

    private GetQueueArgs() {
        this.queueUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queueUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }        public GetQueueArgs build() {
            return new GetQueueArgs(queueUrl);
        }
    }
}
