// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketEventBridgeConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketLambdaConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketQueueConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketTopicConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the notification configuration for an Amazon S3 bucket.
 * 
 */
public final class BucketNotificationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketNotificationConfigurationArgs Empty = new BucketNotificationConfigurationArgs();

    @Import(name="eventBridgeConfiguration")
    private @Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration;

    public Optional<Output<BucketEventBridgeConfigurationArgs>> eventBridgeConfiguration() {
        return Optional.ofNullable(this.eventBridgeConfiguration);
    }

    @Import(name="lambdaConfigurations")
    private @Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations;

    public Optional<Output<List<BucketLambdaConfigurationArgs>>> lambdaConfigurations() {
        return Optional.ofNullable(this.lambdaConfigurations);
    }

    @Import(name="queueConfigurations")
    private @Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations;

    public Optional<Output<List<BucketQueueConfigurationArgs>>> queueConfigurations() {
        return Optional.ofNullable(this.queueConfigurations);
    }

    @Import(name="topicConfigurations")
    private @Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations;

    public Optional<Output<List<BucketTopicConfigurationArgs>>> topicConfigurations() {
        return Optional.ofNullable(this.topicConfigurations);
    }

    private BucketNotificationConfigurationArgs() {}

    private BucketNotificationConfigurationArgs(BucketNotificationConfigurationArgs $) {
        this.eventBridgeConfiguration = $.eventBridgeConfiguration;
        this.lambdaConfigurations = $.lambdaConfigurations;
        this.queueConfigurations = $.queueConfigurations;
        this.topicConfigurations = $.topicConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketNotificationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketNotificationConfigurationArgs $;

        public Builder() {
            $ = new BucketNotificationConfigurationArgs();
        }

        public Builder(BucketNotificationConfigurationArgs defaults) {
            $ = new BucketNotificationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventBridgeConfiguration(@Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration) {
            $.eventBridgeConfiguration = eventBridgeConfiguration;
            return this;
        }

        public Builder eventBridgeConfiguration(BucketEventBridgeConfigurationArgs eventBridgeConfiguration) {
            return eventBridgeConfiguration(Output.of(eventBridgeConfiguration));
        }

        public Builder lambdaConfigurations(@Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations) {
            $.lambdaConfigurations = lambdaConfigurations;
            return this;
        }

        public Builder lambdaConfigurations(List<BucketLambdaConfigurationArgs> lambdaConfigurations) {
            return lambdaConfigurations(Output.of(lambdaConfigurations));
        }

        public Builder lambdaConfigurations(BucketLambdaConfigurationArgs... lambdaConfigurations) {
            return lambdaConfigurations(List.of(lambdaConfigurations));
        }

        public Builder queueConfigurations(@Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations) {
            $.queueConfigurations = queueConfigurations;
            return this;
        }

        public Builder queueConfigurations(List<BucketQueueConfigurationArgs> queueConfigurations) {
            return queueConfigurations(Output.of(queueConfigurations));
        }

        public Builder queueConfigurations(BucketQueueConfigurationArgs... queueConfigurations) {
            return queueConfigurations(List.of(queueConfigurations));
        }

        public Builder topicConfigurations(@Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations) {
            $.topicConfigurations = topicConfigurations;
            return this;
        }

        public Builder topicConfigurations(List<BucketTopicConfigurationArgs> topicConfigurations) {
            return topicConfigurations(Output.of(topicConfigurations));
        }

        public Builder topicConfigurations(BucketTopicConfigurationArgs... topicConfigurations) {
            return topicConfigurations(List.of(topicConfigurations));
        }

        public BucketNotificationConfigurationArgs build() {
            return $;
        }
    }

}
