// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.MongoDbAuthenticationType;
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
 * Linked service for MongoDb data source.
 * 
 */
public final class MongoDbLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MongoDbLinkedServiceArgs Empty = new MongoDbLinkedServiceArgs();

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowSelfSignedServerCert")
      private final @Nullable Output<Object> allowSelfSignedServerCert;

    public Output<Object> allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Codegen.empty() : this.allowSelfSignedServerCert;
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
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authSource")
      private final @Nullable Output<Object> authSource;

    public Output<Object> authSource() {
        return this.authSource == null ? Codegen.empty() : this.authSource;
    }

    /**
     * The authentication type to be used to connect to the MongoDB database.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,MongoDbAuthenticationType>> authenticationType;

    public Output<Either<String,MongoDbAuthenticationType>> authenticationType() {
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
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<Object> databaseName;

    public Output<Object> databaseName() {
        return this.databaseName;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableSsl")
      private final @Nullable Output<Object> enableSsl;

    public Output<Object> enableSsl() {
        return this.enableSsl == null ? Codegen.empty() : this.enableSsl;
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
     * Password for authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Object> port;

    public Output<Object> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server", required=true)
      private final Output<Object> server;

    public Output<Object> server() {
        return this.server;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;MongoDb&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
      private final @Nullable Output<Object> username;

    public Output<Object> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public MongoDbLinkedServiceArgs(
        @Nullable Output<Object> allowSelfSignedServerCert,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authSource,
        @Nullable Output<Either<String,MongoDbAuthenticationType>> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> databaseName,
        @Nullable Output<String> description,
        @Nullable Output<Object> enableSsl,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> port,
        Output<Object> server,
        Output<String> type,
        @Nullable Output<Object> username) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authSource = authSource;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.username = username;
    }

    private MongoDbLinkedServiceArgs() {
        this.allowSelfSignedServerCert = Codegen.empty();
        this.annotations = Codegen.empty();
        this.authSource = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.description = Codegen.empty();
        this.enableSsl = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.server = Codegen.empty();
        this.type = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> allowSelfSignedServerCert;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authSource;
        private @Nullable Output<Either<String,MongoDbAuthenticationType>> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> databaseName;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> enableSsl;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> port;
        private Output<Object> server;
        private Output<String> type;
        private @Nullable Output<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authSource = defaults.authSource;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.databaseName = defaults.databaseName;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder allowSelfSignedServerCert(@Nullable Output<Object> allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }
        public Builder allowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = Codegen.ofNullable(allowSelfSignedServerCert);
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
        public Builder authSource(@Nullable Output<Object> authSource) {
            this.authSource = authSource;
            return this;
        }
        public Builder authSource(@Nullable Object authSource) {
            this.authSource = Codegen.ofNullable(authSource);
            return this;
        }
        public Builder authenticationType(@Nullable Output<Either<String,MongoDbAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,MongoDbAuthenticationType> authenticationType) {
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
        public Builder databaseName(Output<Object> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(Object databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
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
        public Builder enableSsl(@Nullable Output<Object> enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }
        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = Codegen.ofNullable(enableSsl);
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
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder port(@Nullable Output<Object> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Object port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder server(Output<Object> server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public Builder server(Object server) {
            this.server = Output.of(Objects.requireNonNull(server));
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
        public Builder username(@Nullable Output<Object> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public MongoDbLinkedServiceArgs build() {
            return new MongoDbLinkedServiceArgs(allowSelfSignedServerCert, annotations, authSource, authenticationType, connectVia, databaseName, description, enableSsl, encryptedCredential, parameters, password, port, server, type, username);
        }
    }
}
