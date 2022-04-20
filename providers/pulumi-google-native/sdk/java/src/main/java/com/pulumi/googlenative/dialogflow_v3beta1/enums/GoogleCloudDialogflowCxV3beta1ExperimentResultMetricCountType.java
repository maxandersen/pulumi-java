// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType {
        /**
         * Count type unspecified.
         * 
         */
        CountTypeUnspecified("COUNT_TYPE_UNSPECIFIED"),
        /**
         * Total number of occurrences of a &#39;NO_MATCH&#39;.
         * 
         */
        TotalNoMatchCount("TOTAL_NO_MATCH_COUNT"),
        /**
         * Total number of turn counts.
         * 
         */
        TotalTurnCount("TOTAL_TURN_COUNT"),
        /**
         * Average turn count in a session.
         * 
         */
        AverageTurnCount("AVERAGE_TURN_COUNT");

        private final String value;

        GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
