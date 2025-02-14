// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * If omitted, the default value is Requeue.
     * 
     */
    @EnumType
    public enum ComputeNodeDeallocationOption {
        /**
         * Terminate running task processes and requeue the tasks. The tasks will run again when a node is available. Remove nodes as soon as tasks have been terminated.
         * 
         */
        Requeue("Requeue"),
        /**
         * Terminate running tasks. The tasks will be completed with failureInfo indicating that they were terminated, and will not run again. Remove nodes as soon as tasks have been terminated.
         * 
         */
        Terminate("Terminate"),
        /**
         * Allow currently running tasks to complete. Schedule no new tasks while waiting. Remove nodes when all tasks have completed.
         * 
         */
        TaskCompletion("TaskCompletion"),
        /**
         * Allow currently running tasks to complete, then wait for all task data retention periods to expire. Schedule no new tasks while waiting. Remove nodes when all task retention periods have expired.
         * 
         */
        RetainedData("RetainedData");

        private final String value;

        ComputeNodeDeallocationOption(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComputeNodeDeallocationOption[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
