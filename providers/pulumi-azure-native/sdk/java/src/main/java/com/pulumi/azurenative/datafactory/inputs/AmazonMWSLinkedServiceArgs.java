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
 * Amazon Marketplace Web Service linked service.
 * 
 */
public final class AmazonMWSLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonMWSLinkedServiceArgs Empty = new AmazonMWSLinkedServiceArgs();

    /**
     * The access key id used to access data.
     * 
     */
    @Import(name="accessKeyId", required=true)
      private final Output<Object> accessKeyId;

    public Output<Object> accessKeyId() {
        return this.accessKeyId;
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
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<Object> endpoint;

    public Output<Object> endpoint() {
        return this.endpoint;
    }

    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2)
     * 
     */
    @Import(name="marketplaceID", required=true)
      private final Output<Object> marketplaceID;

    public Output<Object> marketplaceID() {
        return this.marketplaceID;
    }

    /**
     * The Amazon MWS authentication token.
     * 
     */
    @Import(name="mwsAuthToken")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken() {
        return this.mwsAuthToken == null ? Codegen.empty() : this.mwsAuthToken;
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
     * The secret key used to access data.
     * 
     */
    @Import(name="secretKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey() {
        return this.secretKey == null ? Codegen.empty() : this.secretKey;
    }

    /**
     * The Amazon seller ID.
     * 
     */
    @Import(name="sellerID", required=true)
      private final Output<Object> sellerID;

    public Output<Object> sellerID() {
        return this.sellerID;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonMWS&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Output<Object> useEncryptedEndpoints;

    public Output<Object> useEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Codegen.empty() : this.useEncryptedEndpoints;
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
      private final @Nullable Output<Object> useHostVerification;

    public Output<Object> useHostVerification() {
        return this.useHostVerification == null ? Codegen.empty() : this.useHostVerification;
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
      private final @Nullable Output<Object> usePeerVerification;

    public Output<Object> usePeerVerification() {
        return this.usePeerVerification == null ? Codegen.empty() : this.usePeerVerification;
    }

    public AmazonMWSLinkedServiceArgs(
        Output<Object> accessKeyId,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> endpoint,
        Output<Object> marketplaceID,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey,
        Output<Object> sellerID,
        Output<String> type,
        @Nullable Output<Object> useEncryptedEndpoints,
        @Nullable Output<Object> useHostVerification,
        @Nullable Output<Object> usePeerVerification) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.marketplaceID = Objects.requireNonNull(marketplaceID, "expected parameter 'marketplaceID' to be non-null");
        this.mwsAuthToken = mwsAuthToken;
        this.parameters = parameters;
        this.secretKey = secretKey;
        this.sellerID = Objects.requireNonNull(sellerID, "expected parameter 'sellerID' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private AmazonMWSLinkedServiceArgs() {
        this.accessKeyId = Codegen.empty();
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.marketplaceID = Codegen.empty();
        this.mwsAuthToken = Codegen.empty();
        this.parameters = Codegen.empty();
        this.secretKey = Codegen.empty();
        this.sellerID = Codegen.empty();
        this.type = Codegen.empty();
        this.useEncryptedEndpoints = Codegen.empty();
        this.useHostVerification = Codegen.empty();
        this.usePeerVerification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonMWSLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> accessKeyId;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> endpoint;
        private Output<Object> marketplaceID;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey;
        private Output<Object> sellerID;
        private Output<String> type;
        private @Nullable Output<Object> useEncryptedEndpoints;
        private @Nullable Output<Object> useHostVerification;
        private @Nullable Output<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonMWSLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.marketplaceID = defaults.marketplaceID;
    	      this.mwsAuthToken = defaults.mwsAuthToken;
    	      this.parameters = defaults.parameters;
    	      this.secretKey = defaults.secretKey;
    	      this.sellerID = defaults.sellerID;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder accessKeyId(Output<Object> accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }
        public Builder accessKeyId(Object accessKeyId) {
            this.accessKeyId = Output.of(Objects.requireNonNull(accessKeyId));
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
        public Builder endpoint(Output<Object> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder endpoint(Object endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }
        public Builder marketplaceID(Output<Object> marketplaceID) {
            this.marketplaceID = Objects.requireNonNull(marketplaceID);
            return this;
        }
        public Builder marketplaceID(Object marketplaceID) {
            this.marketplaceID = Output.of(Objects.requireNonNull(marketplaceID));
            return this;
        }
        public Builder mwsAuthToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken) {
            this.mwsAuthToken = mwsAuthToken;
            return this;
        }
        public Builder mwsAuthToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> mwsAuthToken) {
            this.mwsAuthToken = Codegen.ofNullable(mwsAuthToken);
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
        public Builder secretKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public Builder secretKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretKey) {
            this.secretKey = Codegen.ofNullable(secretKey);
            return this;
        }
        public Builder sellerID(Output<Object> sellerID) {
            this.sellerID = Objects.requireNonNull(sellerID);
            return this;
        }
        public Builder sellerID(Object sellerID) {
            this.sellerID = Output.of(Objects.requireNonNull(sellerID));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Codegen.ofNullable(useEncryptedEndpoints);
            return this;
        }
        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Codegen.ofNullable(useHostVerification);
            return this;
        }
        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Codegen.ofNullable(usePeerVerification);
            return this;
        }        public AmazonMWSLinkedServiceArgs build() {
            return new AmazonMWSLinkedServiceArgs(accessKeyId, annotations, connectVia, description, encryptedCredential, endpoint, marketplaceID, mwsAuthToken, parameters, secretKey, sellerID, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
