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
 * SAP Business Warehouse Open Hub Destination Linked Service.
 * 
 */
public final class SapOpenHubLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SapOpenHubLinkedServiceResponse Empty = new SapOpenHubLinkedServiceResponse();

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
     * Client ID of the client on the BW system where the open hub destination is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
      private final @Nullable Object clientId;

    public Optional<Object> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Language of the BW system where the open hub destination is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="language")
      private final @Nullable Object language;

    public Optional<Object> language() {
        return this.language == null ? Optional.empty() : Optional.ofNullable(this.language);
    }

    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logonGroup")
      private final @Nullable Object logonGroup;

    public Optional<Object> logonGroup() {
        return this.logonGroup == null ? Optional.empty() : Optional.ofNullable(this.logonGroup);
    }

    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServer")
      private final @Nullable Object messageServer;

    public Optional<Object> messageServer() {
        return this.messageServer == null ? Optional.empty() : Optional.ofNullable(this.messageServer);
    }

    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServerService")
      private final @Nullable Object messageServerService;

    public Optional<Object> messageServerService() {
        return this.messageServerService == null ? Optional.empty() : Optional.ofNullable(this.messageServerService);
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
     * Password to access the SAP BW server where the open hub destination is located.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password() {
        return this.password == null ? null : this.password;
    }

    /**
     * Host name of the SAP BW instance where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
      private final @Nullable Object server;

    public Optional<Object> server() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemId")
      private final @Nullable Object systemId;

    public Optional<Object> systemId() {
        return this.systemId == null ? Optional.empty() : Optional.ofNullable(this.systemId);
    }

    /**
     * System number of the BW system where the open hub destination is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemNumber")
      private final @Nullable Object systemNumber;

    public Optional<Object> systemNumber() {
        return this.systemNumber == null ? Optional.empty() : Optional.ofNullable(this.systemNumber);
    }

    /**
     * Type of linked service.
     * Expected value is 'SapOpenHub'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Username to access the SAP BW server where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Object userName;

    public Optional<Object> userName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public SapOpenHubLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object clientId,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object language,
        @Nullable Object logonGroup,
        @Nullable Object messageServer,
        @Nullable Object messageServerService,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object server,
        @Nullable Object systemId,
        @Nullable Object systemNumber,
        String type,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.language = language;
        this.logonGroup = logonGroup;
        this.messageServer = messageServer;
        this.messageServerService = messageServerService;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.systemId = systemId;
        this.systemNumber = systemNumber;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SapOpenHubLinkedServiceResponse() {
        this.annotations = List.of();
        this.clientId = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.language = null;
        this.logonGroup = null;
        this.messageServer = null;
        this.messageServerService = null;
        this.parameters = Map.of();
        this.password = null;
        this.server = null;
        this.systemId = null;
        this.systemNumber = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object clientId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object language;
        private @Nullable Object logonGroup;
        private @Nullable Object messageServer;
        private @Nullable Object messageServerService;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object server;
        private @Nullable Object systemId;
        private @Nullable Object systemNumber;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.language = defaults.language;
    	      this.logonGroup = defaults.logonGroup;
    	      this.messageServer = defaults.messageServer;
    	      this.messageServerService = defaults.messageServerService;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.systemId = defaults.systemId;
    	      this.systemNumber = defaults.systemNumber;
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
        public Builder clientId(@Nullable Object clientId) {
            this.clientId = clientId;
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
        public Builder language(@Nullable Object language) {
            this.language = language;
            return this;
        }
        public Builder logonGroup(@Nullable Object logonGroup) {
            this.logonGroup = logonGroup;
            return this;
        }
        public Builder messageServer(@Nullable Object messageServer) {
            this.messageServer = messageServer;
            return this;
        }
        public Builder messageServerService(@Nullable Object messageServerService) {
            this.messageServerService = messageServerService;
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
        public Builder server(@Nullable Object server) {
            this.server = server;
            return this;
        }
        public Builder systemId(@Nullable Object systemId) {
            this.systemId = systemId;
            return this;
        }
        public Builder systemNumber(@Nullable Object systemNumber) {
            this.systemNumber = systemNumber;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public SapOpenHubLinkedServiceResponse build() {
            return new SapOpenHubLinkedServiceResponse(annotations, clientId, connectVia, description, encryptedCredential, language, logonGroup, messageServer, messageServerService, parameters, password, server, systemId, systemNumber, type, userName);
        }
    }
}
