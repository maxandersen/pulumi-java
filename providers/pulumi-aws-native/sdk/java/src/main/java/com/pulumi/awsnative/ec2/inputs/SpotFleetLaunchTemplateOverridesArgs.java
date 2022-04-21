// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.SpotFleetInstanceRequirementsRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetLaunchTemplateOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetLaunchTemplateOverridesArgs Empty = new SpotFleetLaunchTemplateOverridesArgs();

    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="instanceRequirements")
    private @Nullable Output<SpotFleetInstanceRequirementsRequestArgs> instanceRequirements;

    public Optional<Output<SpotFleetInstanceRequirementsRequestArgs>> instanceRequirements() {
        return Optional.ofNullable(this.instanceRequirements);
    }

    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    @Import(name="spotPrice")
    private @Nullable Output<String> spotPrice;

    public Optional<Output<String>> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }

    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    @Import(name="weightedCapacity")
    private @Nullable Output<Double> weightedCapacity;

    public Optional<Output<Double>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private SpotFleetLaunchTemplateOverridesArgs() {}

    private SpotFleetLaunchTemplateOverridesArgs(SpotFleetLaunchTemplateOverridesArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.instanceRequirements = $.instanceRequirements;
        this.instanceType = $.instanceType;
        this.spotPrice = $.spotPrice;
        this.subnetId = $.subnetId;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetLaunchTemplateOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetLaunchTemplateOverridesArgs $;

        public Builder() {
            $ = new SpotFleetLaunchTemplateOverridesArgs();
        }

        public Builder(SpotFleetLaunchTemplateOverridesArgs defaults) {
            $ = new SpotFleetLaunchTemplateOverridesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        public Builder instanceRequirements(@Nullable Output<SpotFleetInstanceRequirementsRequestArgs> instanceRequirements) {
            $.instanceRequirements = instanceRequirements;
            return this;
        }

        public Builder instanceRequirements(SpotFleetInstanceRequirementsRequestArgs instanceRequirements) {
            return instanceRequirements(Output.of(instanceRequirements));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            $.spotPrice = spotPrice;
            return this;
        }

        public Builder spotPrice(String spotPrice) {
            return spotPrice(Output.of(spotPrice));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder weightedCapacity(@Nullable Output<Double> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(Double weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public SpotFleetLaunchTemplateOverridesArgs build() {
            return $;
        }
    }

}
