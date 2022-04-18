// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RegistrationContactNoticesItem {
        /**
         * The notice is undefined.
         * 
         */
        ContactNoticeUnspecified("CONTACT_NOTICE_UNSPECIFIED"),
        /**
         * Required when setting the `privacy` field of `ContactSettings` to `PUBLIC_CONTACT_DATA`, which exposes contact data publicly.
         * 
         */
        PublicContactDataAcknowledgement("PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT");

        private final String value;

        RegistrationContactNoticesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegistrationContactNoticesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
