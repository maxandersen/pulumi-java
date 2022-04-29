// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.HBaseAuthenticationType;
import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HBase server linked service.
 * 
 */
public final class HBaseLinkedServiceArgs extends ResourceArgs {

    public static final HBaseLinkedServiceArgs Empty = new HBaseLinkedServiceArgs();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
    private @Nullable Output<Object> allowHostNameCNMismatch;

    /**
     * @return Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    public Optional<Output<Object>> allowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @Import(name="allowSelfSignedServerCert")
    private @Nullable Output<Object> allowSelfSignedServerCert;

    /**
     * @return Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    public Optional<Output<Object>> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The authentication mechanism to use to connect to the HBase server.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,HBaseAuthenticationType>> authenticationType;

    /**
     * @return The authentication mechanism to use to connect to the HBase server.
     * 
     */
    public Output<Either<String,HBaseAuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @Import(name="enableSsl")
    private @Nullable Output<Object> enableSsl;

    /**
     * @return Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    public Optional<Output<Object>> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The IP address or host name of the HBase server. (i.e. 192.168.222.160)
     * 
     */
    @Import(name="host", required=true)
    private Output<Object> host;

    /**
     * @return The IP address or host name of the HBase server. (i.e. 192.168.222.160)
     * 
     */
    public Output<Object> host() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the HBase server. (i.e. /gateway/sandbox/hbase/version)
     * 
     */
    @Import(name="httpPath")
    private @Nullable Output<Object> httpPath;

    /**
     * @return The partial URL corresponding to the HBase server. (i.e. /gateway/sandbox/hbase/version)
     * 
     */
    public Optional<Output<Object>> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password corresponding to the user name.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return The password corresponding to the user name.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port that the HBase instance uses to listen for client connections. The default value is 9090.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    /**
     * @return The TCP port that the HBase instance uses to listen for client connections. The default value is 9090.
     * 
     */
    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
    private @Nullable Output<Object> trustedCertPath;

    /**
     * @return The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    public Optional<Output<Object>> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;HBase&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;HBase&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The user name used to connect to the HBase instance.
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    /**
     * @return The user name used to connect to the HBase instance.
     * 
     */
    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private HBaseLinkedServiceArgs() {}

    private HBaseLinkedServiceArgs(HBaseLinkedServiceArgs $) {
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
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HBaseLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HBaseLinkedServiceArgs $;

        public Builder() {
            $ = new HBaseLinkedServiceArgs();
        }

        public Builder(HBaseLinkedServiceArgs defaults) {
            $ = new HBaseLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowHostNameCNMismatch Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder allowHostNameCNMismatch(@Nullable Output<Object> allowHostNameCNMismatch) {
            $.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        /**
         * @param allowHostNameCNMismatch Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder allowHostNameCNMismatch(Object allowHostNameCNMismatch) {
            return allowHostNameCNMismatch(Output.of(allowHostNameCNMismatch));
        }

        /**
         * @param allowSelfSignedServerCert Specifies whether to allow self-signed certificates from the server. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder allowSelfSignedServerCert(@Nullable Output<Object> allowSelfSignedServerCert) {
            $.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        /**
         * @param allowSelfSignedServerCert Specifies whether to allow self-signed certificates from the server. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder allowSelfSignedServerCert(Object allowSelfSignedServerCert) {
            return allowSelfSignedServerCert(Output.of(allowSelfSignedServerCert));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param authenticationType The authentication mechanism to use to connect to the HBase server.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<Either<String,HBaseAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The authentication mechanism to use to connect to the HBase server.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Either<String,HBaseAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param authenticationType The authentication mechanism to use to connect to the HBase server.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        /**
         * @param authenticationType The authentication mechanism to use to connect to the HBase server.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(HBaseAuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableSsl Specifies whether the connections to the server are encrypted using SSL. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder enableSsl(@Nullable Output<Object> enableSsl) {
            $.enableSsl = enableSsl;
            return this;
        }

        /**
         * @param enableSsl Specifies whether the connections to the server are encrypted using SSL. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder enableSsl(Object enableSsl) {
            return enableSsl(Output.of(enableSsl));
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param host The IP address or host name of the HBase server. (i.e. 192.168.222.160)
         * 
         * @return builder
         * 
         */
        public Builder host(Output<Object> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The IP address or host name of the HBase server. (i.e. 192.168.222.160)
         * 
         * @return builder
         * 
         */
        public Builder host(Object host) {
            return host(Output.of(host));
        }

        /**
         * @param httpPath The partial URL corresponding to the HBase server. (i.e. /gateway/sandbox/hbase/version)
         * 
         * @return builder
         * 
         */
        public Builder httpPath(@Nullable Output<Object> httpPath) {
            $.httpPath = httpPath;
            return this;
        }

        /**
         * @param httpPath The partial URL corresponding to the HBase server. (i.e. /gateway/sandbox/hbase/version)
         * 
         * @return builder
         * 
         */
        public Builder httpPath(Object httpPath) {
            return httpPath(Output.of(httpPath));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param password The password corresponding to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password corresponding to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password The password corresponding to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password The password corresponding to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param port The TCP port that the HBase instance uses to listen for client connections. The default value is 9090.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port that the HBase instance uses to listen for client connections. The default value is 9090.
         * 
         * @return builder
         * 
         */
        public Builder port(Object port) {
            return port(Output.of(port));
        }

        /**
         * @param trustedCertPath The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
         * 
         * @return builder
         * 
         */
        public Builder trustedCertPath(@Nullable Output<Object> trustedCertPath) {
            $.trustedCertPath = trustedCertPath;
            return this;
        }

        /**
         * @param trustedCertPath The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
         * 
         * @return builder
         * 
         */
        public Builder trustedCertPath(Object trustedCertPath) {
            return trustedCertPath(Output.of(trustedCertPath));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;HBase&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;HBase&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username The user name used to connect to the HBase instance.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name used to connect to the HBase instance.
         * 
         * @return builder
         * 
         */
        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public HBaseLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
