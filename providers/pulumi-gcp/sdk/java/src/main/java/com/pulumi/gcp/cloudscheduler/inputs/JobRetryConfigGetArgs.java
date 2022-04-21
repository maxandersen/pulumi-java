// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRetryConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobRetryConfigGetArgs Empty = new JobRetryConfigGetArgs();

    /**
     * The maximum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * 
     */
    @Import(name="maxBackoffDuration")
    private @Nullable Output<String> maxBackoffDuration;

    public Optional<Output<String>> maxBackoffDuration() {
        return Optional.ofNullable(this.maxBackoffDuration);
    }

    /**
     * The time between retries will double maxDoublings times.
     * A job&#39;s retry interval starts at minBackoffDuration,
     * then doubles maxDoublings times, then increases linearly,
     * and finally retries retries at intervals of maxBackoffDuration up to retryCount times.
     * 
     */
    @Import(name="maxDoublings")
    private @Nullable Output<Integer> maxDoublings;

    public Optional<Output<Integer>> maxDoublings() {
        return Optional.ofNullable(this.maxDoublings);
    }

    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted.
     * If specified with retryCount, the job will be retried until both limits are reached.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * 
     */
    @Import(name="maxRetryDuration")
    private @Nullable Output<String> maxRetryDuration;

    public Optional<Output<String>> maxRetryDuration() {
        return Optional.ofNullable(this.maxRetryDuration);
    }

    /**
     * The minimum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * 
     */
    @Import(name="minBackoffDuration")
    private @Nullable Output<String> minBackoffDuration;

    public Optional<Output<String>> minBackoffDuration() {
        return Optional.ofNullable(this.minBackoffDuration);
    }

    /**
     * The number of attempts that the system will make to run a
     * job using the exponential backoff procedure described by maxDoublings.
     * Values greater than 5 and negative values are not allowed.
     * 
     */
    @Import(name="retryCount")
    private @Nullable Output<Integer> retryCount;

    public Optional<Output<Integer>> retryCount() {
        return Optional.ofNullable(this.retryCount);
    }

    private JobRetryConfigGetArgs() {}

    private JobRetryConfigGetArgs(JobRetryConfigGetArgs $) {
        this.maxBackoffDuration = $.maxBackoffDuration;
        this.maxDoublings = $.maxDoublings;
        this.maxRetryDuration = $.maxRetryDuration;
        this.minBackoffDuration = $.minBackoffDuration;
        this.retryCount = $.retryCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobRetryConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobRetryConfigGetArgs $;

        public Builder() {
            $ = new JobRetryConfigGetArgs();
        }

        public Builder(JobRetryConfigGetArgs defaults) {
            $ = new JobRetryConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxBackoffDuration(@Nullable Output<String> maxBackoffDuration) {
            $.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        public Builder maxBackoffDuration(String maxBackoffDuration) {
            return maxBackoffDuration(Output.of(maxBackoffDuration));
        }

        public Builder maxDoublings(@Nullable Output<Integer> maxDoublings) {
            $.maxDoublings = maxDoublings;
            return this;
        }

        public Builder maxDoublings(Integer maxDoublings) {
            return maxDoublings(Output.of(maxDoublings));
        }

        public Builder maxRetryDuration(@Nullable Output<String> maxRetryDuration) {
            $.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder maxRetryDuration(String maxRetryDuration) {
            return maxRetryDuration(Output.of(maxRetryDuration));
        }

        public Builder minBackoffDuration(@Nullable Output<String> minBackoffDuration) {
            $.minBackoffDuration = minBackoffDuration;
            return this;
        }

        public Builder minBackoffDuration(String minBackoffDuration) {
            return minBackoffDuration(Output.of(minBackoffDuration));
        }

        public Builder retryCount(@Nullable Output<Integer> retryCount) {
            $.retryCount = retryCount;
            return this;
        }

        public Builder retryCount(Integer retryCount) {
            return retryCount(Output.of(retryCount));
        }

        public JobRetryConfigGetArgs build() {
            return $;
        }
    }

}
