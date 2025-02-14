// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The operation the trigger is associated with
     * 
     */
    @EnumType
    public enum TriggerOperation {
        All("All"),
        Create("Create"),
        Update("Update"),
        Delete("Delete"),
        Replace("Replace");

        private final String value;

        TriggerOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TriggerOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
