// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A log metrics trigger descriptor.
 * 
 */
public final class LogMetricTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogMetricTriggerResponse Empty = new LogMetricTriggerResponse();

    /**
     * Evaluation of metric on a particular column
     * 
     */
    @Import(name="metricColumn")
      private final @Nullable String metricColumn;

    public Optional<String> metricColumn() {
        return this.metricColumn == null ? Optional.empty() : Optional.ofNullable(this.metricColumn);
    }

    /**
     * Metric Trigger Type - 'Consecutive' or 'Total'
     * 
     */
    @Import(name="metricTriggerType")
      private final @Nullable String metricTriggerType;

    public Optional<String> metricTriggerType() {
        return this.metricTriggerType == null ? Optional.empty() : Optional.ofNullable(this.metricTriggerType);
    }

    /**
     * The threshold of the metric trigger.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Double threshold;

    public Optional<Double> threshold() {
        return this.threshold == null ? Optional.empty() : Optional.ofNullable(this.threshold);
    }

    /**
     * Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     * 
     */
    @Import(name="thresholdOperator")
      private final @Nullable String thresholdOperator;

    public Optional<String> thresholdOperator() {
        return this.thresholdOperator == null ? Optional.empty() : Optional.ofNullable(this.thresholdOperator);
    }

    public LogMetricTriggerResponse(
        @Nullable String metricColumn,
        @Nullable String metricTriggerType,
        @Nullable Double threshold,
        @Nullable String thresholdOperator) {
        this.metricColumn = metricColumn;
        this.metricTriggerType = metricTriggerType;
        this.threshold = threshold;
        this.thresholdOperator = thresholdOperator;
    }

    private LogMetricTriggerResponse() {
        this.metricColumn = null;
        this.metricTriggerType = null;
        this.threshold = null;
        this.thresholdOperator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String metricColumn;
        private @Nullable String metricTriggerType;
        private @Nullable Double threshold;
        private @Nullable String thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricColumn = defaults.metricColumn;
    	      this.metricTriggerType = defaults.metricTriggerType;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder metricColumn(@Nullable String metricColumn) {
            this.metricColumn = metricColumn;
            return this;
        }
        public Builder metricTriggerType(@Nullable String metricTriggerType) {
            this.metricTriggerType = metricTriggerType;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder thresholdOperator(@Nullable String thresholdOperator) {
            this.thresholdOperator = thresholdOperator;
            return this;
        }        public LogMetricTriggerResponse build() {
            return new LogMetricTriggerResponse(metricColumn, metricTriggerType, threshold, thresholdOperator);
        }
    }
}
