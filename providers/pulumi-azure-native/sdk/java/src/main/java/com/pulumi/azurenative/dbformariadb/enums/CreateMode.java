// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode to create a new server.
     * 
     */
    @EnumType
    public enum CreateMode {
        Default("Default"),
        PointInTimeRestore("PointInTimeRestore"),
        GeoRestore("GeoRestore"),
        Replica("Replica");

        private final String value;

        CreateMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CreateMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
