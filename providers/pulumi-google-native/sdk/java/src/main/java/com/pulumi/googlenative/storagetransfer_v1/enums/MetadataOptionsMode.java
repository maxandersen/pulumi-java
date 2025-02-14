// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how each file&#39;s mode attribute should be handled by the transfer. By default, mode is not preserved. Only applicable to transfers involving POSIX file systems, and ignored for other transfers.
     * 
     */
    @EnumType
    public enum MetadataOptionsMode {
        /**
         * Mode behavior is unspecified.
         * 
         */
        ModeUnspecified("MODE_UNSPECIFIED"),
        /**
         * Do not preserve mode during a transfer job.
         * 
         */
        ModeSkip("MODE_SKIP"),
        /**
         * Preserve mode during a transfer job.
         * 
         */
        ModePreserve("MODE_PRESERVE");

        private final String value;

        MetadataOptionsMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
