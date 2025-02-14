// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    @EnumType
    public enum LocationSMBMountOptionsVersion {
        Automatic("AUTOMATIC"),
        Smb2("SMB2"),
        Smb3("SMB3");

        private final String value;

        LocationSMBMountOptionsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LocationSMBMountOptionsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
