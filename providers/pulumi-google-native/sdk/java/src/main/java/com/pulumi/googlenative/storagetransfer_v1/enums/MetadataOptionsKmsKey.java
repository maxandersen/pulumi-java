// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how each object&#39;s Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @EnumType
    public enum MetadataOptionsKmsKey {
        /**
         * KmsKey behavior is unspecified.
         * 
         */
        KmsKeyUnspecified("KMS_KEY_UNSPECIFIED"),
        /**
         * Use the destination bucket&#39;s default encryption settings.
         * 
         */
        KmsKeyDestinationBucketDefault("KMS_KEY_DESTINATION_BUCKET_DEFAULT"),
        /**
         * Preserve the object&#39;s original Cloud KMS customer-managed encryption key (CMEK) if present. Objects that do not use a Cloud KMS encryption key will be encrypted using the destination bucket&#39;s encryption settings.
         * 
         */
        KmsKeyPreserve("KMS_KEY_PRESERVE");

        private final String value;

        MetadataOptionsKmsKey(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsKmsKey[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
