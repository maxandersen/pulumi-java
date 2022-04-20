// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetDataDiskResponse {
    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    private final @Nullable String caching;
    /**
     * The create option.
     * 
     */
    private final String createOption;
    /**
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    private final @Nullable Double diskIOPSReadWrite;
    /**
     * Specifies the bandwidth in MB per second for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    private final @Nullable Double diskMBpsReadWrite;
    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    private final Integer lun;
    /**
     * The managed disk parameters.
     * 
     */
    private final @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    private final @Nullable Boolean writeAcceleratorEnabled;

    @CustomType.Constructor
    private VirtualMachineScaleSetDataDiskResponse(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("createOption") String createOption,
        @CustomType.Parameter("diskIOPSReadWrite") @Nullable Double diskIOPSReadWrite,
        @CustomType.Parameter("diskMBpsReadWrite") @Nullable Double diskMBpsReadWrite,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("lun") Integer lun,
        @CustomType.Parameter("managedDisk") @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("writeAcceleratorEnabled") @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = createOption;
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.lun = lun;
        this.managedDisk = managedDisk;
        this.name = name;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
    */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * The create option.
     * 
    */
    public String createOption() {
        return this.createOption;
    }
    /**
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
    */
    public Optional<Double> diskIOPSReadWrite() {
        return Optional.ofNullable(this.diskIOPSReadWrite);
    }
    /**
     * Specifies the bandwidth in MB per second for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
    */
    public Optional<Double> diskMBpsReadWrite() {
        return Optional.ofNullable(this.diskMBpsReadWrite);
    }
    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
    */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
    */
    public Integer lun() {
        return this.lun;
    }
    /**
     * The managed disk parameters.
     * 
    */
    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
    */
    public Optional<Boolean> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable Double diskIOPSReadWrite;
        private @Nullable Double diskMBpsReadWrite;
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder diskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }
        public Builder diskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }        public VirtualMachineScaleSetDataDiskResponse build() {
            return new VirtualMachineScaleSetDataDiskResponse(caching, createOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, lun, managedDisk, name, writeAcceleratorEnabled);
        }
    }
}
