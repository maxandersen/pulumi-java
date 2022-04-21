// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Describes the Amazon EventBridge notification configuration for an Amazon S3 bucket.
 * 
 */
public final class BucketEventBridgeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketEventBridgeConfigurationArgs Empty = new BucketEventBridgeConfigurationArgs();

    /**
     * Specifies whether to send notifications to Amazon EventBridge when events occur in an Amazon S3 bucket.
     * 
     */
    @Import(name="eventBridgeEnabled", required=true)
    private Output<Boolean> eventBridgeEnabled;

    public Output<Boolean> eventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    private BucketEventBridgeConfigurationArgs() {}

    private BucketEventBridgeConfigurationArgs(BucketEventBridgeConfigurationArgs $) {
        this.eventBridgeEnabled = $.eventBridgeEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketEventBridgeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketEventBridgeConfigurationArgs $;

        public Builder() {
            $ = new BucketEventBridgeConfigurationArgs();
        }

        public Builder(BucketEventBridgeConfigurationArgs defaults) {
            $ = new BucketEventBridgeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventBridgeEnabled(Output<Boolean> eventBridgeEnabled) {
            $.eventBridgeEnabled = eventBridgeEnabled;
            return this;
        }

        public Builder eventBridgeEnabled(Boolean eventBridgeEnabled) {
            return eventBridgeEnabled(Output.of(eventBridgeEnabled));
        }

        public BucketEventBridgeConfigurationArgs build() {
            $.eventBridgeEnabled = Objects.requireNonNull($.eventBridgeEnabled, "expected parameter 'eventBridgeEnabled' to be non-null");
            return $;
        }
    }

}
