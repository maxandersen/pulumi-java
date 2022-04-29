// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk input details.
 * 
 */
public final class InMageAzureV2DiskInputDetailsArgs extends ResourceArgs {

    public static final InMageAzureV2DiskInputDetailsArgs Empty = new InMageAzureV2DiskInputDetailsArgs();

    /**
     * The DiskEncryptionSet ARM ID.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    /**
     * @return The DiskEncryptionSet ARM ID.
     * 
     */
    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The DiskId.
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<String> diskId;

    /**
     * @return The DiskId.
     * 
     */
    public Optional<Output<String>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * The DiskType.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<Either<String,DiskAccountType>> diskType;

    /**
     * @return The DiskType.
     * 
     */
    public Optional<Output<Either<String,DiskAccountType>>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The LogStorageAccountId.
     * 
     */
    @Import(name="logStorageAccountId")
    private @Nullable Output<String> logStorageAccountId;

    /**
     * @return The LogStorageAccountId.
     * 
     */
    public Optional<Output<String>> logStorageAccountId() {
        return Optional.ofNullable(this.logStorageAccountId);
    }

    private InMageAzureV2DiskInputDetailsArgs() {}

    private InMageAzureV2DiskInputDetailsArgs(InMageAzureV2DiskInputDetailsArgs $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.diskId = $.diskId;
        this.diskType = $.diskType;
        this.logStorageAccountId = $.logStorageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageAzureV2DiskInputDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageAzureV2DiskInputDetailsArgs $;

        public Builder() {
            $ = new InMageAzureV2DiskInputDetailsArgs();
        }

        public Builder(InMageAzureV2DiskInputDetailsArgs defaults) {
            $ = new InMageAzureV2DiskInputDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionSetId The DiskEncryptionSet ARM ID.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        /**
         * @param diskEncryptionSetId The DiskEncryptionSet ARM ID.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        /**
         * @param diskId The DiskId.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId The DiskId.
         * 
         * @return builder
         * 
         */
        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param diskType The DiskType.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<Either<String,DiskAccountType>> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The DiskType.
         * 
         * @return builder
         * 
         */
        public Builder diskType(Either<String,DiskAccountType> diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param diskType The DiskType.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Either.ofLeft(diskType));
        }

        /**
         * @param diskType The DiskType.
         * 
         * @return builder
         * 
         */
        public Builder diskType(DiskAccountType diskType) {
            return diskType(Either.ofRight(diskType));
        }

        /**
         * @param logStorageAccountId The LogStorageAccountId.
         * 
         * @return builder
         * 
         */
        public Builder logStorageAccountId(@Nullable Output<String> logStorageAccountId) {
            $.logStorageAccountId = logStorageAccountId;
            return this;
        }

        /**
         * @param logStorageAccountId The LogStorageAccountId.
         * 
         * @return builder
         * 
         */
        public Builder logStorageAccountId(String logStorageAccountId) {
            return logStorageAccountId(Output.of(logStorageAccountId));
        }

        public InMageAzureV2DiskInputDetailsArgs build() {
            return $;
        }
    }

}
