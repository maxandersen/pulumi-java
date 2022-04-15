// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataproc_v1.inputs.BasicYarnAutoscalingConfigArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkStandaloneAutoscalingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Basic algorithm for autoscaling.
 * 
 */
public final class BasicAutoscalingAlgorithmArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicAutoscalingAlgorithmArgs Empty = new BasicAutoscalingAlgorithmArgs();

    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    @Import(name="cooldownPeriod")
      private final @Nullable Output<String> cooldownPeriod;

    public Output<String> cooldownPeriod() {
        return this.cooldownPeriod == null ? Codegen.empty() : this.cooldownPeriod;
    }

    /**
     * Optional. Spark Standalone autoscaling configuration
     * 
     */
    @Import(name="sparkStandaloneConfig")
      private final @Nullable Output<SparkStandaloneAutoscalingConfigArgs> sparkStandaloneConfig;

    public Output<SparkStandaloneAutoscalingConfigArgs> sparkStandaloneConfig() {
        return this.sparkStandaloneConfig == null ? Codegen.empty() : this.sparkStandaloneConfig;
    }

    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    @Import(name="yarnConfig")
      private final @Nullable Output<BasicYarnAutoscalingConfigArgs> yarnConfig;

    public Output<BasicYarnAutoscalingConfigArgs> yarnConfig() {
        return this.yarnConfig == null ? Codegen.empty() : this.yarnConfig;
    }

    public BasicAutoscalingAlgorithmArgs(
        @Nullable Output<String> cooldownPeriod,
        @Nullable Output<SparkStandaloneAutoscalingConfigArgs> sparkStandaloneConfig,
        @Nullable Output<BasicYarnAutoscalingConfigArgs> yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.sparkStandaloneConfig = sparkStandaloneConfig;
        this.yarnConfig = yarnConfig;
    }

    private BasicAutoscalingAlgorithmArgs() {
        this.cooldownPeriod = Codegen.empty();
        this.sparkStandaloneConfig = Codegen.empty();
        this.yarnConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAutoscalingAlgorithmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cooldownPeriod;
        private @Nullable Output<SparkStandaloneAutoscalingConfigArgs> sparkStandaloneConfig;
        private @Nullable Output<BasicYarnAutoscalingConfigArgs> yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAutoscalingAlgorithmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.sparkStandaloneConfig = defaults.sparkStandaloneConfig;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(@Nullable Output<String> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }
        public Builder cooldownPeriod(@Nullable String cooldownPeriod) {
            this.cooldownPeriod = Codegen.ofNullable(cooldownPeriod);
            return this;
        }
        public Builder sparkStandaloneConfig(@Nullable Output<SparkStandaloneAutoscalingConfigArgs> sparkStandaloneConfig) {
            this.sparkStandaloneConfig = sparkStandaloneConfig;
            return this;
        }
        public Builder sparkStandaloneConfig(@Nullable SparkStandaloneAutoscalingConfigArgs sparkStandaloneConfig) {
            this.sparkStandaloneConfig = Codegen.ofNullable(sparkStandaloneConfig);
            return this;
        }
        public Builder yarnConfig(@Nullable Output<BasicYarnAutoscalingConfigArgs> yarnConfig) {
            this.yarnConfig = yarnConfig;
            return this;
        }
        public Builder yarnConfig(@Nullable BasicYarnAutoscalingConfigArgs yarnConfig) {
            this.yarnConfig = Codegen.ofNullable(yarnConfig);
            return this;
        }        public BasicAutoscalingAlgorithmArgs build() {
            return new BasicAutoscalingAlgorithmArgs(cooldownPeriod, sparkStandaloneConfig, yarnConfig);
        }
    }
}
