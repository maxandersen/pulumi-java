// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs();

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig;

    public Optional<Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    /**
     * The Amazon S3 location to upload inference responses to.
     * 
     */
    @Import(name="s3OutputPath", required=true)
    private Output<String> s3OutputPath;

    public Output<String> s3OutputPath() {
        return this.s3OutputPath;
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigArgs() {}

    private EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.notificationConfig = $.notificationConfig;
        this.s3OutputPath = $.s3OutputPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationAsyncInferenceConfigOutputConfigArgs $;

        public Builder() {
            $ = new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs();
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
            $ = new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder notificationConfig(@Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        public Builder s3OutputPath(Output<String> s3OutputPath) {
            $.s3OutputPath = s3OutputPath;
            return this;
        }

        public Builder s3OutputPath(String s3OutputPath) {
            return s3OutputPath(Output.of(s3OutputPath));
        }

        public EndpointConfigurationAsyncInferenceConfigOutputConfigArgs build() {
            $.s3OutputPath = Objects.requireNonNull($.s3OutputPath, "expected parameter 's3OutputPath' to be non-null");
            return $;
        }
    }

}
