// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AutoScale configuration properties.
 * 
 */
public final class AutoScaleConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoScaleConfigurationResponse Empty = new AutoScaleConfigurationResponse();

    /**
     * The maximum number of replicas for each service.
     * 
     */
    @Import(name="maxReplicas")
      private final @Nullable Integer maxReplicas;

    public Optional<Integer> maxReplicas() {
        return this.maxReplicas == null ? Optional.empty() : Optional.ofNullable(this.maxReplicas);
    }

    /**
     * The minimum number of replicas for each service.
     * 
     */
    @Import(name="minReplicas")
      private final @Nullable Integer minReplicas;

    public Optional<Integer> minReplicas() {
        return this.minReplicas == null ? Optional.empty() : Optional.ofNullable(this.minReplicas);
    }

    /**
     * Refresh period in seconds.
     * 
     */
    @Import(name="refreshPeriodInSeconds")
      private final @Nullable Integer refreshPeriodInSeconds;

    public Optional<Integer> refreshPeriodInSeconds() {
        return this.refreshPeriodInSeconds == null ? Optional.empty() : Optional.ofNullable(this.refreshPeriodInSeconds);
    }

    /**
     * If auto-scale is enabled for all services. Each service can turn it off individually.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The target utilization.
     * 
     */
    @Import(name="targetUtilization")
      private final @Nullable Double targetUtilization;

    public Optional<Double> targetUtilization() {
        return this.targetUtilization == null ? Optional.empty() : Optional.ofNullable(this.targetUtilization);
    }

    public AutoScaleConfigurationResponse(
        @Nullable Integer maxReplicas,
        @Nullable Integer minReplicas,
        @Nullable Integer refreshPeriodInSeconds,
        @Nullable String status,
        @Nullable Double targetUtilization) {
        this.maxReplicas = maxReplicas == null ? 100 : maxReplicas;
        this.minReplicas = minReplicas == null ? 1 : minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.status = status == null ? "Disabled" : status;
        this.targetUtilization = targetUtilization;
    }

    private AutoScaleConfigurationResponse() {
        this.maxReplicas = null;
        this.minReplicas = null;
        this.refreshPeriodInSeconds = null;
        this.status = null;
        this.targetUtilization = null;
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
