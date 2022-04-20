// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Function linked service.
 * 
 */
public final class AzureFunctionLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFunctionLinkedServiceResponse Empty = new AzureFunctionLinkedServiceResponse();

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
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
      private final @Nullable Object authentication;

    public Optional<Object> authentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
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
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> credential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
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
     * The endpoint of the Azure Function App. URL will be in the format https://&lt;accountName&gt;.azurewebsites.net.
     * 
     */
    @Import(name="functionAppUrl", required=true)
      private final Object functionAppUrl;

    public Object functionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Function or Host key for Azure Function App.
     * 
     */
    @Import(name="functionKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey() {
        return this.functionKey == null ? null : this.functionKey;
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
     * Allowed token audiences for azure function.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Object resourceId;

    public Optional<Object> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureFunction&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureFunctionLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object authentication,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object functionAppUrl,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceId,
        String type) {
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.functionAppUrl = Objects.requireNonNull(functionAppUrl, "expected parameter 'functionAppUrl' to be non-null");
        this.functionKey = functionKey;
        this.parameters = parameters;
        this.resourceId = resourceId;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AzureFunctionLinkedServiceResponse() {
        this.annotations = List.of();
        this.authentication = null;
        this.connectVia = null;
        this.credential = null;
        this.description = null;
        this.encryptedCredential = null;
        this.functionAppUrl = null;
        this.functionKey = null;
        this.parameters = Map.of();
        this.resourceId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object authentication;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object functionAppUrl;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.functionAppUrl = defaults.functionAppUrl;
    	      this.functionKey = defaults.functionKey;
    	      this.parameters = defaults.parameters;
    	      this.resourceId = defaults.resourceId;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
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
        public Builder functionAppUrl(Object functionAppUrl) {
            this.functionAppUrl = Objects.requireNonNull(functionAppUrl);
            return this;
        }
        public Builder functionKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey) {
            this.functionKey = functionKey;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder resourceId(@Nullable Object resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureFunctionLinkedServiceResponse build() {
            return new AzureFunctionLinkedServiceResponse(annotations, authentication, connectVia, credential, description, encryptedCredential, functionAppUrl, functionKey, parameters, resourceId, type);
        }
    }
}
