// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Salesforce Marketing Cloud linked service.
 * 
 */
public final class SalesforceMarketingCloudLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SalesforceMarketingCloudLinkedServiceResponse Empty = new SalesforceMarketingCloudLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The client ID associated with the Salesforce Marketing Cloud application. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
      private final @Nullable Object clientId;

    public Optional<Object> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret associated with the Salesforce Marketing Cloud application. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret() {
        return this.clientSecret == null ? null : this.clientSecret;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Properties used to connect to Salesforce Marketing Cloud. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @Import(name="connectionProperties")
      private final @Nullable Object connectionProperties;

    public Optional<Object> connectionProperties() {
        return this.connectionProperties == null ? Optional.empty() : Optional.ofNullable(this.connectionProperties);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'SalesforceMarketingCloud'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Object useEncryptedEndpoints;

    public Optional<Object> useEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Optional.empty() : Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useHostVerification")
      private final @Nullable Object useHostVerification;

    public Optional<Object> useHostVerification() {
        return this.useHostVerification == null ? Optional.empty() : Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="usePeerVerification")
      private final @Nullable Object usePeerVerification;

    public Optional<Object> usePeerVerification() {
        return this.usePeerVerification == null ? Optional.empty() : Optional.ofNullable(this.usePeerVerification);
    }

    public SalesforceMarketingCloudLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object clientId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionProperties,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private SalesforceMarketingCloudLinkedServiceResponse() {
        this.annotations = List.of();
        this.clientId = null;
        this.clientSecret = null;
        this.connectVia = null;
        this.connectionProperties = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.type = null;
        this.useEncryptedEndpoints = null;
        this.useHostVerification = null;
        this.usePeerVerification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceMarketingCloudLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionProperties;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceMarketingCloudLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }        public SalesforceMarketingCloudLinkedServiceResponse build() {
            return new SalesforceMarketingCloudLinkedServiceResponse(annotations, clientId, clientSecret, connectVia, connectionProperties, description, encryptedCredential, parameters, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
