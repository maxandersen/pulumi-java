// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
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
 * HDInsight linked service.
 * 
 */
public final class HDInsightLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightLinkedServiceArgs Empty = new HDInsightLinkedServiceArgs();

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
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterUri", required=true)
      private final Output<Object> clusterUri;

    public Output<Object> clusterUri() {
        return this.clusterUri;
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
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileSystem")
      private final @Nullable Output<Object> fileSystem;

    public Output<Object> fileSystem() {
        return this.fileSystem == null ? Codegen.empty() : this.fileSystem;
    }

    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    @Import(name="hcatalogLinkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;

    public Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName == null ? Codegen.empty() : this.hcatalogLinkedServiceName;
    }

    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    @Import(name="isEspEnabled")
      private final @Nullable Output<Object> isEspEnabled;

    public Output<Object> isEspEnabled() {
        return this.isEspEnabled == null ? Codegen.empty() : this.isEspEnabled;
    }

    /**
     * The Azure Storage linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName == null ? Codegen.empty() : this.linkedServiceName;
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
     * HDInsight cluster password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;HDInsight&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public HDInsightLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Object> clusterUri,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> fileSystem,
        @Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName,
        @Nullable Output<Object> isEspEnabled,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.clusterUri = Objects.requireNonNull(clusterUri, "expected parameter 'clusterUri' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileSystem = fileSystem;
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        this.isEspEnabled = isEspEnabled;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.password = password;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userName = userName;
    }

    private HDInsightLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.clusterUri = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.fileSystem = Codegen.empty();
        this.hcatalogLinkedServiceName = Codegen.empty();
        this.isEspEnabled = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Object> clusterUri;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> fileSystem;
        private @Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;
        private @Nullable Output<Object> isEspEnabled;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterUri = defaults.clusterUri;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.fileSystem = defaults.fileSystem;
    	      this.hcatalogLinkedServiceName = defaults.hcatalogLinkedServiceName;
    	      this.isEspEnabled = defaults.isEspEnabled;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
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
        public Builder clusterUri(Output<Object> clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }
        public Builder clusterUri(Object clusterUri) {
            this.clusterUri = Output.of(Objects.requireNonNull(clusterUri));
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
        public Builder fileSystem(@Nullable Output<Object> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public Builder fileSystem(@Nullable Object fileSystem) {
            this.fileSystem = Codegen.ofNullable(fileSystem);
            return this;
        }
        public Builder hcatalogLinkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }
        public Builder hcatalogLinkedServiceName(@Nullable LinkedServiceReferenceArgs hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = Codegen.ofNullable(hcatalogLinkedServiceName);
            return this;
        }
        public Builder isEspEnabled(@Nullable Output<Object> isEspEnabled) {
            this.isEspEnabled = isEspEnabled;
            return this;
        }
        public Builder isEspEnabled(@Nullable Object isEspEnabled) {
            this.isEspEnabled = Codegen.ofNullable(isEspEnabled);
            return this;
        }
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Codegen.ofNullable(linkedServiceName);
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
        public Builder userName(@Nullable Output<Object> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public HDInsightLinkedServiceArgs build() {
            return new HDInsightLinkedServiceArgs(annotations, clusterUri, connectVia, description, encryptedCredential, fileSystem, hcatalogLinkedServiceName, isEspEnabled, linkedServiceName, parameters, password, type, userName);
        }
    }
}
