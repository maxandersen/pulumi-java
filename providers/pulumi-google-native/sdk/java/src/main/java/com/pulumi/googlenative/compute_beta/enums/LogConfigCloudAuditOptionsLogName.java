// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @EnumType
    public enum LogConfigCloudAuditOptionsLogName {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        AdminActivity("ADMIN_ACTIVITY"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        DataAccess("DATA_ACCESS"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        UnspecifiedLogName("UNSPECIFIED_LOG_NAME");

        private final String value;

        LogConfigCloudAuditOptionsLogName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LogConfigCloudAuditOptionsLogName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
