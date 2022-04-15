// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ClientCredentialsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStorageSectionResponse {
    /**
     *  Storage Account Key (Deprecated).
     * 
     */
    private final @Nullable String accountKey;
    /**
     * Storage Account Name.
     * 
     */
    private final @Nullable String accountName;
    /**
     * Indicate if we are using Workspace ManagedIdentities/MSI token (Deprecated).
     * 
     */
    private final @Nullable Boolean areWorkspaceManagedIdentitiesAllowed;
    /**
     *  If this is an "DataStoreType.AzureBlob", the length of time (in seconds) to cache files locally after they are accessed (downloaded).
     * 
     */
    private final @Nullable Integer blobCacheTimeout;
    private final @Nullable ClientCredentialsResponse clientCredentials;
    /**
     * The storage container name.
     * 
     */
    private final @Nullable String containerName;
    /**
     * The credential.
     * 
     */
    private final @Nullable String credential;
    /**
     *  The credential type.
     * 
     */
    private final @Nullable String credentialType;
    /**
     * The host of the container.
     * 
     */
    private final @Nullable String endpoint;
    /**
     * Indicate if we are using SAS token or Account Key (Deprecated).
     * 
     */
    private final @Nullable Boolean isSas;
    /**
     * The protocol to use. Defaults to https.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Resource Group.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     *  SAS Token for the container (Deprecated).
     * 
     */
    private final @Nullable String sasToken;
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    private final @Nullable String serviceDataAccessAuthIdentity;
    /**
     * Subscription ID.
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private AzureStorageSectionResponse(
        @CustomType.Parameter("accountKey") @Nullable String accountKey,
        @CustomType.Parameter("accountName") @Nullable String accountName,
        @CustomType.Parameter("areWorkspaceManagedIdentitiesAllowed") @Nullable Boolean areWorkspaceManagedIdentitiesAllowed,
        @CustomType.Parameter("blobCacheTimeout") @Nullable Integer blobCacheTimeout,
        @CustomType.Parameter("clientCredentials") @Nullable ClientCredentialsResponse clientCredentials,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("credential") @Nullable String credential,
        @CustomType.Parameter("credentialType") @Nullable String credentialType,
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("isSas") @Nullable Boolean isSas,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("sasToken") @Nullable String sasToken,
        @CustomType.Parameter("serviceDataAccessAuthIdentity") @Nullable String serviceDataAccessAuthIdentity,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.areWorkspaceManagedIdentitiesAllowed = areWorkspaceManagedIdentitiesAllowed;
        this.blobCacheTimeout = blobCacheTimeout;
        this.clientCredentials = clientCredentials;
        this.containerName = containerName;
        this.credential = credential;
        this.credentialType = credentialType;
        this.endpoint = endpoint;
        this.isSas = isSas;
        this.protocol = protocol;
        this.resourceGroup = resourceGroup;
        this.sasToken = sasToken;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
    }

    /**
     *  Storage Account Key (Deprecated).
     * 
    */
    public Optional<String> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * Storage Account Name.
     * 
    */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * Indicate if we are using Workspace ManagedIdentities/MSI token (Deprecated).
     * 
    */
    public Optional<Boolean> areWorkspaceManagedIdentitiesAllowed() {
        return Optional.ofNullable(this.areWorkspaceManagedIdentitiesAllowed);
    }
    /**
     *  If this is an "DataStoreType.AzureBlob", the length of time (in seconds) to cache files locally after they are accessed (downloaded).
     * 
    */
    public Optional<Integer> blobCacheTimeout() {
        return Optional.ofNullable(this.blobCacheTimeout);
    }
    public Optional<ClientCredentialsResponse> clientCredentials() {
        return Optional.ofNullable(this.clientCredentials);
    }
    /**
     * The storage container name.
     * 
    */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * The credential.
     * 
    */
    public Optional<String> credential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     *  The credential type.
     * 
    */
    public Optional<String> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }
    /**
     * The host of the container.
     * 
    */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * Indicate if we are using SAS token or Account Key (Deprecated).
     * 
    */
    public Optional<Boolean> isSas() {
        return Optional.ofNullable(this.isSas);
    }
    /**
     * The protocol to use. Defaults to https.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Resource Group.
     * 
    */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     *  SAS Token for the container (Deprecated).
     * 
    */
    public Optional<String> sasToken() {
        return Optional.ofNullable(this.sasToken);
    }
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
    */
    public Optional<String> serviceDataAccessAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }
    /**
     * Subscription ID.
     * 
    */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private @Nullable String accountName;
        private @Nullable Boolean areWorkspaceManagedIdentitiesAllowed;
        private @Nullable Integer blobCacheTimeout;
        private @Nullable ClientCredentialsResponse clientCredentials;
        private @Nullable String containerName;
        private @Nullable String credential;
        private @Nullable String credentialType;
        private @Nullable String endpoint;
        private @Nullable Boolean isSas;
        private @Nullable String protocol;
        private @Nullable String resourceGroup;
        private @Nullable String sasToken;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.areWorkspaceManagedIdentitiesAllowed = defaults.areWorkspaceManagedIdentitiesAllowed;
    	      this.blobCacheTimeout = defaults.blobCacheTimeout;
    	      this.clientCredentials = defaults.clientCredentials;
    	      this.containerName = defaults.containerName;
    	      this.credential = defaults.credential;
    	      this.credentialType = defaults.credentialType;
    	      this.endpoint = defaults.endpoint;
    	      this.isSas = defaults.isSas;
    	      this.protocol = defaults.protocol;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.sasToken = defaults.sasToken;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder areWorkspaceManagedIdentitiesAllowed(@Nullable Boolean areWorkspaceManagedIdentitiesAllowed) {
            this.areWorkspaceManagedIdentitiesAllowed = areWorkspaceManagedIdentitiesAllowed;
            return this;
        }
        public Builder blobCacheTimeout(@Nullable Integer blobCacheTimeout) {
            this.blobCacheTimeout = blobCacheTimeout;
            return this;
        }
        public Builder clientCredentials(@Nullable ClientCredentialsResponse clientCredentials) {
            this.clientCredentials = clientCredentials;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder credential(@Nullable String credential) {
            this.credential = credential;
            return this;
        }
        public Builder credentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder isSas(@Nullable Boolean isSas) {
            this.isSas = isSas;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder sasToken(@Nullable String sasToken) {
            this.sasToken = sasToken;
            return this;
        }
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public AzureStorageSectionResponse build() {
            return new AzureStorageSectionResponse(accountKey, accountName, areWorkspaceManagedIdentitiesAllowed, blobCacheTimeout, clientCredentials, containerName, credential, credentialType, endpoint, isSas, protocol, resourceGroup, sasToken, serviceDataAccessAuthIdentity, subscriptionId);
        }
    }
}
