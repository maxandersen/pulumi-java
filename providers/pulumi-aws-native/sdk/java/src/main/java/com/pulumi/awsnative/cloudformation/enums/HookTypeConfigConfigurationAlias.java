// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * An alias by which to refer to this extension configuration data.
     * 
     */
    @EnumType
    public enum HookTypeConfigConfigurationAlias {
        Default("default");

        private final String value;

        HookTypeConfigConfigurationAlias(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HookTypeConfigConfigurationAlias[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
