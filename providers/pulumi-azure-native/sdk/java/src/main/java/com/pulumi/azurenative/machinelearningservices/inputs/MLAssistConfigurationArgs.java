// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ComputeBindingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration for machine learning assisted features in a labeling job.
 * 
 */
public final class MLAssistConfigurationArgs extends ResourceArgs {

    public static final MLAssistConfigurationArgs Empty = new MLAssistConfigurationArgs();

    /**
     * The compute designated for inferencing.
     * 
     */
    @Import(name="inferencingComputeBinding", required=true)
    private Output<ComputeBindingArgs> inferencingComputeBinding;

    /**
     * @return The compute designated for inferencing.
     * 
     */
    public Output<ComputeBindingArgs> inferencingComputeBinding() {
        return this.inferencingComputeBinding;
    }

    /**
     * Indicates whether MLAssist feature is enabled.
     * 
     */
    @Import(name="mlAssistEnabled")
    private @Nullable Output<Boolean> mlAssistEnabled;

    /**
     * @return Indicates whether MLAssist feature is enabled.
     * 
     */
    public Optional<Output<Boolean>> mlAssistEnabled() {
        return Optional.ofNullable(this.mlAssistEnabled);
    }

    /**
     * Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
     * 
     */
    @Import(name="modelNamePrefix", required=true)
    private Output<String> modelNamePrefix;

    /**
     * @return Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
     * 
     */
    public Output<String> modelNamePrefix() {
        return this.modelNamePrefix;
    }

    /**
     * Prelabel accuracy threshold used in MLAssist feature.
     * 
     */
    @Import(name="prelabelAccuracyThreshold")
    private @Nullable Output<Double> prelabelAccuracyThreshold;

    /**
     * @return Prelabel accuracy threshold used in MLAssist feature.
     * 
     */
    public Optional<Output<Double>> prelabelAccuracyThreshold() {
        return Optional.ofNullable(this.prelabelAccuracyThreshold);
    }

    /**
     * The compute designated for training.
     * 
     */
    @Import(name="trainingComputeBinding", required=true)
    private Output<ComputeBindingArgs> trainingComputeBinding;

    /**
     * @return The compute designated for training.
     * 
     */
    public Output<ComputeBindingArgs> trainingComputeBinding() {
        return this.trainingComputeBinding;
    }

    private MLAssistConfigurationArgs() {}

    private MLAssistConfigurationArgs(MLAssistConfigurationArgs $) {
        this.inferencingComputeBinding = $.inferencingComputeBinding;
        this.mlAssistEnabled = $.mlAssistEnabled;
        this.modelNamePrefix = $.modelNamePrefix;
        this.prelabelAccuracyThreshold = $.prelabelAccuracyThreshold;
        this.trainingComputeBinding = $.trainingComputeBinding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MLAssistConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MLAssistConfigurationArgs $;

        public Builder() {
            $ = new MLAssistConfigurationArgs();
        }

        public Builder(MLAssistConfigurationArgs defaults) {
            $ = new MLAssistConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inferencingComputeBinding The compute designated for inferencing.
         * 
         * @return builder
         * 
         */
        public Builder inferencingComputeBinding(Output<ComputeBindingArgs> inferencingComputeBinding) {
            $.inferencingComputeBinding = inferencingComputeBinding;
            return this;
        }

        /**
         * @param inferencingComputeBinding The compute designated for inferencing.
         * 
         * @return builder
         * 
         */
        public Builder inferencingComputeBinding(ComputeBindingArgs inferencingComputeBinding) {
            return inferencingComputeBinding(Output.of(inferencingComputeBinding));
        }

        /**
         * @param mlAssistEnabled Indicates whether MLAssist feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder mlAssistEnabled(@Nullable Output<Boolean> mlAssistEnabled) {
            $.mlAssistEnabled = mlAssistEnabled;
            return this;
        }

        /**
         * @param mlAssistEnabled Indicates whether MLAssist feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder mlAssistEnabled(Boolean mlAssistEnabled) {
            return mlAssistEnabled(Output.of(mlAssistEnabled));
        }

        /**
         * @param modelNamePrefix Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
         * 
         * @return builder
         * 
         */
        public Builder modelNamePrefix(Output<String> modelNamePrefix) {
            $.modelNamePrefix = modelNamePrefix;
            return this;
        }

        /**
         * @param modelNamePrefix Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
         * 
         * @return builder
         * 
         */
        public Builder modelNamePrefix(String modelNamePrefix) {
            return modelNamePrefix(Output.of(modelNamePrefix));
        }

        /**
         * @param prelabelAccuracyThreshold Prelabel accuracy threshold used in MLAssist feature.
         * 
         * @return builder
         * 
         */
        public Builder prelabelAccuracyThreshold(@Nullable Output<Double> prelabelAccuracyThreshold) {
            $.prelabelAccuracyThreshold = prelabelAccuracyThreshold;
            return this;
        }

        /**
         * @param prelabelAccuracyThreshold Prelabel accuracy threshold used in MLAssist feature.
         * 
         * @return builder
         * 
         */
        public Builder prelabelAccuracyThreshold(Double prelabelAccuracyThreshold) {
            return prelabelAccuracyThreshold(Output.of(prelabelAccuracyThreshold));
        }

        /**
         * @param trainingComputeBinding The compute designated for training.
         * 
         * @return builder
         * 
         */
        public Builder trainingComputeBinding(Output<ComputeBindingArgs> trainingComputeBinding) {
            $.trainingComputeBinding = trainingComputeBinding;
            return this;
        }

        /**
         * @param trainingComputeBinding The compute designated for training.
         * 
         * @return builder
         * 
         */
        public Builder trainingComputeBinding(ComputeBindingArgs trainingComputeBinding) {
            return trainingComputeBinding(Output.of(trainingComputeBinding));
        }

        public MLAssistConfigurationArgs build() {
            $.inferencingComputeBinding = Objects.requireNonNull($.inferencingComputeBinding, "expected parameter 'inferencingComputeBinding' to be non-null");
            $.modelNamePrefix = Objects.requireNonNull($.modelNamePrefix, "expected parameter 'modelNamePrefix' to be non-null");
            $.trainingComputeBinding = Objects.requireNonNull($.trainingComputeBinding, "expected parameter 'trainingComputeBinding' to be non-null");
            return $;
        }
    }

}
