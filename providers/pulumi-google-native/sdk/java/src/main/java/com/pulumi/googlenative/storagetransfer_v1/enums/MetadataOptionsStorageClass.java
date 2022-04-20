// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @EnumType
    public enum MetadataOptionsStorageClass {
        /**
         * Storage class behavior is unspecified.
         * 
         */
        StorageClassUnspecified("STORAGE_CLASS_UNSPECIFIED"),
        /**
         * Use the destination bucket&#39;s default storage class.
         * 
         */
        StorageClassDestinationBucketDefault("STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT"),
        /**
         * Preserve the object&#39;s original storage class. This is only supported for transfers from Google Cloud Storage buckets.
         * 
         */
        StorageClassPreserve("STORAGE_CLASS_PRESERVE"),
        /**
         * Set the storage class to STANDARD.
         * 
         */
        StorageClassStandard("STORAGE_CLASS_STANDARD"),
        /**
         * Set the storage class to NEARLINE.
         * 
         */
        StorageClassNearline("STORAGE_CLASS_NEARLINE"),
        /**
         * Set the storage class to COLDLINE.
         * 
         */
        StorageClassColdline("STORAGE_CLASS_COLDLINE"),
        /**
         * Set the storage class to ARCHIVE.
         * 
         */
        StorageClassArchive("STORAGE_CLASS_ARCHIVE");

        private final String value;

        MetadataOptionsStorageClass(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsStorageClass[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
