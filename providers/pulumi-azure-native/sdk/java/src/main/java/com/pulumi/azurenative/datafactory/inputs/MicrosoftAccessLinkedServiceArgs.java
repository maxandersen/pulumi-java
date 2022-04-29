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
 * Microsoft Access linked service.
 * 
 */
public final class MicrosoftAccessLinkedServiceArgs extends ResourceArgs {

    public static final MicrosoftAccessLinkedServiceArgs Empty = new MicrosoftAccessLinkedServiceArgs();

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
     * Type of authentication used to connect to the Microsoft Access as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<Object> authenticationType;

    /**
     * @return Type of authentication used to connect to the Microsoft Access as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
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
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
    private Output<Object> connectionString;

    /**
     * @return The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Output<Object> connectionString() {
        return this.connectionString;
    }

    /**
     * The access credential portion of the connection string specified in driver-specific property-value format.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential;

    /**
     * @return The access credential portion of the connection string specified in driver-specific property-value format.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> credential() {
        return Optional.ofNullable(this.credential);
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
     * Password for Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return Password for Basic authentication.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;MicrosoftAccess&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;MicrosoftAccess&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Output<Object> userName;

    /**
     * @return User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private MicrosoftAccessLinkedServiceArgs() {}

    private MicrosoftAccessLinkedServiceArgs(MicrosoftAccessLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.credential = $.credential;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MicrosoftAccessLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MicrosoftAccessLinkedServiceArgs $;

        public Builder() {
            $ = new MicrosoftAccessLinkedServiceArgs();
        }

        public Builder(MicrosoftAccessLinkedServiceArgs defaults) {
            $ = new MicrosoftAccessLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param authenticationType Type of authentication used to connect to the Microsoft Access as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<Object> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Type of authentication used to connect to the Microsoft Access as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
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
         * @param connectionString The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(Output<Object> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(Object connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param credential The access credential portion of the connection string specified in driver-specific property-value format.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The access credential portion of the connection string specified in driver-specific property-value format.
         * 
         * @return builder
         * 
         */
        public Builder credential(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param credential The access credential portion of the connection string specified in driver-specific property-value format.
         * 
         * @return builder
         * 
         */
        public Builder credential(AzureKeyVaultSecretReferenceArgs credential) {
            return credential(Either.ofLeft(credential));
        }

        /**
         * @param credential The access credential portion of the connection string specified in driver-specific property-value format.
         * 
         * @return builder
         * 
         */
        public Builder credential(SecureStringArgs credential) {
            return credential(Either.ofRight(credential));
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
         * @param password Password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password Password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password Password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;MicrosoftAccess&#39;.
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
         * Expected value is &#39;MicrosoftAccess&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userName User name for Basic authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName User name for Basic authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public MicrosoftAccessLinkedServiceArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
