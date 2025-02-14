// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class StandardSchedulerSettingsResponse {
    /**
     * @return Maximum number of instances to run for this version. Set to zero to disable max_instances configuration.
     * 
     */
    private final Integer maxInstances;
    /**
     * @return Minimum number of instances to run for this version. Set to zero to disable min_instances configuration.
     * 
     */
    private final Integer minInstances;
    /**
     * @return Target CPU utilization ratio to maintain when scaling.
     * 
     */
    private final Double targetCpuUtilization;
    /**
     * @return Target throughput utilization ratio to maintain when scaling
     * 
     */
    private final Double targetThroughputUtilization;

    @CustomType.Constructor
    private StandardSchedulerSettingsResponse(
        @CustomType.Parameter("maxInstances") Integer maxInstances,
        @CustomType.Parameter("minInstances") Integer minInstances,
        @CustomType.Parameter("targetCpuUtilization") Double targetCpuUtilization,
        @CustomType.Parameter("targetThroughputUtilization") Double targetThroughputUtilization) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.targetCpuUtilization = targetCpuUtilization;
        this.targetThroughputUtilization = targetThroughputUtilization;
    }

    /**
     * @return Maximum number of instances to run for this version. Set to zero to disable max_instances configuration.
     * 
     */
    public Integer maxInstances() {
        return this.maxInstances;
    }
    /**
     * @return Minimum number of instances to run for this version. Set to zero to disable min_instances configuration.
     * 
     */
    public Integer minInstances() {
        return this.minInstances;
    }
    /**
     * @return Target CPU utilization ratio to maintain when scaling.
     * 
     */
    public Double targetCpuUtilization() {
        return this.targetCpuUtilization;
    }
    /**
     * @return Target throughput utilization ratio to maintain when scaling
     * 
     */
    public Double targetThroughputUtilization() {
        return this.targetThroughputUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSchedulerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxInstances;
        private Integer minInstances;
        private Double targetCpuUtilization;
        private Double targetThroughputUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSchedulerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.targetCpuUtilization = defaults.targetCpuUtilization;
    	      this.targetThroughputUtilization = defaults.targetThroughputUtilization;
        }

        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public Builder minInstances(Integer minInstances) {
            this.minInstances = Objects.requireNonNull(minInstances);
            return this;
        }
        public Builder targetCpuUtilization(Double targetCpuUtilization) {
            this.targetCpuUtilization = Objects.requireNonNull(targetCpuUtilization);
            return this;
        }
        public Builder targetThroughputUtilization(Double targetThroughputUtilization) {
            this.targetThroughputUtilization = Objects.requireNonNull(targetThroughputUtilization);
            return this;
        }        public StandardSchedulerSettingsResponse build() {
            return new StandardSchedulerSettingsResponse(maxInstances, minInstances, targetCpuUtilization, targetThroughputUtilization);
        }
    }
}
