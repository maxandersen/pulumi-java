// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration values for periodic mode backup
 * 
 */
public final class PeriodicModePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PeriodicModePropertiesResponse Empty = new PeriodicModePropertiesResponse();

    /**
     * An integer representing the interval in minutes between two backups
     * 
     */
    @Import(name="backupIntervalInMinutes")
      private final @Nullable Integer backupIntervalInMinutes;

    public Optional<Integer> backupIntervalInMinutes() {
        return this.backupIntervalInMinutes == null ? Optional.empty() : Optional.ofNullable(this.backupIntervalInMinutes);
    }

    /**
     * An integer representing the time (in hours) that each backup is retained
     * 
     */
    @Import(name="backupRetentionIntervalInHours")
      private final @Nullable Integer backupRetentionIntervalInHours;

    public Optional<Integer> backupRetentionIntervalInHours() {
        return this.backupRetentionIntervalInHours == null ? Optional.empty() : Optional.ofNullable(this.backupRetentionIntervalInHours);
    }

    public PeriodicModePropertiesResponse(
        @Nullable Integer backupIntervalInMinutes,
        @Nullable Integer backupRetentionIntervalInHours) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
    }

    private PeriodicModePropertiesResponse() {
        this.backupIntervalInMinutes = null;
        this.backupRetentionIntervalInHours = null;
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
