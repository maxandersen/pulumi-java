// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs();

    /**
     * Describes the Lambda function that is used to preprocess the records in the stream before being processed by your application code.
     * 
     */
    @Import(name="inputLambdaProcessor", required=true)
    private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs> inputLambdaProcessor;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs> inputLambdaProcessor() {
        return this.inputLambdaProcessor;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs $) {
        this.inputLambdaProcessor = $.inputLambdaProcessor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder inputLambdaProcessor(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs> inputLambdaProcessor) {
            $.inputLambdaProcessor = inputLambdaProcessor;
            return this;
        }

        public Builder inputLambdaProcessor(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs inputLambdaProcessor) {
            return inputLambdaProcessor(Output.of(inputLambdaProcessor));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs build() {
            $.inputLambdaProcessor = Objects.requireNonNull($.inputLambdaProcessor, "expected parameter 'inputLambdaProcessor' to be non-null");
            return $;
        }
    }

}
