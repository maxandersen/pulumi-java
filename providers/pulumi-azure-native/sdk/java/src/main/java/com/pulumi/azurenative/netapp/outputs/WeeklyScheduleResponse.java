// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WeeklyScheduleResponse {
    /**
     * Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
     * 
     */
    private final @Nullable String day;
    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    private final @Nullable Integer hour;
    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    private final @Nullable Integer minute;
    /**
     * Weekly snapshot count to keep
     * 
     */
    private final @Nullable Integer snapshotsToKeep;
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    private final @Nullable Double usedBytes;

    @CustomType.Constructor
    private WeeklyScheduleResponse(
        @CustomType.Parameter("day") @Nullable String day,
        @CustomType.Parameter("hour") @Nullable Integer hour,
        @CustomType.Parameter("minute") @Nullable Integer minute,
        @CustomType.Parameter("snapshotsToKeep") @Nullable Integer snapshotsToKeep,
        @CustomType.Parameter("usedBytes") @Nullable Double usedBytes) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    /**
     * Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
     * 
    */
    public Optional<String> day() {
        return Optional.ofNullable(this.day);
    }
    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
    */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * Indicates which minute snapshot should be taken
     * 
    */
    public Optional<Integer> minute() {
        return Optional.ofNullable(this.minute);
    }
    /**
     * Weekly snapshot count to keep
     * 
    */
    public Optional<Integer> snapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
    */
    public Optional<Double> usedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable Integer hour;
        private @Nullable Integer minute;
        private @Nullable Integer snapshotsToKeep;
        private @Nullable Double usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder day(@Nullable String day) {
            this.day = day;
            return this;
        }
        public Builder hour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }
        public Builder minute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }
        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }
        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }        public WeeklyScheduleResponse build() {
            return new WeeklyScheduleResponse(day, hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
