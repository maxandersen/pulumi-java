// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.storage.enums.EnabledProtocols;
import com.pulumi.azurenative.storage.enums.RootSquashType;
import com.pulumi.azurenative.storage.enums.ShareAccessTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileShareArgs Empty = new FileShareArgs();

    /**
     * Access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     */
    @Import(name="accessTier")
    private @Nullable Output<Either<String,ShareAccessTier>> accessTier;

    public Optional<Output<Either<String,ShareAccessTier>>> accessTier() {
        return Optional.ofNullable(this.accessTier);
    }

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The authentication protocol that is used for the file share. Can only be specified when creating a share.
     * 
     */
    @Import(name="enabledProtocols")
    private @Nullable Output<Either<String,EnabledProtocols>> enabledProtocols;

    public Optional<Output<Either<String,EnabledProtocols>>> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    /**
     * Optional, used to create a snapshot.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * A name-value pair to associate with the share as metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The property is for NFS share only. The default is NoRootSquash.
     * 
     */
    @Import(name="rootSquash")
    private @Nullable Output<Either<String,RootSquashType>> rootSquash;

    public Optional<Output<Either<String,RootSquashType>>> rootSquash() {
        return Optional.ofNullable(this.rootSquash);
    }

    /**
     * The name of the file share within the specified storage account. File share names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * The maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     */
    @Import(name="shareQuota")
    private @Nullable Output<Integer> shareQuota;

    public Optional<Output<Integer>> shareQuota() {
        return Optional.ofNullable(this.shareQuota);
    }

    private FileShareArgs() {}

    private FileShareArgs(FileShareArgs $) {
        this.accessTier = $.accessTier;
        this.accountName = $.accountName;
        this.enabledProtocols = $.enabledProtocols;
        this.expand = $.expand;
        this.metadata = $.metadata;
        this.resourceGroupName = $.resourceGroupName;
        this.rootSquash = $.rootSquash;
        this.shareName = $.shareName;
        this.shareQuota = $.shareQuota;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileShareArgs $;

        public Builder() {
            $ = new FileShareArgs();
        }

        public Builder(FileShareArgs defaults) {
            $ = new FileShareArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessTier(@Nullable Output<Either<String,ShareAccessTier>> accessTier) {
            $.accessTier = accessTier;
            return this;
        }

        public Builder accessTier(Either<String,ShareAccessTier> accessTier) {
            return accessTier(Output.of(accessTier));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder enabledProtocols(@Nullable Output<Either<String,EnabledProtocols>> enabledProtocols) {
            $.enabledProtocols = enabledProtocols;
            return this;
        }

        public Builder enabledProtocols(Either<String,EnabledProtocols> enabledProtocols) {
            return enabledProtocols(Output.of(enabledProtocols));
        }

        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder rootSquash(@Nullable Output<Either<String,RootSquashType>> rootSquash) {
            $.rootSquash = rootSquash;
            return this;
        }

        public Builder rootSquash(Either<String,RootSquashType> rootSquash) {
            return rootSquash(Output.of(rootSquash));
        }

        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public Builder shareQuota(@Nullable Output<Integer> shareQuota) {
            $.shareQuota = shareQuota;
            return this;
        }

        public Builder shareQuota(Integer shareQuota) {
            return shareQuota(Output.of(shareQuota));
        }

        public FileShareArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
