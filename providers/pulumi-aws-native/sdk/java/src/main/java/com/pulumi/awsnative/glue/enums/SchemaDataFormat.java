// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Data format name to use for the schema. Accepted values: &#39;AVRO&#39;, &#39;JSON&#39;, &#39;PROTOBUF&#39;
     * 
     */
    @EnumType
    public enum SchemaDataFormat {
        Avro("AVRO"),
        Json("JSON"),
        Protobuf("PROTOBUF");

        private final String value;

        SchemaDataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchemaDataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
