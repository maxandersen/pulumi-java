// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoScaleConfigurationResponse {
    /**
     * @return The maximum number of replicas for each service.
     * 
     */
    private final @Nullable Integer maxReplicas;
    /**
     * @return The minimum number of replicas for each service.
     * 
     */
    private final @Nullable Integer minReplicas;
    /**
     * @return Refresh period in seconds.
     * 
     */
    private final @Nullable Integer refreshPeriodInSeconds;
    /**
     * @return If auto-scale is enabled for all services. Each service can turn it off individually.
     * 
     */
    private final @Nullable String status;
    /**
     * @return The target utilization.
     * 
     */
    private final @Nullable Double targetUtilization;

    @CustomType.Constructor
    private AutoScaleConfigurationResponse(
        @CustomType.Parameter("maxReplicas") @Nullable Integer maxReplicas,
        @CustomType.Parameter("minReplicas") @Nullable Integer minReplicas,
        @CustomType.Parameter("refreshPeriodInSeconds") @Nullable Integer refreshPeriodInSeconds,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("targetUtilization") @Nullable Double targetUtilization) {
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.status = status;
        this.targetUtilization = targetUtilization;
    }

    /**
     * @return The maximum number of replicas for each service.
     * 
     */
    public Optional<Integer> maxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    /**
     * @return The minimum number of replicas for each service.
     * 
     */
    public Optional<Integer> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * @return Refresh period in seconds.
     * 
     */
    public Optional<Integer> refreshPeriodInSeconds() {
        return Optional.ofNullable(this.refreshPeriodInSeconds);
    }
    /**
     * @return If auto-scale is enabled for all services. Each service can turn it off individually.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The target utilization.
     * 
     */
    public Optional<Double> targetUtilization() {
        return Optional.ofNullable(this.targetUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private @Nullable Integer refreshPeriodInSeconds;
        private @Nullable String status;
        private @Nullable Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.refreshPeriodInSeconds = defaults.refreshPeriodInSeconds;
    	      this.status = defaults.status;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder maxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder refreshPeriodInSeconds(@Nullable Integer refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder targetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }        public AutoScaleConfigurationResponse build() {
            return new AutoScaleConfigurationResponse(maxReplicas, minReplicas, refreshPeriodInSeconds, status, targetUtilization);
        }
    }
}
