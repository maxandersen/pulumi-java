// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediatailor.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * 
     */
    @EnumType
    public enum PlaybackConfigurationDashConfigurationForPutOriginManifestType {
        SinglePeriod("SINGLE_PERIOD"),
        MultiPeriod("MULTI_PERIOD");

        private final String value;

        PlaybackConfigurationDashConfigurationForPutOriginManifestType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PlaybackConfigurationDashConfigurationForPutOriginManifestType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
