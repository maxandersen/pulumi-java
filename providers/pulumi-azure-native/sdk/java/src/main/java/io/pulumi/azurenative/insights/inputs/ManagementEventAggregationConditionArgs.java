// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.ConditionOperator;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * How the data that is collected should be combined over time.
 * 
 */
public final class ManagementEventAggregationConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementEventAggregationConditionArgs Empty = new ManagementEventAggregationConditionArgs();

    /**
     * the condition operator.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<ConditionOperator> operator;

    public Output<ConditionOperator> operator() {
        return this.operator == null ? Codegen.empty() : this.operator;
    }

    /**
     * The threshold value that activates the alert.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold == null ? Codegen.empty() : this.threshold;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
      private final @Nullable Output<String> windowSize;

    public Output<String> windowSize() {
        return this.windowSize == null ? Codegen.empty() : this.windowSize;
    }

    public ManagementEventAggregationConditionArgs(
        @Nullable Output<ConditionOperator> operator,
        @Nullable Output<Double> threshold,
        @Nullable Output<String> windowSize) {
        this.operator = operator;
        this.threshold = threshold;
        this.windowSize = windowSize;
    }

    private ManagementEventAggregationConditionArgs() {
        this.operator = Codegen.empty();
        this.threshold = Codegen.empty();
        this.windowSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventAggregationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConditionOperator> operator;
        private @Nullable Output<Double> threshold;
        private @Nullable Output<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventAggregationConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder operator(@Nullable Output<ConditionOperator> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable ConditionOperator operator) {
            this.operator = Codegen.ofNullable(operator);
            return this;
        }
        public Builder threshold(@Nullable Output<Double> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = Codegen.ofNullable(threshold);
            return this;
        }
        public Builder windowSize(@Nullable Output<String> windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = Codegen.ofNullable(windowSize);
            return this;
        }        public ManagementEventAggregationConditionArgs build() {
            return new ManagementEventAggregationConditionArgs(operator, threshold, windowSize);
        }
    }
}
