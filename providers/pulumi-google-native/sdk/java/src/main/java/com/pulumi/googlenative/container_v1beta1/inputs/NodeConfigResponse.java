// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.AdvancedMachineFeaturesResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.EphemeralStorageConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.GcfsConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.LinuxNodeConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.NodeKubeletConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.NodeTaintResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.ReservationAffinityResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.SandboxConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.VirtualNICResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.WorkloadMetadataConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Parameters that describe the nodes in a cluster.
 * 
 */
public final class NodeConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeConfigResponse Empty = new NodeConfigResponse();

    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
     */
    @Import(name="accelerators", required=true)
      private final List<AcceleratorConfigResponse> accelerators;

    public List<AcceleratorConfigResponse> accelerators() {
        return this.accelerators;
    }

    /**
     * Advanced features for the Compute Engine VM.
     * 
     */
    @Import(name="advancedMachineFeatures", required=true)
      private final AdvancedMachineFeaturesResponse advancedMachineFeatures;

    public AdvancedMachineFeaturesResponse advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }

    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    @Import(name="bootDiskKmsKey", required=true)
      private final String bootDiskKmsKey;

    public String bootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }

    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk.
     * 
     */
    @Import(name="ephemeralStorageConfig", required=true)
      private final EphemeralStorageConfigResponse ephemeralStorageConfig;

    public EphemeralStorageConfigResponse ephemeralStorageConfig() {
        return this.ephemeralStorageConfig;
    }

    /**
     * GCFS (Google Container File System) configs.
     * 
     */
    @Import(name="gcfsConfig", required=true)
      private final GcfsConfigResponse gcfsConfig;

    public GcfsConfigResponse gcfsConfig() {
        return this.gcfsConfig;
    }

    /**
     * Enable or disable gvnic on the node pool.
     * 
     */
    @Import(name="gvnic", required=true)
      private final VirtualNICResponse gvnic;

    public VirtualNICResponse gvnic() {
        return this.gvnic;
    }

    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
     */
    @Import(name="imageType", required=true)
      private final String imageType;

    public String imageType() {
        return this.imageType;
    }

    /**
     * Node kubelet configs.
     * 
     */
    @Import(name="kubeletConfig", required=true)
      private final NodeKubeletConfigResponse kubeletConfig;

    public NodeKubeletConfigResponse kubeletConfig() {
        return this.kubeletConfig;
    }

    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Parameters that can be configured on Linux nodes.
     * 
     */
    @Import(name="linuxNodeConfig", required=true)
      private final LinuxNodeConfigResponse linuxNodeConfig;

    public LinuxNodeConfigResponse linuxNodeConfig() {
        return this.linuxNodeConfig;
    }

    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
     */
    @Import(name="localSsdCount", required=true)
      private final Integer localSsdCount;

    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types). If unspecified, the default machine type is `e2-medium`.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-oslogin" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
     */
    @Import(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    @Import(name="nodeGroup", required=true)
      private final String nodeGroup;

    public String nodeGroup() {
        return this.nodeGroup;
    }

    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    @Import(name="oauthScopes", required=true)
      private final List<String> oauthScopes;

    public List<String> oauthScopes() {
        return this.oauthScopes;
    }

    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more inforamtion about preemptible VM instances.
     * 
     */
    @Import(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
     */
    @Import(name="reservationAffinity", required=true)
      private final ReservationAffinityResponse reservationAffinity;

    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }

    /**
     * Sandbox configuration for this node.
     * 
     */
    @Import(name="sandboxConfig", required=true)
      private final SandboxConfigResponse sandboxConfig;

    public SandboxConfigResponse sandboxConfig() {
        return this.sandboxConfig;
    }

    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Shielded Instance options.
     * 
     */
    @Import(name="shieldedInstanceConfig", required=true)
      private final ShieldedInstanceConfigResponse shieldedInstanceConfig;

    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * Spot flag for enabling Spot VM, which is a rebrand of the existing preemptible flag.
     * 
     */
    @Import(name="spot", required=true)
      private final Boolean spot;

    public Boolean spot() {
        return this.spot;
    }

    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="tags", required=true)
      private final List<String> tags;

    public List<String> tags() {
        return this.tags;
    }

    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
     */
    @Import(name="taints", required=true)
      private final List<NodeTaintResponse> taints;

    public List<NodeTaintResponse> taints() {
        return this.taints;
    }

    /**
     * The workload metadata configuration for this node.
     * 
     */
    @Import(name="workloadMetadataConfig", required=true)
      private final WorkloadMetadataConfigResponse workloadMetadataConfig;

    public WorkloadMetadataConfigResponse workloadMetadataConfig() {
        return this.workloadMetadataConfig;
    }

    public NodeConfigResponse(
        List<AcceleratorConfigResponse> accelerators,
        AdvancedMachineFeaturesResponse advancedMachineFeatures,
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        EphemeralStorageConfigResponse ephemeralStorageConfig,
        GcfsConfigResponse gcfsConfig,
        VirtualNICResponse gvnic,
        String imageType,
        NodeKubeletConfigResponse kubeletConfig,
        Map<String,String> labels,
        LinuxNodeConfigResponse linuxNodeConfig,
        Integer localSsdCount,
        String machineType,
        Map<String,String> metadata,
        String minCpuPlatform,
        String nodeGroup,
        List<String> oauthScopes,
        Boolean preemptible,
        ReservationAffinityResponse reservationAffinity,
        SandboxConfigResponse sandboxConfig,
        String serviceAccount,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        Boolean spot,
        List<String> tags,
        List<NodeTaintResponse> taints,
        WorkloadMetadataConfigResponse workloadMetadataConfig) {
        this.accelerators = Objects.requireNonNull(accelerators, "expected parameter 'accelerators' to be non-null");
        this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures, "expected parameter 'advancedMachineFeatures' to be non-null");
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey, "expected parameter 'bootDiskKmsKey' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.ephemeralStorageConfig = Objects.requireNonNull(ephemeralStorageConfig, "expected parameter 'ephemeralStorageConfig' to be non-null");
        this.gcfsConfig = Objects.requireNonNull(gcfsConfig, "expected parameter 'gcfsConfig' to be non-null");
        this.gvnic = Objects.requireNonNull(gvnic, "expected parameter 'gvnic' to be non-null");
        this.imageType = Objects.requireNonNull(imageType, "expected parameter 'imageType' to be non-null");
        this.kubeletConfig = Objects.requireNonNull(kubeletConfig, "expected parameter 'kubeletConfig' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.linuxNodeConfig = Objects.requireNonNull(linuxNodeConfig, "expected parameter 'linuxNodeConfig' to be non-null");
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.nodeGroup = Objects.requireNonNull(nodeGroup, "expected parameter 'nodeGroup' to be non-null");
        this.oauthScopes = Objects.requireNonNull(oauthScopes, "expected parameter 'oauthScopes' to be non-null");
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
        this.reservationAffinity = Objects.requireNonNull(reservationAffinity, "expected parameter 'reservationAffinity' to be non-null");
        this.sandboxConfig = Objects.requireNonNull(sandboxConfig, "expected parameter 'sandboxConfig' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
        this.spot = Objects.requireNonNull(spot, "expected parameter 'spot' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.taints = Objects.requireNonNull(taints, "expected parameter 'taints' to be non-null");
        this.workloadMetadataConfig = Objects.requireNonNull(workloadMetadataConfig, "expected parameter 'workloadMetadataConfig' to be non-null");
    }

    private NodeConfigResponse() {
        this.accelerators = List.of();
        this.advancedMachineFeatures = null;
        this.bootDiskKmsKey = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.ephemeralStorageConfig = null;
        this.gcfsConfig = null;
        this.gvnic = null;
        this.imageType = null;
        this.kubeletConfig = null;
        this.labels = Map.of();
        this.linuxNodeConfig = null;
        this.localSsdCount = null;
        this.machineType = null;
        this.metadata = Map.of();
        this.minCpuPlatform = null;
        this.nodeGroup = null;
        this.oauthScopes = List.of();
        this.preemptible = null;
        this.reservationAffinity = null;
        this.sandboxConfig = null;
        this.serviceAccount = null;
        this.shieldedInstanceConfig = null;
        this.spot = null;
        this.tags = List.of();
        this.taints = List.of();
        this.workloadMetadataConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private EphemeralStorageConfigResponse ephemeralStorageConfig;
        private GcfsConfigResponse gcfsConfig;
        private VirtualNICResponse gvnic;
        private String imageType;
        private NodeKubeletConfigResponse kubeletConfig;
        private Map<String,String> labels;
        private LinuxNodeConfigResponse linuxNodeConfig;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private ReservationAffinityResponse reservationAffinity;
        private SandboxConfigResponse sandboxConfig;
        private String serviceAccount;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private Boolean spot;
        private List<String> tags;
        private List<NodeTaintResponse> taints;
        private WorkloadMetadataConfigResponse workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfig = defaults.ephemeralStorageConfig;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.gvnic = defaults.gvnic;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder accelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigResponse... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder advancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }
        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder ephemeralStorageConfig(EphemeralStorageConfigResponse ephemeralStorageConfig) {
            this.ephemeralStorageConfig = Objects.requireNonNull(ephemeralStorageConfig);
            return this;
        }
        public Builder gcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }
        public Builder gvnic(VirtualNICResponse gvnic) {
            this.gvnic = Objects.requireNonNull(gvnic);
            return this;
        }
        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }
        public Builder kubeletConfig(NodeKubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = Objects.requireNonNull(kubeletConfig);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder linuxNodeConfig(LinuxNodeConfigResponse linuxNodeConfig) {
            this.linuxNodeConfig = Objects.requireNonNull(linuxNodeConfig);
            return this;
        }
        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder nodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }
        public Builder sandboxConfig(SandboxConfigResponse sandboxConfig) {
            this.sandboxConfig = Objects.requireNonNull(sandboxConfig);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder spot(Boolean spot) {
            this.spot = Objects.requireNonNull(spot);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder taints(List<NodeTaintResponse> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }
        public Builder taints(NodeTaintResponse... taints) {
            return taints(List.of(taints));
        }
        public Builder workloadMetadataConfig(WorkloadMetadataConfigResponse workloadMetadataConfig) {
            this.workloadMetadataConfig = Objects.requireNonNull(workloadMetadataConfig);
            return this;
        }        public NodeConfigResponse build() {
            return new NodeConfigResponse(accelerators, advancedMachineFeatures, bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfig, gcfsConfig, gvnic, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, reservationAffinity, sandboxConfig, serviceAccount, shieldedInstanceConfig, spot, tags, taints, workloadMetadataConfig);
        }
    }
}
