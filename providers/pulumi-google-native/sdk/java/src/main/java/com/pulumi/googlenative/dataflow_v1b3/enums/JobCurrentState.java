// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current state of the job. Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified. A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job has reached a terminal state, no further state updates may be made. This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    @EnumType
    public enum JobCurrentState {
        /**
         * The job&#39;s run state isn&#39;t specified.
         * 
         */
        JobStateUnknown("JOB_STATE_UNKNOWN"),
        /**
         * `JOB_STATE_STOPPED` indicates that the job has not yet started to run.
         * 
         */
        JobStateStopped("JOB_STATE_STOPPED"),
        /**
         * `JOB_STATE_RUNNING` indicates that the job is currently running.
         * 
         */
        JobStateRunning("JOB_STATE_RUNNING"),
        /**
         * `JOB_STATE_DONE` indicates that the job has successfully completed. This is a terminal job state. This state may be set by the Cloud Dataflow service, as a transition from `JOB_STATE_RUNNING`. It may also be set via a Cloud Dataflow `UpdateJob` call, if the job has not yet reached a terminal state.
         * 
         */
        JobStateDone("JOB_STATE_DONE"),
        /**
         * `JOB_STATE_FAILED` indicates that the job has failed. This is a terminal job state. This state may only be set by the Cloud Dataflow service, and only as a transition from `JOB_STATE_RUNNING`.
         * 
         */
        JobStateFailed("JOB_STATE_FAILED"),
        /**
         * `JOB_STATE_CANCELLED` indicates that the job has been explicitly cancelled. This is a terminal job state. This state may only be set via a Cloud Dataflow `UpdateJob` call, and only if the job has not yet reached another terminal state.
         * 
         */
        JobStateCancelled("JOB_STATE_CANCELLED"),
        /**
         * `JOB_STATE_UPDATED` indicates that the job was successfully updated, meaning that this job was stopped and another job was started, inheriting state from this one. This is a terminal job state. This state may only be set by the Cloud Dataflow service, and only as a transition from `JOB_STATE_RUNNING`.
         * 
         */
        JobStateUpdated("JOB_STATE_UPDATED"),
        /**
         * `JOB_STATE_DRAINING` indicates that the job is in the process of draining. A draining job has stopped pulling from its input sources and is processing any data that remains in-flight. This state may be set via a Cloud Dataflow `UpdateJob` call, but only as a transition from `JOB_STATE_RUNNING`. Jobs that are draining may only transition to `JOB_STATE_DRAINED`, `JOB_STATE_CANCELLED`, or `JOB_STATE_FAILED`.
         * 
         */
        JobStateDraining("JOB_STATE_DRAINING"),
        /**
         * `JOB_STATE_DRAINED` indicates that the job has been drained. A drained job terminated by stopping pulling from its input sources and processing any data that remained in-flight when draining was requested. This state is a terminal state, may only be set by the Cloud Dataflow service, and only as a transition from `JOB_STATE_DRAINING`.
         * 
         */
        JobStateDrained("JOB_STATE_DRAINED"),
        /**
         * `JOB_STATE_PENDING` indicates that the job has been created but is not yet running. Jobs that are pending may only transition to `JOB_STATE_RUNNING`, or `JOB_STATE_FAILED`.
         * 
         */
        JobStatePending("JOB_STATE_PENDING"),
        /**
         * `JOB_STATE_CANCELLING` indicates that the job has been explicitly cancelled and is in the process of stopping. Jobs that are cancelling may only transition to `JOB_STATE_CANCELLED` or `JOB_STATE_FAILED`.
         * 
         */
        JobStateCancelling("JOB_STATE_CANCELLING"),
        /**
         * `JOB_STATE_QUEUED` indicates that the job has been created but is being delayed until launch. Jobs that are queued may only transition to `JOB_STATE_PENDING` or `JOB_STATE_CANCELLED`.
         * 
         */
        JobStateQueued("JOB_STATE_QUEUED"),
        /**
         * `JOB_STATE_RESOURCE_CLEANING_UP` indicates that the batch job&#39;s associated resources are currently being cleaned up after a successful run. Currently, this is an opt-in feature, please reach out to Cloud support team if you are interested.
         * 
         */
        JobStateResourceCleaningUp("JOB_STATE_RESOURCE_CLEANING_UP");

        private final String value;

        JobCurrentState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobCurrentState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
