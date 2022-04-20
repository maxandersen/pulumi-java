// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HDInsightLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    private final Object clusterUri;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileSystem;
    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;
    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    private final @Nullable Object isEspEnabled;
    /**
     * The Azure Storage linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * HDInsight cluster password.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Type of linked service.
     * Expected value is &#39;HDInsight&#39;.
     * 
     */
    private final String type;
    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @CustomType.Constructor
    private HDInsightLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("clusterUri") Object clusterUri,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("fileSystem") @Nullable Object fileSystem,
        @CustomType.Parameter("hcatalogLinkedServiceName") @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName,
        @CustomType.Parameter("isEspEnabled") @Nullable Object isEspEnabled,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") @Nullable Object userName) {
        this.annotations = annotations;
        this.clusterUri = clusterUri;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileSystem = fileSystem;
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        this.isEspEnabled = isEspEnabled;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.password = password;
        this.type = type;
        this.userName = userName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
    */
    public Object clusterUri() {
        return this.clusterUri;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }
    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> hcatalogLinkedServiceName() {
        return Optional.ofNullable(this.hcatalogLinkedServiceName);
    }
    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
    */
    public Optional<Object> isEspEnabled() {
        return Optional.ofNullable(this.isEspEnabled);
    }
    /**
     * The Azure Storage linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * HDInsight cluster password.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Type of linked service.
     * Expected value is &#39;HDInsight&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object clusterUri;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object fileSystem;
        private @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;
        private @Nullable Object isEspEnabled;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightLinkedServiceResponse defaults) {
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

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clusterUri(Object clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
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
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder fileSystem(@Nullable Object fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public Builder hcatalogLinkedServiceName(@Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }
        public Builder isEspEnabled(@Nullable Object isEspEnabled) {
            this.isEspEnabled = isEspEnabled;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public HDInsightLinkedServiceResponse build() {
            return new HDInsightLinkedServiceResponse(annotations, clusterUri, connectVia, description, encryptedCredential, fileSystem, hcatalogLinkedServiceName, isEspEnabled, linkedServiceName, parameters, password, type, userName);
        }
    }
}
