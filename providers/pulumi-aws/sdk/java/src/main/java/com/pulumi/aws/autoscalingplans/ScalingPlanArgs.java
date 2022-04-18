// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans;

import com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs;
import com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanArgs Empty = new ScalingPlanArgs();

    /**
     * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * 
     */
    @Import(name="applicationSource", required=true)
      private final Output<ScalingPlanApplicationSourceArgs> applicationSource;

    public Output<ScalingPlanApplicationSourceArgs> applicationSource() {
        return this.applicationSource;
    }

    /**
     * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * 
     */
    @Import(name="scalingInstructions", required=true)
      private final Output<List<ScalingPlanScalingInstructionArgs>> scalingInstructions;

    public Output<List<ScalingPlanScalingInstructionArgs>> scalingInstructions() {
        return this.scalingInstructions;
    }

    public ScalingPlanArgs(
        Output<ScalingPlanApplicationSourceArgs> applicationSource,
        @Nullable Output<String> name,
        Output<List<ScalingPlanScalingInstructionArgs>> scalingInstructions) {
        this.applicationSource = Objects.requireNonNull(applicationSource, "expected parameter 'applicationSource' to be non-null");
        this.name = name;
        this.scalingInstructions = Objects.requireNonNull(scalingInstructions, "expected parameter 'scalingInstructions' to be non-null");
    }

    private ScalingPlanArgs() {
        this.applicationSource = Codegen.empty();
        this.name = Codegen.empty();
        this.scalingInstructions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ScalingPlanApplicationSourceArgs> applicationSource;
        private @Nullable Output<String> name;
        private Output<List<ScalingPlanScalingInstructionArgs>> scalingInstructions;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSource = defaults.applicationSource;
    	      this.name = defaults.name;
    	      this.scalingInstructions = defaults.scalingInstructions;
        }

        public Builder applicationSource(Output<ScalingPlanApplicationSourceArgs> applicationSource) {
            this.applicationSource = Objects.requireNonNull(applicationSource);
            return this;
        }
        public Builder applicationSource(ScalingPlanApplicationSourceArgs applicationSource) {
            this.applicationSource = Output.of(Objects.requireNonNull(applicationSource));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder scalingInstructions(Output<List<ScalingPlanScalingInstructionArgs>> scalingInstructions) {
            this.scalingInstructions = Objects.requireNonNull(scalingInstructions);
            return this;
        }
        public Builder scalingInstructions(List<ScalingPlanScalingInstructionArgs> scalingInstructions) {
            this.scalingInstructions = Output.of(Objects.requireNonNull(scalingInstructions));
            return this;
        }
        public Builder scalingInstructions(ScalingPlanScalingInstructionArgs... scalingInstructions) {
            return scalingInstructions(List.of(scalingInstructions));
        }        public ScalingPlanArgs build() {
            return new ScalingPlanArgs(applicationSource, name, scalingInstructions);
        }
    }
}
