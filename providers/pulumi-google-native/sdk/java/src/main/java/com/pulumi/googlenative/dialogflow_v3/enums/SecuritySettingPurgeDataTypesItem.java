// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SecuritySettingPurgeDataTypesItem {
        /**
         * Unspecified. Do not use.
         * 
         */
        PurgeDataTypeUnspecified("PURGE_DATA_TYPE_UNSPECIFIED"),
        /**
         * Dialogflow history. This does not include Cloud logging, which is owned by the user - not Dialogflow.
         * 
         */
        DialogflowHistory("DIALOGFLOW_HISTORY");

        private final String value;

        SecuritySettingPurgeDataTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecuritySettingPurgeDataTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
