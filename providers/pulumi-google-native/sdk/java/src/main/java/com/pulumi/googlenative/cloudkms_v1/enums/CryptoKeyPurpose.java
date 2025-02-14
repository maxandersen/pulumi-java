// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The immutable purpose of this CryptoKey.
     * 
     */
    @EnumType
    public enum CryptoKeyPurpose {
        /**
         * Not specified.
         * 
         */
        CryptoKeyPurposeUnspecified("CRYPTO_KEY_PURPOSE_UNSPECIFIED"),
        /**
         * CryptoKeys with this purpose may be used with Encrypt and Decrypt.
         * 
         */
        EncryptDecrypt("ENCRYPT_DECRYPT"),
        /**
         * CryptoKeys with this purpose may be used with AsymmetricSign and GetPublicKey.
         * 
         */
        AsymmetricSign("ASYMMETRIC_SIGN"),
        /**
         * CryptoKeys with this purpose may be used with AsymmetricDecrypt and GetPublicKey.
         * 
         */
        AsymmetricDecrypt("ASYMMETRIC_DECRYPT"),
        /**
         * CryptoKeys with this purpose may be used with MacSign.
         * 
         */
        Mac("MAC");

        private final String value;

        CryptoKeyPurpose(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CryptoKeyPurpose[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
