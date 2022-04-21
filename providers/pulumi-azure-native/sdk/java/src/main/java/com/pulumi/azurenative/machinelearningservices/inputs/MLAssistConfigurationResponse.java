// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ComputeBindingResponse;
import com.pulumi.core.annotations.Import;
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
public final class MLAssistConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final MLAssistConfigurationResponse Empty = new MLAssistConfigurationResponse();

    /**
     * The compute designated for inferencing.
     * 
     */
    @Import(name="inferencingComputeBinding", required=true)
    private ComputeBindingResponse inferencingComputeBinding;

    public ComputeBindingResponse inferencingComputeBinding() {
        return this.inferencingComputeBinding;
    }

    /**
     * Indicates whether MLAssist feature is enabled.
     * 
     */
    @Import(name="mlAssistEnabled")
    private @Nullable Boolean mlAssistEnabled;

    public Optional<Boolean> mlAssistEnabled() {
        return Optional.ofNullable(this.mlAssistEnabled);
    }

    /**
     * Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
     * 
     */
    @Import(name="modelNamePrefix", required=true)
    private String modelNamePrefix;

    public String modelNamePrefix() {
        return this.modelNamePrefix;
    }

    /**
     * Prelabel accuracy threshold used in MLAssist feature.
     * 
     */
    @Import(name="prelabelAccuracyThreshold")
    private @Nullable Double prelabelAccuracyThreshold;

    public Optional<Double> prelabelAccuracyThreshold() {
        return Optional.ofNullable(this.prelabelAccuracyThreshold);
    }

    /**
     * The compute designated for training.
     * 
     */
    @Import(name="trainingComputeBinding", required=true)
    private ComputeBindingResponse trainingComputeBinding;

    public ComputeBindingResponse trainingComputeBinding() {
        return this.trainingComputeBinding;
    }

    private MLAssistConfigurationResponse() {}

    private MLAssistConfigurationResponse(MLAssistConfigurationResponse $) {
        this.inferencingComputeBinding = $.inferencingComputeBinding;
        this.mlAssistEnabled = $.mlAssistEnabled;
        this.modelNamePrefix = $.modelNamePrefix;
        this.prelabelAccuracyThreshold = $.prelabelAccuracyThreshold;
        this.trainingComputeBinding = $.trainingComputeBinding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MLAssistConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MLAssistConfigurationResponse $;

        public Builder() {
            $ = new MLAssistConfigurationResponse();
        }

        public Builder(MLAssistConfigurationResponse defaults) {
            $ = new MLAssistConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder inferencingComputeBinding(ComputeBindingResponse inferencingComputeBinding) {
            $.inferencingComputeBinding = inferencingComputeBinding;
            return this;
        }

        public Builder mlAssistEnabled(@Nullable Boolean mlAssistEnabled) {
            $.mlAssistEnabled = mlAssistEnabled;
            return this;
        }

        public Builder modelNamePrefix(String modelNamePrefix) {
            $.modelNamePrefix = modelNamePrefix;
            return this;
        }

        public Builder prelabelAccuracyThreshold(@Nullable Double prelabelAccuracyThreshold) {
            $.prelabelAccuracyThreshold = prelabelAccuracyThreshold;
            return this;
        }

        public Builder trainingComputeBinding(ComputeBindingResponse trainingComputeBinding) {
            $.trainingComputeBinding = trainingComputeBinding;
            return this;
        }

        public MLAssistConfigurationResponse build() {
            $.inferencingComputeBinding = Objects.requireNonNull($.inferencingComputeBinding, "expected parameter 'inferencingComputeBinding' to be non-null");
            $.modelNamePrefix = Objects.requireNonNull($.modelNamePrefix, "expected parameter 'modelNamePrefix' to be non-null");
            $.trainingComputeBinding = Objects.requireNonNull($.trainingComputeBinding, "expected parameter 'trainingComputeBinding' to be non-null");
            return $;
        }
    }

}
