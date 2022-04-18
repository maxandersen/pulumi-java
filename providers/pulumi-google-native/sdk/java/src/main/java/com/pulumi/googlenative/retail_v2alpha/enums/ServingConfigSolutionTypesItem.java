// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ServingConfigSolutionTypesItem {
        /**
         * Default value.
         * 
         */
        SolutionTypeUnspecified("SOLUTION_TYPE_UNSPECIFIED"),
        /**
         * Used for Recommendations AI.
         * 
         */
        SolutionTypeRecommendation("SOLUTION_TYPE_RECOMMENDATION"),
        /**
         * Used for Retail Search.
         * 
         */
        SolutionTypeSearch("SOLUTION_TYPE_SEARCH");

        private final String value;

        ServingConfigSolutionTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServingConfigSolutionTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
