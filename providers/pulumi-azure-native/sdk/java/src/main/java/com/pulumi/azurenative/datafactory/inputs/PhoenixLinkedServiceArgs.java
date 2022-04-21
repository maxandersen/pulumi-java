// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.PhoenixAuthenticationType;
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
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Phoenix server linked service.
 * 
 */
public final class PhoenixLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PhoenixLinkedServiceArgs Empty = new PhoenixLinkedServiceArgs();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
    private @Nullable Output<Object> allowHostNameCNMismatch;

    public Optional<Output<Object>> allowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @Import(name="allowSelfSignedServerCert")
    private @Nullable Output<Object> allowSelfSignedServerCert;

    public Optional<Output<Object>> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The authentication mechanism used to connect to the Phoenix server.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,PhoenixAuthenticationType>> authenticationType;

    public Output<Either<String,PhoenixAuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @Import(name="enableSsl")
    private @Nullable Output<Object> enableSsl;

    public Optional<Output<Object>> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The IP address or host name of the Phoenix server. (i.e. 192.168.222.160)
     * 
     */
    @Import(name="host", required=true)
    private Output<Object> host;

    public Output<Object> host() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the Phoenix server. (i.e. /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     * 
     */
    @Import(name="httpPath")
    private @Nullable Output<Object> httpPath;

    public Optional<Output<Object>> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password corresponding to the user name.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port that the Phoenix server uses to listen for client connections. The default value is 8765.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
    private @Nullable Output<Object> trustedCertPath;

    public Optional<Output<Object>> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Phoenix&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
    private @Nullable Output<Object> useSystemTrustStore;

    public Optional<Output<Object>> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    /**
     * The user name used to connect to the Phoenix server.
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private PhoenixLinkedServiceArgs() {}

    private PhoenixLinkedServiceArgs(PhoenixLinkedServiceArgs $) {
        this.allowHostNameCNMismatch = $.allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = $.allowSelfSignedServerCert;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.enableSsl = $.enableSsl;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.httpPath = $.httpPath;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useSystemTrustStore = $.useSystemTrustStore;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PhoenixLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PhoenixLinkedServiceArgs $;

        public Builder() {
            $ = new PhoenixLinkedServiceArgs();
        }

        public Builder(PhoenixLinkedServiceArgs defaults) {
            $ = new PhoenixLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowHostNameCNMismatch(@Nullable Output<Object> allowHostNameCNMismatch) {
            $.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder allowHostNameCNMismatch(Object allowHostNameCNMismatch) {
            return allowHostNameCNMismatch(Output.of(allowHostNameCNMismatch));
        }

        public Builder allowSelfSignedServerCert(@Nullable Output<Object> allowSelfSignedServerCert) {
            $.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder allowSelfSignedServerCert(Object allowSelfSignedServerCert) {
            return allowSelfSignedServerCert(Output.of(allowSelfSignedServerCert));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(Output<Either<String,PhoenixAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,PhoenixAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableSsl(@Nullable Output<Object> enableSsl) {
            $.enableSsl = enableSsl;
            return this;
        }

        public Builder enableSsl(Object enableSsl) {
            return enableSsl(Output.of(enableSsl));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder host(Output<Object> host) {
            $.host = host;
            return this;
        }

        public Builder host(Object host) {
            return host(Output.of(host));
        }

        public Builder httpPath(@Nullable Output<Object> httpPath) {
            $.httpPath = httpPath;
            return this;
        }

        public Builder httpPath(Object httpPath) {
            return httpPath(Output.of(httpPath));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        public Builder port(Object port) {
            return port(Output.of(port));
        }

        public Builder trustedCertPath(@Nullable Output<Object> trustedCertPath) {
            $.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder trustedCertPath(Object trustedCertPath) {
            return trustedCertPath(Output.of(trustedCertPath));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useSystemTrustStore(@Nullable Output<Object> useSystemTrustStore) {
            $.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder useSystemTrustStore(Object useSystemTrustStore) {
            return useSystemTrustStore(Output.of(useSystemTrustStore));
        }

        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public PhoenixLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
