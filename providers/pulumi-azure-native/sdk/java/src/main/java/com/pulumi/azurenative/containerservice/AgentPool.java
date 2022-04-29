// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerservice.AgentPoolArgs;
import com.pulumi.azurenative.containerservice.outputs.AgentPoolUpgradeSettingsResponse;
import com.pulumi.azurenative.containerservice.outputs.KubeletConfigResponse;
import com.pulumi.azurenative.containerservice.outputs.LinuxOSConfigResponse;
import com.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Agent Pool.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerservice:AgentPool agentpool1 /subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/managedClusters/clustername1/agentPools/agentpool1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerservice:AgentPool")
public class AgentPool extends CustomResource {
    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> availabilityZones;

    /**
     * @return Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    public Output<Optional<List<String>>> availabilityZones() {
        return Codegen.optional(this.availabilityZones);
    }
    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    @Export(name="count", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> count;

    /**
     * @return Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    public Output<Optional<Integer>> count() {
        return Codegen.optional(this.count);
    }
    /**
     * Whether to enable auto-scaler
     * 
     */
    @Export(name="enableAutoScaling", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoScaling;

    /**
     * @return Whether to enable auto-scaler
     * 
     */
    public Output<Optional<Boolean>> enableAutoScaling() {
        return Codegen.optional(this.enableAutoScaling);
    }
    /**
     * Whether to enable EncryptionAtHost
     * 
     */
    @Export(name="enableEncryptionAtHost", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEncryptionAtHost;

    /**
     * @return Whether to enable EncryptionAtHost
     * 
     */
    public Output<Optional<Boolean>> enableEncryptionAtHost() {
        return Codegen.optional(this.enableEncryptionAtHost);
    }
    /**
     * Whether to use FIPS enabled OS
     * 
     */
    @Export(name="enableFIPS", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFIPS;

    /**
     * @return Whether to use FIPS enabled OS
     * 
     */
    public Output<Optional<Boolean>> enableFIPS() {
        return Codegen.optional(this.enableFIPS);
    }
    /**
     * Enable public IP for nodes
     * 
     */
    @Export(name="enableNodePublicIP", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNodePublicIP;

    /**
     * @return Enable public IP for nodes
     * 
     */
    public Output<Optional<Boolean>> enableNodePublicIP() {
        return Codegen.optional(this.enableNodePublicIP);
    }
    /**
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    @Export(name="gpuInstanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> gpuInstanceProfile;

    /**
     * @return GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    public Output<Optional<String>> gpuInstanceProfile() {
        return Codegen.optional(this.gpuInstanceProfile);
    }
    /**
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    @Export(name="kubeletConfig", type=KubeletConfigResponse.class, parameters={})
    private Output</* @Nullable */ KubeletConfigResponse> kubeletConfig;

    /**
     * @return KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    public Output<Optional<KubeletConfigResponse>> kubeletConfig() {
        return Codegen.optional(this.kubeletConfig);
    }
    /**
     * KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    @Export(name="kubeletDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> kubeletDiskType;

    /**
     * @return KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    public Output<Optional<String>> kubeletDiskType() {
        return Codegen.optional(this.kubeletDiskType);
    }
    /**
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    @Export(name="linuxOSConfig", type=LinuxOSConfigResponse.class, parameters={})
    private Output</* @Nullable */ LinuxOSConfigResponse> linuxOSConfig;

    /**
     * @return LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    public Output<Optional<LinuxOSConfigResponse>> linuxOSConfig() {
        return Codegen.optional(this.linuxOSConfig);
    }
    /**
     * Maximum number of nodes for auto-scaling
     * 
     */
    @Export(name="maxCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxCount;

    /**
     * @return Maximum number of nodes for auto-scaling
     * 
     */
    public Output<Optional<Integer>> maxCount() {
        return Codegen.optional(this.maxCount);
    }
    /**
     * Maximum number of pods that can run on a node.
     * 
     */
    @Export(name="maxPods", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxPods;

    /**
     * @return Maximum number of pods that can run on a node.
     * 
     */
    public Output<Optional<Integer>> maxPods() {
        return Codegen.optional(this.maxPods);
    }
    /**
     * Minimum number of nodes for auto-scaling
     * 
     */
    @Export(name="minCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minCount;

    /**
     * @return Minimum number of nodes for auto-scaling
     * 
     */
    public Output<Optional<Integer>> minCount() {
        return Codegen.optional(this.minCount);
    }
    /**
     * AgentPoolMode represents mode of an agent pool
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return AgentPoolMode represents mode of an agent pool
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Version of node image
     * 
     */
    @Export(name="nodeImageVersion", type=String.class, parameters={})
    private Output<String> nodeImageVersion;

    /**
     * @return Version of node image
     * 
     */
    public Output<String> nodeImageVersion() {
        return this.nodeImageVersion;
    }
    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    @Export(name="nodeLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> nodeLabels;

    /**
     * @return Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    public Output<Optional<Map<String,String>>> nodeLabels() {
        return Codegen.optional(this.nodeLabels);
    }
    /**
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    @Export(name="nodePublicIPPrefixID", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodePublicIPPrefixID;

    /**
     * @return Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    public Output<Optional<String>> nodePublicIPPrefixID() {
        return Codegen.optional(this.nodePublicIPPrefixID);
    }
    /**
     * Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    @Export(name="nodeTaints", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> nodeTaints;

    /**
     * @return Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    public Output<Optional<List<String>>> nodeTaints() {
        return Codegen.optional(this.nodeTaints);
    }
    /**
     * Version of orchestrator specified when creating the managed cluster.
     * 
     */
    @Export(name="orchestratorVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> orchestratorVersion;

    /**
     * @return Version of orchestrator specified when creating the managed cluster.
     * 
     */
    public Output<Optional<String>> orchestratorVersion() {
        return Codegen.optional(this.orchestratorVersion);
    }
    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    @Export(name="osDiskSizeGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> osDiskSizeGB;

    /**
     * @return OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    public Output<Optional<Integer>> osDiskSizeGB() {
        return Codegen.optional(this.osDiskSizeGB);
    }
    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are &#39;Ephemeral&#39; and &#39;Managed&#39;. If unspecified, defaults to &#39;Ephemeral&#39; when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to &#39;Managed&#39;. May not be changed after creation.
     * 
     */
    @Export(name="osDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osDiskType;

    /**
     * @return OS disk type to be used for machines in a given agent pool. Allowed values are &#39;Ephemeral&#39; and &#39;Managed&#39;. If unspecified, defaults to &#39;Ephemeral&#39; when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to &#39;Managed&#39;. May not be changed after creation.
     * 
     */
    public Output<Optional<String>> osDiskType() {
        return Codegen.optional(this.osDiskType);
    }
    /**
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    @Export(name="osSKU", type=String.class, parameters={})
    private Output</* @Nullable */ String> osSKU;

    /**
     * @return OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    public Output<Optional<String>> osSKU() {
        return Codegen.optional(this.osSKU);
    }
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    /**
     * Pod SubnetID specifies the VNet&#39;s subnet identifier for pods.
     * 
     */
    @Export(name="podSubnetID", type=String.class, parameters={})
    private Output</* @Nullable */ String> podSubnetID;

    /**
     * @return Pod SubnetID specifies the VNet&#39;s subnet identifier for pods.
     * 
     */
    public Output<Optional<String>> podSubnetID() {
        return Codegen.optional(this.podSubnetID);
    }
    /**
     * Describes whether the Agent Pool is Running or Stopped
     * 
     */
    @Export(name="powerState", type=PowerStateResponse.class, parameters={})
    private Output<PowerStateResponse> powerState;

    /**
     * @return Describes whether the Agent Pool is Running or Stopped
     * 
     */
    public Output<PowerStateResponse> powerState() {
        return this.powerState;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The ID for Proximity Placement Group.
     * 
     */
    @Export(name="proximityPlacementGroupID", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupID;

    /**
     * @return The ID for Proximity Placement Group.
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupID() {
        return Codegen.optional(this.proximityPlacementGroupID);
    }
    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    @Export(name="scaleSetEvictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleSetEvictionPolicy;

    /**
     * @return ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    public Output<Optional<String>> scaleSetEvictionPolicy() {
        return Codegen.optional(this.scaleSetEvictionPolicy);
    }
    /**
     * ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    @Export(name="scaleSetPriority", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleSetPriority;

    /**
     * @return ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    public Output<Optional<String>> scaleSetPriority() {
        return Codegen.optional(this.scaleSetPriority);
    }
    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    @Export(name="spotMaxPrice", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> spotMaxPrice;

    /**
     * @return SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    public Output<Optional<Double>> spotMaxPrice() {
        return Codegen.optional(this.spotMaxPrice);
    }
    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * AgentPoolType represents types of an agent pool
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return AgentPoolType represents types of an agent pool
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Settings for upgrading the agentpool
     * 
     */
    @Export(name="upgradeSettings", type=AgentPoolUpgradeSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AgentPoolUpgradeSettingsResponse> upgradeSettings;

    /**
     * @return Settings for upgrading the agentpool
     * 
     */
    public Output<Optional<AgentPoolUpgradeSettingsResponse>> upgradeSettings() {
        return Codegen.optional(this.upgradeSettings);
    }
    /**
     * Size of agent VMs.
     * 
     */
    @Export(name="vmSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmSize;

    /**
     * @return Size of agent VMs.
     * 
     */
    public Output<Optional<String>> vmSize() {
        return Codegen.optional(this.vmSize);
    }
    /**
     * VNet SubnetID specifies the VNet&#39;s subnet identifier for nodes and maybe pods
     * 
     */
    @Export(name="vnetSubnetID", type=String.class, parameters={})
    private Output</* @Nullable */ String> vnetSubnetID;

    /**
     * @return VNet SubnetID specifies the VNet&#39;s subnet identifier for nodes and maybe pods
     * 
     */
    public Output<Optional<String>> vnetSubnetID() {
        return Codegen.optional(this.vnetSubnetID);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AgentPool(String name) {
        this(name, AgentPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AgentPool(String name, AgentPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AgentPool(String name, AgentPoolArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:containerservice:AgentPool", name, args == null ? AgentPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AgentPool(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:containerservice:AgentPool", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:containerservice/v20190201:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20190401:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20190601:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20190801:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20191001:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20191101:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200101:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200201:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200301:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200401:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200601:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200701:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20200901:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20201101:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20201201:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210201:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210301:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210501:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210701:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210801:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20210901:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20211001:AgentPool").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20211101preview:AgentPool").build())
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
    public static AgentPool get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AgentPool(name, id, options);
    }
}
