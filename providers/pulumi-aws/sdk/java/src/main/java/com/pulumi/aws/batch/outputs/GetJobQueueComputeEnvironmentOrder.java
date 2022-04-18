// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobQueueComputeEnvironmentOrder {
    private final String computeEnvironment;
    private final Integer order;

    @CustomType.Constructor
    private GetJobQueueComputeEnvironmentOrder(
        @CustomType.Parameter("computeEnvironment") String computeEnvironment,
        @CustomType.Parameter("order") Integer order) {
        this.computeEnvironment = computeEnvironment;
        this.order = order;
    }

    public String computeEnvironment() {
        return this.computeEnvironment;
    }
    public Integer order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobQueueComputeEnvironmentOrder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeEnvironment;
        private Integer order;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobQueueComputeEnvironmentOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnvironment = defaults.computeEnvironment;
    	      this.order = defaults.order;
        }

        public Builder computeEnvironment(String computeEnvironment) {
            this.computeEnvironment = Objects.requireNonNull(computeEnvironment);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }        public GetJobQueueComputeEnvironmentOrder build() {
            return new GetJobQueueComputeEnvironmentOrder(computeEnvironment, order);
        }
    }
}
