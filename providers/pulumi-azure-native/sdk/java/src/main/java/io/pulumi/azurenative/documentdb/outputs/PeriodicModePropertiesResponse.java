// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PeriodicModePropertiesResponse {
    /**
     * An integer representing the interval in minutes between two backups
     * 
     */
    private final @Nullable Integer backupIntervalInMinutes;
    /**
     * An integer representing the time (in hours) that each backup is retained
     * 
     */
    private final @Nullable Integer backupRetentionIntervalInHours;

    @CustomType.Constructor
    private PeriodicModePropertiesResponse(
        @CustomType.Parameter("backupIntervalInMinutes") @Nullable Integer backupIntervalInMinutes,
        @CustomType.Parameter("backupRetentionIntervalInHours") @Nullable Integer backupRetentionIntervalInHours) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
    }

    /**
     * An integer representing the interval in minutes between two backups
     * 
    */
    public Optional<Integer> backupIntervalInMinutes() {
        return Optional.ofNullable(this.backupIntervalInMinutes);
    }
    /**
     * An integer representing the time (in hours) that each backup is retained
     * 
    */
    public Optional<Integer> backupRetentionIntervalInHours() {
        return Optional.ofNullable(this.backupRetentionIntervalInHours);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicModePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backupIntervalInMinutes;
        private @Nullable Integer backupRetentionIntervalInHours;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicModePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupIntervalInMinutes = defaults.backupIntervalInMinutes;
    	      this.backupRetentionIntervalInHours = defaults.backupRetentionIntervalInHours;
        }

        public Builder backupIntervalInMinutes(@Nullable Integer backupIntervalInMinutes) {
            this.backupIntervalInMinutes = backupIntervalInMinutes;
            return this;
        }
        public Builder backupRetentionIntervalInHours(@Nullable Integer backupRetentionIntervalInHours) {
            this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
            return this;
        }        public PeriodicModePropertiesResponse build() {
            return new PeriodicModePropertiesResponse(backupIntervalInMinutes, backupRetentionIntervalInHours);
        }
    }
}
