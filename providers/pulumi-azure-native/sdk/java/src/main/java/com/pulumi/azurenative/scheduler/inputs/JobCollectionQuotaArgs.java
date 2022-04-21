// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.inputs.JobMaxRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobCollectionQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobCollectionQuotaArgs Empty = new JobCollectionQuotaArgs();

    /**
     * Gets or set the maximum job count.
     * 
     */
    @Import(name="maxJobCount")
    private @Nullable Output<Integer> maxJobCount;

    public Optional<Output<Integer>> maxJobCount() {
        return Optional.ofNullable(this.maxJobCount);
    }

    /**
     * Gets or sets the maximum job occurrence.
     * 
     */
    @Import(name="maxJobOccurrence")
    private @Nullable Output<Integer> maxJobOccurrence;

    public Optional<Output<Integer>> maxJobOccurrence() {
        return Optional.ofNullable(this.maxJobOccurrence);
    }

    /**
     * Gets or set the maximum recurrence.
     * 
     */
    @Import(name="maxRecurrence")
    private @Nullable Output<JobMaxRecurrenceArgs> maxRecurrence;

    public Optional<Output<JobMaxRecurrenceArgs>> maxRecurrence() {
        return Optional.ofNullable(this.maxRecurrence);
    }

    private JobCollectionQuotaArgs() {}

    private JobCollectionQuotaArgs(JobCollectionQuotaArgs $) {
        this.maxJobCount = $.maxJobCount;
        this.maxJobOccurrence = $.maxJobOccurrence;
        this.maxRecurrence = $.maxRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobCollectionQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobCollectionQuotaArgs $;

        public Builder() {
            $ = new JobCollectionQuotaArgs();
        }

        public Builder(JobCollectionQuotaArgs defaults) {
            $ = new JobCollectionQuotaArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxJobCount(@Nullable Output<Integer> maxJobCount) {
            $.maxJobCount = maxJobCount;
            return this;
        }

        public Builder maxJobCount(Integer maxJobCount) {
            return maxJobCount(Output.of(maxJobCount));
        }

        public Builder maxJobOccurrence(@Nullable Output<Integer> maxJobOccurrence) {
            $.maxJobOccurrence = maxJobOccurrence;
            return this;
        }

        public Builder maxJobOccurrence(Integer maxJobOccurrence) {
            return maxJobOccurrence(Output.of(maxJobOccurrence));
        }

        public Builder maxRecurrence(@Nullable Output<JobMaxRecurrenceArgs> maxRecurrence) {
            $.maxRecurrence = maxRecurrence;
            return this;
        }

        public Builder maxRecurrence(JobMaxRecurrenceArgs maxRecurrence) {
            return maxRecurrence(Output.of(maxRecurrence));
        }

        public JobCollectionQuotaArgs build() {
            return $;
        }
    }

}
