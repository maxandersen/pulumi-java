// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyStepAdjustmentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyStepAdjustmentGetArgs Empty = new PolicyStepAdjustmentGetArgs();

    /**
     * The lower bound for the
     * difference between the alarm threshold and the CloudWatch metric.
     * Without a value, AWS will treat this bound as infinity.
     * 
     */
    @Import(name="metricIntervalLowerBound")
    private @Nullable Output<String> metricIntervalLowerBound;

    public Optional<Output<String>> metricIntervalLowerBound() {
        return Optional.ofNullable(this.metricIntervalLowerBound);
    }

    /**
     * The upper bound for the
     * difference between the alarm threshold and the CloudWatch metric.
     * Without a value, AWS will treat this bound as infinity. The upper bound
     * must be greater than the lower bound.
     * 
     */
    @Import(name="metricIntervalUpperBound")
    private @Nullable Output<String> metricIntervalUpperBound;

    public Optional<Output<String>> metricIntervalUpperBound() {
        return Optional.ofNullable(this.metricIntervalUpperBound);
    }

    /**
     * The number of members by which to
     * scale, when the adjustment bounds are breached. A positive value scales
     * up. A negative value scales down.
     * 
     */
    @Import(name="scalingAdjustment", required=true)
    private Output<Integer> scalingAdjustment;

    public Output<Integer> scalingAdjustment() {
        return this.scalingAdjustment;
    }

    private PolicyStepAdjustmentGetArgs() {}

    private PolicyStepAdjustmentGetArgs(PolicyStepAdjustmentGetArgs $) {
        this.metricIntervalLowerBound = $.metricIntervalLowerBound;
        this.metricIntervalUpperBound = $.metricIntervalUpperBound;
        this.scalingAdjustment = $.scalingAdjustment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyStepAdjustmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyStepAdjustmentGetArgs $;

        public Builder() {
            $ = new PolicyStepAdjustmentGetArgs();
        }

        public Builder(PolicyStepAdjustmentGetArgs defaults) {
            $ = new PolicyStepAdjustmentGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricIntervalLowerBound(@Nullable Output<String> metricIntervalLowerBound) {
            $.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }

        public Builder metricIntervalLowerBound(String metricIntervalLowerBound) {
            return metricIntervalLowerBound(Output.of(metricIntervalLowerBound));
        }

        public Builder metricIntervalUpperBound(@Nullable Output<String> metricIntervalUpperBound) {
            $.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }

        public Builder metricIntervalUpperBound(String metricIntervalUpperBound) {
            return metricIntervalUpperBound(Output.of(metricIntervalUpperBound));
        }

        public Builder scalingAdjustment(Output<Integer> scalingAdjustment) {
            $.scalingAdjustment = scalingAdjustment;
            return this;
        }

        public Builder scalingAdjustment(Integer scalingAdjustment) {
            return scalingAdjustment(Output.of(scalingAdjustment));
        }

        public PolicyStepAdjustmentGetArgs build() {
            $.scalingAdjustment = Objects.requireNonNull($.scalingAdjustment, "expected parameter 'scalingAdjustment' to be non-null");
            return $;
        }
    }

}
