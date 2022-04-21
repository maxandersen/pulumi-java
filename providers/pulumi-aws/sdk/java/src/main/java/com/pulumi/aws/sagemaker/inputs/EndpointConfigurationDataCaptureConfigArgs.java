// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs;
import com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationDataCaptureConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationDataCaptureConfigArgs Empty = new EndpointConfigurationDataCaptureConfigArgs();

    /**
     * The content type headers to capture. Fields are documented below.
     * 
     */
    @Import(name="captureContentTypeHeader")
    private @Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs> captureContentTypeHeader;

    public Optional<Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs>> captureContentTypeHeader() {
        return Optional.ofNullable(this.captureContentTypeHeader);
    }

    /**
     * Specifies what data to capture. Fields are documented below.
     * 
     */
    @Import(name="captureOptions", required=true)
    private Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionArgs>> captureOptions;

    public Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionArgs>> captureOptions() {
        return this.captureOptions;
    }

    /**
     * The URL for S3 location where the captured data is stored.
     * 
     */
    @Import(name="destinationS3Uri", required=true)
    private Output<String> destinationS3Uri;

    public Output<String> destinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * Flag to enable data capture. Defaults to `false`.
     * 
     */
    @Import(name="enableCapture")
    private @Nullable Output<Boolean> enableCapture;

    public Optional<Output<Boolean>> enableCapture() {
        return Optional.ofNullable(this.enableCapture);
    }

    /**
     * Portion of data to capture. Should be between 0 and 100.
     * 
     */
    @Import(name="initialSamplingPercentage", required=true)
    private Output<Integer> initialSamplingPercentage;

    public Output<Integer> initialSamplingPercentage() {
        return this.initialSamplingPercentage;
    }

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    private EndpointConfigurationDataCaptureConfigArgs() {}

    private EndpointConfigurationDataCaptureConfigArgs(EndpointConfigurationDataCaptureConfigArgs $) {
        this.captureContentTypeHeader = $.captureContentTypeHeader;
        this.captureOptions = $.captureOptions;
        this.destinationS3Uri = $.destinationS3Uri;
        this.enableCapture = $.enableCapture;
        this.initialSamplingPercentage = $.initialSamplingPercentage;
        this.kmsKeyId = $.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationDataCaptureConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationDataCaptureConfigArgs $;

        public Builder() {
            $ = new EndpointConfigurationDataCaptureConfigArgs();
        }

        public Builder(EndpointConfigurationDataCaptureConfigArgs defaults) {
            $ = new EndpointConfigurationDataCaptureConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder captureContentTypeHeader(@Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs> captureContentTypeHeader) {
            $.captureContentTypeHeader = captureContentTypeHeader;
            return this;
        }

        public Builder captureContentTypeHeader(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs captureContentTypeHeader) {
            return captureContentTypeHeader(Output.of(captureContentTypeHeader));
        }

        public Builder captureOptions(Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionArgs>> captureOptions) {
            $.captureOptions = captureOptions;
            return this;
        }

        public Builder captureOptions(List<EndpointConfigurationDataCaptureConfigCaptureOptionArgs> captureOptions) {
            return captureOptions(Output.of(captureOptions));
        }

        public Builder captureOptions(EndpointConfigurationDataCaptureConfigCaptureOptionArgs... captureOptions) {
            return captureOptions(List.of(captureOptions));
        }

        public Builder destinationS3Uri(Output<String> destinationS3Uri) {
            $.destinationS3Uri = destinationS3Uri;
            return this;
        }

        public Builder destinationS3Uri(String destinationS3Uri) {
            return destinationS3Uri(Output.of(destinationS3Uri));
        }

        public Builder enableCapture(@Nullable Output<Boolean> enableCapture) {
            $.enableCapture = enableCapture;
            return this;
        }

        public Builder enableCapture(Boolean enableCapture) {
            return enableCapture(Output.of(enableCapture));
        }

        public Builder initialSamplingPercentage(Output<Integer> initialSamplingPercentage) {
            $.initialSamplingPercentage = initialSamplingPercentage;
            return this;
        }

        public Builder initialSamplingPercentage(Integer initialSamplingPercentage) {
            return initialSamplingPercentage(Output.of(initialSamplingPercentage));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public EndpointConfigurationDataCaptureConfigArgs build() {
            $.captureOptions = Objects.requireNonNull($.captureOptions, "expected parameter 'captureOptions' to be non-null");
            $.destinationS3Uri = Objects.requireNonNull($.destinationS3Uri, "expected parameter 'destinationS3Uri' to be non-null");
            $.initialSamplingPercentage = Objects.requireNonNull($.initialSamplingPercentage, "expected parameter 'initialSamplingPercentage' to be non-null");
            return $;
        }
    }

}
