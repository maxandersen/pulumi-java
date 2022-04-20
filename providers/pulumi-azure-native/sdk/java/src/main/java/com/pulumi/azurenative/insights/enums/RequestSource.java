// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    @EnumType
    public enum RequestSource {
        Rest("rest");

        private final String value;

        RequestSource(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RequestSource[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
