// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kusto.ClusterArgs;
import com.pulumi.azurenative.kusto.outputs.AzureSkuResponse;
import com.pulumi.azurenative.kusto.outputs.IdentityResponse;
import com.pulumi.azurenative.kusto.outputs.KeyVaultPropertiesResponse;
import com.pulumi.azurenative.kusto.outputs.LanguageExtensionsListResponse;
import com.pulumi.azurenative.kusto.outputs.OptimizedAutoscaleResponse;
import com.pulumi.azurenative.kusto.outputs.TrustedExternalTenantResponse;
import com.pulumi.azurenative.kusto.outputs.VirtualNetworkConfigurationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Class representing a Kusto cluster.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:Cluster KustoClusterRPTest4 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The cluster data ingestion URI.
     * 
     */
    @Export(name="dataIngestionUri", type=String.class, parameters={})
    private Output<String> dataIngestionUri;

    /**
     * @return The cluster data ingestion URI.
     * 
     */
    public Output<String> dataIngestionUri() {
        return this.dataIngestionUri;
    }
    /**
     * A boolean value that indicates if the cluster&#39;s disks are encrypted.
     * 
     */
    @Export(name="enableDiskEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDiskEncryption;

    /**
     * @return A boolean value that indicates if the cluster&#39;s disks are encrypted.
     * 
     */
    public Output</* @Nullable */ Boolean> enableDiskEncryption() {
        return this.enableDiskEncryption;
    }
    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
     */
    @Export(name="enableDoubleEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDoubleEncryption;

    /**
     * @return A boolean value that indicates if double encryption is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> enableDoubleEncryption() {
        return this.enableDoubleEncryption;
    }
    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
     */
    @Export(name="enablePurge", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePurge;

    /**
     * @return A boolean value that indicates if the purge operations are enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> enablePurge() {
        return this.enablePurge;
    }
    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    @Export(name="enableStreamingIngest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStreamingIngest;

    /**
     * @return A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> enableStreamingIngest() {
        return this.enableStreamingIngest;
    }
    /**
     * The engine type
     * 
     */
    @Export(name="engineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineType;

    /**
     * @return The engine type
     * 
     */
    public Output</* @Nullable */ String> engineType() {
        return this.engineType;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The identity of the cluster, if configured.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the cluster, if configured.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * KeyVault properties for the cluster encryption.
     * 
     */
    @Export(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    /**
     * @return KeyVault properties for the cluster encryption.
     * 
     */
    public Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties() {
        return this.keyVaultProperties;
    }
    /**
     * List of the cluster&#39;s language extensions.
     * 
     */
    @Export(name="languageExtensions", type=LanguageExtensionsListResponse.class, parameters={})
    private Output<LanguageExtensionsListResponse> languageExtensions;

    /**
     * @return List of the cluster&#39;s language extensions.
     * 
     */
    public Output<LanguageExtensionsListResponse> languageExtensions() {
        return this.languageExtensions;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Optimized auto scale definition.
     * 
     */
    @Export(name="optimizedAutoscale", type=OptimizedAutoscaleResponse.class, parameters={})
    private Output</* @Nullable */ OptimizedAutoscaleResponse> optimizedAutoscale;

    /**
     * @return Optimized auto scale definition.
     * 
     */
    public Output</* @Nullable */ OptimizedAutoscaleResponse> optimizedAutoscale() {
        return this.optimizedAutoscale;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the cluster.
     * 
     */
    @Export(name="sku", type=AzureSkuResponse.class, parameters={})
    private Output<AzureSkuResponse> sku;

    /**
     * @return The SKU of the cluster.
     * 
     */
    public Output<AzureSkuResponse> sku() {
        return this.sku;
    }
    /**
     * The state of the resource.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the resource.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The reason for the cluster&#39;s current state.
     * 
     */
    @Export(name="stateReason", type=String.class, parameters={})
    private Output<String> stateReason;

    /**
     * @return The reason for the cluster&#39;s current state.
     * 
     */
    public Output<String> stateReason() {
        return this.stateReason;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The cluster&#39;s external tenants.
     * 
     */
    @Export(name="trustedExternalTenants", type=List.class, parameters={TrustedExternalTenantResponse.class})
    private Output</* @Nullable */ List<TrustedExternalTenantResponse>> trustedExternalTenants;

    /**
     * @return The cluster&#39;s external tenants.
     * 
     */
    public Output</* @Nullable */ List<TrustedExternalTenantResponse>> trustedExternalTenants() {
        return this.trustedExternalTenants;
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
     * The cluster URI.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The cluster URI.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }
    /**
     * Virtual network definition.
     * 
     */
    @Export(name="virtualNetworkConfiguration", type=VirtualNetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkConfigurationResponse> virtualNetworkConfiguration;

    /**
     * @return Virtual network definition.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkConfigurationResponse> virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }
    /**
     * The availability zones of the cluster.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The availability zones of the cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20170907privatepreview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20180907preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190121:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190515:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190907:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20191109:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200215:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200614:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200918:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210101:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:Cluster").build())
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
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
