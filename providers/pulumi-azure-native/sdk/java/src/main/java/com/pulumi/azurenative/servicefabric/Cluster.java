// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabric.ClusterArgs;
import com.pulumi.azurenative.servicefabric.outputs.ApplicationTypeVersionsCleanupPolicyResponse;
import com.pulumi.azurenative.servicefabric.outputs.AzureActiveDirectoryResponse;
import com.pulumi.azurenative.servicefabric.outputs.CertificateDescriptionResponse;
import com.pulumi.azurenative.servicefabric.outputs.ClientCertificateCommonNameResponse;
import com.pulumi.azurenative.servicefabric.outputs.ClientCertificateThumbprintResponse;
import com.pulumi.azurenative.servicefabric.outputs.ClusterUpgradePolicyResponse;
import com.pulumi.azurenative.servicefabric.outputs.ClusterVersionDetailsResponse;
import com.pulumi.azurenative.servicefabric.outputs.DiagnosticsStorageAccountConfigResponse;
import com.pulumi.azurenative.servicefabric.outputs.NodeTypeDescriptionResponse;
import com.pulumi.azurenative.servicefabric.outputs.ServerCertificateCommonNamesResponse;
import com.pulumi.azurenative.servicefabric.outputs.SettingsSectionDescriptionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The cluster resource
 * 
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:Cluster myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/clusters/myCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:Cluster")
public class Cluster extends CustomResource {
    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    @Export(name="addOnFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addOnFeatures;

    /**
     * @return The list of add-on features to enable in the cluster.
     * 
     */
    public Output<Optional<List<String>>> addOnFeatures() {
        return Codegen.optional(this.addOnFeatures);
    }
    /**
     * The policy used to clean up unused versions.
     * 
     */
    @Export(name="applicationTypeVersionsCleanupPolicy", type=ApplicationTypeVersionsCleanupPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationTypeVersionsCleanupPolicyResponse> applicationTypeVersionsCleanupPolicy;

    /**
     * @return The policy used to clean up unused versions.
     * 
     */
    public Output<Optional<ApplicationTypeVersionsCleanupPolicyResponse>> applicationTypeVersionsCleanupPolicy() {
        return Codegen.optional(this.applicationTypeVersionsCleanupPolicy);
    }
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
     */
    @Export(name="availableClusterVersions", type=List.class, parameters={ClusterVersionDetailsResponse.class})
    private Output<List<ClusterVersionDetailsResponse>> availableClusterVersions;

    /**
     * @return The Service Fabric runtime versions available for this cluster.
     * 
     */
    public Output<List<ClusterVersionDetailsResponse>> availableClusterVersions() {
        return this.availableClusterVersions;
    }
    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    @Export(name="azureActiveDirectory", type=AzureActiveDirectoryResponse.class, parameters={})
    private Output</* @Nullable */ AzureActiveDirectoryResponse> azureActiveDirectory;

    /**
     * @return The AAD authentication settings of the cluster.
     * 
     */
    public Output<Optional<AzureActiveDirectoryResponse>> azureActiveDirectory() {
        return Codegen.optional(this.azureActiveDirectory);
    }
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    @Export(name="certificate", type=CertificateDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ CertificateDescriptionResponse> certificate;

    /**
     * @return The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    public Output<Optional<CertificateDescriptionResponse>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Export(name="certificateCommonNames", type=ServerCertificateCommonNamesResponse.class, parameters={})
    private Output</* @Nullable */ ServerCertificateCommonNamesResponse> certificateCommonNames;

    /**
     * @return Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    public Output<Optional<ServerCertificateCommonNamesResponse>> certificateCommonNames() {
        return Codegen.optional(this.certificateCommonNames);
    }
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    @Export(name="clientCertificateCommonNames", type=List.class, parameters={ClientCertificateCommonNameResponse.class})
    private Output</* @Nullable */ List<ClientCertificateCommonNameResponse>> clientCertificateCommonNames;

    /**
     * @return The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    public Output<Optional<List<ClientCertificateCommonNameResponse>>> clientCertificateCommonNames() {
        return Codegen.optional(this.clientCertificateCommonNames);
    }
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    @Export(name="clientCertificateThumbprints", type=List.class, parameters={ClientCertificateThumbprintResponse.class})
    private Output</* @Nullable */ List<ClientCertificateThumbprintResponse>> clientCertificateThumbprints;

    /**
     * @return The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    public Output<Optional<List<ClientCertificateThumbprintResponse>>> clientCertificateThumbprints() {
        return Codegen.optional(this.clientCertificateThumbprints);
    }
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to &#39;Manual&#39;. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @Export(name="clusterCodeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterCodeVersion;

    /**
     * @return The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to &#39;Manual&#39;. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    public Output<Optional<String>> clusterCodeVersion() {
        return Codegen.optional(this.clusterCodeVersion);
    }
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    @Export(name="clusterEndpoint", type=String.class, parameters={})
    private Output<String> clusterEndpoint;

    /**
     * @return The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    public Output<String> clusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * A service generated unique identifier for the cluster resource.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return A service generated unique identifier for the cluster resource.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to &#39;Automatic&#39;.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
     */
    @Export(name="clusterState", type=String.class, parameters={})
    private Output<String> clusterState;

    /**
     * @return The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to &#39;Automatic&#39;.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
     */
    public Output<String> clusterState() {
        return this.clusterState;
    }
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    @Export(name="diagnosticsStorageAccountConfig", type=DiagnosticsStorageAccountConfigResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsStorageAccountConfigResponse> diagnosticsStorageAccountConfig;

    /**
     * @return The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    public Output<Optional<DiagnosticsStorageAccountConfigResponse>> diagnosticsStorageAccountConfig() {
        return Codegen.optional(this.diagnosticsStorageAccountConfig);
    }
    /**
     * Azure resource etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Azure resource etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Indicates if the event store service is enabled.
     * 
     */
    @Export(name="eventStoreServiceEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventStoreServiceEnabled;

    /**
     * @return Indicates if the event store service is enabled.
     * 
     */
    public Output<Optional<Boolean>> eventStoreServiceEnabled() {
        return Codegen.optional(this.eventStoreServiceEnabled);
    }
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @Export(name="fabricSettings", type=List.class, parameters={SettingsSectionDescriptionResponse.class})
    private Output</* @Nullable */ List<SettingsSectionDescriptionResponse>> fabricSettings;

    /**
     * @return The list of custom fabric settings to configure the cluster.
     * 
     */
    public Output<Optional<List<SettingsSectionDescriptionResponse>>> fabricSettings() {
        return Codegen.optional(this.fabricSettings);
    }
    /**
     * Azure resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The http management endpoint of the cluster.
     * 
     */
    @Export(name="managementEndpoint", type=String.class, parameters={})
    private Output<String> managementEndpoint;

    /**
     * @return The http management endpoint of the cluster.
     * 
     */
    public Output<String> managementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of node types in the cluster.
     * 
     */
    @Export(name="nodeTypes", type=List.class, parameters={NodeTypeDescriptionResponse.class})
    private Output<List<NodeTypeDescriptionResponse>> nodeTypes;

    /**
     * @return The list of node types in the cluster.
     * 
     */
    public Output<List<NodeTypeDescriptionResponse>> nodeTypes() {
        return this.nodeTypes;
    }
    /**
     * The provisioning state of the cluster resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the cluster resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    @Export(name="reliabilityLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> reliabilityLevel;

    /**
     * @return The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    public Output<Optional<String>> reliabilityLevel() {
        return Codegen.optional(this.reliabilityLevel);
    }
    /**
     * The server certificate used by reverse proxy.
     * 
     */
    @Export(name="reverseProxyCertificate", type=CertificateDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ CertificateDescriptionResponse> reverseProxyCertificate;

    /**
     * @return The server certificate used by reverse proxy.
     * 
     */
    public Output<Optional<CertificateDescriptionResponse>> reverseProxyCertificate() {
        return Codegen.optional(this.reverseProxyCertificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Export(name="reverseProxyCertificateCommonNames", type=ServerCertificateCommonNamesResponse.class, parameters={})
    private Output</* @Nullable */ ServerCertificateCommonNamesResponse> reverseProxyCertificateCommonNames;

    /**
     * @return Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    public Output<Optional<ServerCertificateCommonNamesResponse>> reverseProxyCertificateCommonNames() {
        return Codegen.optional(this.reverseProxyCertificateCommonNames);
    }
    /**
     * Azure resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    @Export(name="upgradeDescription", type=ClusterUpgradePolicyResponse.class, parameters={})
    private Output</* @Nullable */ ClusterUpgradePolicyResponse> upgradeDescription;

    /**
     * @return The policy to use when upgrading the cluster.
     * 
     */
    public Output<Optional<ClusterUpgradePolicyResponse>> upgradeDescription() {
        return Codegen.optional(this.upgradeDescription);
    }
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    @Export(name="upgradeMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> upgradeMode;

    /**
     * @return The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    public Output<Optional<String>> upgradeMode() {
        return Codegen.optional(this.upgradeMode);
    }
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    @Export(name="vmImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImage;

    /**
     * @return The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    public Output<Optional<String>> vmImage() {
        return Codegen.optional(this.vmImage);
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
    public Cluster(String name, ClusterArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:servicefabric:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:servicefabric:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicefabric/v20160901:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20170701preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20180201:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190301:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190301preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190601preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20191101preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20200301:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20201201preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20210601:Cluster").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
