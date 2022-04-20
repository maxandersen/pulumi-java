// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.AdvancedMachineFeaturesResponse;
import com.pulumi.googlenative.compute_beta.inputs.AttachedDiskResponse;
import com.pulumi.googlenative.compute_beta.inputs.ConfidentialInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.DisplayDeviceResponse;
import com.pulumi.googlenative.compute_beta.inputs.MetadataResponse;
import com.pulumi.googlenative.compute_beta.inputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_beta.inputs.NetworkPerformanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.ReservationAffinityResponse;
import com.pulumi.googlenative.compute_beta.inputs.SchedulingResponse;
import com.pulumi.googlenative.compute_beta.inputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_beta.inputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.ShieldedVmConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class InstancePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstancePropertiesResponse Empty = new InstancePropertiesResponse();

    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="advancedMachineFeatures", required=true)
      private final AdvancedMachineFeaturesResponse advancedMachineFeatures;

    public AdvancedMachineFeaturesResponse advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }

    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    @Import(name="canIpForward", required=true)
      private final Boolean canIpForward;

    public Boolean canIpForward() {
        return this.canIpForward;
    }

    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="confidentialInstanceConfig", required=true)
      private final ConfidentialInstanceConfigResponse confidentialInstanceConfig;

    public ConfidentialInstanceConfigResponse confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }

    /**
     * An optional text description for the instances that are created from these properties.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
     */
    @Import(name="disks", required=true)
      private final List<AttachedDiskResponse> disks;

    public List<AttachedDiskResponse> disks() {
        return this.disks;
    }

    /**
     * Display Device properties to enable support for remote display products like: Teradici, VNC and TeamViewer Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="displayDevice", required=true)
      private final DisplayDeviceResponse displayDevice;

    public DisplayDeviceResponse displayDevice() {
        return this.displayDevice;
    }

    /**
     * A list of guest accelerator cards&#39; type and count to use for instances created from these properties.
     * 
     */
    @Import(name="guestAccelerators", required=true)
      private final List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Labels to apply to instances that are created from these properties.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The machine type to use for instances that are created from these properties.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    @Import(name="metadata", required=true)
      private final MetadataResponse metadata;

    public MetadataResponse metadata() {
        return this.metadata;
    }

    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;. For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    @Import(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * An array of network access configurations for this interface.
     * 
     */
    @Import(name="networkInterfaces", required=true)
      private final List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="networkPerformanceConfig", required=true)
      private final NetworkPerformanceConfigResponse networkPerformanceConfig;

    public NetworkPerformanceConfigResponse networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }

    /**
     * PostKeyRevocationActionType of the instance.
     * 
     */
    @Import(name="postKeyRevocationActionType", required=true)
      private final String postKeyRevocationActionType;

    public String postKeyRevocationActionType() {
        return this.postKeyRevocationActionType;
    }

    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="privateIpv6GoogleAccess", required=true)
      private final String privateIpv6GoogleAccess;

    public String privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }

    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="reservationAffinity", required=true)
      private final ReservationAffinityResponse reservationAffinity;

    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    @Import(name="resourceManagerTags", required=true)
      private final Map<String,String> resourceManagerTags;

    public Map<String,String> resourceManagerTags() {
        return this.resourceManagerTags;
    }

    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="resourcePolicies", required=true)
      private final List<String> resourcePolicies;

    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }

    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
     */
    @Import(name="scheduling", required=true)
      private final SchedulingResponse scheduling;

    public SchedulingResponse scheduling() {
        return this.scheduling;
    }

    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    @Import(name="serviceAccounts", required=true)
      private final List<ServiceAccountResponse> serviceAccounts;

    public List<ServiceAccountResponse> serviceAccounts() {
        return this.serviceAccounts;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="shieldedInstanceConfig", required=true)
      private final ShieldedInstanceConfigResponse shieldedInstanceConfig;

    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * Specifies the Shielded VM options for the instances that are created from these properties.
     * 
     */
    @Import(name="shieldedVmConfig", required=true)
      private final ShieldedVmConfigResponse shieldedVmConfig;

    public ShieldedVmConfigResponse shieldedVmConfig() {
        return this.shieldedVmConfig;
    }

    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="tags", required=true)
      private final TagsResponse tags;

    public TagsResponse tags() {
        return this.tags;
    }

    public InstancePropertiesResponse(
        AdvancedMachineFeaturesResponse advancedMachineFeatures,
        Boolean canIpForward,
        ConfidentialInstanceConfigResponse confidentialInstanceConfig,
        String description,
        List<AttachedDiskResponse> disks,
        DisplayDeviceResponse displayDevice,
        List<AcceleratorConfigResponse> guestAccelerators,
        Map<String,String> labels,
        String machineType,
        MetadataResponse metadata,
        String minCpuPlatform,
        List<NetworkInterfaceResponse> networkInterfaces,
        NetworkPerformanceConfigResponse networkPerformanceConfig,
        String postKeyRevocationActionType,
        String privateIpv6GoogleAccess,
        ReservationAffinityResponse reservationAffinity,
        Map<String,String> resourceManagerTags,
        List<String> resourcePolicies,
        SchedulingResponse scheduling,
        List<ServiceAccountResponse> serviceAccounts,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        ShieldedVmConfigResponse shieldedVmConfig,
        TagsResponse tags) {
        this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures, "expected parameter 'advancedMachineFeatures' to be non-null");
        this.canIpForward = Objects.requireNonNull(canIpForward, "expected parameter 'canIpForward' to be non-null");
        this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig, "expected parameter 'confidentialInstanceConfig' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.displayDevice = Objects.requireNonNull(displayDevice, "expected parameter 'displayDevice' to be non-null");
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
        this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig, "expected parameter 'networkPerformanceConfig' to be non-null");
        this.postKeyRevocationActionType = Objects.requireNonNull(postKeyRevocationActionType, "expected parameter 'postKeyRevocationActionType' to be non-null");
        this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess, "expected parameter 'privateIpv6GoogleAccess' to be non-null");
        this.reservationAffinity = Objects.requireNonNull(reservationAffinity, "expected parameter 'reservationAffinity' to be non-null");
        this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags, "expected parameter 'resourceManagerTags' to be non-null");
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies, "expected parameter 'resourcePolicies' to be non-null");
        this.scheduling = Objects.requireNonNull(scheduling, "expected parameter 'scheduling' to be non-null");
        this.serviceAccounts = Objects.requireNonNull(serviceAccounts, "expected parameter 'serviceAccounts' to be non-null");
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
        this.shieldedVmConfig = Objects.requireNonNull(shieldedVmConfig, "expected parameter 'shieldedVmConfig' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private InstancePropertiesResponse() {
        this.advancedMachineFeatures = null;
        this.canIpForward = null;
        this.confidentialInstanceConfig = null;
        this.description = null;
        this.disks = List.of();
        this.displayDevice = null;
        this.guestAccelerators = List.of();
        this.labels = Map.of();
        this.machineType = null;
        this.metadata = null;
        this.minCpuPlatform = null;
        this.networkInterfaces = List.of();
        this.networkPerformanceConfig = null;
        this.postKeyRevocationActionType = null;
        this.privateIpv6GoogleAccess = null;
        this.reservationAffinity = null;
        this.resourceManagerTags = Map.of();
        this.resourcePolicies = List.of();
        this.scheduling = null;
        this.serviceAccounts = List.of();
        this.shieldedInstanceConfig = null;
        this.shieldedVmConfig = null;
        this.tags = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private Boolean canIpForward;
        private ConfidentialInstanceConfigResponse confidentialInstanceConfig;
        private String description;
        private List<AttachedDiskResponse> disks;
        private DisplayDeviceResponse displayDevice;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private NetworkPerformanceConfigResponse networkPerformanceConfig;
        private String postKeyRevocationActionType;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private Map<String,String> resourceManagerTags;
        private List<String> resourcePolicies;
        private SchedulingResponse scheduling;
        private List<ServiceAccountResponse> serviceAccounts;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private ShieldedVmConfigResponse shieldedVmConfig;
        private TagsResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.displayDevice = defaults.displayDevice;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.postKeyRevocationActionType = defaults.postKeyRevocationActionType;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourceManagerTags = defaults.resourceManagerTags;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.shieldedVmConfig = defaults.shieldedVmConfig;
    	      this.tags = defaults.tags;
        }

        public Builder advancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }
        public Builder canIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }
        public Builder confidentialInstanceConfig(ConfidentialInstanceConfigResponse confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disks(List<AttachedDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(AttachedDiskResponse... disks) {
            return disks(List.of(disks));
        }
        public Builder displayDevice(DisplayDeviceResponse displayDevice) {
            this.displayDevice = Objects.requireNonNull(displayDevice);
            return this;
        }
        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig);
            return this;
        }
        public Builder postKeyRevocationActionType(String postKeyRevocationActionType) {
            this.postKeyRevocationActionType = Objects.requireNonNull(postKeyRevocationActionType);
            return this;
        }
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }
        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }
        public Builder resourceManagerTags(Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }
        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder scheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }
        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }
        public Builder serviceAccounts(ServiceAccountResponse... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder shieldedVmConfig(ShieldedVmConfigResponse shieldedVmConfig) {
            this.shieldedVmConfig = Objects.requireNonNull(shieldedVmConfig);
            return this;
        }
        public Builder tags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public InstancePropertiesResponse build() {
            return new InstancePropertiesResponse(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, displayDevice, guestAccelerators, labels, machineType, metadata, minCpuPlatform, networkInterfaces, networkPerformanceConfig, postKeyRevocationActionType, privateIpv6GoogleAccess, reservationAffinity, resourceManagerTags, resourcePolicies, scheduling, serviceAccounts, shieldedInstanceConfig, shieldedVmConfig, tags);
        }
    }
}
