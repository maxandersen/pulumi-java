// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CronJobStatus represents the current state of a cron job.
 * 
 */
public final class CronJobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CronJobStatusArgs Empty = new CronJobStatusArgs();

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<List<ObjectReferenceArgs>> active;

    public Input<List<ObjectReferenceArgs>> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    @InputImport(name="lastScheduleTime")
    private final @Nullable Input<String> lastScheduleTime;

    public Input<String> getLastScheduleTime() {
        return this.lastScheduleTime == null ? Input.empty() : this.lastScheduleTime;
    }

    /**
     * Information when was the last time the job successfully completed.
     * 
     */
    @InputImport(name="lastSuccessfulTime")
    private final @Nullable Input<String> lastSuccessfulTime;

    public Input<String> getLastSuccessfulTime() {
        return this.lastSuccessfulTime == null ? Input.empty() : this.lastSuccessfulTime;
    }

    public CronJobStatusArgs(
        @Nullable Input<List<ObjectReferenceArgs>> active,
        @Nullable Input<String> lastScheduleTime,
        @Nullable Input<String> lastSuccessfulTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    private CronJobStatusArgs() {
        this.active = Input.empty();
        this.lastScheduleTime = Input.empty();
        this.lastSuccessfulTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ObjectReferenceArgs>> active;
        private @Nullable Input<String> lastScheduleTime;
        private @Nullable Input<String> lastSuccessfulTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.lastScheduleTime = defaults.lastScheduleTime;
    	      this.lastSuccessfulTime = defaults.lastSuccessfulTime;
        }

        public Builder setActive(@Nullable Input<List<ObjectReferenceArgs>> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable List<ObjectReferenceArgs> active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setLastScheduleTime(@Nullable Input<String> lastScheduleTime) {
            this.lastScheduleTime = lastScheduleTime;
            return this;
        }

        public Builder setLastScheduleTime(@Nullable String lastScheduleTime) {
            this.lastScheduleTime = Input.ofNullable(lastScheduleTime);
            return this;
        }

        public Builder setLastSuccessfulTime(@Nullable Input<String> lastSuccessfulTime) {
            this.lastSuccessfulTime = lastSuccessfulTime;
            return this;
        }

        public Builder setLastSuccessfulTime(@Nullable String lastSuccessfulTime) {
            this.lastSuccessfulTime = Input.ofNullable(lastSuccessfulTime);
            return this;
        }

        public CronJobStatusArgs build() {
            return new CronJobStatusArgs(active, lastScheduleTime, lastSuccessfulTime);
        }
    }
}
