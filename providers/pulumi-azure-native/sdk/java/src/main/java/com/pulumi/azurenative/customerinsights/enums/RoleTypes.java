// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of roles.
     * 
     */
    @EnumType
    public enum RoleTypes {
        Admin("Admin"),
        Reader("Reader"),
        ManageAdmin("ManageAdmin"),
        ManageReader("ManageReader"),
        DataAdmin("DataAdmin"),
        DataReader("DataReader");

        private final String value;

        RoleTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RoleTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
