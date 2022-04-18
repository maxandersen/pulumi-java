// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Impala server linked service.
 * 
 */
public final class ImpalaLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImpalaLinkedServiceResponse Empty = new ImpalaLinkedServiceResponse();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
      private final @Nullable Object allowHostNameCNMismatch;

    public Optional<Object> allowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch == null ? Optional.empty() : Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @Import(name="allowSelfSignedServerCert")
      private final @Nullable Object allowSelfSignedServerCert;

    public Optional<Object> allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Optional.empty() : Optional.ofNullable(this.allowSelfSignedServerCert);
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
     * The authentication type to use.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @Import(name="enableSsl")
      private final @Nullable Object enableSsl;

    public Optional<Object> enableSsl() {
        return this.enableSsl == null ? Optional.empty() : Optional.ofNullable(this.enableSsl);
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
     * The IP address or host name of the Impala server. (i.e. 192.168.222.160)
     * 
     */
    @Import(name="host", required=true)
      private final Object host;

    public Object host() {
        return this.host;
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
     * The password corresponding to the user name when using UsernameAndPassword.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password() {
        return this.password == null ? null : this.password;
    }

    /**
     * The TCP port that the Impala server uses to listen for client connections. The default value is 21050.
     * 
     */
    @Import(name="port")
      private final @Nullable Object port;

    public Optional<Object> port() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
      private final @Nullable Object trustedCertPath;

    public Optional<Object> trustedCertPath() {
        return this.trustedCertPath == null ? Optional.empty() : Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is 'Impala'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
      private final @Nullable Object useSystemTrustStore;

    public Optional<Object> useSystemTrustStore() {
        return this.useSystemTrustStore == null ? Optional.empty() : Optional.ofNullable(this.useSystemTrustStore);
    }

    /**
     * The user name used to access the Impala server. The default value is anonymous when using SASLUsername.
     * 
     */
    @Import(name="username")
      private final @Nullable Object username;

    public Optional<Object> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public ImpalaLinkedServiceResponse(
        @Nullable Object allowHostNameCNMismatch,
        @Nullable Object allowSelfSignedServerCert,
        @Nullable List<Object> annotations,
        String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object enableSsl,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        @Nullable Object trustedCertPath,
        String type,
        @Nullable Object useSystemTrustStore,
        @Nullable Object username) {
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
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    private ImpalaLinkedServiceResponse() {
        this.allowHostNameCNMismatch = null;
        this.allowSelfSignedServerCert = null;
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.description = null;
        this.enableSsl = null;
        this.encryptedCredential = null;
        this.host = null;
        this.parameters = Map.of();
        this.password = null;
        this.port = null;
        this.trustedCertPath = null;
        this.type = null;
        this.useSystemTrustStore = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImpalaLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowHostNameCNMismatch;
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(ImpalaLinkedServiceResponse defaults) {
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

        public Builder allowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
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
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
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
        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder host(Object host) {
            this.host = Objects.requireNonNull(host);
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
        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }        public ImpalaLinkedServiceResponse build() {
            return new ImpalaLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, parameters, password, port, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
