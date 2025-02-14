// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMLLinkedServiceResponse {
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The API key for accessing the Azure ML model endpoint.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey;
    /**
     * @return Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object authentication;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * @return The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final Object mlEndpoint;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * @return The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureML&#39;.
     * 
     */
    private final String type;
    /**
     * @return The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object updateResourceEndpoint;

    @CustomType.Constructor
    private AzureMLLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("apiKey") Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey,
        @CustomType.Parameter("authentication") @Nullable Object authentication,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("mlEndpoint") Object mlEndpoint,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("servicePrincipalId") @Nullable Object servicePrincipalId,
        @CustomType.Parameter("servicePrincipalKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @CustomType.Parameter("tenant") @Nullable Object tenant,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateResourceEndpoint") @Nullable Object updateResourceEndpoint) {
        this.annotations = annotations;
        this.apiKey = apiKey;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlEndpoint = mlEndpoint;
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = type;
        this.updateResourceEndpoint = updateResourceEndpoint;
    }

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The API key for accessing the Azure ML model endpoint.
     * 
     */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey() {
        return this.apiKey;
    }
    /**
     * @return Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * @return The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Object mlEndpoint() {
        return this.mlEndpoint;
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * @return The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> tenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureML&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> updateResourceEndpoint() {
        return Optional.ofNullable(this.updateResourceEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey;
        private @Nullable Object authentication;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object mlEndpoint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private @Nullable Object updateResourceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiKey = defaults.apiKey;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.mlEndpoint = defaults.mlEndpoint;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.updateResourceEndpoint = defaults.updateResourceEndpoint;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder apiKey(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder authentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
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
        public Builder mlEndpoint(Object mlEndpoint) {
            this.mlEndpoint = Objects.requireNonNull(mlEndpoint);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateResourceEndpoint(@Nullable Object updateResourceEndpoint) {
            this.updateResourceEndpoint = updateResourceEndpoint;
            return this;
        }        public AzureMLLinkedServiceResponse build() {
            return new AzureMLLinkedServiceResponse(annotations, apiKey, authentication, connectVia, description, encryptedCredential, mlEndpoint, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, updateResourceEndpoint);
        }
    }
}
