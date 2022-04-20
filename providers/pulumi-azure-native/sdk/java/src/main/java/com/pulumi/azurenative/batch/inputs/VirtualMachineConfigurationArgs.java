// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.ContainerConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.DataDiskArgs;
import com.pulumi.azurenative.batch.inputs.DiskEncryptionConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.ImageReferenceArgs;
import com.pulumi.azurenative.batch.inputs.NodePlacementConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.VMExtensionArgs;
import com.pulumi.azurenative.batch.inputs.WindowsConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineConfigurationArgs Empty = new VirtualMachineConfigurationArgs();

    /**
     * If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    @Import(name="containerConfiguration")
      private final @Nullable Output<ContainerConfigurationArgs> containerConfiguration;

    public Output<ContainerConfigurationArgs> containerConfiguration() {
        return this.containerConfiguration == null ? Codegen.empty() : this.containerConfiguration;
    }

    /**
     * This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    @Import(name="dataDisks")
      private final @Nullable Output<List<DataDiskArgs>> dataDisks;

    public Output<List<DataDiskArgs>> dataDisks() {
        return this.dataDisks == null ? Codegen.empty() : this.dataDisks;
    }

    /**
     * If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    @Import(name="diskEncryptionConfiguration")
      private final @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Codegen.empty() : this.diskEncryptionConfiguration;
    }

    /**
     * If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    @Import(name="extensions")
      private final @Nullable Output<List<VMExtensionArgs>> extensions;

    public Output<List<VMExtensionArgs>> extensions() {
        return this.extensions == null ? Codegen.empty() : this.extensions;
    }

    @Import(name="imageReference", required=true)
      private final Output<ImageReferenceArgs> imageReference;

    public Output<ImageReferenceArgs> imageReference() {
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
      private final @Nullable Output<String> licenseType;

    public Output<String> licenseType() {
        return this.licenseType == null ? Codegen.empty() : this.licenseType;
    }

    /**
     * The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the &#39;List supported node agent SKUs&#39; operation.
     * 
     */
    @Import(name="nodeAgentSkuId", required=true)
      private final Output<String> nodeAgentSkuId;

    public Output<String> nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    @Import(name="nodePlacementConfiguration")
      private final @Nullable Output<NodePlacementConfigurationArgs> nodePlacementConfiguration;

    public Output<NodePlacementConfigurationArgs> nodePlacementConfiguration() {
        return this.nodePlacementConfiguration == null ? Codegen.empty() : this.nodePlacementConfiguration;
    }

    /**
     * This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    @Import(name="windowsConfiguration")
      private final @Nullable Output<WindowsConfigurationArgs> windowsConfiguration;

    public Output<WindowsConfigurationArgs> windowsConfiguration() {
        return this.windowsConfiguration == null ? Codegen.empty() : this.windowsConfiguration;
    }

    public VirtualMachineConfigurationArgs(
        @Nullable Output<ContainerConfigurationArgs> containerConfiguration,
        @Nullable Output<List<DataDiskArgs>> dataDisks,
        @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Output<List<VMExtensionArgs>> extensions,
        Output<ImageReferenceArgs> imageReference,
        @Nullable Output<String> licenseType,
        Output<String> nodeAgentSkuId,
        @Nullable Output<NodePlacementConfigurationArgs> nodePlacementConfiguration,
        @Nullable Output<WindowsConfigurationArgs> windowsConfiguration) {
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

    private VirtualMachineConfigurationArgs() {
        this.containerConfiguration = Codegen.empty();
        this.dataDisks = Codegen.empty();
        this.diskEncryptionConfiguration = Codegen.empty();
        this.extensions = Codegen.empty();
        this.imageReference = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.nodeAgentSkuId = Codegen.empty();
        this.nodePlacementConfiguration = Codegen.empty();
        this.windowsConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerConfigurationArgs> containerConfiguration;
        private @Nullable Output<List<DataDiskArgs>> dataDisks;
        private @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Output<List<VMExtensionArgs>> extensions;
        private Output<ImageReferenceArgs> imageReference;
        private @Nullable Output<String> licenseType;
        private Output<String> nodeAgentSkuId;
        private @Nullable Output<NodePlacementConfigurationArgs> nodePlacementConfiguration;
        private @Nullable Output<WindowsConfigurationArgs> windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigurationArgs defaults) {
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

        public Builder containerConfiguration(@Nullable Output<ContainerConfigurationArgs> containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public Builder containerConfiguration(@Nullable ContainerConfigurationArgs containerConfiguration) {
            this.containerConfiguration = Codegen.ofNullable(containerConfiguration);
            return this;
        }
        public Builder dataDisks(@Nullable Output<List<DataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(@Nullable List<DataDiskArgs> dataDisks) {
            this.dataDisks = Codegen.ofNullable(dataDisks);
            return this;
        }
        public Builder dataDisks(DataDiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder diskEncryptionConfiguration(@Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }
        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Codegen.ofNullable(diskEncryptionConfiguration);
            return this;
        }
        public Builder extensions(@Nullable Output<List<VMExtensionArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(@Nullable List<VMExtensionArgs> extensions) {
            this.extensions = Codegen.ofNullable(extensions);
            return this;
        }
        public Builder extensions(VMExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder imageReference(Output<ImageReferenceArgs> imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }
        public Builder imageReference(ImageReferenceArgs imageReference) {
            this.imageReference = Output.of(Objects.requireNonNull(imageReference));
            return this;
        }
        public Builder licenseType(@Nullable Output<String> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = Codegen.ofNullable(licenseType);
            return this;
        }
        public Builder nodeAgentSkuId(Output<String> nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }
        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Output.of(Objects.requireNonNull(nodeAgentSkuId));
            return this;
        }
        public Builder nodePlacementConfiguration(@Nullable Output<NodePlacementConfigurationArgs> nodePlacementConfiguration) {
            this.nodePlacementConfiguration = nodePlacementConfiguration;
            return this;
        }
        public Builder nodePlacementConfiguration(@Nullable NodePlacementConfigurationArgs nodePlacementConfiguration) {
            this.nodePlacementConfiguration = Codegen.ofNullable(nodePlacementConfiguration);
            return this;
        }
        public Builder windowsConfiguration(@Nullable Output<WindowsConfigurationArgs> windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }
        public Builder windowsConfiguration(@Nullable WindowsConfigurationArgs windowsConfiguration) {
            this.windowsConfiguration = Codegen.ofNullable(windowsConfiguration);
            return this;
        }        public VirtualMachineConfigurationArgs build() {
            return new VirtualMachineConfigurationArgs(containerConfiguration, dataDisks, diskEncryptionConfiguration, extensions, imageReference, licenseType, nodeAgentSkuId, nodePlacementConfiguration, windowsConfiguration);
        }
    }
}
