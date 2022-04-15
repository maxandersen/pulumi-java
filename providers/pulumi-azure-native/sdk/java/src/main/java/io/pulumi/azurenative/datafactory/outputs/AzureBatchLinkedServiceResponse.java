// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureBatchLinkedServiceResponse {
    /**
     * The Azure Batch account access key.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessKey;
    /**
     * The Azure Batch account name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object accountName;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The Azure Batch URI. Type: string (or Expression with resultType string).
     * 
     */
    private final Object batchUri;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The Azure Storage linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The Azure Batch pool name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object poolName;
    /**
     * Type of linked service.
     * Expected value is 'AzureBatch'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureBatchLinkedServiceResponse(
        @CustomType.Parameter("accessKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessKey,
        @CustomType.Parameter("accountName") Object accountName,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("batchUri") Object batchUri,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("credential") @Nullable CredentialReferenceResponse credential,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("poolName") Object poolName,
        @CustomType.Parameter("type") String type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.annotations = annotations;
        this.batchUri = batchUri;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.poolName = poolName;
        this.type = type;
    }

    /**
     * The Azure Batch account access key.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * The Azure Batch account name. Type: string (or Expression with resultType string).
     * 
    */
    public Object accountName() {
        return this.accountName;
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The Azure Batch URI. Type: string (or Expression with resultType string).
     * 
    */
    public Object batchUri() {
        return this.batchUri;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The Azure Storage linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The Azure Batch pool name. Type: string (or Expression with resultType string).
     * 
    */
    public Object poolName() {
        return this.poolName;
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureBatch'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBatchLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessKey;
        private Object accountName;
        private @Nullable List<Object> annotations;
        private Object batchUri;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object poolName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBatchLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.batchUri = defaults.batchUri;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.poolName = defaults.poolName;
    	      this.type = defaults.type;
        }

        public Builder accessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder accountName(Object accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder batchUri(Object batchUri) {
            this.batchUri = Objects.requireNonNull(batchUri);
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
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder poolName(Object poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBatchLinkedServiceResponse build() {
            return new AzureBatchLinkedServiceResponse(accessKey, accountName, annotations, batchUri, connectVia, credential, description, encryptedCredential, linkedServiceName, parameters, poolName, type);
        }
    }
}
