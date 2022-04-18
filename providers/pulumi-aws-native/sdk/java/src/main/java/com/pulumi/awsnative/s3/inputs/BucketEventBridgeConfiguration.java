// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Describes the Amazon EventBridge notification configuration for an Amazon S3 bucket.
 * 
 */
public final class BucketEventBridgeConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketEventBridgeConfiguration Empty = new BucketEventBridgeConfiguration();

    /**
     * Specifies whether to send notifications to Amazon EventBridge when events occur in an Amazon S3 bucket.
     * 
     */
    @Import(name="eventBridgeEnabled", required=true)
      private final Boolean eventBridgeEnabled;

    public Boolean eventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    public BucketEventBridgeConfiguration(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = Objects.requireNonNull(eventBridgeEnabled, "expected parameter 'eventBridgeEnabled' to be non-null");
    }

    private BucketEventBridgeConfiguration() {
        this.eventBridgeEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEventBridgeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean eventBridgeEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEventBridgeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridgeEnabled = defaults.eventBridgeEnabled;
        }

        public Builder eventBridgeEnabled(Boolean eventBridgeEnabled) {
            this.eventBridgeEnabled = Objects.requireNonNull(eventBridgeEnabled);
            return this;
        }        public BucketEventBridgeConfiguration build() {
            return new BucketEventBridgeConfiguration(eventBridgeEnabled);
        }
    }
}
