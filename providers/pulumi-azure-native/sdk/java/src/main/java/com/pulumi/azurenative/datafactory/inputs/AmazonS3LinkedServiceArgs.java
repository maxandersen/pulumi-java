// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for Amazon S3.
 * 
 */
public final class AmazonS3LinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonS3LinkedServiceArgs Empty = new AmazonS3LinkedServiceArgs();

    /**
     * The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
      private final @Nullable Output<Object> accessKeyId;

    public Output<Object> accessKeyId() {
        return this.accessKeyId == null ? Codegen.empty() : this.accessKeyId;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Object> authenticationType;

    public Output<Object> authenticationType() {
        return this.authenticationType == null ? Codegen.empty() : this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey() {
        return this.secretAccessKey == null ? Codegen.empty() : this.secretAccessKey;
    }

    /**
     * This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
      private final @Nullable Output<Object> serviceUrl;

    public Output<Object> serviceUrl() {
        return this.serviceUrl == null ? Codegen.empty() : this.serviceUrl;
    }

    /**
     * The session token for the S3 temporary security credential.
     * 
     */
    @Import(name="sessionToken")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> sessionToken;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> sessionToken() {
        return this.sessionToken == null ? Codegen.empty() : this.sessionToken;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonS3&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AmazonS3LinkedServiceArgs(
        @Nullable Output<Object> accessKeyId,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey,
        @Nullable Output<Object> serviceUrl,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> sessionToken,
        Output<String> type) {
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
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AmazonS3LinkedServiceArgs() {
        this.accessKeyId = Codegen.empty();
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.secretAccessKey = Codegen.empty();
        this.serviceUrl = Codegen.empty();
        this.sessionToken = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accessKeyId;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;
        private @Nullable Output<Object> serviceUrl;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> sessionToken;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3LinkedServiceArgs defaults) {
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

        public Builder accessKeyId(@Nullable Output<Object> accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = Codegen.ofNullable(accessKeyId);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(@Nullable Output<Object> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Object authenticationType) {
            this.authenticationType = Codegen.ofNullable(authenticationType);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder secretAccessKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretAccessKey) {
            this.secretAccessKey = Codegen.ofNullable(secretAccessKey);
            return this;
        }
        public Builder serviceUrl(@Nullable Output<Object> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = Codegen.ofNullable(serviceUrl);
            return this;
        }
        public Builder sessionToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public Builder sessionToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> sessionToken) {
            this.sessionToken = Codegen.ofNullable(sessionToken);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AmazonS3LinkedServiceArgs build() {
            return new AmazonS3LinkedServiceArgs(accessKeyId, annotations, authenticationType, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, sessionToken, type);
        }
    }
}
