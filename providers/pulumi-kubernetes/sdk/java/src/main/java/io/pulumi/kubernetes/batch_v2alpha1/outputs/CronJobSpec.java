// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v2alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.batch_v2alpha1.outputs.JobTemplateSpec;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CronJobSpec {
    private final @Nullable String concurrencyPolicy;
    private final @Nullable Integer failedJobsHistoryLimit;
    private final JobTemplateSpec jobTemplate;
    private final String schedule;
    private final @Nullable Integer startingDeadlineSeconds;
    private final @Nullable Integer successfulJobsHistoryLimit;
    private final @Nullable Boolean suspend;

    @OutputCustomType.Constructor({"concurrencyPolicy","failedJobsHistoryLimit","jobTemplate","schedule","startingDeadlineSeconds","successfulJobsHistoryLimit","suspend"})
    private CronJobSpec(
        @Nullable String concurrencyPolicy,
        @Nullable Integer failedJobsHistoryLimit,
        JobTemplateSpec jobTemplate,
        String schedule,
        @Nullable Integer startingDeadlineSeconds,
        @Nullable Integer successfulJobsHistoryLimit,
        @Nullable Boolean suspend) {
        this.concurrencyPolicy = concurrencyPolicy;
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        this.jobTemplate = Objects.requireNonNull(jobTemplate);
        this.schedule = Objects.requireNonNull(schedule);
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        this.suspend = suspend;
    }

    public Optional<String> getConcurrencyPolicy() {
        return Optional.ofNullable(this.concurrencyPolicy);
    }
    public Optional<Integer> getFailedJobsHistoryLimit() {
        return Optional.ofNullable(this.failedJobsHistoryLimit);
    }
    public JobTemplateSpec getJobTemplate() {
        return this.jobTemplate;
    }
    public String getSchedule() {
        return this.schedule;
    }
    public Optional<Integer> getStartingDeadlineSeconds() {
        return Optional.ofNullable(this.startingDeadlineSeconds);
    }
    public Optional<Integer> getSuccessfulJobsHistoryLimit() {
        return Optional.ofNullable(this.successfulJobsHistoryLimit);
    }
    public Optional<Boolean> getSuspend() {
        return Optional.ofNullable(this.suspend);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String concurrencyPolicy;
        private @Nullable Integer failedJobsHistoryLimit;
        private JobTemplateSpec jobTemplate;
        private String schedule;
        private @Nullable Integer startingDeadlineSeconds;
        private @Nullable Integer successfulJobsHistoryLimit;
        private @Nullable Boolean suspend;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyPolicy = defaults.concurrencyPolicy;
    	      this.failedJobsHistoryLimit = defaults.failedJobsHistoryLimit;
    	      this.jobTemplate = defaults.jobTemplate;
    	      this.schedule = defaults.schedule;
    	      this.startingDeadlineSeconds = defaults.startingDeadlineSeconds;
    	      this.successfulJobsHistoryLimit = defaults.successfulJobsHistoryLimit;
    	      this.suspend = defaults.suspend;
        }

        public Builder setConcurrencyPolicy(@Nullable String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        public Builder setFailedJobsHistoryLimit(@Nullable Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        public Builder setJobTemplate(JobTemplateSpec jobTemplate) {
            this.jobTemplate = Objects.requireNonNull(jobTemplate);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setStartingDeadlineSeconds(@Nullable Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        public Builder setSuccessfulJobsHistoryLimit(@Nullable Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        public Builder setSuspend(@Nullable Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        public CronJobSpec build() {
            return new CronJobSpec(concurrencyPolicy, failedJobsHistoryLimit, jobTemplate, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend);
        }
    }
}
