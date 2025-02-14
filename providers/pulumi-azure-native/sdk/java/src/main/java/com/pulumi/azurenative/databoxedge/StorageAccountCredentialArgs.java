// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.AccountType;
import com.pulumi.azurenative.databoxedge.enums.SSLStatus;
import com.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageAccountCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountCredentialArgs Empty = new StorageAccountCredentialArgs();

    /**
     * Encrypted storage key.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<AsymmetricEncryptedSecretArgs> accountKey;

    /**
     * @return Encrypted storage key.
     * 
     */
    public Optional<Output<AsymmetricEncryptedSecretArgs>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * Type of storage accessed on the storage account.
     * 
     */
    @Import(name="accountType", required=true)
    private Output<Either<String,AccountType>> accountType;

    /**
     * @return Type of storage accessed on the storage account.
     * 
     */
    public Output<Either<String,AccountType>> accountType() {
        return this.accountType;
    }

    /**
     * Alias for the storage account.
     * 
     */
    @Import(name="alias", required=true)
    private Output<String> alias;

    /**
     * @return Alias for the storage account.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }

    /**
     * Blob end point for private clouds.
     * 
     */
    @Import(name="blobDomainName")
    private @Nullable Output<String> blobDomainName;

    /**
     * @return Blob end point for private clouds.
     * 
     */
    public Optional<Output<String>> blobDomainName() {
        return Optional.ofNullable(this.blobDomainName);
    }

    /**
     * Connection string for the storage account. Use this string if username and account key are not specified.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return Connection string for the storage account. Use this string if username and account key are not specified.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The storage account credential name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The storage account credential name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
     */
    @Import(name="sslStatus", required=true)
    private Output<Either<String,SSLStatus>> sslStatus;

    /**
     * @return Signifies whether SSL needs to be enabled or not.
     * 
     */
    public Output<Either<String,SSLStatus>> sslStatus() {
        return this.sslStatus;
    }

    /**
     * Id of the storage account.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return Id of the storage account.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * Username for the storage account.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Username for the storage account.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private StorageAccountCredentialArgs() {}

    private StorageAccountCredentialArgs(StorageAccountCredentialArgs $) {
        this.accountKey = $.accountKey;
        this.accountType = $.accountType;
        this.alias = $.alias;
        this.blobDomainName = $.blobDomainName;
        this.connectionString = $.connectionString;
        this.deviceName = $.deviceName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sslStatus = $.sslStatus;
        this.storageAccountId = $.storageAccountId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountCredentialArgs $;

        public Builder() {
            $ = new StorageAccountCredentialArgs();
        }

        public Builder(StorageAccountCredentialArgs defaults) {
            $ = new StorageAccountCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey Encrypted storage key.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<AsymmetricEncryptedSecretArgs> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey Encrypted storage key.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(AsymmetricEncryptedSecretArgs accountKey) {
            return accountKey(Output.of(accountKey));
        }

        /**
         * @param accountType Type of storage accessed on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accountType(Output<Either<String,AccountType>> accountType) {
            $.accountType = accountType;
            return this;
        }

        /**
         * @param accountType Type of storage accessed on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accountType(Either<String,AccountType> accountType) {
            return accountType(Output.of(accountType));
        }

        /**
         * @param accountType Type of storage accessed on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accountType(String accountType) {
            return accountType(Either.ofLeft(accountType));
        }

        /**
         * @param accountType Type of storage accessed on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accountType(AccountType accountType) {
            return accountType(Either.ofRight(accountType));
        }

        /**
         * @param alias Alias for the storage account.
         * 
         * @return builder
         * 
         */
        public Builder alias(Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Alias for the storage account.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param blobDomainName Blob end point for private clouds.
         * 
         * @return builder
         * 
         */
        public Builder blobDomainName(@Nullable Output<String> blobDomainName) {
            $.blobDomainName = blobDomainName;
            return this;
        }

        /**
         * @param blobDomainName Blob end point for private clouds.
         * 
         * @return builder
         * 
         */
        public Builder blobDomainName(String blobDomainName) {
            return blobDomainName(Output.of(blobDomainName));
        }

        /**
         * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param name The storage account credential name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The storage account credential name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sslStatus Signifies whether SSL needs to be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder sslStatus(Output<Either<String,SSLStatus>> sslStatus) {
            $.sslStatus = sslStatus;
            return this;
        }

        /**
         * @param sslStatus Signifies whether SSL needs to be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder sslStatus(Either<String,SSLStatus> sslStatus) {
            return sslStatus(Output.of(sslStatus));
        }

        /**
         * @param sslStatus Signifies whether SSL needs to be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder sslStatus(String sslStatus) {
            return sslStatus(Either.ofLeft(sslStatus));
        }

        /**
         * @param sslStatus Signifies whether SSL needs to be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder sslStatus(SSLStatus sslStatus) {
            return sslStatus(Either.ofRight(sslStatus));
        }

        /**
         * @param storageAccountId Id of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Id of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param userName Username for the storage account.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Username for the storage account.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public StorageAccountCredentialArgs build() {
            $.accountType = Objects.requireNonNull($.accountType, "expected parameter 'accountType' to be non-null");
            $.alias = Objects.requireNonNull($.alias, "expected parameter 'alias' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sslStatus = Objects.requireNonNull($.sslStatus, "expected parameter 'sslStatus' to be non-null");
            return $;
        }
    }

}
