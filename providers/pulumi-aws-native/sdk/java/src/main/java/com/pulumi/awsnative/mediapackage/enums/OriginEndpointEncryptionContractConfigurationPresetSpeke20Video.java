// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A collection of video encryption presets.
     * 
     */
    @EnumType
    public enum OriginEndpointEncryptionContractConfigurationPresetSpeke20Video {
        PresetVideo1("PRESET-VIDEO-1");

        private final String value;

        OriginEndpointEncryptionContractConfigurationPresetSpeke20Video(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OriginEndpointEncryptionContractConfigurationPresetSpeke20Video[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
