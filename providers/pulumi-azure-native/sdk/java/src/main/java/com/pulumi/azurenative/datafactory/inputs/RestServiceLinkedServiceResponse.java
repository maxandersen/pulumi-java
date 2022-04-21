// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
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
 * Rest Service linked service.
 * 
 */
public final class RestServiceLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestServiceLinkedServiceResponse Empty = new RestServiceLinkedServiceResponse();

    /**
     * The resource you are requesting authorization to use.
     * 
     */
    @Import(name="aadResourceId")
    private @Nullable Object aadResourceId;

    public Optional<Object> aadResourceId() {
        return Optional.ofNullable(this.aadResourceId);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="authHeaders")
    private @Nullable Object authHeaders;

    public Optional<Object> authHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }

    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    @Import(name="authenticationType", required=true)
    private String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
    private @Nullable Object azureCloudType;

    public Optional<Object> azureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableServerCertificateValidation")
    private @Nullable Object enableServerCertificateValidation;

    public Optional<Object> enableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password used in Basic authentication type.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The application&#39;s client ID used in AadServicePrincipal authentication type.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The application&#39;s key used in AadServicePrincipal authentication type.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    @Import(name="tenant")
    private @Nullable Object tenant;

    public Optional<Object> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;RestService&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The base URL of the REST service.
     * 
     */
    @Import(name="url", required=true)
    private Object url;

    public Object url() {
        return this.url;
    }

    /**
     * The user name used in Basic authentication type.
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private RestServiceLinkedServiceResponse() {}

    private RestServiceLinkedServiceResponse(RestServiceLinkedServiceResponse $) {
        this.aadResourceId = $.aadResourceId;
        this.annotations = $.annotations;
        this.authHeaders = $.authHeaders;
        this.authenticationType = $.authenticationType;
        this.azureCloudType = $.azureCloudType;
        this.connectVia = $.connectVia;
        this.credential = $.credential;
        this.description = $.description;
        this.enableServerCertificateValidation = $.enableServerCertificateValidation;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.url = $.url;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestServiceLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestServiceLinkedServiceResponse $;

        public Builder() {
            $ = new RestServiceLinkedServiceResponse();
        }

        public Builder(RestServiceLinkedServiceResponse defaults) {
            $ = new RestServiceLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder aadResourceId(@Nullable Object aadResourceId) {
            $.aadResourceId = aadResourceId;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authHeaders(@Nullable Object authHeaders) {
            $.authHeaders = authHeaders;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder azureCloudType(@Nullable Object azureCloudType) {
            $.azureCloudType = azureCloudType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            $.credential = credential;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder enableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            $.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder tenant(@Nullable Object tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder url(Object url) {
            $.url = url;
            return this;
        }

        public Builder userName(@Nullable Object userName) {
            $.userName = userName;
            return this;
        }

        public RestServiceLinkedServiceResponse build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
