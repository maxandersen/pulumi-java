// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.FtpAuthenticationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A FTP server Linked Service.
 * 
 */
public final class FtpServerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FtpServerLinkedServiceArgs Empty = new FtpServerLinkedServiceArgs();

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
     * The authentication type to be used to connect to the FTP server.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,FtpAuthenticationType>> authenticationType;

    public Output<Either<String,FtpAuthenticationType>> authenticationType() {
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
     * If true, validate the FTP server SSL certificate when connect over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableServerCertificateValidation")
      private final @Nullable Output<Object> enableServerCertificateValidation;

    public Output<Object> enableServerCertificateValidation() {
        return this.enableServerCertificateValidation == null ? Codegen.empty() : this.enableServerCertificateValidation;
    }

    /**
     * If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
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
     * Host name of the FTP server. Type: string (or Expression with resultType string).
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
     * Password to logon the FTP server.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The TCP port number that the FTP server uses to listen for client connections. Default value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Object> port;

    public Output<Object> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Type of linked service.
     * Expected value is 'FtpServer'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public FtpServerLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Either<String,FtpAuthenticationType>> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> enableServerCertificateValidation,
        @Nullable Output<Object> enableSsl,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> host,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> port,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private FtpServerLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.enableServerCertificateValidation = Codegen.empty();
        this.enableSsl = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.host = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FtpServerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Either<String,FtpAuthenticationType>> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> enableServerCertificateValidation;
        private @Nullable Output<Object> enableSsl;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> host;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> port;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(FtpServerLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
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
        public Builder authenticationType(@Nullable Output<Either<String,FtpAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,FtpAuthenticationType> authenticationType) {
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
        public Builder enableServerCertificateValidation(@Nullable Output<Object> enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }
        public Builder enableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = Codegen.ofNullable(enableServerCertificateValidation);
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
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(@Nullable Output<Object> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public FtpServerLinkedServiceArgs build() {
            return new FtpServerLinkedServiceArgs(annotations, authenticationType, connectVia, description, enableServerCertificateValidation, enableSsl, encryptedCredential, host, parameters, password, port, type, userName);
        }
    }
}
