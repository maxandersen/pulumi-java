// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.enums.SecurityProfileBehaviorCriteriaComparisonOperator;
import com.pulumi.awsnative.iot.inputs.SecurityProfileMachineLearningDetectionConfigArgs;
import com.pulumi.awsnative.iot.inputs.SecurityProfileMetricValueArgs;
import com.pulumi.awsnative.iot.inputs.SecurityProfileStatisticalThresholdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The criteria by which the behavior is determined to be normal.
 * 
 */
public final class SecurityProfileBehaviorCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProfileBehaviorCriteriaArgs Empty = new SecurityProfileBehaviorCriteriaArgs();

    /**
     * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
     * 
     */
    @Import(name="comparisonOperator")
    private @Nullable Output<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator;

    /**
     * @return The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
     * 
     */
    public Optional<Output<SecurityProfileBehaviorCriteriaComparisonOperator>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    /**
     * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
     * 
     */
    @Import(name="consecutiveDatapointsToAlarm")
    private @Nullable Output<Integer> consecutiveDatapointsToAlarm;

    /**
     * @return If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
     * 
     */
    public Optional<Output<Integer>> consecutiveDatapointsToAlarm() {
        return Optional.ofNullable(this.consecutiveDatapointsToAlarm);
    }

    /**
     * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * 
     */
    @Import(name="consecutiveDatapointsToClear")
    private @Nullable Output<Integer> consecutiveDatapointsToClear;

    /**
     * @return If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * 
     */
    public Optional<Output<Integer>> consecutiveDatapointsToClear() {
        return Optional.ofNullable(this.consecutiveDatapointsToClear);
    }

    /**
     * Use this to specify the time duration over which the behavior is evaluated.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Output<Integer> durationSeconds;

    /**
     * @return Use this to specify the time duration over which the behavior is evaluated.
     * 
     */
    public Optional<Output<Integer>> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    @Import(name="mlDetectionConfig")
    private @Nullable Output<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig;

    public Optional<Output<SecurityProfileMachineLearningDetectionConfigArgs>> mlDetectionConfig() {
        return Optional.ofNullable(this.mlDetectionConfig);
    }

    @Import(name="statisticalThreshold")
    private @Nullable Output<SecurityProfileStatisticalThresholdArgs> statisticalThreshold;

    public Optional<Output<SecurityProfileStatisticalThresholdArgs>> statisticalThreshold() {
        return Optional.ofNullable(this.statisticalThreshold);
    }

    @Import(name="value")
    private @Nullable Output<SecurityProfileMetricValueArgs> value;

    public Optional<Output<SecurityProfileMetricValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private SecurityProfileBehaviorCriteriaArgs() {}

    private SecurityProfileBehaviorCriteriaArgs(SecurityProfileBehaviorCriteriaArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.consecutiveDatapointsToAlarm = $.consecutiveDatapointsToAlarm;
        this.consecutiveDatapointsToClear = $.consecutiveDatapointsToClear;
        this.durationSeconds = $.durationSeconds;
        this.mlDetectionConfig = $.mlDetectionConfig;
        this.statisticalThreshold = $.statisticalThreshold;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProfileBehaviorCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProfileBehaviorCriteriaArgs $;

        public Builder() {
            $ = new SecurityProfileBehaviorCriteriaArgs();
        }

        public Builder(SecurityProfileBehaviorCriteriaArgs defaults) {
            $ = new SecurityProfileBehaviorCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonOperator The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(@Nullable Output<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(SecurityProfileBehaviorCriteriaComparisonOperator comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param consecutiveDatapointsToAlarm If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDatapointsToAlarm(@Nullable Output<Integer> consecutiveDatapointsToAlarm) {
            $.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
            return this;
        }

        /**
         * @param consecutiveDatapointsToAlarm If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDatapointsToAlarm(Integer consecutiveDatapointsToAlarm) {
            return consecutiveDatapointsToAlarm(Output.of(consecutiveDatapointsToAlarm));
        }

        /**
         * @param consecutiveDatapointsToClear If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDatapointsToClear(@Nullable Output<Integer> consecutiveDatapointsToClear) {
            $.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
            return this;
        }

        /**
         * @param consecutiveDatapointsToClear If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDatapointsToClear(Integer consecutiveDatapointsToClear) {
            return consecutiveDatapointsToClear(Output.of(consecutiveDatapointsToClear));
        }

        /**
         * @param durationSeconds Use this to specify the time duration over which the behavior is evaluated.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * @param durationSeconds Use this to specify the time duration over which the behavior is evaluated.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(Integer durationSeconds) {
            return durationSeconds(Output.of(durationSeconds));
        }

        public Builder mlDetectionConfig(@Nullable Output<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig) {
            $.mlDetectionConfig = mlDetectionConfig;
            return this;
        }

        public Builder mlDetectionConfig(SecurityProfileMachineLearningDetectionConfigArgs mlDetectionConfig) {
            return mlDetectionConfig(Output.of(mlDetectionConfig));
        }

        public Builder statisticalThreshold(@Nullable Output<SecurityProfileStatisticalThresholdArgs> statisticalThreshold) {
            $.statisticalThreshold = statisticalThreshold;
            return this;
        }

        public Builder statisticalThreshold(SecurityProfileStatisticalThresholdArgs statisticalThreshold) {
            return statisticalThreshold(Output.of(statisticalThreshold));
        }

        public Builder value(@Nullable Output<SecurityProfileMetricValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(SecurityProfileMetricValueArgs value) {
            return value(Output.of(value));
        }

        public SecurityProfileBehaviorCriteriaArgs build() {
            return $;
        }
    }

}
