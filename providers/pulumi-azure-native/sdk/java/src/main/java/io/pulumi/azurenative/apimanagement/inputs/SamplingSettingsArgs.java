// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.SamplingType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sampling settings for Diagnostic.
 * 
 */
public final class SamplingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SamplingSettingsArgs Empty = new SamplingSettingsArgs();

    /**
     * Rate of sampling for fixed-rate sampling.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage == null ? Codegen.empty() : this.percentage;
    }

    /**
     * Sampling type.
     * 
     */
    @Import(name="samplingType")
      private final @Nullable Output<Either<String,SamplingType>> samplingType;

    public Output<Either<String,SamplingType>> samplingType() {
        return this.samplingType == null ? Codegen.empty() : this.samplingType;
    }

    public SamplingSettingsArgs(
        @Nullable Output<Double> percentage,
        @Nullable Output<Either<String,SamplingType>> samplingType) {
        this.percentage = percentage;
        this.samplingType = samplingType;
    }

    private SamplingSettingsArgs() {
        this.percentage = Codegen.empty();
        this.samplingType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> percentage;
        private @Nullable Output<Either<String,SamplingType>> samplingType;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
    	      this.samplingType = defaults.samplingType;
        }

        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Codegen.ofNullable(percentage);
            return this;
        }
        public Builder samplingType(@Nullable Output<Either<String,SamplingType>> samplingType) {
            this.samplingType = samplingType;
            return this;
        }
        public Builder samplingType(@Nullable Either<String,SamplingType> samplingType) {
            this.samplingType = Codegen.ofNullable(samplingType);
            return this;
        }        public SamplingSettingsArgs build() {
            return new SamplingSettingsArgs(percentage, samplingType);
        }
    }
}
