// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
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
 * SAP HANA Linked Service.
 * 
 */
public final class SapHanaLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SapHanaLinkedServiceResponse Empty = new SapHanaLinkedServiceResponse();

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
     * The authentication type to be used to connect to the SAP HANA server.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
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
     * SAP HANA ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Object connectionString;

    public Optional<Object> connectionString() {
        return Optional.ofNullable(this.connectionString);
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
     * Password to access the SAP HANA server.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
    private @Nullable Object server;

    public Optional<Object> server() {
        return Optional.ofNullable(this.server);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;SapHana&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Username to access the SAP HANA server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SapHanaLinkedServiceResponse() {}

    private SapHanaLinkedServiceResponse(SapHanaLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.server = $.server;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapHanaLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapHanaLinkedServiceResponse $;

        public Builder() {
            $ = new SapHanaLinkedServiceResponse();
        }

        public Builder(SapHanaLinkedServiceResponse defaults) {
            $ = new SapHanaLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectionString(@Nullable Object connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
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

        public Builder server(@Nullable Object server) {
            $.server = server;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userName(@Nullable Object userName) {
            $.userName = userName;
            return this;
        }

        public SapHanaLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
