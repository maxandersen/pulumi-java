// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureSqlDatabaseSectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureSqlDatabaseSectionResponse Empty = new AzureSqlDatabaseSectionResponse();

    /**
     * The authority URL used for authentication.
     * 
     */
    @Import(name="authorityUrl")
      private final @Nullable String authorityUrl;

    public Optional<String> authorityUrl() {
        return this.authorityUrl == null ? Optional.empty() : Optional.ofNullable(this.authorityUrl);
    }

    /**
     * The content of the certificate used for authentication.
     * 
     */
    @Import(name="certificate")
      private final @Nullable String certificate;

    public Optional<String> certificate() {
        return this.certificate == null ? Optional.empty() : Optional.ofNullable(this.certificate);
    }

    /**
     * The Client ID/Application ID
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> clientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * Sql Authentication type.
     * 
     */
    @Import(name="credentialType")
      private final @Nullable String credentialType;

    public Optional<String> credentialType() {
        return this.credentialType == null ? Optional.empty() : Optional.ofNullable(this.credentialType);
    }

    /**
     * The Azure SQL database name.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable String databaseName;

    public Optional<String> databaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * The server host endpoint.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> endpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    @Import(name="isCertAuth")
      private final @Nullable Boolean isCertAuth;

    public Optional<Boolean> isCertAuth() {
        return this.isCertAuth == null ? Optional.empty() : Optional.ofNullable(this.isCertAuth);
    }

    /**
     * / The Azure SQL port number.
     * 
     */
    @Import(name="portNumber")
      private final @Nullable String portNumber;

    public Optional<String> portNumber() {
        return this.portNumber == null ? Optional.empty() : Optional.ofNullable(this.portNumber);
    }

    /**
     * Resource Group.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> resourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The resource the service principal/app has access to.
     * 
     */
    @Import(name="resourceUri")
      private final @Nullable String resourceUri;

    public Optional<String> resourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    /**
     * The Azure SQL server name.
     * 
     */
    @Import(name="serverName")
      private final @Nullable String serverName;

    public Optional<String> serverName() {
        return this.serverName == null ? Optional.empty() : Optional.ofNullable(this.serverName);
    }

    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    @Import(name="serviceDataAccessAuthIdentity")
      private final @Nullable String serviceDataAccessAuthIdentity;

    public Optional<String> serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity == null ? Optional.empty() : Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }

    /**
     * Subscription ID.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> subscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The thumbprint of the certificate above.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> thumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    /**
     * The Azure SQL user id.
     * 
     */
    @Import(name="userId")
      private final @Nullable String userId;

    public Optional<String> userId() {
        return this.userId == null ? Optional.empty() : Optional.ofNullable(this.userId);
    }

    /**
     * The Azure SQL user password.
     * 
     */
    @Import(name="userPassword")
      private final @Nullable String userPassword;

    public Optional<String> userPassword() {
        return this.userPassword == null ? Optional.empty() : Optional.ofNullable(this.userPassword);
    }

    public AzureSqlDatabaseSectionResponse(
        @Nullable String authorityUrl,
        @Nullable String certificate,
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable String credentialType,
        @Nullable String databaseName,
        @Nullable String endpoint,
        @Nullable Boolean isCertAuth,
        @Nullable String portNumber,
        @Nullable String resourceGroup,
        @Nullable String resourceUri,
        @Nullable String serverName,
        @Nullable String serviceDataAccessAuthIdentity,
        @Nullable String subscriptionId,
        @Nullable String tenantId,
        @Nullable String thumbprint,
        @Nullable String userId,
        @Nullable String userPassword) {
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

    private AzureSqlDatabaseSectionResponse() {
        this.authorityUrl = null;
        this.certificate = null;
        this.clientId = null;
        this.clientSecret = null;
        this.credentialType = null;
        this.databaseName = null;
        this.endpoint = null;
        this.isCertAuth = null;
        this.portNumber = null;
        this.resourceGroup = null;
        this.resourceUri = null;
        this.serverName = null;
        this.serviceDataAccessAuthIdentity = null;
        this.subscriptionId = null;
        this.tenantId = null;
        this.thumbprint = null;
        this.userId = null;
        this.userPassword = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseSectionResponse defaults) {
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

        public Builder(AzureSqlDatabaseSectionResponse defaults) {
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
        }        public AzureSqlDatabaseSectionResponse build() {
            return new AzureSqlDatabaseSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, databaseName, endpoint, isCertAuth, portNumber, resourceGroup, resourceUri, serverName, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint, userId, userPassword);
        }
    }
}
