// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterDefaultNodePoolKubeletConfig;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterDefaultNodePoolLinuxOsConfig;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterDefaultNodePoolUpgradeSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterDefaultNodePool {
    /**
     * @return Should [the Kubernetes Auto Scaler](https://docs.microsoft.com/en-us/azure/aks/cluster-autoscaler) be enabled for this Node Pool? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enableAutoScaling;
    /**
     * @return Should the nodes in the Default Node Pool have host encryption enabled? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enableHostEncryption;
    /**
     * @return Should nodes in this Node Pool have a Public IP Address? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean enableNodePublicIp;
    /**
     * @return Should the nodes in this Node Pool have Federal Information Processing Standard enabled? Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean fipsEnabled;
    /**
     * @return A `kubelet_config` block as defined below.
     * 
     */
    private final @Nullable KubernetesClusterDefaultNodePoolKubeletConfig kubeletConfig;
    /**
     * @return The type of disk used by kubelet. Possible values are `OS` and `Temporary`.
     * 
     */
    private final @Nullable String kubeletDiskType;
    /**
     * @return A `linux_os_config` block as defined below.
     * 
     */
    private final @Nullable KubernetesClusterDefaultNodePoolLinuxOsConfig linuxOsConfig;
    /**
     * @return The maximum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * @return The maximum number of pods that can run on each agent. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer maxPods;
    /**
     * @return The minimum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
     * 
     */
    private final @Nullable Integer minCount;
    /**
     * @return The name which should be used for the default Kubernetes Node Pool. Changing this forces a new resource to be created.
     * 
     */
    private final String name;
    /**
     * @return The initial number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000` and between `min_count` and `max_count`.
     * 
     */
    private final @Nullable Integer nodeCount;
    /**
     * @return A map of Kubernetes labels which should be applied to nodes in the Default Node Pool. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Map<String,String> nodeLabels;
    /**
     * @return Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `enable_node_public_ip` should be `true`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String nodePublicIpPrefixId;
    private final @Nullable List<String> nodeTaints;
    /**
     * @return Enabling this option will taint default node pool with `CriticalAddonsOnly=true:NoSchedule` taint. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean onlyCriticalAddonsEnabled;
    /**
     * @return Version of Kubernetes used for the Agents. If not specified, the default node pool will be created with the version specified by `kubernetes_version`. If both are unspecified, the latest recommended version will be used at provisioning time (but won&#39;t auto-upgrade)
     * 
     */
    private final @Nullable String orchestratorVersion;
    /**
     * @return The size of the OS Disk which should be used for each agent in the Node Pool. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer osDiskSizeGb;
    /**
     * @return The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String osDiskType;
    /**
     * @return OsSKU to be used to specify Linux OSType. Not applicable to Windows OSType. Possible values include: `Ubuntu`, `CBLMariner`. Defaults to `Ubuntu`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String osSku;
    /**
     * @return The ID of the Subnet where the pods in the default Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String podSubnetId;
    private final @Nullable String proximityPlacementGroupId;
    /**
     * @return A mapping of tags to assign to the Node Pool.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of Node Pool which should be created. Possible values are `AvailabilitySet` and `VirtualMachineScaleSets`. Defaults to `VirtualMachineScaleSets`.
     * 
     */
    private final @Nullable String type;
    /**
     * @return Used to specify whether the UltraSSD is enabled in the Default Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/en-us/azure/aks/use-ultra-disks) for more information.
     * 
     */
    private final @Nullable Boolean ultraSsdEnabled;
    /**
     * @return A `upgrade_settings` block as documented below.
     * 
     */
    private final @Nullable KubernetesClusterDefaultNodePoolUpgradeSettings upgradeSettings;
    /**
     * @return The size of the Virtual Machine, such as `Standard_DS2_v2`.
     * 
     */
    private final String vmSize;
    /**
     * @return The ID of a Subnet where the Kubernetes Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String vnetSubnetId;
    /**
     * @return Specifies a list of Availability Zones in which this Kubernetes Cluster should be located. Changing this forces a new Kubernetes Cluster to be created.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private KubernetesClusterDefaultNodePool(
        @CustomType.Parameter("enableAutoScaling") @Nullable Boolean enableAutoScaling,
        @CustomType.Parameter("enableHostEncryption") @Nullable Boolean enableHostEncryption,
        @CustomType.Parameter("enableNodePublicIp") @Nullable Boolean enableNodePublicIp,
        @CustomType.Parameter("fipsEnabled") @Nullable Boolean fipsEnabled,
        @CustomType.Parameter("kubeletConfig") @Nullable KubernetesClusterDefaultNodePoolKubeletConfig kubeletConfig,
        @CustomType.Parameter("kubeletDiskType") @Nullable String kubeletDiskType,
        @CustomType.Parameter("linuxOsConfig") @Nullable KubernetesClusterDefaultNodePoolLinuxOsConfig linuxOsConfig,
        @CustomType.Parameter("maxCount") @Nullable Integer maxCount,
        @CustomType.Parameter("maxPods") @Nullable Integer maxPods,
        @CustomType.Parameter("minCount") @Nullable Integer minCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeCount") @Nullable Integer nodeCount,
        @CustomType.Parameter("nodeLabels") @Nullable Map<String,String> nodeLabels,
        @CustomType.Parameter("nodePublicIpPrefixId") @Nullable String nodePublicIpPrefixId,
        @CustomType.Parameter("nodeTaints") @Nullable List<String> nodeTaints,
        @CustomType.Parameter("onlyCriticalAddonsEnabled") @Nullable Boolean onlyCriticalAddonsEnabled,
        @CustomType.Parameter("orchestratorVersion") @Nullable String orchestratorVersion,
        @CustomType.Parameter("osDiskSizeGb") @Nullable Integer osDiskSizeGb,
        @CustomType.Parameter("osDiskType") @Nullable String osDiskType,
        @CustomType.Parameter("osSku") @Nullable String osSku,
        @CustomType.Parameter("podSubnetId") @Nullable String podSubnetId,
        @CustomType.Parameter("proximityPlacementGroupId") @Nullable String proximityPlacementGroupId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("ultraSsdEnabled") @Nullable Boolean ultraSsdEnabled,
        @CustomType.Parameter("upgradeSettings") @Nullable KubernetesClusterDefaultNodePoolUpgradeSettings upgradeSettings,
        @CustomType.Parameter("vmSize") String vmSize,
        @CustomType.Parameter("vnetSubnetId") @Nullable String vnetSubnetId,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.enableAutoScaling = enableAutoScaling;
        this.enableHostEncryption = enableHostEncryption;
        this.enableNodePublicIp = enableNodePublicIp;
        this.fipsEnabled = fipsEnabled;
        this.kubeletConfig = kubeletConfig;
        this.kubeletDiskType = kubeletDiskType;
        this.linuxOsConfig = linuxOsConfig;
        this.maxCount = maxCount;
        this.maxPods = maxPods;
        this.minCount = minCount;
        this.name = name;
        this.nodeCount = nodeCount;
        this.nodeLabels = nodeLabels;
        this.nodePublicIpPrefixId = nodePublicIpPrefixId;
        this.nodeTaints = nodeTaints;
        this.onlyCriticalAddonsEnabled = onlyCriticalAddonsEnabled;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGb = osDiskSizeGb;
        this.osDiskType = osDiskType;
        this.osSku = osSku;
        this.podSubnetId = podSubnetId;
        this.proximityPlacementGroupId = proximityPlacementGroupId;
        this.tags = tags;
        this.type = type;
        this.ultraSsdEnabled = ultraSsdEnabled;
        this.upgradeSettings = upgradeSettings;
        this.vmSize = vmSize;
        this.vnetSubnetId = vnetSubnetId;
        this.zones = zones;
    }

    /**
     * @return Should [the Kubernetes Auto Scaler](https://docs.microsoft.com/en-us/azure/aks/cluster-autoscaler) be enabled for this Node Pool? Defaults to `false`.
     * 
     */
    public Optional<Boolean> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * @return Should the nodes in the Default Node Pool have host encryption enabled? Defaults to `false`.
     * 
     */
    public Optional<Boolean> enableHostEncryption() {
        return Optional.ofNullable(this.enableHostEncryption);
    }
    /**
     * @return Should nodes in this Node Pool have a Public IP Address? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> enableNodePublicIp() {
        return Optional.ofNullable(this.enableNodePublicIp);
    }
    /**
     * @return Should the nodes in this Node Pool have Federal Information Processing Standard enabled? Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }
    /**
     * @return A `kubelet_config` block as defined below.
     * 
     */
    public Optional<KubernetesClusterDefaultNodePoolKubeletConfig> kubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    /**
     * @return The type of disk used by kubelet. Possible values are `OS` and `Temporary`.
     * 
     */
    public Optional<String> kubeletDiskType() {
        return Optional.ofNullable(this.kubeletDiskType);
    }
    /**
     * @return A `linux_os_config` block as defined below.
     * 
     */
    public Optional<KubernetesClusterDefaultNodePoolLinuxOsConfig> linuxOsConfig() {
        return Optional.ofNullable(this.linuxOsConfig);
    }
    /**
     * @return The maximum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
     * 
     */
    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * @return The maximum number of pods that can run on each agent. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * @return The minimum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
     * 
     */
    public Optional<Integer> minCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * @return The name which should be used for the default Kubernetes Node Pool. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The initial number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000` and between `min_count` and `max_count`.
     * 
     */
    public Optional<Integer> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    /**
     * @return A map of Kubernetes labels which should be applied to nodes in the Default Node Pool. Changing this forces a new resource to be created.
     * 
     */
    public Map<String,String> nodeLabels() {
        return this.nodeLabels == null ? Map.of() : this.nodeLabels;
    }
    /**
     * @return Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `enable_node_public_ip` should be `true`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> nodePublicIpPrefixId() {
        return Optional.ofNullable(this.nodePublicIpPrefixId);
    }
    public List<String> nodeTaints() {
        return this.nodeTaints == null ? List.of() : this.nodeTaints;
    }
    /**
     * @return Enabling this option will taint default node pool with `CriticalAddonsOnly=true:NoSchedule` taint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> onlyCriticalAddonsEnabled() {
        return Optional.ofNullable(this.onlyCriticalAddonsEnabled);
    }
    /**
     * @return Version of Kubernetes used for the Agents. If not specified, the default node pool will be created with the version specified by `kubernetes_version`. If both are unspecified, the latest recommended version will be used at provisioning time (but won&#39;t auto-upgrade)
     * 
     */
    public Optional<String> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * @return The size of the OS Disk which should be used for each agent in the Node Pool. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }
    /**
     * @return The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * @return OsSKU to be used to specify Linux OSType. Not applicable to Windows OSType. Possible values include: `Ubuntu`, `CBLMariner`. Defaults to `Ubuntu`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> osSku() {
        return Optional.ofNullable(this.osSku);
    }
    /**
     * @return The ID of the Subnet where the pods in the default Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> podSubnetId() {
        return Optional.ofNullable(this.podSubnetId);
    }
    public Optional<String> proximityPlacementGroupId() {
        return Optional.ofNullable(this.proximityPlacementGroupId);
    }
    /**
     * @return A mapping of tags to assign to the Node Pool.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of Node Pool which should be created. Possible values are `AvailabilitySet` and `VirtualMachineScaleSets`. Defaults to `VirtualMachineScaleSets`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Used to specify whether the UltraSSD is enabled in the Default Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/en-us/azure/aks/use-ultra-disks) for more information.
     * 
     */
    public Optional<Boolean> ultraSsdEnabled() {
        return Optional.ofNullable(this.ultraSsdEnabled);
    }
    /**
     * @return A `upgrade_settings` block as documented below.
     * 
     */
    public Optional<KubernetesClusterDefaultNodePoolUpgradeSettings> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }
    /**
     * @return The size of the Virtual Machine, such as `Standard_DS2_v2`.
     * 
     */
    public String vmSize() {
        return this.vmSize;
    }
    /**
     * @return The ID of a Subnet where the Kubernetes Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> vnetSubnetId() {
        return Optional.ofNullable(this.vnetSubnetId);
    }
    /**
     * @return Specifies a list of Availability Zones in which this Kubernetes Cluster should be located. Changing this forces a new Kubernetes Cluster to be created.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterDefaultNodePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Boolean enableHostEncryption;
        private @Nullable Boolean enableNodePublicIp;
        private @Nullable Boolean fipsEnabled;
        private @Nullable KubernetesClusterDefaultNodePoolKubeletConfig kubeletConfig;
        private @Nullable String kubeletDiskType;
        private @Nullable KubernetesClusterDefaultNodePoolLinuxOsConfig linuxOsConfig;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable Integer minCount;
        private String name;
        private @Nullable Integer nodeCount;
        private @Nullable Map<String,String> nodeLabels;
        private @Nullable String nodePublicIpPrefixId;
        private @Nullable List<String> nodeTaints;
        private @Nullable Boolean onlyCriticalAddonsEnabled;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGb;
        private @Nullable String osDiskType;
        private @Nullable String osSku;
        private @Nullable String podSubnetId;
        private @Nullable String proximityPlacementGroupId;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;
        private @Nullable Boolean ultraSsdEnabled;
        private @Nullable KubernetesClusterDefaultNodePoolUpgradeSettings upgradeSettings;
        private String vmSize;
        private @Nullable String vnetSubnetId;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterDefaultNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.enableHostEncryption = defaults.enableHostEncryption;
    	      this.enableNodePublicIp = defaults.enableNodePublicIp;
    	      this.fipsEnabled = defaults.fipsEnabled;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.kubeletDiskType = defaults.kubeletDiskType;
    	      this.linuxOsConfig = defaults.linuxOsConfig;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.minCount = defaults.minCount;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeLabels = defaults.nodeLabels;
    	      this.nodePublicIpPrefixId = defaults.nodePublicIpPrefixId;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.onlyCriticalAddonsEnabled = defaults.onlyCriticalAddonsEnabled;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGb = defaults.osDiskSizeGb;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osSku = defaults.osSku;
    	      this.podSubnetId = defaults.podSubnetId;
    	      this.proximityPlacementGroupId = defaults.proximityPlacementGroupId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.ultraSsdEnabled = defaults.ultraSsdEnabled;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetSubnetId = defaults.vnetSubnetId;
    	      this.zones = defaults.zones;
        }

        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Builder enableHostEncryption(@Nullable Boolean enableHostEncryption) {
            this.enableHostEncryption = enableHostEncryption;
            return this;
        }
        public Builder enableNodePublicIp(@Nullable Boolean enableNodePublicIp) {
            this.enableNodePublicIp = enableNodePublicIp;
            return this;
        }
        public Builder fipsEnabled(@Nullable Boolean fipsEnabled) {
            this.fipsEnabled = fipsEnabled;
            return this;
        }
        public Builder kubeletConfig(@Nullable KubernetesClusterDefaultNodePoolKubeletConfig kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletDiskType(@Nullable String kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }
        public Builder linuxOsConfig(@Nullable KubernetesClusterDefaultNodePoolLinuxOsConfig linuxOsConfig) {
            this.linuxOsConfig = linuxOsConfig;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }
        public Builder nodePublicIpPrefixId(@Nullable String nodePublicIpPrefixId) {
            this.nodePublicIpPrefixId = nodePublicIpPrefixId;
            return this;
        }
        public Builder nodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }
        public Builder nodeTaints(String... nodeTaints) {
            return nodeTaints(List.of(nodeTaints));
        }
        public Builder onlyCriticalAddonsEnabled(@Nullable Boolean onlyCriticalAddonsEnabled) {
            this.onlyCriticalAddonsEnabled = onlyCriticalAddonsEnabled;
            return this;
        }
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        public Builder osDiskSizeGb(@Nullable Integer osDiskSizeGb) {
            this.osDiskSizeGb = osDiskSizeGb;
            return this;
        }
        public Builder osDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }
        public Builder osSku(@Nullable String osSku) {
            this.osSku = osSku;
            return this;
        }
        public Builder podSubnetId(@Nullable String podSubnetId) {
            this.podSubnetId = podSubnetId;
            return this;
        }
        public Builder proximityPlacementGroupId(@Nullable String proximityPlacementGroupId) {
            this.proximityPlacementGroupId = proximityPlacementGroupId;
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
        public Builder ultraSsdEnabled(@Nullable Boolean ultraSsdEnabled) {
            this.ultraSsdEnabled = ultraSsdEnabled;
            return this;
        }
        public Builder upgradeSettings(@Nullable KubernetesClusterDefaultNodePoolUpgradeSettings upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }
        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }
        public Builder vnetSubnetId(@Nullable String vnetSubnetId) {
            this.vnetSubnetId = vnetSubnetId;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public KubernetesClusterDefaultNodePool build() {
            return new KubernetesClusterDefaultNodePool(enableAutoScaling, enableHostEncryption, enableNodePublicIp, fipsEnabled, kubeletConfig, kubeletDiskType, linuxOsConfig, maxCount, maxPods, minCount, name, nodeCount, nodeLabels, nodePublicIpPrefixId, nodeTaints, onlyCriticalAddonsEnabled, orchestratorVersion, osDiskSizeGb, osDiskType, osSku, podSubnetId, proximityPlacementGroupId, tags, type, ultraSsdEnabled, upgradeSettings, vmSize, vnetSubnetId, zones);
        }
    }
}
