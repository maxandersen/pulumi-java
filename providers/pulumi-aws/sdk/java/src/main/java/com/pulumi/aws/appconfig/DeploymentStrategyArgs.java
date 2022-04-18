// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentStrategyArgs Empty = new DeploymentStrategyArgs();

    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     * 
     */
    @Import(name="deploymentDurationInMinutes", required=true)
      private final Output<Integer> deploymentDurationInMinutes;

    public Output<Integer> deploymentDurationInMinutes() {
        return this.deploymentDurationInMinutes;
    }

    /**
     * A description of the deployment strategy. Can be at most 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     * 
     */
    @Import(name="finalBakeTimeInMinutes")
      private final @Nullable Output<Integer> finalBakeTimeInMinutes;

    public Output<Integer> finalBakeTimeInMinutes() {
        return this.finalBakeTimeInMinutes == null ? Codegen.empty() : this.finalBakeTimeInMinutes;
    }

    /**
     * The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     * 
     */
    @Import(name="growthFactor", required=true)
      private final Output<Double> growthFactor;

    public Output<Double> growthFactor() {
        return this.growthFactor;
    }

    /**
     * The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     * 
     */
    @Import(name="growthType")
      private final @Nullable Output<String> growthType;

    public Output<String> growthType() {
        return this.growthType == null ? Codegen.empty() : this.growthType;
    }

    /**
     * A name for the deployment strategy. Must be between 1 and 64 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     * 
     */
    @Import(name="replicateTo", required=true)
      private final Output<String> replicateTo;

    public Output<String> replicateTo() {
        return this.replicateTo;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DeploymentStrategyArgs(
        Output<Integer> deploymentDurationInMinutes,
        @Nullable Output<String> description,
        @Nullable Output<Integer> finalBakeTimeInMinutes,
        Output<Double> growthFactor,
        @Nullable Output<String> growthType,
        @Nullable Output<String> name,
        Output<String> replicateTo,
        @Nullable Output<Map<String,String>> tags) {
        this.deploymentDurationInMinutes = Objects.requireNonNull(deploymentDurationInMinutes, "expected parameter 'deploymentDurationInMinutes' to be non-null");
        this.description = description;
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        this.growthFactor = Objects.requireNonNull(growthFactor, "expected parameter 'growthFactor' to be non-null");
        this.growthType = growthType;
        this.name = name;
        this.replicateTo = Objects.requireNonNull(replicateTo, "expected parameter 'replicateTo' to be non-null");
        this.tags = tags;
    }

    private DeploymentStrategyArgs() {
        this.deploymentDurationInMinutes = Codegen.empty();
        this.description = Codegen.empty();
        this.finalBakeTimeInMinutes = Codegen.empty();
        this.growthFactor = Codegen.empty();
        this.growthType = Codegen.empty();
        this.name = Codegen.empty();
        this.replicateTo = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> deploymentDurationInMinutes;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> finalBakeTimeInMinutes;
        private Output<Double> growthFactor;
        private @Nullable Output<String> growthType;
        private @Nullable Output<String> name;
        private Output<String> replicateTo;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentDurationInMinutes = defaults.deploymentDurationInMinutes;
    	      this.description = defaults.description;
    	      this.finalBakeTimeInMinutes = defaults.finalBakeTimeInMinutes;
    	      this.growthFactor = defaults.growthFactor;
    	      this.growthType = defaults.growthType;
    	      this.name = defaults.name;
    	      this.replicateTo = defaults.replicateTo;
    	      this.tags = defaults.tags;
        }

        public Builder deploymentDurationInMinutes(Output<Integer> deploymentDurationInMinutes) {
            this.deploymentDurationInMinutes = Objects.requireNonNull(deploymentDurationInMinutes);
            return this;
        }
        public Builder deploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
            this.deploymentDurationInMinutes = Output.of(Objects.requireNonNull(deploymentDurationInMinutes));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder finalBakeTimeInMinutes(@Nullable Output<Integer> finalBakeTimeInMinutes) {
            this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
            return this;
        }
        public Builder finalBakeTimeInMinutes(@Nullable Integer finalBakeTimeInMinutes) {
            this.finalBakeTimeInMinutes = Codegen.ofNullable(finalBakeTimeInMinutes);
            return this;
        }
        public Builder growthFactor(Output<Double> growthFactor) {
            this.growthFactor = Objects.requireNonNull(growthFactor);
            return this;
        }
        public Builder growthFactor(Double growthFactor) {
            this.growthFactor = Output.of(Objects.requireNonNull(growthFactor));
            return this;
        }
        public Builder growthType(@Nullable Output<String> growthType) {
            this.growthType = growthType;
            return this;
        }
        public Builder growthType(@Nullable String growthType) {
            this.growthType = Codegen.ofNullable(growthType);
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
        public Builder replicateTo(Output<String> replicateTo) {
            this.replicateTo = Objects.requireNonNull(replicateTo);
            return this;
        }
        public Builder replicateTo(String replicateTo) {
            this.replicateTo = Output.of(Objects.requireNonNull(replicateTo));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DeploymentStrategyArgs build() {
            return new DeploymentStrategyArgs(deploymentDurationInMinutes, description, finalBakeTimeInMinutes, growthFactor, growthType, name, replicateTo, tags);
        }
    }
}
