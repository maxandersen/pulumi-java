// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    @EnumType
    public enum GuestOsFeatureType {
        FeatureTypeUnspecified("FEATURE_TYPE_UNSPECIFIED"),
        Gvnic("GVNIC"),
        MultiIpSubnet("MULTI_IP_SUBNET"),
        SecureBoot("SECURE_BOOT"),
        SevCapable("SEV_CAPABLE"),
        UefiCompatible("UEFI_COMPATIBLE"),
        VirtioScsiMultiqueue("VIRTIO_SCSI_MULTIQUEUE"),
        Windows("WINDOWS");

        private final String value;

        GuestOsFeatureType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GuestOsFeatureType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
