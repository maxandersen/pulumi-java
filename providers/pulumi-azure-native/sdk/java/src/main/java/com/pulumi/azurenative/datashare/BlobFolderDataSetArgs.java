// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlobFolderDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobFolderDataSetArgs Empty = new BlobFolderDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Container that has the file path.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
    private @Nullable Output<String> dataSetName;

    public Optional<Output<String>> dataSetName() {
        return Optional.ofNullable(this.dataSetName);
    }

    /**
     * Kind of data set.
     * Expected value is &#39;BlobFolder&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Prefix for blob folder
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     * Resource group of storage account
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * Storage account name of the source data set
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private BlobFolderDataSetArgs() {}

    private BlobFolderDataSetArgs(BlobFolderDataSetArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.dataSetName = $.dataSetName;
        this.kind = $.kind;
        this.prefix = $.prefix;
        this.resourceGroup = $.resourceGroup;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.storageAccountName = $.storageAccountName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobFolderDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobFolderDataSetArgs $;

        public Builder() {
            $ = new BlobFolderDataSetArgs();
        }

        public Builder(BlobFolderDataSetArgs defaults) {
            $ = new BlobFolderDataSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        public Builder dataSetName(String dataSetName) {
            return dataSetName(Output.of(dataSetName));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public BlobFolderDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
