// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage profile of the user settings.
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Size of file share
     * 
     */
    @Import(name="diskSizeInGB")
    private @Nullable Output<Integer> diskSizeInGB;

    public Optional<Output<Integer>> diskSizeInGB() {
        return Optional.ofNullable(this.diskSizeInGB);
    }

    /**
     * Name of the mounted file share. 63 characters or less, lowercase alphabet, numbers, and -
     * 
     */
    @Import(name="fileShareName")
    private @Nullable Output<String> fileShareName;

    public Optional<Output<String>> fileShareName() {
        return Optional.ofNullable(this.fileShareName);
    }

    /**
     * Full resource ID of storage account.
     * 
     */
    @Import(name="storageAccountResourceId")
    private @Nullable Output<String> storageAccountResourceId;

    public Optional<Output<String>> storageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.diskSizeInGB = $.diskSizeInGB;
        this.fileShareName = $.fileShareName;
        this.storageAccountResourceId = $.storageAccountResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileArgs $;

        public Builder() {
            $ = new StorageProfileArgs();
        }

        public Builder(StorageProfileArgs defaults) {
            $ = new StorageProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskSizeInGB(@Nullable Output<Integer> diskSizeInGB) {
            $.diskSizeInGB = diskSizeInGB;
            return this;
        }

        public Builder diskSizeInGB(Integer diskSizeInGB) {
            return diskSizeInGB(Output.of(diskSizeInGB));
        }

        public Builder fileShareName(@Nullable Output<String> fileShareName) {
            $.fileShareName = fileShareName;
            return this;
        }

        public Builder fileShareName(String fileShareName) {
            return fileShareName(Output.of(fileShareName));
        }

        public Builder storageAccountResourceId(@Nullable Output<String> storageAccountResourceId) {
            $.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        public Builder storageAccountResourceId(String storageAccountResourceId) {
            return storageAccountResourceId(Output.of(storageAccountResourceId));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
