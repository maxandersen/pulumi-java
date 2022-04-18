// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    @EnumType
    public enum EndpointsApiServiceRolloutStrategy {
        /**
         * Not specified. Defaults to FIXED.
         * 
         */
        UnspecifiedRolloutStrategy("UNSPECIFIED_ROLLOUT_STRATEGY"),
        /**
         * Endpoints service configuration ID will be fixed to the configuration ID specified by config_id.
         * 
         */
        Fixed("FIXED"),
        /**
         * Endpoints service configuration ID will be updated with each rollout.
         * 
         */
        Managed("MANAGED");

        private final String value;

        EndpointsApiServiceRolloutStrategy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointsApiServiceRolloutStrategy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
