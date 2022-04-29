// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.DiskCreateOption;
import com.pulumi.azurenative.compute.inputs.ImageDiskReferenceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data used when creating a disk.
 * 
 */
public final class CreationDataArgs extends ResourceArgs {

    public static final CreationDataArgs Empty = new CreationDataArgs();

    /**
     * This enumerates the possible sources of a disk&#39;s creation.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<Either<String,DiskCreateOption>> createOption;

    /**
     * @return This enumerates the possible sources of a disk&#39;s creation.
     * 
     */
    public Output<Either<String,DiskCreateOption>> createOption() {
        return this.createOption;
    }

    /**
     * Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    @Import(name="galleryImageReference")
    private @Nullable Output<ImageDiskReferenceArgs> galleryImageReference;

    /**
     * @return Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    public Optional<Output<ImageDiskReferenceArgs>> galleryImageReference() {
        return Optional.ofNullable(this.galleryImageReference);
    }

    /**
     * Disk source information.
     * 
     */
    @Import(name="imageReference")
    private @Nullable Output<ImageDiskReferenceArgs> imageReference;

    /**
     * @return Disk source information.
     * 
     */
    public Optional<Output<ImageDiskReferenceArgs>> imageReference() {
        return Optional.ofNullable(this.imageReference);
    }

    /**
     * Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    @Import(name="logicalSectorSize")
    private @Nullable Output<Integer> logicalSectorSize;

    /**
     * @return Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    public Optional<Output<Integer>> logicalSectorSize() {
        return Optional.ofNullable(this.logicalSectorSize);
    }

    /**
     * If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable Output<String> sourceResourceId;

    /**
     * @return If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    public Optional<Output<String>> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    @Import(name="sourceUri")
    private @Nullable Output<String> sourceUri;

    /**
     * @return If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    public Optional<Output<String>> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    /**
     * Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    @Import(name="uploadSizeBytes")
    private @Nullable Output<Double> uploadSizeBytes;

    /**
     * @return If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    public Optional<Output<Double>> uploadSizeBytes() {
        return Optional.ofNullable(this.uploadSizeBytes);
    }

    private CreationDataArgs() {}

    private CreationDataArgs(CreationDataArgs $) {
        this.createOption = $.createOption;
        this.galleryImageReference = $.galleryImageReference;
        this.imageReference = $.imageReference;
        this.logicalSectorSize = $.logicalSectorSize;
        this.sourceResourceId = $.sourceResourceId;
        this.sourceUri = $.sourceUri;
        this.storageAccountId = $.storageAccountId;
        this.uploadSizeBytes = $.uploadSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreationDataArgs $;

        public Builder() {
            $ = new CreationDataArgs();
        }

        public Builder(CreationDataArgs defaults) {
            $ = new CreationDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createOption This enumerates the possible sources of a disk&#39;s creation.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<Either<String,DiskCreateOption>> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption This enumerates the possible sources of a disk&#39;s creation.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Either<String,DiskCreateOption> createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param createOption This enumerates the possible sources of a disk&#39;s creation.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Either.ofLeft(createOption));
        }

        /**
         * @param createOption This enumerates the possible sources of a disk&#39;s creation.
         * 
         * @return builder
         * 
         */
        public Builder createOption(DiskCreateOption createOption) {
            return createOption(Either.ofRight(createOption));
        }

        /**
         * @param galleryImageReference Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageReference(@Nullable Output<ImageDiskReferenceArgs> galleryImageReference) {
            $.galleryImageReference = galleryImageReference;
            return this;
        }

        /**
         * @param galleryImageReference Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageReference(ImageDiskReferenceArgs galleryImageReference) {
            return galleryImageReference(Output.of(galleryImageReference));
        }

        /**
         * @param imageReference Disk source information.
         * 
         * @return builder
         * 
         */
        public Builder imageReference(@Nullable Output<ImageDiskReferenceArgs> imageReference) {
            $.imageReference = imageReference;
            return this;
        }

        /**
         * @param imageReference Disk source information.
         * 
         * @return builder
         * 
         */
        public Builder imageReference(ImageDiskReferenceArgs imageReference) {
            return imageReference(Output.of(imageReference));
        }

        /**
         * @param logicalSectorSize Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
         * 
         * @return builder
         * 
         */
        public Builder logicalSectorSize(@Nullable Output<Integer> logicalSectorSize) {
            $.logicalSectorSize = logicalSectorSize;
            return this;
        }

        /**
         * @param logicalSectorSize Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
         * 
         * @return builder
         * 
         */
        public Builder logicalSectorSize(Integer logicalSectorSize) {
            return logicalSectorSize(Output.of(logicalSectorSize));
        }

        /**
         * @param sourceResourceId If createOption is Copy, this is the ARM id of the source snapshot or disk.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param sourceResourceId If createOption is Copy, this is the ARM id of the source snapshot or disk.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(String sourceResourceId) {
            return sourceResourceId(Output.of(sourceResourceId));
        }

        /**
         * @param sourceUri If createOption is Import, this is the URI of a blob to be imported into a managed disk.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        /**
         * @param sourceUri If createOption is Import, this is the URI of a blob to be imported into a managed disk.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(String sourceUri) {
            return sourceUri(Output.of(sourceUri));
        }

        /**
         * @param storageAccountId Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param uploadSizeBytes If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
         * 
         * @return builder
         * 
         */
        public Builder uploadSizeBytes(@Nullable Output<Double> uploadSizeBytes) {
            $.uploadSizeBytes = uploadSizeBytes;
            return this;
        }

        /**
         * @param uploadSizeBytes If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
         * 
         * @return builder
         * 
         */
        public Builder uploadSizeBytes(Double uploadSizeBytes) {
            return uploadSizeBytes(Output.of(uploadSizeBytes));
        }

        public CreationDataArgs build() {
            $.createOption = Objects.requireNonNull($.createOption, "expected parameter 'createOption' to be non-null");
            return $;
        }
    }

}
