// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.ContainerConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.DataDiskResponse;
import io.pulumi.azurenative.batch.inputs.DiskEncryptionConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.ImageReferenceResponse;
import io.pulumi.azurenative.batch.inputs.NodePlacementConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.VMExtensionResponse;
import io.pulumi.azurenative.batch.inputs.WindowsConfigurationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineConfigurationResponse Empty = new VirtualMachineConfigurationResponse();

    /**
     * If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    @Import(name="containerConfiguration")
      private final @Nullable ContainerConfigurationResponse containerConfiguration;

    public Optional<ContainerConfigurationResponse> containerConfiguration() {
        return this.containerConfiguration == null ? Optional.empty() : Optional.ofNullable(this.containerConfiguration);
    }

    /**
     * This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    @Import(name="dataDisks")
      private final @Nullable List<DataDiskResponse> dataDisks;

    public List<DataDiskResponse> dataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }

    /**
     * If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    @Import(name="diskEncryptionConfiguration")
      private final @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;

    public Optional<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionConfiguration);
    }

    /**
     * If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    @Import(name="extensions")
      private final @Nullable List<VMExtensionResponse> extensions;

    public List<VMExtensionResponse> extensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }

    @Import(name="imageReference", required=true)
      private final ImageReferenceResponse imageReference;

    public ImageReferenceResponse imageReference() {
        return this.imageReference;
    }

    /**
     * This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable String licenseType;

    public Optional<String> licenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    /**
     * The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the 'List supported node agent SKUs' operation.
     * 
     */
    @Import(name="nodeAgentSkuId", required=true)
      private final String nodeAgentSkuId;

    public String nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    @Import(name="nodePlacementConfiguration")
      private final @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;

    public Optional<NodePlacementConfigurationResponse> nodePlacementConfiguration() {
        return this.nodePlacementConfiguration == null ? Optional.empty() : Optional.ofNullable(this.nodePlacementConfiguration);
    }

    /**
     * This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    @Import(name="windowsConfiguration")
      private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    public Optional<WindowsConfigurationResponse> windowsConfiguration() {
        return this.windowsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.windowsConfiguration);
    }

    public VirtualMachineConfigurationResponse(
        @Nullable ContainerConfigurationResponse containerConfiguration,
        @Nullable List<DataDiskResponse> dataDisks,
        @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        @Nullable List<VMExtensionResponse> extensions,
        ImageReferenceResponse imageReference,
        @Nullable String licenseType,
        String nodeAgentSkuId,
        @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration,
        @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.containerConfiguration = containerConfiguration;
        this.dataDisks = dataDisks;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.extensions = extensions;
        this.imageReference = Objects.requireNonNull(imageReference, "expected parameter 'imageReference' to be non-null");
        this.licenseType = licenseType;
        this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId, "expected parameter 'nodeAgentSkuId' to be non-null");
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    private VirtualMachineConfigurationResponse() {
        this.containerConfiguration = null;
        this.dataDisks = List.of();
        this.diskEncryptionConfiguration = null;
        this.extensions = List.of();
        this.imageReference = null;
        this.licenseType = null;
        this.nodeAgentSkuId = null;
        this.nodePlacementConfiguration = null;
        this.windowsConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerConfigurationResponse containerConfiguration;
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private @Nullable List<VMExtensionResponse> extensions;
        private ImageReferenceResponse imageReference;
        private @Nullable String licenseType;
        private String nodeAgentSkuId;
        private @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.dataDisks = defaults.dataDisks;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.extensions = defaults.extensions;
    	      this.imageReference = defaults.imageReference;
    	      this.licenseType = defaults.licenseType;
    	      this.nodeAgentSkuId = defaults.nodeAgentSkuId;
    	      this.nodePlacementConfiguration = defaults.nodePlacementConfiguration;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder containerConfiguration(@Nullable ContainerConfigurationResponse containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public Builder dataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(DataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }
        public Builder extensions(@Nullable List<VMExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(VMExtensionResponse... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder imageReference(ImageReferenceResponse imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }
        public Builder nodePlacementConfiguration(@Nullable NodePlacementConfigurationResponse nodePlacementConfiguration) {
            this.nodePlacementConfiguration = nodePlacementConfiguration;
            return this;
        }
        public Builder windowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }        public VirtualMachineConfigurationResponse build() {
            return new VirtualMachineConfigurationResponse(containerConfiguration, dataDisks, diskEncryptionConfiguration, extensions, imageReference, licenseType, nodeAgentSkuId, nodePlacementConfiguration, windowsConfiguration);
        }
    }
}
