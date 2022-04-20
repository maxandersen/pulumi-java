// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ImageReferenceResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetDataDiskResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetOSDiskResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetStorageProfileResponse {
    /**
     * Specifies the parameters that are used to add data disks to the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    private final @Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks;
    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     */
    private final @Nullable ImageReferenceResponse imageReference;
    /**
     * Specifies information about the operating system disk used by the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    private final @Nullable VirtualMachineScaleSetOSDiskResponse osDisk;

    @CustomType.Constructor
    private VirtualMachineScaleSetStorageProfileResponse(
        @CustomType.Parameter("dataDisks") @Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks,
        @CustomType.Parameter("imageReference") @Nullable ImageReferenceResponse imageReference,
        @CustomType.Parameter("osDisk") @Nullable VirtualMachineScaleSetOSDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    /**
     * Specifies the parameters that are used to add data disks to the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
    */
    public List<VirtualMachineScaleSetDataDiskResponse> dataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
    */
    public Optional<ImageReferenceResponse> imageReference() {
        return Optional.ofNullable(this.imageReference);
    }
    /**
     * Specifies information about the operating system disk used by the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
    */
    public Optional<VirtualMachineScaleSetOSDiskResponse> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks;
        private @Nullable ImageReferenceResponse imageReference;
        private @Nullable VirtualMachineScaleSetOSDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder dataDisks(@Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(VirtualMachineScaleSetDataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder imageReference(@Nullable ImageReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder osDisk(@Nullable VirtualMachineScaleSetOSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }        public VirtualMachineScaleSetStorageProfileResponse build() {
            return new VirtualMachineScaleSetStorageProfileResponse(dataDisks, imageReference, osDisk);
        }
    }
}
