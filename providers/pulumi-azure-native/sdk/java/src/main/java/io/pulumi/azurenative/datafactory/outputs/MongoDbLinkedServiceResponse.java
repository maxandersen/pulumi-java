// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
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
public final class MongoDbLinkedServiceResponse {
    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object allowSelfSignedServerCert;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object authSource;
    /**
     * The authentication type to be used to connect to the MongoDB database.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    private final Object databaseName;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableSsl;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password for authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object port;
    /**
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     * 
     */
    private final Object server;
    /**
     * Type of linked service.
     * Expected value is 'MongoDb'.
     * 
     */
    private final String type;
    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @CustomType.Constructor
    private MongoDbLinkedServiceResponse(
        @CustomType.Parameter("allowSelfSignedServerCert") @Nullable Object allowSelfSignedServerCert,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authSource") @Nullable Object authSource,
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("databaseName") Object databaseName,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enableSsl") @Nullable Object enableSsl,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("port") @Nullable Object port,
        @CustomType.Parameter("server") Object server,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") @Nullable Object username) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authSource = authSource;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.databaseName = databaseName;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.server = server;
        this.type = type;
        this.username = username;
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> authSource() {
        return Optional.ofNullable(this.authSource);
    }
    /**
     * The authentication type to be used to connect to the MongoDB database.
     * 
    */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     * 
    */
    public Object databaseName() {
        return this.databaseName;
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password for authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     * 
    */
    public Object server() {
        return this.server;
    }
    /**
     * Type of linked service.
     * Expected value is 'MongoDb'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private @Nullable Object authSource;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object databaseName;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private Object server;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbLinkedServiceResponse defaults) {
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

        public Builder allowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authSource(@Nullable Object authSource) {
            this.authSource = authSource;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder databaseName(Object databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
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
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder port(@Nullable Object port) {
            this.port = port;
            return this;
        }
        public Builder server(Object server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }        public MongoDbLinkedServiceResponse build() {
            return new MongoDbLinkedServiceResponse(allowSelfSignedServerCert, annotations, authSource, authenticationType, connectVia, databaseName, description, enableSsl, encryptedCredential, parameters, password, port, server, type, username);
        }
    }
}
