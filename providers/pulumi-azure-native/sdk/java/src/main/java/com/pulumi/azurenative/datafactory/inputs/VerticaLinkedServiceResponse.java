// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
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
 * Vertica linked service.
 * 
 */
public final class VerticaLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final VerticaLinkedServiceResponse Empty = new VerticaLinkedServiceResponse();

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
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
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
     * The Azure key vault secret reference of password in connection string.
     * 
     */
    @Import(name="pwd")
    private @Nullable AzureKeyVaultSecretReferenceResponse pwd;

    public Optional<AzureKeyVaultSecretReferenceResponse> pwd() {
        return Optional.ofNullable(this.pwd);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Vertica&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private VerticaLinkedServiceResponse() {}

    private VerticaLinkedServiceResponse(VerticaLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.pwd = $.pwd;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerticaLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerticaLinkedServiceResponse $;

        public Builder() {
            $ = new VerticaLinkedServiceResponse();
        }

        public Builder(VerticaLinkedServiceResponse defaults) {
            $ = new VerticaLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
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

        public Builder pwd(@Nullable AzureKeyVaultSecretReferenceResponse pwd) {
            $.pwd = pwd;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public VerticaLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
