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
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Shopify Service linked service.
 * 
 */
public final class ShopifyLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShopifyLinkedServiceArgs Empty = new ShopifyLinkedServiceArgs();

    /**
     * The API access token that can be used to access Shopify’s data. The token won&#39;t expire if it is offline mode.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     * 
     */
    @Import(name="host", required=true)
    private Output<Object> host;

    public Output<Object> host() {
        return this.host;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Shopify&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Output<Object> useEncryptedEndpoints;

    public Optional<Output<Object>> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Output<Object> useHostVerification;

    public Optional<Output<Object>> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Output<Object> usePeerVerification;

    public Optional<Output<Object>> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    private ShopifyLinkedServiceArgs() {}

    private ShopifyLinkedServiceArgs(ShopifyLinkedServiceArgs $) {
        this.accessToken = $.accessToken;
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.parameters = $.parameters;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShopifyLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShopifyLinkedServiceArgs $;

        public Builder() {
            $ = new ShopifyLinkedServiceArgs();
        }

        public Builder(ShopifyLinkedServiceArgs defaults) {
            $ = new ShopifyLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder host(Output<Object> host) {
            $.host = host;
            return this;
        }

        public Builder host(Object host) {
            return host(Output.of(host));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(Object useEncryptedEndpoints) {
            return useEncryptedEndpoints(Output.of(useEncryptedEndpoints));
        }

        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(Object useHostVerification) {
            return useHostVerification(Output.of(useHostVerification));
        }

        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(Object usePeerVerification) {
            return usePeerVerification(Output.of(usePeerVerification));
        }

        public ShopifyLinkedServiceArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
