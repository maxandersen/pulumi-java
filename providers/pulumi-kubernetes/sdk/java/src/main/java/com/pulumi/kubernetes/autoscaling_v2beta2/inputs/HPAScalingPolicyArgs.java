// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 * 
 */
public final class HPAScalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final HPAScalingPolicyArgs Empty = new HPAScalingPolicyArgs();

    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    @Import(name="periodSeconds", required=true)
      private final Output<Integer> periodSeconds;

    public Output<Integer> periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Type is used to specify the scaling policy.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    @Import(name="value", required=true)
      private final Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    public HPAScalingPolicyArgs(
        Output<Integer> periodSeconds,
        Output<String> type,
        Output<Integer> value) {
        this.periodSeconds = Objects.requireNonNull(periodSeconds, "expected parameter 'periodSeconds' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private HPAScalingPolicyArgs() {
        this.periodSeconds = Codegen.empty();
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> periodSeconds;
        private Output<String> type;
        private Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HPAScalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder periodSeconds(Output<Integer> periodSeconds) {
            this.periodSeconds = Objects.requireNonNull(periodSeconds);
            return this;
        }
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = Output.of(Objects.requireNonNull(periodSeconds));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder value(Output<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public HPAScalingPolicyArgs build() {
            return new HPAScalingPolicyArgs(periodSeconds, type, value);
        }
    }
}
