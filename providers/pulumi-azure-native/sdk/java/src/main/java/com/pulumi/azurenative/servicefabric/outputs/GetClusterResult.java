// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

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
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterResult {
    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    private final @Nullable List<String> addOnFeatures;
    /**
     * The policy used to clean up unused versions.
     * 
     */
    private final @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy;
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
     */
    private final List<ClusterVersionDetailsResponse> availableClusterVersions;
    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    private final @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    private final @Nullable CertificateDescriptionResponse certificate;
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    private final @Nullable ServerCertificateCommonNamesResponse certificateCommonNames;
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    private final @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames;
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    private final @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints;
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to &#39;Manual&#39;. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    private final @Nullable String clusterCodeVersion;
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    private final String clusterEndpoint;
    /**
     * A service generated unique identifier for the cluster resource.
     * 
     */
    private final String clusterId;
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
    private final String clusterState;
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    private final @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig;
    /**
     * Azure resource etag.
     * 
     */
    private final String etag;
    /**
     * Indicates if the event store service is enabled.
     * 
     */
    private final @Nullable Boolean eventStoreServiceEnabled;
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    private final @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
    /**
     * Azure resource identifier.
     * 
     */
    private final String id;
    /**
     * Azure resource location.
     * 
     */
    private final String location;
    /**
     * The http management endpoint of the cluster.
     * 
     */
    private final String managementEndpoint;
    /**
     * Azure resource name.
     * 
     */
    private final String name;
    /**
     * The list of node types in the cluster.
     * 
     */
    private final List<NodeTypeDescriptionResponse> nodeTypes;
    /**
     * The provisioning state of the cluster resource.
     * 
     */
    private final String provisioningState;
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
    private final @Nullable String reliabilityLevel;
    /**
     * The server certificate used by reverse proxy.
     * 
     */
    private final @Nullable CertificateDescriptionResponse reverseProxyCertificate;
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    private final @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames;
    /**
     * Azure resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type.
     * 
     */
    private final String type;
    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    private final @Nullable ClusterUpgradePolicyResponse upgradeDescription;
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    private final @Nullable String upgradeMode;
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    private final @Nullable String vmImage;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("addOnFeatures") @Nullable List<String> addOnFeatures,
        @CustomType.Parameter("applicationTypeVersionsCleanupPolicy") @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy,
        @CustomType.Parameter("availableClusterVersions") List<ClusterVersionDetailsResponse> availableClusterVersions,
        @CustomType.Parameter("azureActiveDirectory") @Nullable AzureActiveDirectoryResponse azureActiveDirectory,
        @CustomType.Parameter("certificate") @Nullable CertificateDescriptionResponse certificate,
        @CustomType.Parameter("certificateCommonNames") @Nullable ServerCertificateCommonNamesResponse certificateCommonNames,
        @CustomType.Parameter("clientCertificateCommonNames") @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames,
        @CustomType.Parameter("clientCertificateThumbprints") @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints,
        @CustomType.Parameter("clusterCodeVersion") @Nullable String clusterCodeVersion,
        @CustomType.Parameter("clusterEndpoint") String clusterEndpoint,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterState") String clusterState,
        @CustomType.Parameter("diagnosticsStorageAccountConfig") @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("eventStoreServiceEnabled") @Nullable Boolean eventStoreServiceEnabled,
        @CustomType.Parameter("fabricSettings") @Nullable List<SettingsSectionDescriptionResponse> fabricSettings,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managementEndpoint") String managementEndpoint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeTypes") List<NodeTypeDescriptionResponse> nodeTypes,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("reliabilityLevel") @Nullable String reliabilityLevel,
        @CustomType.Parameter("reverseProxyCertificate") @Nullable CertificateDescriptionResponse reverseProxyCertificate,
        @CustomType.Parameter("reverseProxyCertificateCommonNames") @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("upgradeDescription") @Nullable ClusterUpgradePolicyResponse upgradeDescription,
        @CustomType.Parameter("upgradeMode") @Nullable String upgradeMode,
        @CustomType.Parameter("vmImage") @Nullable String vmImage) {
        this.addOnFeatures = addOnFeatures;
        this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
        this.availableClusterVersions = availableClusterVersions;
        this.azureActiveDirectory = azureActiveDirectory;
        this.certificate = certificate;
        this.certificateCommonNames = certificateCommonNames;
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterEndpoint = clusterEndpoint;
        this.clusterId = clusterId;
        this.clusterState = clusterState;
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        this.etag = etag;
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        this.fabricSettings = fabricSettings;
        this.id = id;
        this.location = location;
        this.managementEndpoint = managementEndpoint;
        this.name = name;
        this.nodeTypes = nodeTypes;
        this.provisioningState = provisioningState;
        this.reliabilityLevel = reliabilityLevel;
        this.reverseProxyCertificate = reverseProxyCertificate;
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        this.tags = tags;
        this.type = type;
        this.upgradeDescription = upgradeDescription;
        this.upgradeMode = upgradeMode;
        this.vmImage = vmImage;
    }

    /**
     * The list of add-on features to enable in the cluster.
     * 
    */
    public List<String> addOnFeatures() {
        return this.addOnFeatures == null ? List.of() : this.addOnFeatures;
    }
    /**
     * The policy used to clean up unused versions.
     * 
    */
    public Optional<ApplicationTypeVersionsCleanupPolicyResponse> applicationTypeVersionsCleanupPolicy() {
        return Optional.ofNullable(this.applicationTypeVersionsCleanupPolicy);
    }
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
    */
    public List<ClusterVersionDetailsResponse> availableClusterVersions() {
        return this.availableClusterVersions;
    }
    /**
     * The AAD authentication settings of the cluster.
     * 
    */
    public Optional<AzureActiveDirectoryResponse> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
    */
    public Optional<CertificateDescriptionResponse> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
    */
    public Optional<ServerCertificateCommonNamesResponse> certificateCommonNames() {
        return Optional.ofNullable(this.certificateCommonNames);
    }
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
    */
    public List<ClientCertificateCommonNameResponse> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames == null ? List.of() : this.clientCertificateCommonNames;
    }
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
    */
    public List<ClientCertificateThumbprintResponse> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints == null ? List.of() : this.clientCertificateThumbprints;
    }
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to &#39;Manual&#39;. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
    */
    public Optional<String> clusterCodeVersion() {
        return Optional.ofNullable(this.clusterCodeVersion);
    }
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
    */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * A service generated unique identifier for the cluster resource.
     * 
    */
    public String clusterId() {
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
    public String clusterState() {
        return this.clusterState;
    }
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
    */
    public Optional<DiagnosticsStorageAccountConfigResponse> diagnosticsStorageAccountConfig() {
        return Optional.ofNullable(this.diagnosticsStorageAccountConfig);
    }
    /**
     * Azure resource etag.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Indicates if the event store service is enabled.
     * 
    */
    public Optional<Boolean> eventStoreServiceEnabled() {
        return Optional.ofNullable(this.eventStoreServiceEnabled);
    }
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
    */
    public List<SettingsSectionDescriptionResponse> fabricSettings() {
        return this.fabricSettings == null ? List.of() : this.fabricSettings;
    }
    /**
     * Azure resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Azure resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The http management endpoint of the cluster.
     * 
    */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * Azure resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The list of node types in the cluster.
     * 
    */
    public List<NodeTypeDescriptionResponse> nodeTypes() {
        return this.nodeTypes;
    }
    /**
     * The provisioning state of the cluster resource.
     * 
    */
    public String provisioningState() {
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
    public Optional<String> reliabilityLevel() {
        return Optional.ofNullable(this.reliabilityLevel);
    }
    /**
     * The server certificate used by reverse proxy.
     * 
    */
    public Optional<CertificateDescriptionResponse> reverseProxyCertificate() {
        return Optional.ofNullable(this.reverseProxyCertificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
    */
    public Optional<ServerCertificateCommonNamesResponse> reverseProxyCertificateCommonNames() {
        return Optional.ofNullable(this.reverseProxyCertificateCommonNames);
    }
    /**
     * Azure resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The policy to use when upgrading the cluster.
     * 
    */
    public Optional<ClusterUpgradePolicyResponse> upgradeDescription() {
        return Optional.ofNullable(this.upgradeDescription);
    }
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
    */
    public Optional<String> upgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
    */
    public Optional<String> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addOnFeatures;
        private @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy;
        private List<ClusterVersionDetailsResponse> availableClusterVersions;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable CertificateDescriptionResponse certificate;
        private @Nullable ServerCertificateCommonNamesResponse certificateCommonNames;
        private @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames;
        private @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints;
        private @Nullable String clusterCodeVersion;
        private String clusterEndpoint;
        private String clusterId;
        private String clusterState;
        private @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig;
        private String etag;
        private @Nullable Boolean eventStoreServiceEnabled;
        private @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
        private String id;
        private String location;
        private String managementEndpoint;
        private String name;
        private List<NodeTypeDescriptionResponse> nodeTypes;
        private String provisioningState;
        private @Nullable String reliabilityLevel;
        private @Nullable CertificateDescriptionResponse reverseProxyCertificate;
        private @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ClusterUpgradePolicyResponse upgradeDescription;
        private @Nullable String upgradeMode;
        private @Nullable String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnFeatures = defaults.addOnFeatures;
    	      this.applicationTypeVersionsCleanupPolicy = defaults.applicationTypeVersionsCleanupPolicy;
    	      this.availableClusterVersions = defaults.availableClusterVersions;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.certificate = defaults.certificate;
    	      this.certificateCommonNames = defaults.certificateCommonNames;
    	      this.clientCertificateCommonNames = defaults.clientCertificateCommonNames;
    	      this.clientCertificateThumbprints = defaults.clientCertificateThumbprints;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.diagnosticsStorageAccountConfig = defaults.diagnosticsStorageAccountConfig;
    	      this.etag = defaults.etag;
    	      this.eventStoreServiceEnabled = defaults.eventStoreServiceEnabled;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managementEndpoint = defaults.managementEndpoint;
    	      this.name = defaults.name;
    	      this.nodeTypes = defaults.nodeTypes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.reliabilityLevel = defaults.reliabilityLevel;
    	      this.reverseProxyCertificate = defaults.reverseProxyCertificate;
    	      this.reverseProxyCertificateCommonNames = defaults.reverseProxyCertificateCommonNames;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeDescription = defaults.upgradeDescription;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder addOnFeatures(@Nullable List<String> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            return this;
        }
        public Builder addOnFeatures(String... addOnFeatures) {
            return addOnFeatures(List.of(addOnFeatures));
        }
        public Builder applicationTypeVersionsCleanupPolicy(@Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
            return this;
        }
        public Builder availableClusterVersions(List<ClusterVersionDetailsResponse> availableClusterVersions) {
            this.availableClusterVersions = Objects.requireNonNull(availableClusterVersions);
            return this;
        }
        public Builder availableClusterVersions(ClusterVersionDetailsResponse... availableClusterVersions) {
            return availableClusterVersions(List.of(availableClusterVersions));
        }
        public Builder azureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }
        public Builder certificate(@Nullable CertificateDescriptionResponse certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificateCommonNames(@Nullable ServerCertificateCommonNamesResponse certificateCommonNames) {
            this.certificateCommonNames = certificateCommonNames;
            return this;
        }
        public Builder clientCertificateCommonNames(@Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = clientCertificateCommonNames;
            return this;
        }
        public Builder clientCertificateCommonNames(ClientCertificateCommonNameResponse... clientCertificateCommonNames) {
            return clientCertificateCommonNames(List.of(clientCertificateCommonNames));
        }
        public Builder clientCertificateThumbprints(@Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = clientCertificateThumbprints;
            return this;
        }
        public Builder clientCertificateThumbprints(ClientCertificateThumbprintResponse... clientCertificateThumbprints) {
            return clientCertificateThumbprints(List.of(clientCertificateThumbprints));
        }
        public Builder clusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }
        public Builder clusterEndpoint(String clusterEndpoint) {
            this.clusterEndpoint = Objects.requireNonNull(clusterEndpoint);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterState(String clusterState) {
            this.clusterState = Objects.requireNonNull(clusterState);
            return this;
        }
        public Builder diagnosticsStorageAccountConfig(@Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder eventStoreServiceEnabled(@Nullable Boolean eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = eventStoreServiceEnabled;
            return this;
        }
        public Builder fabricSettings(@Nullable List<SettingsSectionDescriptionResponse> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }
        public Builder fabricSettings(SettingsSectionDescriptionResponse... fabricSettings) {
            return fabricSettings(List.of(fabricSettings));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeTypes(List<NodeTypeDescriptionResponse> nodeTypes) {
            this.nodeTypes = Objects.requireNonNull(nodeTypes);
            return this;
        }
        public Builder nodeTypes(NodeTypeDescriptionResponse... nodeTypes) {
            return nodeTypes(List.of(nodeTypes));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder reliabilityLevel(@Nullable String reliabilityLevel) {
            this.reliabilityLevel = reliabilityLevel;
            return this;
        }
        public Builder reverseProxyCertificate(@Nullable CertificateDescriptionResponse reverseProxyCertificate) {
            this.reverseProxyCertificate = reverseProxyCertificate;
            return this;
        }
        public Builder reverseProxyCertificateCommonNames(@Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder upgradeDescription(@Nullable ClusterUpgradePolicyResponse upgradeDescription) {
            this.upgradeDescription = upgradeDescription;
            return this;
        }
        public Builder upgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public Builder vmImage(@Nullable String vmImage) {
            this.vmImage = vmImage;
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(addOnFeatures, applicationTypeVersionsCleanupPolicy, availableClusterVersions, azureActiveDirectory, certificate, certificateCommonNames, clientCertificateCommonNames, clientCertificateThumbprints, clusterCodeVersion, clusterEndpoint, clusterId, clusterState, diagnosticsStorageAccountConfig, etag, eventStoreServiceEnabled, fabricSettings, id, location, managementEndpoint, name, nodeTypes, provisioningState, reliabilityLevel, reverseProxyCertificate, reverseProxyCertificateCommonNames, tags, type, upgradeDescription, upgradeMode, vmImage);
        }
    }
}
