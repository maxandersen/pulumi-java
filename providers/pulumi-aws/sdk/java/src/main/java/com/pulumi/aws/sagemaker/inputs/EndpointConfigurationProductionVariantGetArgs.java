// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationProductionVariantGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationProductionVariantGetArgs Empty = new EndpointConfigurationProductionVariantGetArgs();

    /**
     * The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    /**
     * Initial number of instances used for auto-scaling.
     * 
     */
    @Import(name="initialInstanceCount", required=true)
    private Output<Integer> initialInstanceCount;

    public Output<Integer> initialInstanceCount() {
        return this.initialInstanceCount;
    }

    /**
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to 1.0.
     * 
     */
    @Import(name="initialVariantWeight")
    private @Nullable Output<Double> initialVariantWeight;

    public Optional<Output<Double>> initialVariantWeight() {
        return Optional.ofNullable(this.initialVariantWeight);
    }

    /**
     * The type of instance to start.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * The name of the model to use.
     * 
     */
    @Import(name="modelName", required=true)
    private Output<String> modelName;

    public Output<String> modelName() {
        return this.modelName;
    }

    /**
     * The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="variantName")
    private @Nullable Output<String> variantName;

    public Optional<Output<String>> variantName() {
        return Optional.ofNullable(this.variantName);
    }

    private EndpointConfigurationProductionVariantGetArgs() {}

    private EndpointConfigurationProductionVariantGetArgs(EndpointConfigurationProductionVariantGetArgs $) {
        this.acceleratorType = $.acceleratorType;
        this.initialInstanceCount = $.initialInstanceCount;
        this.initialVariantWeight = $.initialVariantWeight;
        this.instanceType = $.instanceType;
        this.modelName = $.modelName;
        this.variantName = $.variantName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationProductionVariantGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationProductionVariantGetArgs $;

        public Builder() {
            $ = new EndpointConfigurationProductionVariantGetArgs();
        }

        public Builder(EndpointConfigurationProductionVariantGetArgs defaults) {
            $ = new EndpointConfigurationProductionVariantGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public Builder initialInstanceCount(Output<Integer> initialInstanceCount) {
            $.initialInstanceCount = initialInstanceCount;
            return this;
        }

        public Builder initialInstanceCount(Integer initialInstanceCount) {
            return initialInstanceCount(Output.of(initialInstanceCount));
        }

        public Builder initialVariantWeight(@Nullable Output<Double> initialVariantWeight) {
            $.initialVariantWeight = initialVariantWeight;
            return this;
        }

        public Builder initialVariantWeight(Double initialVariantWeight) {
            return initialVariantWeight(Output.of(initialVariantWeight));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder modelName(Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        public Builder variantName(@Nullable Output<String> variantName) {
            $.variantName = variantName;
            return this;
        }

        public Builder variantName(String variantName) {
            return variantName(Output.of(variantName));
        }

        public EndpointConfigurationProductionVariantGetArgs build() {
            $.initialInstanceCount = Objects.requireNonNull($.initialInstanceCount, "expected parameter 'initialInstanceCount' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            $.modelName = Objects.requireNonNull($.modelName, "expected parameter 'modelName' to be non-null");
            return $;
        }
    }

}
