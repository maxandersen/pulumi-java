// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureBlobFileSystemConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobFileSystemConfigurationArgs Empty = new AzureBlobFileSystemConfigurationArgs();

    /**
     * This property is mutually exclusive with sasKey and one must be specified.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="blobfuseOptions")
    private @Nullable Output<String> blobfuseOptions;

    public Optional<Output<String>> blobfuseOptions() {
        return Optional.ofNullable(this.blobfuseOptions);
    }

    @Import(name="containerName", required=true)
    private Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private Output<String> relativeMountPath;

    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * This property is mutually exclusive with accountKey and one must be specified.
     * 
     */
    @Import(name="sasKey")
    private @Nullable Output<String> sasKey;

    public Optional<Output<String>> sasKey() {
        return Optional.ofNullable(this.sasKey);
    }

    private AzureBlobFileSystemConfigurationArgs() {}

    private AzureBlobFileSystemConfigurationArgs(AzureBlobFileSystemConfigurationArgs $) {
        this.accountKey = $.accountKey;
        this.accountName = $.accountName;
        this.blobfuseOptions = $.blobfuseOptions;
        this.containerName = $.containerName;
        this.relativeMountPath = $.relativeMountPath;
        this.sasKey = $.sasKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobFileSystemConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobFileSystemConfigurationArgs $;

        public Builder() {
            $ = new AzureBlobFileSystemConfigurationArgs();
        }

        public Builder(AzureBlobFileSystemConfigurationArgs defaults) {
            $ = new AzureBlobFileSystemConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder blobfuseOptions(@Nullable Output<String> blobfuseOptions) {
            $.blobfuseOptions = blobfuseOptions;
            return this;
        }

        public Builder blobfuseOptions(String blobfuseOptions) {
            return blobfuseOptions(Output.of(blobfuseOptions));
        }

        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder relativeMountPath(Output<String> relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        public Builder relativeMountPath(String relativeMountPath) {
            return relativeMountPath(Output.of(relativeMountPath));
        }

        public Builder sasKey(@Nullable Output<String> sasKey) {
            $.sasKey = sasKey;
            return this;
        }

        public Builder sasKey(String sasKey) {
            return sasKey(Output.of(sasKey));
        }

        public AzureBlobFileSystemConfigurationArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.relativeMountPath = Objects.requireNonNull($.relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
            return $;
        }
    }

}
