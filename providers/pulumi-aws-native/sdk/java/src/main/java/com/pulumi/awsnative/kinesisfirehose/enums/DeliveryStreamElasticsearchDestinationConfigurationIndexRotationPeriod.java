// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod {
        NoRotation("NoRotation"),
        OneHour("OneHour"),
        OneDay("OneDay"),
        OneWeek("OneWeek"),
        OneMonth("OneMonth");

        private final String value;

        DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
