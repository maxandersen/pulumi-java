// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManualScaleSettingsResponse {
    /**
     * Fixed number of instances for this deployment.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * Maximum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer maxInstances;
    /**
     * Minimum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer minInstances;
    /**
     * Expected value is &#39;Manual&#39;.
     * 
     */
    private final String scaleType;

    @CustomType.Constructor
    private ManualScaleSettingsResponse(
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("maxInstances") @Nullable Integer maxInstances,
        @CustomType.Parameter("minInstances") @Nullable Integer minInstances,
        @CustomType.Parameter("scaleType") String scaleType) {
        this.instanceCount = instanceCount;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.scaleType = scaleType;
    }

    /**
     * Fixed number of instances for this deployment.
     * 
    */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * Maximum number of instances for this deployment.
     * 
    */
    public Optional<Integer> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    /**
     * Minimum number of instances for this deployment.
     * 
    */
    public Optional<Integer> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }
    /**
     * Expected value is &#39;Manual&#39;.
     * 
    */
    public String scaleType() {
        return this.scaleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder scaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }        public ManualScaleSettingsResponse build() {
            return new ManualScaleSettingsResponse(instanceCount, maxInstances, minInstances, scaleType);
        }
    }
}
