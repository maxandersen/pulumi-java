// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.ContainerImageResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.LocalDiskResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeAcceleratorConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeShieldedInstanceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class VirtualMachineConfigResponse {
    /**
     * Optional. The Compute Engine accelerator configuration for this runtime.
     * 
     */
    private final RuntimeAcceleratorConfigResponse acceleratorConfig;
    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    private final List<ContainerImageResponse> containerImages;
    /**
     * Data disk option configuration settings.
     * 
     */
    private final LocalDiskResponse dataDisk;
    /**
     * Optional. Encryption settings for virtual machine data disk.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * The Compute Engine guest attributes. (see [Project and instance guest attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
     * 
     */
    private final Map<String,String> guestAttributes;
    /**
     * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    private final Boolean internalIpOnly;
    /**
     * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
     * 
     */
    private final String machineType;
    /**
     * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires configuring Private Service Access. * Shared VPC (network & subnet are required). Requires configuring Private Service Access.
     * 
     */
    private final String network;
    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    private final String nicType;
    /**
     * Optional. Shielded VM Instance configuration settings.
     * 
     */
    private final RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    private final String subnet;
    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    private final List<String> tags;
    /**
     * The zone where the virtual machine is located. If using regional request, the notebooks service will pick a location in the corresponding runtime region. On a get request, zone will always be present. Example: * `us-central1-b`
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private VirtualMachineConfigResponse(
        @CustomType.Parameter("acceleratorConfig") RuntimeAcceleratorConfigResponse acceleratorConfig,
        @CustomType.Parameter("containerImages") List<ContainerImageResponse> containerImages,
        @CustomType.Parameter("dataDisk") LocalDiskResponse dataDisk,
        @CustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("guestAttributes") Map<String,String> guestAttributes,
        @CustomType.Parameter("internalIpOnly") Boolean internalIpOnly,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nicType") String nicType,
        @CustomType.Parameter("shieldedInstanceConfig") RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("subnet") String subnet,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("zone") String zone) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerImages = containerImages;
        this.dataDisk = dataDisk;
        this.encryptionConfig = encryptionConfig;
        this.guestAttributes = guestAttributes;
        this.internalIpOnly = internalIpOnly;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.network = network;
        this.nicType = nicType;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnet = subnet;
        this.tags = tags;
        this.zone = zone;
    }

    /**
     * Optional. The Compute Engine accelerator configuration for this runtime.
     * 
    */
    public RuntimeAcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
    */
    public List<ContainerImageResponse> containerImages() {
        return this.containerImages;
    }
    /**
     * Data disk option configuration settings.
     * 
    */
    public LocalDiskResponse dataDisk() {
        return this.dataDisk;
    }
    /**
     * Optional. Encryption settings for virtual machine data disk.
     * 
    */
    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The Compute Engine guest attributes. (see [Project and instance guest attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
     * 
    */
    public Map<String,String> guestAttributes() {
        return this.guestAttributes;
    }
    /**
     * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
     * 
    */
    public Boolean internalIpOnly() {
        return this.internalIpOnly;
    }
    /**
     * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
     * 
    */
    public String machineType() {
        return this.machineType;
    }
    /**
     * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
    */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires configuring Private Service Access. * Shared VPC (network & subnet are required). Requires configuring Private Service Access.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
    */
    public String nicType() {
        return this.nicType;
    }
    /**
     * Optional. Shielded VM Instance configuration settings.
     * 
    */
    public RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
    */
    public String subnet() {
        return this.subnet;
    }
    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
    */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * The zone where the virtual machine is located. If using regional request, the notebooks service will pick a location in the corresponding runtime region. On a get request, zone will always be present. Example: * `us-central1-b`
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeAcceleratorConfigResponse acceleratorConfig;
        private List<ContainerImageResponse> containerImages;
        private LocalDiskResponse dataDisk;
        private EncryptionConfigResponse encryptionConfig;
        private Map<String,String> guestAttributes;
        private Boolean internalIpOnly;
        private Map<String,String> labels;
        private String machineType;
        private Map<String,String> metadata;
        private String network;
        private String nicType;
        private RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig;
        private String subnet;
        private List<String> tags;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImages = defaults.containerImages;
    	      this.dataDisk = defaults.dataDisk;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.guestAttributes = defaults.guestAttributes;
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder acceleratorConfig(RuntimeAcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder containerImages(List<ContainerImageResponse> containerImages) {
            this.containerImages = Objects.requireNonNull(containerImages);
            return this;
        }
        public Builder containerImages(ContainerImageResponse... containerImages) {
            return containerImages(List.of(containerImages));
        }
        public Builder dataDisk(LocalDiskResponse dataDisk) {
            this.dataDisk = Objects.requireNonNull(dataDisk);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder guestAttributes(Map<String,String> guestAttributes) {
            this.guestAttributes = Objects.requireNonNull(guestAttributes);
            return this;
        }
        public Builder internalIpOnly(Boolean internalIpOnly) {
            this.internalIpOnly = Objects.requireNonNull(internalIpOnly);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
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
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder shieldedInstanceConfig(RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder subnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public VirtualMachineConfigResponse build() {
            return new VirtualMachineConfigResponse(acceleratorConfig, containerImages, dataDisk, encryptionConfig, guestAttributes, internalIpOnly, labels, machineType, metadata, network, nicType, shieldedInstanceConfig, subnet, tags, zone);
        }
    }
}
