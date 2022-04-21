// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationCloudwatchLoggingOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationCloudwatchLoggingOptionsGetArgs Empty = new ApplicationCloudwatchLoggingOptionsGetArgs();

    @Import(name="cloudwatchLoggingOptionId")
    private @Nullable Output<String> cloudwatchLoggingOptionId;

    public Optional<Output<String>> cloudwatchLoggingOptionId() {
        return Optional.ofNullable(this.cloudwatchLoggingOptionId);
    }

    /**
     * The ARN of the CloudWatch log stream to receive application messages.
     * 
     */
    @Import(name="logStreamArn", required=true)
    private Output<String> logStreamArn;

    public Output<String> logStreamArn() {
        return this.logStreamArn;
    }

    private ApplicationCloudwatchLoggingOptionsGetArgs() {}

    private ApplicationCloudwatchLoggingOptionsGetArgs(ApplicationCloudwatchLoggingOptionsGetArgs $) {
        this.cloudwatchLoggingOptionId = $.cloudwatchLoggingOptionId;
        this.logStreamArn = $.logStreamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationCloudwatchLoggingOptionsGetArgs $;

        public Builder() {
            $ = new ApplicationCloudwatchLoggingOptionsGetArgs();
        }

        public Builder(ApplicationCloudwatchLoggingOptionsGetArgs defaults) {
            $ = new ApplicationCloudwatchLoggingOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudwatchLoggingOptionId(@Nullable Output<String> cloudwatchLoggingOptionId) {
            $.cloudwatchLoggingOptionId = cloudwatchLoggingOptionId;
            return this;
        }

        public Builder cloudwatchLoggingOptionId(String cloudwatchLoggingOptionId) {
            return cloudwatchLoggingOptionId(Output.of(cloudwatchLoggingOptionId));
        }

        public Builder logStreamArn(Output<String> logStreamArn) {
            $.logStreamArn = logStreamArn;
            return this;
        }

        public Builder logStreamArn(String logStreamArn) {
            return logStreamArn(Output.of(logStreamArn));
        }

        public ApplicationCloudwatchLoggingOptionsGetArgs build() {
            $.logStreamArn = Objects.requireNonNull($.logStreamArn, "expected parameter 'logStreamArn' to be non-null");
            return $;
        }
    }

}
