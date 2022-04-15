// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rate limits. This message determines the maximum rate that tasks can be dispatched by a queue, regardless of whether the dispatch is a first task attempt or a retry. Note: The debugging command, RunTask, will run a task even if the queue has reached its RateLimits.
 * 
 */
public final class RateLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RateLimitsArgs Empty = new RateLimitsArgs();

    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. The default value of `max_burst_size` is picked by Cloud Tasks based on the value of max_dispatches_per_second. The maximum value of `max_burst_size` is 500. For App Engine queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). If UpdateQueue is called on a queue without explicitly setting a value for `max_burst_size`, `max_burst_size` value will get updated if UpdateQueue is updating max_dispatches_per_second.
     * 
     */
    @Import(name="maxBurstSize")
      private final @Nullable Output<Integer> maxBurstSize;

    public Output<Integer> maxBurstSize() {
        return this.maxBurstSize == null ? Codegen.empty() : this.maxBurstSize;
    }

    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field is output only for pull queues and always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    @Import(name="maxConcurrentTasks")
      private final @Nullable Output<Integer> maxConcurrentTasks;

    public Output<Integer> maxConcurrentTasks() {
        return this.maxConcurrentTasks == null ? Codegen.empty() : this.maxConcurrentTasks;
    }

    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed value is 500. * This field is output only for pull queues. In addition to the `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed per pull queue. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    @Import(name="maxTasksDispatchedPerSecond")
      private final @Nullable Output<Double> maxTasksDispatchedPerSecond;

    public Output<Double> maxTasksDispatchedPerSecond() {
        return this.maxTasksDispatchedPerSecond == null ? Codegen.empty() : this.maxTasksDispatchedPerSecond;
    }

    public RateLimitsArgs(
        @Nullable Output<Integer> maxBurstSize,
        @Nullable Output<Integer> maxConcurrentTasks,
        @Nullable Output<Double> maxTasksDispatchedPerSecond) {
        this.maxBurstSize = maxBurstSize;
        this.maxConcurrentTasks = maxConcurrentTasks;
        this.maxTasksDispatchedPerSecond = maxTasksDispatchedPerSecond;
    }

    private RateLimitsArgs() {
        this.maxBurstSize = Codegen.empty();
        this.maxConcurrentTasks = Codegen.empty();
        this.maxTasksDispatchedPerSecond = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxBurstSize;
        private @Nullable Output<Integer> maxConcurrentTasks;
        private @Nullable Output<Double> maxTasksDispatchedPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentTasks = defaults.maxConcurrentTasks;
    	      this.maxTasksDispatchedPerSecond = defaults.maxTasksDispatchedPerSecond;
        }

        public Builder maxBurstSize(@Nullable Output<Integer> maxBurstSize) {
            this.maxBurstSize = maxBurstSize;
            return this;
        }
        public Builder maxBurstSize(@Nullable Integer maxBurstSize) {
            this.maxBurstSize = Codegen.ofNullable(maxBurstSize);
            return this;
        }
        public Builder maxConcurrentTasks(@Nullable Output<Integer> maxConcurrentTasks) {
            this.maxConcurrentTasks = maxConcurrentTasks;
            return this;
        }
        public Builder maxConcurrentTasks(@Nullable Integer maxConcurrentTasks) {
            this.maxConcurrentTasks = Codegen.ofNullable(maxConcurrentTasks);
            return this;
        }
        public Builder maxTasksDispatchedPerSecond(@Nullable Output<Double> maxTasksDispatchedPerSecond) {
            this.maxTasksDispatchedPerSecond = maxTasksDispatchedPerSecond;
            return this;
        }
        public Builder maxTasksDispatchedPerSecond(@Nullable Double maxTasksDispatchedPerSecond) {
            this.maxTasksDispatchedPerSecond = Codegen.ofNullable(maxTasksDispatchedPerSecond);
            return this;
        }        public RateLimitsArgs build() {
            return new RateLimitsArgs(maxBurstSize, maxConcurrentTasks, maxTasksDispatchedPerSecond);
        }
    }
}
