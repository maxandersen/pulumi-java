// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CpuUtilizationResponse {
    /**
     * Period of time over which CPU utilization is calculated.
     * 
     */
    private final String aggregationWindowLength;
    /**
     * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
     * 
     */
    private final Double targetUtilization;

    @CustomType.Constructor
    private CpuUtilizationResponse(
        @CustomType.Parameter("aggregationWindowLength") String aggregationWindowLength,
        @CustomType.Parameter("targetUtilization") Double targetUtilization) {
        this.aggregationWindowLength = aggregationWindowLength;
        this.targetUtilization = targetUtilization;
    }

    /**
     * Period of time over which CPU utilization is calculated.
     * 
    */
    public String aggregationWindowLength() {
        return this.aggregationWindowLength;
    }
    /**
     * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
     * 
    */
    public Double targetUtilization() {
        return this.targetUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpuUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationWindowLength;
        private Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CpuUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationWindowLength = defaults.aggregationWindowLength;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder aggregationWindowLength(String aggregationWindowLength) {
            this.aggregationWindowLength = Objects.requireNonNull(aggregationWindowLength);
            return this;
        }
        public Builder targetUtilization(Double targetUtilization) {
            this.targetUtilization = Objects.requireNonNull(targetUtilization);
            return this;
        }        public CpuUtilizationResponse build() {
            return new CpuUtilizationResponse(aggregationWindowLength, targetUtilization);
        }
    }
}
