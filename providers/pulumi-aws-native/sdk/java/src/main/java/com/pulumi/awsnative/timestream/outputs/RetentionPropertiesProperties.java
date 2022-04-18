// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RetentionPropertiesProperties {
    /**
     * The duration for which data must be stored in the magnetic store.
     * 
     */
    private final @Nullable String magneticStoreRetentionPeriodInDays;
    /**
     * The duration for which data must be stored in the memory store.
     * 
     */
    private final @Nullable String memoryStoreRetentionPeriodInHours;

    @CustomType.Constructor
    private RetentionPropertiesProperties(
        @CustomType.Parameter("magneticStoreRetentionPeriodInDays") @Nullable String magneticStoreRetentionPeriodInDays,
        @CustomType.Parameter("memoryStoreRetentionPeriodInHours") @Nullable String memoryStoreRetentionPeriodInHours) {
        this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
        this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
    }

    /**
     * The duration for which data must be stored in the magnetic store.
     * 
    */
    public Optional<String> magneticStoreRetentionPeriodInDays() {
        return Optional.ofNullable(this.magneticStoreRetentionPeriodInDays);
    }
    /**
     * The duration for which data must be stored in the memory store.
     * 
    */
    public Optional<String> memoryStoreRetentionPeriodInHours() {
        return Optional.ofNullable(this.memoryStoreRetentionPeriodInHours);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPropertiesProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String magneticStoreRetentionPeriodInDays;
        private @Nullable String memoryStoreRetentionPeriodInHours;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPropertiesProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.magneticStoreRetentionPeriodInDays = defaults.magneticStoreRetentionPeriodInDays;
    	      this.memoryStoreRetentionPeriodInHours = defaults.memoryStoreRetentionPeriodInHours;
        }

        public Builder magneticStoreRetentionPeriodInDays(@Nullable String magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
            return this;
        }
        public Builder memoryStoreRetentionPeriodInHours(@Nullable String memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
            return this;
        }        public RetentionPropertiesProperties build() {
            return new RetentionPropertiesProperties(magneticStoreRetentionPeriodInDays, memoryStoreRetentionPeriodInHours);
        }
    }
}
