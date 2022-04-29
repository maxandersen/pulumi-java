// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

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
 * Common Data Service for Apps linked service.
 * 
 */
public final class CommonDataServiceForAppsLinkedServiceArgs extends ResourceArgs {

    public static final CommonDataServiceForAppsLinkedServiceArgs Empty = new CommonDataServiceForAppsLinkedServiceArgs();

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
     * The authentication type to connect to Common Data Service for Apps server. &#39;Office365&#39; for online scenario, &#39;Ifd&#39; for on-premises with Ifd scenario. &#39;AADServicePrincipal&#39; for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Object> authenticationType;

    /**
     * @return The authentication type to connect to Common Data Service for Apps server. &#39;Office365&#39; for online scenario, &#39;Ifd&#39; for on-premises with Ifd scenario. &#39;AADServicePrincipal&#39; for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> authenticationType() {
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
     * The deployment type of the Common Data Service for Apps instance. &#39;Online&#39; for Common Data Service for Apps Online and &#39;OnPremisesWithIfd&#39; for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deploymentType", required=true)
    private Output<Object> deploymentType;

    /**
     * @return The deployment type of the Common Data Service for Apps instance. &#39;Online&#39; for Common Data Service for Apps Online and &#39;OnPremisesWithIfd&#39; for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> deploymentType() {
        return this.deploymentType;
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
     * The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<Object> hostName;

    /**
     * @return The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="organizationName")
    private @Nullable Output<Object> organizationName;

    /**
     * @return The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> organizationName() {
        return Optional.ofNullable(this.organizationName);
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
     * Password to access the Common Data Service for Apps instance.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return Password to access the Common Data Service for Apps instance.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    /**
     * @return The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;

    /**
     * @return The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalCredential() {
        return Optional.ofNullable(this.servicePrincipalCredential);
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
    private @Nullable Output<Object> servicePrincipalCredentialType;

    /**
     * @return The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> servicePrincipalCredentialType() {
        return Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    /**
     * @return The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUri")
    private @Nullable Output<Object> serviceUri;

    /**
     * @return The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> serviceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;CommonDataServiceForApps&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;CommonDataServiceForApps&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    /**
     * @return User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private CommonDataServiceForAppsLinkedServiceArgs() {}

    private CommonDataServiceForAppsLinkedServiceArgs(CommonDataServiceForAppsLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.deploymentType = $.deploymentType;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.hostName = $.hostName;
        this.organizationName = $.organizationName;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.servicePrincipalCredential = $.servicePrincipalCredential;
        this.servicePrincipalCredentialType = $.servicePrincipalCredentialType;
        this.servicePrincipalId = $.servicePrincipalId;
        this.serviceUri = $.serviceUri;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommonDataServiceForAppsLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommonDataServiceForAppsLinkedServiceArgs $;

        public Builder() {
            $ = new CommonDataServiceForAppsLinkedServiceArgs();
        }

        public Builder(CommonDataServiceForAppsLinkedServiceArgs defaults) {
            $ = new CommonDataServiceForAppsLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param authenticationType The authentication type to connect to Common Data Service for Apps server. &#39;Office365&#39; for online scenario, &#39;Ifd&#39; for on-premises with Ifd scenario. &#39;AADServicePrincipal&#39; for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<Object> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The authentication type to connect to Common Data Service for Apps server. &#39;Office365&#39; for online scenario, &#39;Ifd&#39; for on-premises with Ifd scenario. &#39;AADServicePrincipal&#39; for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Object authenticationType) {
            return authenticationType(Output.of(authenticationType));
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
         * @param deploymentType The deployment type of the Common Data Service for Apps instance. &#39;Online&#39; for Common Data Service for Apps Online and &#39;OnPremisesWithIfd&#39; for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(Output<Object> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType The deployment type of the Common Data Service for Apps instance. &#39;Online&#39; for Common Data Service for Apps Online and &#39;OnPremisesWithIfd&#39; for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(Object deploymentType) {
            return deploymentType(Output.of(deploymentType));
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
         * @param hostName The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<Object> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder hostName(Object hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param organizationName The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder organizationName(@Nullable Output<Object> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder organizationName(Object organizationName) {
            return organizationName(Output.of(organizationName));
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
         * @param password Password to access the Common Data Service for Apps instance.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to access the Common Data Service for Apps instance.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password Password to access the Common Data Service for Apps instance.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password Password to access the Common Data Service for Apps instance.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param port The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder port(Object port) {
            return port(Output.of(port));
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential) {
            $.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalCredential) {
            return servicePrincipalCredential(Output.of(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(AzureKeyVaultSecretReferenceArgs servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofLeft(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(SecureStringArgs servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofRight(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredentialType The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredentialType(@Nullable Output<Object> servicePrincipalCredentialType) {
            $.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        /**
         * @param servicePrincipalCredentialType The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredentialType(Object servicePrincipalCredentialType) {
            return servicePrincipalCredentialType(Output.of(servicePrincipalCredentialType));
        }

        /**
         * @param servicePrincipalId The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param serviceUri The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(@Nullable Output<Object> serviceUri) {
            $.serviceUri = serviceUri;
            return this;
        }

        /**
         * @param serviceUri The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(Object serviceUri) {
            return serviceUri(Output.of(serviceUri));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;CommonDataServiceForApps&#39;.
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
         * Expected value is &#39;CommonDataServiceForApps&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public CommonDataServiceForAppsLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.deploymentType = Objects.requireNonNull($.deploymentType, "expected parameter 'deploymentType' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
