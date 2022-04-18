// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QueueStatsResponse {
    /**
     * The number of requests that the queue has dispatched but has not received a reply for yet.
     * 
     */
    private final String concurrentDispatchesCount;
    /**
     * The current maximum number of tasks per second executed by the queue. The maximum value of this variable is controlled by the RateLimits of the Queue. However, this value could be less to avoid overloading the endpoints tasks in the queue are targeting.
     * 
     */
    private final Double effectiveExecutionRate;
    /**
     * The number of tasks that the queue has dispatched and received a reply for during the last minute. This variable counts both successful and non-successful executions.
     * 
     */
    private final String executedLastMinuteCount;
    /**
     * An estimation of the nearest time in the future where a task in the queue is scheduled to be executed.
     * 
     */
    private final String oldestEstimatedArrivalTime;
    /**
     * An estimation of the number of tasks in the queue, that is, the tasks in the queue that haven't been executed, the tasks in the queue which the queue has dispatched but has not yet received a reply for, and the failed tasks that the queue is retrying.
     * 
     */
    private final String tasksCount;

    @CustomType.Constructor
    private QueueStatsResponse(
        @CustomType.Parameter("concurrentDispatchesCount") String concurrentDispatchesCount,
        @CustomType.Parameter("effectiveExecutionRate") Double effectiveExecutionRate,
        @CustomType.Parameter("executedLastMinuteCount") String executedLastMinuteCount,
        @CustomType.Parameter("oldestEstimatedArrivalTime") String oldestEstimatedArrivalTime,
        @CustomType.Parameter("tasksCount") String tasksCount) {
        this.concurrentDispatchesCount = concurrentDispatchesCount;
        this.effectiveExecutionRate = effectiveExecutionRate;
        this.executedLastMinuteCount = executedLastMinuteCount;
        this.oldestEstimatedArrivalTime = oldestEstimatedArrivalTime;
        this.tasksCount = tasksCount;
    }

    /**
     * The number of requests that the queue has dispatched but has not received a reply for yet.
     * 
    */
    public String concurrentDispatchesCount() {
        return this.concurrentDispatchesCount;
    }
    /**
     * The current maximum number of tasks per second executed by the queue. The maximum value of this variable is controlled by the RateLimits of the Queue. However, this value could be less to avoid overloading the endpoints tasks in the queue are targeting.
     * 
    */
    public Double effectiveExecutionRate() {
        return this.effectiveExecutionRate;
    }
    /**
     * The number of tasks that the queue has dispatched and received a reply for during the last minute. This variable counts both successful and non-successful executions.
     * 
    */
    public String executedLastMinuteCount() {
        return this.executedLastMinuteCount;
    }
    /**
     * An estimation of the nearest time in the future where a task in the queue is scheduled to be executed.
     * 
    */
    public String oldestEstimatedArrivalTime() {
        return this.oldestEstimatedArrivalTime;
    }
    /**
     * An estimation of the number of tasks in the queue, that is, the tasks in the queue that haven't been executed, the tasks in the queue which the queue has dispatched but has not yet received a reply for, and the failed tasks that the queue is retrying.
     * 
    */
    public String tasksCount() {
        return this.tasksCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String concurrentDispatchesCount;
        private Double effectiveExecutionRate;
        private String executedLastMinuteCount;
        private String oldestEstimatedArrivalTime;
        private String tasksCount;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentDispatchesCount = defaults.concurrentDispatchesCount;
    	      this.effectiveExecutionRate = defaults.effectiveExecutionRate;
    	      this.executedLastMinuteCount = defaults.executedLastMinuteCount;
    	      this.oldestEstimatedArrivalTime = defaults.oldestEstimatedArrivalTime;
    	      this.tasksCount = defaults.tasksCount;
        }

        public Builder concurrentDispatchesCount(String concurrentDispatchesCount) {
            this.concurrentDispatchesCount = Objects.requireNonNull(concurrentDispatchesCount);
            return this;
        }
        public Builder effectiveExecutionRate(Double effectiveExecutionRate) {
            this.effectiveExecutionRate = Objects.requireNonNull(effectiveExecutionRate);
            return this;
        }
        public Builder executedLastMinuteCount(String executedLastMinuteCount) {
            this.executedLastMinuteCount = Objects.requireNonNull(executedLastMinuteCount);
            return this;
        }
        public Builder oldestEstimatedArrivalTime(String oldestEstimatedArrivalTime) {
            this.oldestEstimatedArrivalTime = Objects.requireNonNull(oldestEstimatedArrivalTime);
            return this;
        }
        public Builder tasksCount(String tasksCount) {
            this.tasksCount = Objects.requireNonNull(tasksCount);
            return this;
        }        public QueueStatsResponse build() {
            return new QueueStatsResponse(concurrentDispatchesCount, effectiveExecutionRate, executedLastMinuteCount, oldestEstimatedArrivalTime, tasksCount);
        }
    }
}
