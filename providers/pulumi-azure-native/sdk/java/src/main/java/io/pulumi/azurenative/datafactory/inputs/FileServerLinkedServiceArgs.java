// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

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
 * File system linked service.
 * 
 */
public final class FileServerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileServerLinkedServiceArgs Empty = new FileServerLinkedServiceArgs();

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
     * Host name of the server. Type: string (or Expression with resultType string).
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
     * Password to logon the server.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'FileServer'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * User ID to logon the server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userId")
      private final @Nullable Output<Object> userId;

    public Output<Object> userId() {
        return this.userId == null ? Codegen.empty() : this.userId;
    }

    public FileServerLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> host,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<String> type,
        @Nullable Output<Object> userId) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userId = userId;
    }

    private FileServerLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.host = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.type = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> host;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<String> type;
        private @Nullable Output<Object> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
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
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userId(@Nullable Output<Object> userId) {
            this.userId = userId;
            return this;
        }
        public Builder userId(@Nullable Object userId) {
            this.userId = Codegen.ofNullable(userId);
            return this;
        }        public FileServerLinkedServiceArgs build() {
            return new FileServerLinkedServiceArgs(annotations, connectVia, description, encryptedCredential, host, parameters, password, type, userId);
        }
    }
}
