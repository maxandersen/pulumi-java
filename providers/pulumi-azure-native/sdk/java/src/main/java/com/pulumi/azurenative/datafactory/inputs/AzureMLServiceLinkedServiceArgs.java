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
 * Azure ML Service linked service.
 * 
 */
public final class AzureMLServiceLinkedServiceArgs extends ResourceArgs {

    public static final AzureMLServiceLinkedServiceArgs Empty = new AzureMLServiceLinkedServiceArgs();

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
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlWorkspaceName", required=true)
    private Output<Object> mlWorkspaceName;

    /**
     * @return Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> mlWorkspaceName() {
        return this.mlWorkspaceName;
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
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<Object> resourceGroupName;

    /**
     * @return Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    /**
     * @return The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    /**
     * @return The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<Object> subscriptionId;

    /**
     * @return Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<Object> tenant;

    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureMLService&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureMLService&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureMLServiceLinkedServiceArgs() {}

    private AzureMLServiceLinkedServiceArgs(AzureMLServiceLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.mlWorkspaceName = $.mlWorkspaceName;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.subscriptionId = $.subscriptionId;
        this.tenant = $.tenant;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLServiceLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLServiceLinkedServiceArgs $;

        public Builder() {
            $ = new AzureMLServiceLinkedServiceArgs();
        }

        public Builder(AzureMLServiceLinkedServiceArgs defaults) {
            $ = new AzureMLServiceLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param mlWorkspaceName Azure ML Service workspace name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlWorkspaceName(Output<Object> mlWorkspaceName) {
            $.mlWorkspaceName = mlWorkspaceName;
            return this;
        }

        /**
         * @param mlWorkspaceName Azure ML Service workspace name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlWorkspaceName(Object mlWorkspaceName) {
            return mlWorkspaceName(Output.of(mlWorkspaceName));
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
         * @param resourceGroupName Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<Object> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Object resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param servicePrincipalId The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        /**
         * @param subscriptionId Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<Object> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Object subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenant The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AzureMLService&#39;.
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
         * Expected value is &#39;AzureMLService&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureMLServiceLinkedServiceArgs build() {
            $.mlWorkspaceName = Objects.requireNonNull($.mlWorkspaceName, "expected parameter 'mlWorkspaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
