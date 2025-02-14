// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @EnumType
    public enum LoggingDefaultLogLevel {
        Error("ERROR"),
        Warn("WARN"),
        Info("INFO"),
        Debug("DEBUG"),
        Disabled("DISABLED");

        private final String value;

        LoggingDefaultLogLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggingDefaultLogLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
