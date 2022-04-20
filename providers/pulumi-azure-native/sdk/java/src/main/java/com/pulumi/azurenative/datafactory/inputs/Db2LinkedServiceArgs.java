// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.Db2AuthenticationType;
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
 * Linked service for DB2 data source.
 * 
 */
public final class Db2LinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final Db2LinkedServiceArgs Empty = new Db2LinkedServiceArgs();

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
     * AuthenticationType to be used for connection. It is mutually exclusive with connectionString property.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,Db2AuthenticationType>> authenticationType;

    public Output<Either<String,Db2AuthenticationType>> authenticationType() {
        return this.authenticationType == null ? Codegen.empty() : this.authenticationType;
    }

    /**
     * Certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="certificateCommonName")
      private final @Nullable Output<Object> certificateCommonName;

    public Output<Object> certificateCommonName() {
        return this.certificateCommonName == null ? Codegen.empty() : this.certificateCommonName;
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
     * The connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<Object> connectionString;

    public Output<Object> connectionString() {
        return this.connectionString == null ? Codegen.empty() : this.connectionString;
    }

    /**
     * Database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database")
      private final @Nullable Output<Object> database;

    public Output<Object> database() {
        return this.database == null ? Codegen.empty() : this.database;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packageCollection")
      private final @Nullable Output<Object> packageCollection;

    public Output<Object> packageCollection() {
        return this.packageCollection == null ? Codegen.empty() : this.packageCollection;
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
     * Server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
      private final @Nullable Output<Object> server;

    public Output<Object> server() {
        return this.server == null ? Codegen.empty() : this.server;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Db2&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
      private final @Nullable Output<Object> username;

    public Output<Object> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public Db2LinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Either<String,Db2AuthenticationType>> authenticationType,
        @Nullable Output<Object> certificateCommonName,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<Object> connectionString,
        @Nullable Output<Object> database,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> packageCollection,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> server,
        Output<String> type,
        @Nullable Output<Object> username) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.certificateCommonName = certificateCommonName;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.packageCollection = packageCollection;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.username = username;
    }

    private Db2LinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.certificateCommonName = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionString = Codegen.empty();
        this.database = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.packageCollection = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.server = Codegen.empty();
        this.type = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Db2LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Either<String,Db2AuthenticationType>> authenticationType;
        private @Nullable Output<Object> certificateCommonName;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<Object> connectionString;
        private @Nullable Output<Object> database;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> packageCollection;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> server;
        private Output<String> type;
        private @Nullable Output<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(Db2LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.packageCollection = defaults.packageCollection;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
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
        public Builder authenticationType(@Nullable Output<Either<String,Db2AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,Db2AuthenticationType> authenticationType) {
            this.authenticationType = Codegen.ofNullable(authenticationType);
            return this;
        }
        public Builder certificateCommonName(@Nullable Output<Object> certificateCommonName) {
            this.certificateCommonName = certificateCommonName;
            return this;
        }
        public Builder certificateCommonName(@Nullable Object certificateCommonName) {
            this.certificateCommonName = Codegen.ofNullable(certificateCommonName);
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
        public Builder connectionString(@Nullable Output<Object> connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = Codegen.ofNullable(connectionString);
            return this;
        }
        public Builder database(@Nullable Output<Object> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable Object database) {
            this.database = Codegen.ofNullable(database);
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
        public Builder packageCollection(@Nullable Output<Object> packageCollection) {
            this.packageCollection = packageCollection;
            return this;
        }
        public Builder packageCollection(@Nullable Object packageCollection) {
            this.packageCollection = Codegen.ofNullable(packageCollection);
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
        public Builder server(@Nullable Output<Object> server) {
            this.server = server;
            return this;
        }
        public Builder server(@Nullable Object server) {
            this.server = Codegen.ofNullable(server);
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
        }        public Db2LinkedServiceArgs build() {
            return new Db2LinkedServiceArgs(annotations, authenticationType, certificateCommonName, connectVia, connectionString, database, description, encryptedCredential, packageCollection, parameters, password, server, type, username);
        }
    }
}
