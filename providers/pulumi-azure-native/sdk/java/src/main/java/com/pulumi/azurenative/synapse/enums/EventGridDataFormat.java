// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @EnumType
    public enum EventGridDataFormat {
        MULTIJSON("MULTIJSON"),
        JSON("JSON"),
        CSV("CSV"),
        TSV("TSV"),
        SCSV("SCSV"),
        SOHSV("SOHSV"),
        PSV("PSV"),
        TXT("TXT"),
        RAW("RAW"),
        SINGLEJSON("SINGLEJSON"),
        AVRO("AVRO"),
        TSVE("TSVE"),
        PARQUET("PARQUET"),
        ORC("ORC"),
        APACHEAVRO("APACHEAVRO"),
        W3CLOGFILE("W3CLOGFILE");

        private final String value;

        EventGridDataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EventGridDataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
