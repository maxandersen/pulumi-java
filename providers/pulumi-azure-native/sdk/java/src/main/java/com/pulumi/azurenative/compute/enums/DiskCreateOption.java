// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This enumerates the possible sources of a disk&#39;s creation.
     * 
     */
    @EnumType
    public enum DiskCreateOption {
        /**
         * Create an empty data disk of a size given by diskSizeGB.
         * 
         */
        Empty("Empty"),
        /**
         * Disk will be attached to a VM.
         * 
         */
        Attach("Attach"),
        /**
         * Create a new disk from a platform image specified by the given imageReference or galleryImageReference.
         * 
         */
        FromImage("FromImage"),
        /**
         * Create a disk by importing from a blob specified by a sourceUri in a storage account specified by storageAccountId.
         * 
         */
        Import("Import"),
        /**
         * Create a new disk or snapshot by copying from a disk or snapshot specified by the given sourceResourceId.
         * 
         */
        Copy("Copy"),
        /**
         * Create a new disk by copying from a backup recovery point.
         * 
         */
        Restore("Restore"),
        /**
         * Create a new disk by obtaining a write token and using it to directly upload the contents of the disk.
         * 
         */
        Upload("Upload");

        private final String value;

        DiskCreateOption(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskCreateOption[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
