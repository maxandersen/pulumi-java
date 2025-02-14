// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.DiskEncryptionSetParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetManagedDiskParametersResponse {
    /**
     * @return Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
    /**
     * @return Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    private final @Nullable String storageAccountType;

    @CustomType.Constructor
    private VirtualMachineScaleSetManagedDiskParametersResponse(
        @CustomType.Parameter("diskEncryptionSet") @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.storageAccountType = storageAccountType;
    }

    /**
     * @return Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    public Optional<DiskEncryptionSetParametersResponse> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }
    /**
     * @return Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }        public VirtualMachineScaleSetManagedDiskParametersResponse build() {
            return new VirtualMachineScaleSetManagedDiskParametersResponse(diskEncryptionSet, storageAccountType);
        }
    }
}
