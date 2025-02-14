// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kubernetesconfiguration.FluxConfigurationArgs;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.GitRepositoryDefinitionResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.KustomizationDefinitionResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectStatusDefinitionResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Flux Configuration object returned in Get &amp; Put response.
 * API Version: 2021-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kubernetesconfiguration:FluxConfiguration srs-fluxconfig /subscriptions/subId1/resourceGroups/rg1/providers/Microsoft.Kubernetes/connectedClusters/clusterName1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/srs-fluxconfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetesconfiguration:FluxConfiguration")
public class FluxConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
     */
    @Export(name="complianceState", type=String.class, parameters={})
    private Output<String> complianceState;

    /**
     * @return Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
     */
    public Output<String> complianceState() {
        return this.complianceState;
    }
    /**
     * Key-value pairs of protected configuration settings for the configuration
     * 
     */
    @Export(name="configurationProtectedSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationProtectedSettings;

    /**
     * @return Key-value pairs of protected configuration settings for the configuration
     * 
     */
    public Output<Optional<Map<String,String>>> configurationProtectedSettings() {
        return Codegen.optional(this.configurationProtectedSettings);
    }
    /**
     * Error message returned to the user in the case of provisioning failure.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return Error message returned to the user in the case of provisioning failure.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    @Export(name="gitRepository", type=GitRepositoryDefinitionResponse.class, parameters={})
    private Output</* @Nullable */ GitRepositoryDefinitionResponse> gitRepository;

    /**
     * @return Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    public Output<Optional<GitRepositoryDefinitionResponse>> gitRepository() {
        return Codegen.optional(this.gitRepository);
    }
    /**
     * Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    @Export(name="kustomizations", type=Map.class, parameters={String.class, KustomizationDefinitionResponse.class})
    private Output</* @Nullable */ Map<String,KustomizationDefinitionResponse>> kustomizations;

    /**
     * @return Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    public Output<Optional<Map<String,KustomizationDefinitionResponse>>> kustomizations() {
        return Codegen.optional(this.kustomizations);
    }
    /**
     * Datetime the fluxConfiguration last synced its source on the cluster.
     * 
     */
    @Export(name="lastSourceSyncedAt", type=String.class, parameters={})
    private Output<String> lastSourceSyncedAt;

    /**
     * @return Datetime the fluxConfiguration last synced its source on the cluster.
     * 
     */
    public Output<String> lastSourceSyncedAt() {
        return this.lastSourceSyncedAt;
    }
    /**
     * Branch and SHA of the last source commit synced with the cluster.
     * 
     */
    @Export(name="lastSourceSyncedCommitId", type=String.class, parameters={})
    private Output<String> lastSourceSyncedCommitId;

    /**
     * @return Branch and SHA of the last source commit synced with the cluster.
     * 
     */
    public Output<String> lastSourceSyncedCommitId() {
        return this.lastSourceSyncedCommitId;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * Status of the creation of the fluxConfiguration.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Status of the creation of the fluxConfiguration.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
     */
    @Export(name="repositoryPublicKey", type=String.class, parameters={})
    private Output<String> repositoryPublicKey;

    /**
     * @return Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
     */
    public Output<String> repositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    /**
     * Scope at which the operator will be installed.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Scope at which the operator will be installed.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Source Kind to pull the configuration data from.
     * 
     */
    @Export(name="sourceKind", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceKind;

    /**
     * @return Source Kind to pull the configuration data from.
     * 
     */
    public Output<Optional<String>> sourceKind() {
        return Codegen.optional(this.sourceKind);
    }
    /**
     * Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ObjectStatusDefinitionResponse.class})
    private Output<List<ObjectStatusDefinitionResponse>> statuses;

    /**
     * @return Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
     */
    public Output<List<ObjectStatusDefinitionResponse>> statuses() {
        return this.statuses;
    }
    /**
     * Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    @Export(name="suspend", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> suspend;

    /**
     * @return Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    public Output<Optional<Boolean>> suspend() {
        return Codegen.optional(this.suspend);
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FluxConfiguration(String name) {
        this(name, FluxConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:FluxConfiguration", name, args == null ? FluxConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FluxConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:FluxConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20211101preview:FluxConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20220101preview:FluxConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20220301:FluxConfiguration").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FluxConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FluxConfiguration(name, id, options);
    }
}
