// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMySqlSectionResponse {
    /**
     * The authority URL used for authentication.
     * 
     */
    private final @Nullable String authorityUrl;
    /**
     * The content of the certificate used for authentication.
     * 
     */
    private final @Nullable String certificate;
    /**
     * The Client ID/Application ID
     * 
     */
    private final @Nullable String clientId;
    /**
     * The client secret.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * Sql Authentication type.
     * 
     */
    private final @Nullable String credentialType;
    /**
     * The Azure SQL database name.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * The server host endpoint.
     * 
     */
    private final @Nullable String endpoint;
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    private final @Nullable Boolean isCertAuth;
    /**
     * / The Azure SQL port number.
     * 
     */
    private final @Nullable String portNumber;
    /**
     * Resource Group.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * The resource the service principal/app has access to.
     * 
     */
    private final @Nullable String resourceUri;
    /**
     * The Azure SQL server name.
     * 
     */
    private final @Nullable String serverName;
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
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The thumbprint of the certificate above.
     * 
     */
    private final @Nullable String thumbprint;
    /**
     * The Azure SQL user id.
     * 
     */
    private final @Nullable String userId;
    /**
     * The Azure SQL user password.
     * 
     */
    private final @Nullable String userPassword;

    @CustomType.Constructor
    private AzureMySqlSectionResponse(
        @CustomType.Parameter("authorityUrl") @Nullable String authorityUrl,
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("credentialType") @Nullable String credentialType,
        @CustomType.Parameter("databaseName") @Nullable String databaseName,
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("isCertAuth") @Nullable Boolean isCertAuth,
        @CustomType.Parameter("portNumber") @Nullable String portNumber,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("resourceUri") @Nullable String resourceUri,
        @CustomType.Parameter("serverName") @Nullable String serverName,
        @CustomType.Parameter("serviceDataAccessAuthIdentity") @Nullable String serviceDataAccessAuthIdentity,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint,
        @CustomType.Parameter("userId") @Nullable String userId,
        @CustomType.Parameter("userPassword") @Nullable String userPassword) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentialType = credentialType;
        this.databaseName = databaseName;
        this.endpoint = endpoint;
        this.isCertAuth = isCertAuth;
        this.portNumber = portNumber;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serverName = serverName;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    /**
     * The authority URL used for authentication.
     * 
    */
    public Optional<String> authorityUrl() {
        return Optional.ofNullable(this.authorityUrl);
    }
    /**
     * The content of the certificate used for authentication.
     * 
    */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * The Client ID/Application ID
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The client secret.
     * 
    */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * Sql Authentication type.
     * 
    */
    public Optional<String> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }
    /**
     * The Azure SQL database name.
     * 
    */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * The server host endpoint.
     * 
    */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
    */
    public Optional<Boolean> isCertAuth() {
        return Optional.ofNullable(this.isCertAuth);
    }
    /**
     * / The Azure SQL port number.
     * 
    */
    public Optional<String> portNumber() {
        return Optional.ofNullable(this.portNumber);
    }
    /**
     * Resource Group.
     * 
    */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * The resource the service principal/app has access to.
     * 
    */
    public Optional<String> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }
    /**
     * The Azure SQL server name.
     * 
    */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
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
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The thumbprint of the certificate above.
     * 
    */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * The Azure SQL user id.
     * 
    */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    /**
     * The Azure SQL user password.
     * 
    */
    public Optional<String> userPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMySqlSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String credentialType;
        private @Nullable String databaseName;
        private @Nullable String endpoint;
        private @Nullable Boolean isCertAuth;
        private @Nullable String portNumber;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serverName;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;
        private @Nullable String userId;
        private @Nullable String userPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMySqlSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.credentialType = defaults.credentialType;
    	      this.databaseName = defaults.databaseName;
    	      this.endpoint = defaults.endpoint;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.portNumber = defaults.portNumber;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serverName = defaults.serverName;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
    	      this.userId = defaults.userId;
    	      this.userPassword = defaults.userPassword;
        }

        public Builder authorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder credentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder isCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }
        public Builder portNumber(@Nullable String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        public Builder userPassword(@Nullable String userPassword) {
            this.userPassword = userPassword;
            return this;
        }        public AzureMySqlSectionResponse build() {
            return new AzureMySqlSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, databaseName, endpoint, isCertAuth, portNumber, resourceGroup, resourceUri, serverName, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint, userId, userPassword);
        }
    }
}
