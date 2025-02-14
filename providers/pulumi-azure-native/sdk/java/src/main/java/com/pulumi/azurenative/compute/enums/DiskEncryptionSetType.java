// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    @EnumType
    public enum DiskEncryptionSetType {
        /**
         * Resource using diskEncryptionSet would be encrypted at rest with Customer managed key that can be changed and revoked by a customer.
         * 
         */
        EncryptionAtRestWithCustomerKey("EncryptionAtRestWithCustomerKey"),
        /**
         * Resource using diskEncryptionSet would be encrypted at rest with two layers of encryption. One of the keys is Customer managed and the other key is Platform managed.
         * 
         */
        EncryptionAtRestWithPlatformAndCustomerKeys("EncryptionAtRestWithPlatformAndCustomerKeys");

        private final String value;

        DiskEncryptionSetType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskEncryptionSetType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
