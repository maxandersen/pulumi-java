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
 * Square Service linked service.
 * 
 */
public final class SquareLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SquareLinkedServiceArgs Empty = new SquareLinkedServiceArgs();

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
     * The client ID associated with your Square application.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<Object> clientId;

    public Output<Object> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * The client secret associated with your Square application.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
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
     * Properties used to connect to Square. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @Import(name="connectionProperties")
      private final @Nullable Output<Object> connectionProperties;

    public Output<Object> connectionProperties() {
        return this.connectionProperties == null ? Codegen.empty() : this.connectionProperties;
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
     * The URL of the Square instance. (i.e. mystore.mysquare.com)
     * 
     */
    @Import(name="host")
      private final @Nullable Output<Object> host;

    public Output<Object> host() {
        return this.host == null ? Codegen.empty() : this.host;
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
     * The redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500)
     * 
     */
    @Import(name="redirectUri")
      private final @Nullable Output<Object> redirectUri;

    public Output<Object> redirectUri() {
        return this.redirectUri == null ? Codegen.empty() : this.redirectUri;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Square&#39;.
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

    public SquareLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> clientId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<Object> connectionProperties,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> host,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> redirectUri,
        Output<String> type,
        @Nullable Output<Object> useEncryptedEndpoints,
        @Nullable Output<Object> useHostVerification,
        @Nullable Output<Object> usePeerVerification) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.redirectUri = redirectUri;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private SquareLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionProperties = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.host = Codegen.empty();
        this.parameters = Codegen.empty();
        this.redirectUri = Codegen.empty();
        this.type = Codegen.empty();
        this.useEncryptedEndpoints = Codegen.empty();
        this.useHostVerification = Codegen.empty();
        this.usePeerVerification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SquareLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> clientId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<Object> connectionProperties;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> host;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> redirectUri;
        private Output<String> type;
        private @Nullable Output<Object> useEncryptedEndpoints;
        private @Nullable Output<Object> useHostVerification;
        private @Nullable Output<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(SquareLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.redirectUri = defaults.redirectUri;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
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
        public Builder clientId(@Nullable Output<Object> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable Object clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
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
        public Builder connectionProperties(@Nullable Output<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Builder connectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Codegen.ofNullable(connectionProperties);
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
        public Builder host(@Nullable Output<Object> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable Object host) {
            this.host = Codegen.ofNullable(host);
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
        public Builder redirectUri(@Nullable Output<Object> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public Builder redirectUri(@Nullable Object redirectUri) {
            this.redirectUri = Codegen.ofNullable(redirectUri);
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
        }        public SquareLinkedServiceArgs build() {
            return new SquareLinkedServiceArgs(annotations, clientId, clientSecret, connectVia, connectionProperties, description, encryptedCredential, host, parameters, redirectUri, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
