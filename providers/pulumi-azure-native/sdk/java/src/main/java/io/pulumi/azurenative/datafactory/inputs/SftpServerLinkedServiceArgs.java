// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.SftpAuthenticationType;
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
 * A linked service for an SSH File Transfer Protocol (SFTP) server.
 * 
 */
public final class SftpServerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SftpServerLinkedServiceArgs Empty = new SftpServerLinkedServiceArgs();

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
      private final @Nullable Output<Either<String,SftpAuthenticationType>> authenticationType;

    public Output<Either<String,SftpAuthenticationType>> authenticationType() {
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="host", required=true)
      private final Output<Object> host;

    public Output<Object> host() {
        return this.host;
    }

    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostKeyFingerprint")
      private final @Nullable Output<Object> hostKeyFingerprint;

    public Output<Object> hostKeyFingerprint() {
        return this.hostKeyFingerprint == null ? Codegen.empty() : this.hostKeyFingerprint;
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
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     */
    @Import(name="passPhrase")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase() {
        return this.passPhrase == null ? Codegen.empty() : this.passPhrase;
    }

    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Object> port;

    public Output<Object> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
     */
    @Import(name="privateKeyContent")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent() {
        return this.privateKeyContent == null ? Codegen.empty() : this.privateKeyContent;
    }

    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="privateKeyPath")
      private final @Nullable Output<Object> privateKeyPath;

    public Output<Object> privateKeyPath() {
        return this.privateKeyPath == null ? Codegen.empty() : this.privateKeyPath;
    }

    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="skipHostKeyValidation")
      private final @Nullable Output<Object> skipHostKeyValidation;

    public Output<Object> skipHostKeyValidation() {
        return this.skipHostKeyValidation == null ? Codegen.empty() : this.skipHostKeyValidation;
    }

    /**
     * Type of linked service.
     * Expected value is 'Sftp'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public SftpServerLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Either<String,SftpAuthenticationType>> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> host,
        @Nullable Output<Object> hostKeyFingerprint,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> port,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent,
        @Nullable Output<Object> privateKeyPath,
        @Nullable Output<Object> skipHostKeyValidation,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.hostKeyFingerprint = hostKeyFingerprint;
        this.parameters = parameters;
        this.passPhrase = passPhrase;
        this.password = password;
        this.port = port;
        this.privateKeyContent = privateKeyContent;
        this.privateKeyPath = privateKeyPath;
        this.skipHostKeyValidation = skipHostKeyValidation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SftpServerLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.host = Codegen.empty();
        this.hostKeyFingerprint = Codegen.empty();
        this.parameters = Codegen.empty();
        this.passPhrase = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.privateKeyContent = Codegen.empty();
        this.privateKeyPath = Codegen.empty();
        this.skipHostKeyValidation = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpServerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Either<String,SftpAuthenticationType>> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> host;
        private @Nullable Output<Object> hostKeyFingerprint;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> port;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent;
        private @Nullable Output<Object> privateKeyPath;
        private @Nullable Output<Object> skipHostKeyValidation;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpServerLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.hostKeyFingerprint = defaults.hostKeyFingerprint;
    	      this.parameters = defaults.parameters;
    	      this.passPhrase = defaults.passPhrase;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKeyContent = defaults.privateKeyContent;
    	      this.privateKeyPath = defaults.privateKeyPath;
    	      this.skipHostKeyValidation = defaults.skipHostKeyValidation;
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
        public Builder authenticationType(@Nullable Output<Either<String,SftpAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,SftpAuthenticationType> authenticationType) {
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
        public Builder hostKeyFingerprint(@Nullable Output<Object> hostKeyFingerprint) {
            this.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }
        public Builder hostKeyFingerprint(@Nullable Object hostKeyFingerprint) {
            this.hostKeyFingerprint = Codegen.ofNullable(hostKeyFingerprint);
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
        public Builder passPhrase(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }
        public Builder passPhrase(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> passPhrase) {
            this.passPhrase = Codegen.ofNullable(passPhrase);
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
        public Builder privateKeyContent(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent) {
            this.privateKeyContent = privateKeyContent;
            return this;
        }
        public Builder privateKeyContent(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> privateKeyContent) {
            this.privateKeyContent = Codegen.ofNullable(privateKeyContent);
            return this;
        }
        public Builder privateKeyPath(@Nullable Output<Object> privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }
        public Builder privateKeyPath(@Nullable Object privateKeyPath) {
            this.privateKeyPath = Codegen.ofNullable(privateKeyPath);
            return this;
        }
        public Builder skipHostKeyValidation(@Nullable Output<Object> skipHostKeyValidation) {
            this.skipHostKeyValidation = skipHostKeyValidation;
            return this;
        }
        public Builder skipHostKeyValidation(@Nullable Object skipHostKeyValidation) {
            this.skipHostKeyValidation = Codegen.ofNullable(skipHostKeyValidation);
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
        }        public SftpServerLinkedServiceArgs build() {
            return new SftpServerLinkedServiceArgs(annotations, authenticationType, connectVia, description, encryptedCredential, host, hostKeyFingerprint, parameters, passPhrase, password, port, privateKeyContent, privateKeyPath, skipHostKeyValidation, type, userName);
        }
    }
}
