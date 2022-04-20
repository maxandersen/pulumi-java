// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs Empty = new LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs();

    /**
     * The required duration in minutes. This value must be a multiple of 60.
     * 
     */
    @Import(name="blockDurationMinutes")
      private final @Nullable Output<Integer> blockDurationMinutes;

    public Output<Integer> blockDurationMinutes() {
        return this.blockDurationMinutes == null ? Codegen.empty() : this.blockDurationMinutes;
    }

    /**
     * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
     * `stop`, or `terminate`. (Default: `terminate`).
     * 
     */
    @Import(name="instanceInterruptionBehavior")
      private final @Nullable Output<String> instanceInterruptionBehavior;

    public Output<String> instanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Codegen.empty() : this.instanceInterruptionBehavior;
    }

    /**
     * The maximum hourly price you&#39;re willing to pay for the Spot Instances.
     * 
     */
    @Import(name="maxPrice")
      private final @Nullable Output<String> maxPrice;

    public Output<String> maxPrice() {
        return this.maxPrice == null ? Codegen.empty() : this.maxPrice;
    }

    /**
     * The Spot Instance request type. Can be `one-time`, or `persistent`.
     * 
     */
    @Import(name="spotInstanceType")
      private final @Nullable Output<String> spotInstanceType;

    public Output<String> spotInstanceType() {
        return this.spotInstanceType == null ? Codegen.empty() : this.spotInstanceType;
    }

    /**
     * The end date of the request.
     * 
     */
    @Import(name="validUntil")
      private final @Nullable Output<String> validUntil;

    public Output<String> validUntil() {
        return this.validUntil == null ? Codegen.empty() : this.validUntil;
    }

    public LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs(
        @Nullable Output<Integer> blockDurationMinutes,
        @Nullable Output<String> instanceInterruptionBehavior,
        @Nullable Output<String> maxPrice,
        @Nullable Output<String> spotInstanceType,
        @Nullable Output<String> validUntil) {
        this.blockDurationMinutes = blockDurationMinutes;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.maxPrice = maxPrice;
        this.spotInstanceType = spotInstanceType;
        this.validUntil = validUntil;
    }

    private LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs() {
        this.blockDurationMinutes = Codegen.empty();
        this.instanceInterruptionBehavior = Codegen.empty();
        this.maxPrice = Codegen.empty();
        this.spotInstanceType = Codegen.empty();
        this.validUntil = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> blockDurationMinutes;
        private @Nullable Output<String> instanceInterruptionBehavior;
        private @Nullable Output<String> maxPrice;
        private @Nullable Output<String> spotInstanceType;
        private @Nullable Output<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.maxPrice = defaults.maxPrice;
    	      this.spotInstanceType = defaults.spotInstanceType;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder blockDurationMinutes(@Nullable Output<Integer> blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        public Builder blockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = Codegen.ofNullable(blockDurationMinutes);
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable Output<String> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Codegen.ofNullable(instanceInterruptionBehavior);
            return this;
        }
        public Builder maxPrice(@Nullable Output<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = Codegen.ofNullable(maxPrice);
            return this;
        }
        public Builder spotInstanceType(@Nullable Output<String> spotInstanceType) {
            this.spotInstanceType = spotInstanceType;
            return this;
        }
        public Builder spotInstanceType(@Nullable String spotInstanceType) {
            this.spotInstanceType = Codegen.ofNullable(spotInstanceType);
            return this;
        }
        public Builder validUntil(@Nullable Output<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Codegen.ofNullable(validUntil);
            return this;
        }        public LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs build() {
            return new LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs(blockDurationMinutes, instanceInterruptionBehavior, maxPrice, spotInstanceType, validUntil);
        }
    }
}
