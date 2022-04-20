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
 * Azure Databricks Delta Lake linked service.
 * 
 */
public final class AzureDatabricksDeltaLakeLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDatabricksDeltaLakeLinkedServiceResponse Empty = new AzureDatabricksDeltaLakeLinkedServiceResponse();

    /**
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken() {
        return this.accessToken == null ? null : this.accessToken;
    }

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
     * The id of an existing interactive cluster that will be used for all runs of this job. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Object clusterId;

    public Optional<Object> clusterId() {
        return this.clusterId == null ? Optional.empty() : Optional.ofNullable(this.clusterId);
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
     * &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="domain", required=true)
      private final Object domain;

    public Object domain() {
        return this.domain;
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
     * Expected value is &#39;AzureDatabricksDeltaLake&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable Object workspaceResourceId;

    public Optional<Object> workspaceResourceId() {
        return this.workspaceResourceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceResourceId);
    }

    public AzureDatabricksDeltaLakeLinkedServiceResponse(
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @Nullable List<Object> annotations,
        @Nullable Object clusterId,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        Object domain,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type,
        @Nullable Object workspaceResourceId) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.clusterId = clusterId;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.workspaceResourceId = workspaceResourceId;
    }

    private AzureDatabricksDeltaLakeLinkedServiceResponse() {
        this.accessToken = null;
        this.annotations = List.of();
        this.clusterId = null;
        this.connectVia = null;
        this.credential = null;
        this.description = null;
        this.domain = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.type = null;
        this.workspaceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private @Nullable Object clusterId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private Object domain;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clusterId(@Nullable Object clusterId) {
            this.clusterId = clusterId;
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
        public Builder domain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
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
        public Builder workspaceResourceId(@Nullable Object workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }        public AzureDatabricksDeltaLakeLinkedServiceResponse build() {
            return new AzureDatabricksDeltaLakeLinkedServiceResponse(accessToken, annotations, clusterId, connectVia, credential, description, domain, encryptedCredential, parameters, type, workspaceResourceId);
        }
    }
}
