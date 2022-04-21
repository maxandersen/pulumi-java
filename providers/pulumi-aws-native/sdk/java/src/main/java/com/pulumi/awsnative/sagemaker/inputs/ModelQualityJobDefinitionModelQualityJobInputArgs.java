// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionEndpointInputArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionModelQualityJobInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionModelQualityJobInputArgs Empty = new ModelQualityJobDefinitionModelQualityJobInputArgs();

    @Import(name="endpointInput", required=true)
    private Output<ModelQualityJobDefinitionEndpointInputArgs> endpointInput;

    public Output<ModelQualityJobDefinitionEndpointInputArgs> endpointInput() {
        return this.endpointInput;
    }

    @Import(name="groundTruthS3Input", required=true)
    private Output<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

    public Output<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    private ModelQualityJobDefinitionModelQualityJobInputArgs() {}

    private ModelQualityJobDefinitionModelQualityJobInputArgs(ModelQualityJobDefinitionModelQualityJobInputArgs $) {
        this.endpointInput = $.endpointInput;
        this.groundTruthS3Input = $.groundTruthS3Input;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionModelQualityJobInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionModelQualityJobInputArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionModelQualityJobInputArgs();
        }

        public Builder(ModelQualityJobDefinitionModelQualityJobInputArgs defaults) {
            $ = new ModelQualityJobDefinitionModelQualityJobInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointInput(Output<ModelQualityJobDefinitionEndpointInputArgs> endpointInput) {
            $.endpointInput = endpointInput;
            return this;
        }

        public Builder endpointInput(ModelQualityJobDefinitionEndpointInputArgs endpointInput) {
            return endpointInput(Output.of(endpointInput));
        }

        public Builder groundTruthS3Input(Output<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
            $.groundTruthS3Input = groundTruthS3Input;
            return this;
        }

        public Builder groundTruthS3Input(ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs groundTruthS3Input) {
            return groundTruthS3Input(Output.of(groundTruthS3Input));
        }

        public ModelQualityJobDefinitionModelQualityJobInputArgs build() {
            $.endpointInput = Objects.requireNonNull($.endpointInput, "expected parameter 'endpointInput' to be non-null");
            $.groundTruthS3Input = Objects.requireNonNull($.groundTruthS3Input, "expected parameter 'groundTruthS3Input' to be non-null");
            return $;
        }
    }

}
