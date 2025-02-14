// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.azurenative.containerservice.outputs.AgentPoolUpgradeSettingsResponse;
import com.pulumi.azurenative.containerservice.outputs.KubeletConfigResponse;
import com.pulumi.azurenative.containerservice.outputs.LinuxOSConfigResponse;
import com.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterAgentPoolProfileResponse {
    /**
     * @return Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    private final @Nullable List<String> availabilityZones;
    /**
     * @return Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return Whether to enable auto-scaler
     * 
     */
    private final @Nullable Boolean enableAutoScaling;
    /**
     * @return Whether to enable EncryptionAtHost
     * 
     */
    private final @Nullable Boolean enableEncryptionAtHost;
    /**
     * @return Whether to use FIPS enabled OS
     * 
     */
    private final @Nullable Boolean enableFIPS;
    /**
     * @return Enable public IP for nodes
     * 
     */
    private final @Nullable Boolean enableNodePublicIP;
    /**
     * @return GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    private final @Nullable String gpuInstanceProfile;
    /**
     * @return KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    private final @Nullable KubeletConfigResponse kubeletConfig;
    /**
     * @return KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    private final @Nullable String kubeletDiskType;
    /**
     * @return LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    private final @Nullable LinuxOSConfigResponse linuxOSConfig;
    /**
     * @return Maximum number of nodes for auto-scaling
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * @return Maximum number of pods that can run on a node.
     * 
     */
    private final @Nullable Integer maxPods;
    /**
     * @return Minimum number of nodes for auto-scaling
     * 
     */
    private final @Nullable Integer minCount;
    /**
     * @return AgentPoolMode represents mode of an agent pool
     * 
     */
    private final @Nullable String mode;
    /**
     * @return Unique name of the agent pool profile in the context of the subscription and resource group.
     * 
     */
    private final String name;
    /**
     * @return Version of node image
     * 
     */
    private final String nodeImageVersion;
    /**
     * @return Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    private final @Nullable Map<String,String> nodeLabels;
    /**
     * @return Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    private final @Nullable String nodePublicIPPrefixID;
    /**
     * @return Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    private final @Nullable List<String> nodeTaints;
    /**
     * @return Version of orchestrator specified when creating the managed cluster.
     * 
     */
    private final @Nullable String orchestratorVersion;
    /**
     * @return OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    private final @Nullable Integer osDiskSizeGB;
    /**
     * @return OS disk type to be used for machines in a given agent pool. Allowed values are &#39;Ephemeral&#39; and &#39;Managed&#39;. If unspecified, defaults to &#39;Ephemeral&#39; when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to &#39;Managed&#39;. May not be changed after creation.
     * 
     */
    private final @Nullable String osDiskType;
    /**
     * @return OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    private final @Nullable String osSKU;
    /**
     * @return OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    private final @Nullable String osType;
    /**
     * @return Pod SubnetID specifies the VNet&#39;s subnet identifier for pods.
     * 
     */
    private final @Nullable String podSubnetID;
    /**
     * @return Describes whether the Agent Pool is Running or Stopped
     * 
     */
    private final PowerStateResponse powerState;
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * @return The ID for Proximity Placement Group.
     * 
     */
    private final @Nullable String proximityPlacementGroupID;
    /**
     * @return ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    private final @Nullable String scaleSetEvictionPolicy;
    /**
     * @return ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    private final @Nullable String scaleSetPriority;
    /**
     * @return SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    private final @Nullable Double spotMaxPrice;
    /**
     * @return Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return AgentPoolType represents types of an agent pool
     * 
     */
    private final @Nullable String type;
    /**
     * @return Settings for upgrading the agentpool
     * 
     */
    private final @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
    /**
     * @return Size of agent VMs.
     * 
     */
    private final @Nullable String vmSize;
    /**
     * @return VNet SubnetID specifies the VNet&#39;s subnet identifier for nodes and maybe pods
     * 
     */
    private final @Nullable String vnetSubnetID;

    @CustomType.Constructor
    private ManagedClusterAgentPoolProfileResponse(
        @CustomType.Parameter("availabilityZones") @Nullable List<String> availabilityZones,
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("enableAutoScaling") @Nullable Boolean enableAutoScaling,
        @CustomType.Parameter("enableEncryptionAtHost") @Nullable Boolean enableEncryptionAtHost,
        @CustomType.Parameter("enableFIPS") @Nullable Boolean enableFIPS,
        @CustomType.Parameter("enableNodePublicIP") @Nullable Boolean enableNodePublicIP,
        @CustomType.Parameter("gpuInstanceProfile") @Nullable String gpuInstanceProfile,
        @CustomType.Parameter("kubeletConfig") @Nullable KubeletConfigResponse kubeletConfig,
        @CustomType.Parameter("kubeletDiskType") @Nullable String kubeletDiskType,
        @CustomType.Parameter("linuxOSConfig") @Nullable LinuxOSConfigResponse linuxOSConfig,
        @CustomType.Parameter("maxCount") @Nullable Integer maxCount,
        @CustomType.Parameter("maxPods") @Nullable Integer maxPods,
        @CustomType.Parameter("minCount") @Nullable Integer minCount,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeImageVersion") String nodeImageVersion,
        @CustomType.Parameter("nodeLabels") @Nullable Map<String,String> nodeLabels,
        @CustomType.Parameter("nodePublicIPPrefixID") @Nullable String nodePublicIPPrefixID,
        @CustomType.Parameter("nodeTaints") @Nullable List<String> nodeTaints,
        @CustomType.Parameter("orchestratorVersion") @Nullable String orchestratorVersion,
        @CustomType.Parameter("osDiskSizeGB") @Nullable Integer osDiskSizeGB,
        @CustomType.Parameter("osDiskType") @Nullable String osDiskType,
        @CustomType.Parameter("osSKU") @Nullable String osSKU,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("podSubnetID") @Nullable String podSubnetID,
        @CustomType.Parameter("powerState") PowerStateResponse powerState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("proximityPlacementGroupID") @Nullable String proximityPlacementGroupID,
        @CustomType.Parameter("scaleSetEvictionPolicy") @Nullable String scaleSetEvictionPolicy,
        @CustomType.Parameter("scaleSetPriority") @Nullable String scaleSetPriority,
        @CustomType.Parameter("spotMaxPrice") @Nullable Double spotMaxPrice,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("upgradeSettings") @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings,
        @CustomType.Parameter("vmSize") @Nullable String vmSize,
        @CustomType.Parameter("vnetSubnetID") @Nullable String vnetSubnetID) {
        this.availabilityZones = availabilityZones;
        this.count = count;
        this.enableAutoScaling = enableAutoScaling;
        this.enableEncryptionAtHost = enableEncryptionAtHost;
        this.enableFIPS = enableFIPS;
        this.enableNodePublicIP = enableNodePublicIP;
        this.gpuInstanceProfile = gpuInstanceProfile;
        this.kubeletConfig = kubeletConfig;
        this.kubeletDiskType = kubeletDiskType;
        this.linuxOSConfig = linuxOSConfig;
        this.maxCount = maxCount;
        this.maxPods = maxPods;
        this.minCount = minCount;
        this.mode = mode;
        this.name = name;
        this.nodeImageVersion = nodeImageVersion;
        this.nodeLabels = nodeLabels;
        this.nodePublicIPPrefixID = nodePublicIPPrefixID;
        this.nodeTaints = nodeTaints;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGB = osDiskSizeGB;
        this.osDiskType = osDiskType;
        this.osSKU = osSKU;
        this.osType = osType;
        this.podSubnetID = podSubnetID;
        this.powerState = powerState;
        this.provisioningState = provisioningState;
        this.proximityPlacementGroupID = proximityPlacementGroupID;
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        this.scaleSetPriority = scaleSetPriority;
        this.spotMaxPrice = spotMaxPrice;
        this.tags = tags;
        this.type = type;
        this.upgradeSettings = upgradeSettings;
        this.vmSize = vmSize;
        this.vnetSubnetID = vnetSubnetID;
    }

    /**
     * @return Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * @return Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Whether to enable auto-scaler
     * 
     */
    public Optional<Boolean> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * @return Whether to enable EncryptionAtHost
     * 
     */
    public Optional<Boolean> enableEncryptionAtHost() {
        return Optional.ofNullable(this.enableEncryptionAtHost);
    }
    /**
     * @return Whether to use FIPS enabled OS
     * 
     */
    public Optional<Boolean> enableFIPS() {
        return Optional.ofNullable(this.enableFIPS);
    }
    /**
     * @return Enable public IP for nodes
     * 
     */
    public Optional<Boolean> enableNodePublicIP() {
        return Optional.ofNullable(this.enableNodePublicIP);
    }
    /**
     * @return GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    public Optional<String> gpuInstanceProfile() {
        return Optional.ofNullable(this.gpuInstanceProfile);
    }
    /**
     * @return KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    public Optional<KubeletConfigResponse> kubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    /**
     * @return KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    public Optional<String> kubeletDiskType() {
        return Optional.ofNullable(this.kubeletDiskType);
    }
    /**
     * @return LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    public Optional<LinuxOSConfigResponse> linuxOSConfig() {
        return Optional.ofNullable(this.linuxOSConfig);
    }
    /**
     * @return Maximum number of nodes for auto-scaling
     * 
     */
    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * @return Maximum number of pods that can run on a node.
     * 
     */
    public Optional<Integer> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * @return Minimum number of nodes for auto-scaling
     * 
     */
    public Optional<Integer> minCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * @return AgentPoolMode represents mode of an agent pool
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Unique name of the agent pool profile in the context of the subscription and resource group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Version of node image
     * 
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }
    /**
     * @return Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    public Map<String,String> nodeLabels() {
        return this.nodeLabels == null ? Map.of() : this.nodeLabels;
    }
    /**
     * @return Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    public Optional<String> nodePublicIPPrefixID() {
        return Optional.ofNullable(this.nodePublicIPPrefixID);
    }
    /**
     * @return Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    public List<String> nodeTaints() {
        return this.nodeTaints == null ? List.of() : this.nodeTaints;
    }
    /**
     * @return Version of orchestrator specified when creating the managed cluster.
     * 
     */
    public Optional<String> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * @return OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    public Optional<Integer> osDiskSizeGB() {
        return Optional.ofNullable(this.osDiskSizeGB);
    }
    /**
     * @return OS disk type to be used for machines in a given agent pool. Allowed values are &#39;Ephemeral&#39; and &#39;Managed&#39;. If unspecified, defaults to &#39;Ephemeral&#39; when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to &#39;Managed&#39;. May not be changed after creation.
     * 
     */
    public Optional<String> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * @return OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    public Optional<String> osSKU() {
        return Optional.ofNullable(this.osSKU);
    }
    /**
     * @return OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return Pod SubnetID specifies the VNet&#39;s subnet identifier for pods.
     * 
     */
    public Optional<String> podSubnetID() {
        return Optional.ofNullable(this.podSubnetID);
    }
    /**
     * @return Describes whether the Agent Pool is Running or Stopped
     * 
     */
    public PowerStateResponse powerState() {
        return this.powerState;
    }
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The ID for Proximity Placement Group.
     * 
     */
    public Optional<String> proximityPlacementGroupID() {
        return Optional.ofNullable(this.proximityPlacementGroupID);
    }
    /**
     * @return ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    public Optional<String> scaleSetEvictionPolicy() {
        return Optional.ofNullable(this.scaleSetEvictionPolicy);
    }
    /**
     * @return ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    public Optional<String> scaleSetPriority() {
        return Optional.ofNullable(this.scaleSetPriority);
    }
    /**
     * @return SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    public Optional<Double> spotMaxPrice() {
        return Optional.ofNullable(this.spotMaxPrice);
    }
    /**
     * @return Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return AgentPoolType represents types of an agent pool
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Settings for upgrading the agentpool
     * 
     */
    public Optional<AgentPoolUpgradeSettingsResponse> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }
    /**
     * @return Size of agent VMs.
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }
    /**
     * @return VNet SubnetID specifies the VNet&#39;s subnet identifier for nodes and maybe pods
     * 
     */
    public Optional<String> vnetSubnetID() {
        return Optional.ofNullable(this.vnetSubnetID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAgentPoolProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Boolean enableEncryptionAtHost;
        private @Nullable Boolean enableFIPS;
        private @Nullable Boolean enableNodePublicIP;
        private @Nullable String gpuInstanceProfile;
        private @Nullable KubeletConfigResponse kubeletConfig;
        private @Nullable String kubeletDiskType;
        private @Nullable LinuxOSConfigResponse linuxOSConfig;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private String nodeImageVersion;
        private @Nullable Map<String,String> nodeLabels;
        private @Nullable String nodePublicIPPrefixID;
        private @Nullable List<String> nodeTaints;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGB;
        private @Nullable String osDiskType;
        private @Nullable String osSKU;
        private @Nullable String osType;
        private @Nullable String podSubnetID;
        private PowerStateResponse powerState;
        private String provisioningState;
        private @Nullable String proximityPlacementGroupID;
        private @Nullable String scaleSetEvictionPolicy;
        private @Nullable String scaleSetPriority;
        private @Nullable Double spotMaxPrice;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;
        private @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
        private @Nullable String vmSize;
        private @Nullable String vnetSubnetID;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAgentPoolProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.enableEncryptionAtHost = defaults.enableEncryptionAtHost;
    	      this.enableFIPS = defaults.enableFIPS;
    	      this.enableNodePublicIP = defaults.enableNodePublicIP;
    	      this.gpuInstanceProfile = defaults.gpuInstanceProfile;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.kubeletDiskType = defaults.kubeletDiskType;
    	      this.linuxOSConfig = defaults.linuxOSConfig;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.nodeImageVersion = defaults.nodeImageVersion;
    	      this.nodeLabels = defaults.nodeLabels;
    	      this.nodePublicIPPrefixID = defaults.nodePublicIPPrefixID;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osSKU = defaults.osSKU;
    	      this.osType = defaults.osType;
    	      this.podSubnetID = defaults.podSubnetID;
    	      this.powerState = defaults.powerState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.proximityPlacementGroupID = defaults.proximityPlacementGroupID;
    	      this.scaleSetEvictionPolicy = defaults.scaleSetEvictionPolicy;
    	      this.scaleSetPriority = defaults.scaleSetPriority;
    	      this.spotMaxPrice = defaults.spotMaxPrice;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetSubnetID = defaults.vnetSubnetID;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Builder enableEncryptionAtHost(@Nullable Boolean enableEncryptionAtHost) {
            this.enableEncryptionAtHost = enableEncryptionAtHost;
            return this;
        }
        public Builder enableFIPS(@Nullable Boolean enableFIPS) {
            this.enableFIPS = enableFIPS;
            return this;
        }
        public Builder enableNodePublicIP(@Nullable Boolean enableNodePublicIP) {
            this.enableNodePublicIP = enableNodePublicIP;
            return this;
        }
        public Builder gpuInstanceProfile(@Nullable String gpuInstanceProfile) {
            this.gpuInstanceProfile = gpuInstanceProfile;
            return this;
        }
        public Builder kubeletConfig(@Nullable KubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletDiskType(@Nullable String kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }
        public Builder linuxOSConfig(@Nullable LinuxOSConfigResponse linuxOSConfig) {
            this.linuxOSConfig = linuxOSConfig;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxPods(@Nullable Integer maxPods) {
            this.maxPods = maxPods;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeImageVersion(String nodeImageVersion) {
            this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion);
            return this;
        }
        public Builder nodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }
        public Builder nodePublicIPPrefixID(@Nullable String nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = nodePublicIPPrefixID;
            return this;
        }
        public Builder nodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }
        public Builder nodeTaints(String... nodeTaints) {
            return nodeTaints(List.of(nodeTaints));
        }
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        public Builder osDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }
        public Builder osDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }
        public Builder osSKU(@Nullable String osSKU) {
            this.osSKU = osSKU;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder podSubnetID(@Nullable String podSubnetID) {
            this.podSubnetID = podSubnetID;
            return this;
        }
        public Builder powerState(PowerStateResponse powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder proximityPlacementGroupID(@Nullable String proximityPlacementGroupID) {
            this.proximityPlacementGroupID = proximityPlacementGroupID;
            return this;
        }
        public Builder scaleSetEvictionPolicy(@Nullable String scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
            return this;
        }
        public Builder scaleSetPriority(@Nullable String scaleSetPriority) {
            this.scaleSetPriority = scaleSetPriority;
            return this;
        }
        public Builder spotMaxPrice(@Nullable Double spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder upgradeSettings(@Nullable AgentPoolUpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public Builder vnetSubnetID(@Nullable String vnetSubnetID) {
            this.vnetSubnetID = vnetSubnetID;
            return this;
        }        public ManagedClusterAgentPoolProfileResponse build() {
            return new ManagedClusterAgentPoolProfileResponse(availabilityZones, count, enableAutoScaling, enableEncryptionAtHost, enableFIPS, enableNodePublicIP, gpuInstanceProfile, kubeletConfig, kubeletDiskType, linuxOSConfig, maxCount, maxPods, minCount, mode, name, nodeImageVersion, nodeLabels, nodePublicIPPrefixID, nodeTaints, orchestratorVersion, osDiskSizeGB, osDiskType, osSKU, osType, podSubnetID, powerState, provisioningState, proximityPlacementGroupID, scaleSetEvictionPolicy, scaleSetPriority, spotMaxPrice, tags, type, upgradeSettings, vmSize, vnetSubnetID);
        }
    }
}
