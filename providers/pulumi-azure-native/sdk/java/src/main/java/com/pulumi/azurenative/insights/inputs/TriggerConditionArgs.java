// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ConditionalOperator;
import com.pulumi.azurenative.insights.inputs.LogMetricTriggerArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The condition that results in the Log Search rule.
 * 
 */
public final class TriggerConditionArgs extends ResourceArgs {

    public static final TriggerConditionArgs Empty = new TriggerConditionArgs();

    /**
     * Trigger condition for metric query rule
     * 
     */
    @Import(name="metricTrigger")
    private @Nullable Output<LogMetricTriggerArgs> metricTrigger;

    /**
     * @return Trigger condition for metric query rule
     * 
     */
    public Optional<Output<LogMetricTriggerArgs>> metricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }

    /**
     * Result or count threshold based on which rule should be triggered.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return Result or count threshold based on which rule should be triggered.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
     * 
     */
    @Import(name="thresholdOperator", required=true)
    private Output<Either<String,ConditionalOperator>> thresholdOperator;

    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
     * 
     */
    public Output<Either<String,ConditionalOperator>> thresholdOperator() {
        return this.thresholdOperator;
    }

    private TriggerConditionArgs() {}

    private TriggerConditionArgs(TriggerConditionArgs $) {
        this.metricTrigger = $.metricTrigger;
        this.threshold = $.threshold;
        this.thresholdOperator = $.thresholdOperator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerConditionArgs $;

        public Builder() {
            $ = new TriggerConditionArgs();
        }

        public Builder(TriggerConditionArgs defaults) {
            $ = new TriggerConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricTrigger Trigger condition for metric query rule
         * 
         * @return builder
         * 
         */
        public Builder metricTrigger(@Nullable Output<LogMetricTriggerArgs> metricTrigger) {
            $.metricTrigger = metricTrigger;
            return this;
        }

        /**
         * @param metricTrigger Trigger condition for metric query rule
         * 
         * @return builder
         * 
         */
        public Builder metricTrigger(LogMetricTriggerArgs metricTrigger) {
            return metricTrigger(Output.of(metricTrigger));
        }

        /**
         * @param threshold Result or count threshold based on which rule should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Result or count threshold based on which rule should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param thresholdOperator Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
         * 
         * @return builder
         * 
         */
        public Builder thresholdOperator(Output<Either<String,ConditionalOperator>> thresholdOperator) {
            $.thresholdOperator = thresholdOperator;
            return this;
        }

        /**
         * @param thresholdOperator Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
         * 
         * @return builder
         * 
         */
        public Builder thresholdOperator(Either<String,ConditionalOperator> thresholdOperator) {
            return thresholdOperator(Output.of(thresholdOperator));
        }

        /**
         * @param thresholdOperator Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
         * 
         * @return builder
         * 
         */
        public Builder thresholdOperator(String thresholdOperator) {
            return thresholdOperator(Either.ofLeft(thresholdOperator));
        }

        /**
         * @param thresholdOperator Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
         * 
         * @return builder
         * 
         */
        public Builder thresholdOperator(ConditionalOperator thresholdOperator) {
            return thresholdOperator(Either.ofRight(thresholdOperator));
        }

        public TriggerConditionArgs build() {
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.thresholdOperator = Objects.requireNonNull($.thresholdOperator, "expected parameter 'thresholdOperator' to be non-null");
            return $;
        }
    }

}
