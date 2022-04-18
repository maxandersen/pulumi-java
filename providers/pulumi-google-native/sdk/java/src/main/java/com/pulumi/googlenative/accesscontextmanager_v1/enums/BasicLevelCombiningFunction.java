// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    @EnumType
    public enum BasicLevelCombiningFunction {
        /**
         * All `Conditions` must be true for the `BasicLevel` to be true.
         * 
         */
        And("AND"),
        /**
         * If at least one `Condition` is true, then the `BasicLevel` is true.
         * 
         */
        Or("OR");

        private final String value;

        BasicLevelCombiningFunction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BasicLevelCombiningFunction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
