// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScheduleResult {
    /**
     * Schedule cron
     * 
     */
    private final @Nullable String cronExpression;
    private final @Nullable List<String> jobNames;

    @CustomType.Constructor
    private GetScheduleResult(
        @CustomType.Parameter("cronExpression") @Nullable String cronExpression,
        @CustomType.Parameter("jobNames") @Nullable List<String> jobNames) {
        this.cronExpression = cronExpression;
        this.jobNames = jobNames;
    }

    /**
     * Schedule cron
     * 
    */
    public Optional<String> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }
    public List<String> jobNames() {
        return this.jobNames == null ? List.of() : this.jobNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cronExpression;
        private @Nullable List<String> jobNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpression = defaults.cronExpression;
    	      this.jobNames = defaults.jobNames;
        }

        public Builder cronExpression(@Nullable String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public Builder jobNames(@Nullable List<String> jobNames) {
            this.jobNames = jobNames;
            return this;
        }
        public Builder jobNames(String... jobNames) {
            return jobNames(List.of(jobNames));
        }        public GetScheduleResult build() {
            return new GetScheduleResult(cronExpression, jobNames);
        }
    }
}
