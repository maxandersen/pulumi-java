// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ConditionalOperator;
import com.pulumi.azurenative.insights.inputs.LogMetricTriggerArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The condition that results in the Log Search rule.
 * 
 */
public final class TriggerConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerConditionArgs Empty = new TriggerConditionArgs();

    /**
     * Trigger condition for metric query rule
     * 
     */
    @Import(name="metricTrigger")
      private final @Nullable Output<LogMetricTriggerArgs> metricTrigger;

    public Output<LogMetricTriggerArgs> metricTrigger() {
        return this.metricTrigger == null ? Codegen.empty() : this.metricTrigger;
    }

    /**
     * Result or count threshold based on which rule should be triggered.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
     * 
     */
    @Import(name="thresholdOperator", required=true)
      private final Output<Either<String,ConditionalOperator>> thresholdOperator;

    public Output<Either<String,ConditionalOperator>> thresholdOperator() {
        return this.thresholdOperator;
    }

    public TriggerConditionArgs(
        @Nullable Output<LogMetricTriggerArgs> metricTrigger,
        Output<Double> threshold,
        Output<Either<String,ConditionalOperator>> thresholdOperator) {
        this.metricTrigger = metricTrigger;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdOperator = Objects.requireNonNull(thresholdOperator, "expected parameter 'thresholdOperator' to be non-null");
    }

    private TriggerConditionArgs() {
        this.metricTrigger = Codegen.empty();
        this.threshold = Codegen.empty();
        this.thresholdOperator = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LogMetricTriggerArgs> metricTrigger;
        private Output<Double> threshold;
        private Output<Either<String,ConditionalOperator>> thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder metricTrigger(@Nullable Output<LogMetricTriggerArgs> metricTrigger) {
            this.metricTrigger = metricTrigger;
            return this;
        }
        public Builder metricTrigger(@Nullable LogMetricTriggerArgs metricTrigger) {
            this.metricTrigger = Codegen.ofNullable(metricTrigger);
            return this;
        }
        public Builder threshold(Output<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }
        public Builder thresholdOperator(Output<Either<String,ConditionalOperator>> thresholdOperator) {
            this.thresholdOperator = Objects.requireNonNull(thresholdOperator);
            return this;
        }
        public Builder thresholdOperator(Either<String,ConditionalOperator> thresholdOperator) {
            this.thresholdOperator = Output.of(Objects.requireNonNull(thresholdOperator));
            return this;
        }        public TriggerConditionArgs build() {
            return new TriggerConditionArgs(metricTrigger, threshold, thresholdOperator);
        }
    }
}
