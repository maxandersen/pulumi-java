// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Any scheduled maintenancce for this instance.
 * 
 */
public final class SqlScheduledMaintenanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlScheduledMaintenanceArgs Empty = new SqlScheduledMaintenanceArgs();

    @Import(name="canDefer")
      private final @Nullable Output<Boolean> canDefer;

    public Output<Boolean> canDefer() {
        return this.canDefer == null ? Codegen.empty() : this.canDefer;
    }

    /**
     * If the scheduled maintenance can be rescheduled.
     * 
     */
    @Import(name="canReschedule")
      private final @Nullable Output<Boolean> canReschedule;

    public Output<Boolean> canReschedule() {
        return this.canReschedule == null ? Codegen.empty() : this.canReschedule;
    }

    /**
     * Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    @Import(name="scheduleDeadlineTime")
      private final @Nullable Output<String> scheduleDeadlineTime;

    public Output<String> scheduleDeadlineTime() {
        return this.scheduleDeadlineTime == null ? Codegen.empty() : this.scheduleDeadlineTime;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public SqlScheduledMaintenanceArgs(
        @Nullable Output<Boolean> canDefer,
        @Nullable Output<Boolean> canReschedule,
        @Nullable Output<String> scheduleDeadlineTime,
        @Nullable Output<String> startTime) {
        this.canDefer = canDefer;
        this.canReschedule = canReschedule;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    private SqlScheduledMaintenanceArgs() {
        this.canDefer = Codegen.empty();
        this.canReschedule = Codegen.empty();
        this.scheduleDeadlineTime = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlScheduledMaintenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> canDefer;
        private @Nullable Output<Boolean> canReschedule;
        private @Nullable Output<String> scheduleDeadlineTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlScheduledMaintenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canDefer = defaults.canDefer;
    	      this.canReschedule = defaults.canReschedule;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder canDefer(@Nullable Output<Boolean> canDefer) {
            this.canDefer = canDefer;
            return this;
        }
        public Builder canDefer(@Nullable Boolean canDefer) {
            this.canDefer = Codegen.ofNullable(canDefer);
            return this;
        }
        public Builder canReschedule(@Nullable Output<Boolean> canReschedule) {
            this.canReschedule = canReschedule;
            return this;
        }
        public Builder canReschedule(@Nullable Boolean canReschedule) {
            this.canReschedule = Codegen.ofNullable(canReschedule);
            return this;
        }
        public Builder scheduleDeadlineTime(@Nullable Output<String> scheduleDeadlineTime) {
            this.scheduleDeadlineTime = scheduleDeadlineTime;
            return this;
        }
        public Builder scheduleDeadlineTime(@Nullable String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Codegen.ofNullable(scheduleDeadlineTime);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public SqlScheduledMaintenanceArgs build() {
            return new SqlScheduledMaintenanceArgs(canDefer, canReschedule, scheduleDeadlineTime, startTime);
        }
    }
}
