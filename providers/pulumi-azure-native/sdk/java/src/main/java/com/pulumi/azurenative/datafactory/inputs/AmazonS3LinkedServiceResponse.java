// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
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
 * Linked service for Amazon S3.
 * 
 */
public final class AmazonS3LinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmazonS3LinkedServiceResponse Empty = new AmazonS3LinkedServiceResponse();

    /**
     * The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
      private final @Nullable Object accessKeyId;

    public Optional<Object> accessKeyId() {
        return this.accessKeyId == null ? Optional.empty() : Optional.ofNullable(this.accessKeyId);
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
     * The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Object authenticationType;

    public Optional<Object> authenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
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
     * The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey() {
        return this.secretAccessKey == null ? null : this.secretAccessKey;
    }

    /**
     * This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
      private final @Nullable Object serviceUrl;

    public Optional<Object> serviceUrl() {
        return this.serviceUrl == null ? Optional.empty() : Optional.ofNullable(this.serviceUrl);
    }

    /**
     * The session token for the S3 temporary security credential.
     * 
     */
    @Import(name="sessionToken")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken() {
        return this.sessionToken == null ? null : this.sessionToken;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonS3&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AmazonS3LinkedServiceResponse(
        @Nullable Object accessKeyId,
        @Nullable List<Object> annotations,
        @Nullable Object authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey,
        @Nullable Object serviceUrl,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken,
        String type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.sessionToken = sessionToken;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AmazonS3LinkedServiceResponse() {
        this.accessKeyId = null;
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.secretAccessKey = null;
        this.serviceUrl = null;
        this.sessionToken = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable Object authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
        private @Nullable Object serviceUrl;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3LinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sessionToken = defaults.sessionToken;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(@Nullable Object authenticationType) {
            this.authenticationType = authenticationType;
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
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder sessionToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AmazonS3LinkedServiceResponse build() {
            return new AmazonS3LinkedServiceResponse(accessKeyId, annotations, authenticationType, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, sessionToken, type);
        }
    }
}
