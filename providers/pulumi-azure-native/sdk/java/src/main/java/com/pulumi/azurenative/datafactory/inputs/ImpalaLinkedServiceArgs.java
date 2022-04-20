// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.ImpalaAuthenticationType;
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
 * Impala server linked service.
 * 
 */
public final class ImpalaLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImpalaLinkedServiceArgs Empty = new ImpalaLinkedServiceArgs();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
      private final @Nullable Output<Object> allowHostNameCNMismatch;

    public Output<Object> allowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch == null ? Codegen.empty() : this.allowHostNameCNMismatch;
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
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
     * The authentication type to use.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<Either<String,ImpalaAuthenticationType>> authenticationType;

    public Output<Either<String,ImpalaAuthenticationType>> authenticationType() {
        return this.authenticationType;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
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
     * The IP address or host name of the Impala server. (i.e. 192.168.222.160)
     * 
     */
    @Import(name="host", required=true)
      private final Output<Object> host;

    public Output<Object> host() {
        return this.host;
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
     * The password corresponding to the user name when using UsernameAndPassword.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The TCP port that the Impala server uses to listen for client connections. The default value is 21050.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Object> port;

    public Output<Object> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
      private final @Nullable Output<Object> trustedCertPath;

    public Output<Object> trustedCertPath() {
        return this.trustedCertPath == null ? Codegen.empty() : this.trustedCertPath;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Impala&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
      private final @Nullable Output<Object> useSystemTrustStore;

    public Output<Object> useSystemTrustStore() {
        return this.useSystemTrustStore == null ? Codegen.empty() : this.useSystemTrustStore;
    }

    /**
     * The user name used to access the Impala server. The default value is anonymous when using SASLUsername.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<Object> username;

    public Output<Object> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public ImpalaLinkedServiceArgs(
        @Nullable Output<Object> allowHostNameCNMismatch,
        @Nullable Output<Object> allowSelfSignedServerCert,
        @Nullable Output<List<Object>> annotations,
        Output<Either<String,ImpalaAuthenticationType>> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> enableSsl,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> host,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> port,
        @Nullable Output<Object> trustedCertPath,
        Output<String> type,
        @Nullable Output<Object> useSystemTrustStore,
        @Nullable Output<Object> username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.trustedCertPath = trustedCertPath;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    private ImpalaLinkedServiceArgs() {
        this.allowHostNameCNMismatch = Codegen.empty();
        this.allowSelfSignedServerCert = Codegen.empty();
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.enableSsl = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.host = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.trustedCertPath = Codegen.empty();
        this.type = Codegen.empty();
        this.useSystemTrustStore = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImpalaLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> allowHostNameCNMismatch;
        private @Nullable Output<Object> allowSelfSignedServerCert;
        private @Nullable Output<List<Object>> annotations;
        private Output<Either<String,ImpalaAuthenticationType>> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> enableSsl;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> host;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> port;
        private @Nullable Output<Object> trustedCertPath;
        private Output<String> type;
        private @Nullable Output<Object> useSystemTrustStore;
        private @Nullable Output<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ImpalaLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
        }

        public Builder allowHostNameCNMismatch(@Nullable Output<Object> allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }
        public Builder allowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = Codegen.ofNullable(allowHostNameCNMismatch);
            return this;
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
        public Builder authenticationType(Output<Either<String,ImpalaAuthenticationType>> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(Either<String,ImpalaAuthenticationType> authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
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
        public Builder host(Output<Object> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(Object host) {
            this.host = Output.of(Objects.requireNonNull(host));
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
        public Builder trustedCertPath(@Nullable Output<Object> trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }
        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = Codegen.ofNullable(trustedCertPath);
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
        public Builder useSystemTrustStore(@Nullable Output<Object> useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }
        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = Codegen.ofNullable(useSystemTrustStore);
            return this;
        }
        public Builder username(@Nullable Output<Object> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public ImpalaLinkedServiceArgs build() {
            return new ImpalaLinkedServiceArgs(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, parameters, password, port, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
