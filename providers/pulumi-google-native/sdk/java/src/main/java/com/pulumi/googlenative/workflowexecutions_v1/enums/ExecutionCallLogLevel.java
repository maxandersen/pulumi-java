// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The call logging level associated to this execution.
     * 
     */
    @EnumType
    public enum ExecutionCallLogLevel {
        /**
         * No call logging specified.
         * 
         */
        CallLogLevelUnspecified("CALL_LOG_LEVEL_UNSPECIFIED"),
        /**
         * Log all call steps within workflows, all call returns, and all exceptions raised.
         * 
         */
        LogAllCalls("LOG_ALL_CALLS"),
        /**
         * Log only exceptions that are raised from call steps within workflows.
         * 
         */
        LogErrorsOnly("LOG_ERRORS_ONLY");

        private final String value;

        ExecutionCallLogLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExecutionCallLogLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
