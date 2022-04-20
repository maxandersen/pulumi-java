// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allows autoscaling based on Stackdriver metrics.
 * 
 */
public final class CustomMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomMetricArgs Empty = new CustomMetricArgs();

    /**
     * Allows filtering on the metric&#39;s fields.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName == null ? Codegen.empty() : this.metricName;
    }

    /**
     * May be used instead of target_utilization when an instance can handle a specific amount of work/resources and the metric value is equal to the current amount of work remaining. The autoscaler will try to keep the number of instances equal to the metric value divided by single_instance_assignment.
     * 
     */
    @Import(name="singleInstanceAssignment")
      private final @Nullable Output<Double> singleInstanceAssignment;

    public Output<Double> singleInstanceAssignment() {
        return this.singleInstanceAssignment == null ? Codegen.empty() : this.singleInstanceAssignment;
    }

    /**
     * The type of the metric. Must be a string representing a Stackdriver metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> targetType() {
        return this.targetType == null ? Codegen.empty() : this.targetType;
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetUtilization")
      private final @Nullable Output<Double> targetUtilization;

    public Output<Double> targetUtilization() {
        return this.targetUtilization == null ? Codegen.empty() : this.targetUtilization;
    }

    public CustomMetricArgs(
        @Nullable Output<String> filter,
        @Nullable Output<String> metricName,
        @Nullable Output<Double> singleInstanceAssignment,
        @Nullable Output<String> targetType,
        @Nullable Output<Double> targetUtilization) {
        this.filter = filter;
        this.metricName = metricName;
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.targetType = targetType;
        this.targetUtilization = targetUtilization;
    }

    private CustomMetricArgs() {
        this.filter = Codegen.empty();
        this.metricName = Codegen.empty();
        this.singleInstanceAssignment = Codegen.empty();
        this.targetType = Codegen.empty();
        this.targetUtilization = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filter;
        private @Nullable Output<String> metricName;
        private @Nullable Output<Double> singleInstanceAssignment;
        private @Nullable Output<String> targetType;
        private @Nullable Output<Double> targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.metricName = defaults.metricName;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.targetType = defaults.targetType;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder metricName(@Nullable Output<String> metricName) {
            this.metricName = metricName;
            return this;
        }
        public Builder metricName(@Nullable String metricName) {
            this.metricName = Codegen.ofNullable(metricName);
            return this;
        }
        public Builder singleInstanceAssignment(@Nullable Output<Double> singleInstanceAssignment) {
            this.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }
        public Builder singleInstanceAssignment(@Nullable Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Codegen.ofNullable(singleInstanceAssignment);
            return this;
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Codegen.ofNullable(targetType);
            return this;
        }
        public Builder targetUtilization(@Nullable Output<Double> targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }
        public Builder targetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = Codegen.ofNullable(targetUtilization);
            return this;
        }        public CustomMetricArgs build() {
            return new CustomMetricArgs(filter, metricName, singleInstanceAssignment, targetType, targetUtilization);
        }
    }
}
