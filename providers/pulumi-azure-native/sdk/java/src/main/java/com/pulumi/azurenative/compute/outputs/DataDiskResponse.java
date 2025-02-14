// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ManagedDiskParametersResponse;
import com.pulumi.azurenative.compute.outputs.VirtualHardDiskResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataDiskResponse {
    /**
     * @return Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    private final @Nullable String caching;
    /**
     * @return Specifies how the virtual machine should be created.&lt;br&gt;&lt;br&gt; Possible values are:&lt;br&gt;&lt;br&gt; **Attach** \u2013 This value is used when you are using a specialized disk to create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    private final String createOption;
    /**
     * @return Specifies whether data disk should be deleted or detached upon VM deletion.&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the data disk is deleted when VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the data disk is retained after VM is deleted.&lt;br&gt;&lt;br&gt; The default value is set to **detach**
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * @return Specifies the detach behavior to be used while detaching a disk or which is already in the process of detachment from the virtual machine. Supported values: **ForceDetach**. &lt;br&gt;&lt;br&gt; detachOption: **ForceDetach** is applicable only for managed data disks. If a previous detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the VM. All writes might not have been flushed when using this detach behavior. &lt;br&gt;&lt;br&gt; This feature is still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update toBeDetached to &#39;true&#39; along with setting detachOption: &#39;ForceDetach&#39;.
     * 
     */
    private final @Nullable String detachOption;
    /**
     * @return Specifies the Read-Write IOPS for the managed disk when StorageAccountType is UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     * 
     */
    private final Double diskIOPSReadWrite;
    /**
     * @return Specifies the bandwidth in MB per second for the managed disk when StorageAccountType is UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     * 
     */
    private final Double diskMBpsReadWrite;
    /**
     * @return Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * @return The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    private final @Nullable VirtualHardDiskResponse image;
    /**
     * @return Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    private final Integer lun;
    /**
     * @return The managed disk parameters.
     * 
     */
    private final @Nullable ManagedDiskParametersResponse managedDisk;
    /**
     * @return The disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Specifies whether the data disk is in process of detachment from the VirtualMachine/VirtualMachineScaleset
     * 
     */
    private final @Nullable Boolean toBeDetached;
    /**
     * @return The virtual hard disk.
     * 
     */
    private final @Nullable VirtualHardDiskResponse vhd;
    /**
     * @return Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    private final @Nullable Boolean writeAcceleratorEnabled;

    @CustomType.Constructor
    private DataDiskResponse(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("createOption") String createOption,
        @CustomType.Parameter("deleteOption") @Nullable String deleteOption,
        @CustomType.Parameter("detachOption") @Nullable String detachOption,
        @CustomType.Parameter("diskIOPSReadWrite") Double diskIOPSReadWrite,
        @CustomType.Parameter("diskMBpsReadWrite") Double diskMBpsReadWrite,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("image") @Nullable VirtualHardDiskResponse image,
        @CustomType.Parameter("lun") Integer lun,
        @CustomType.Parameter("managedDisk") @Nullable ManagedDiskParametersResponse managedDisk,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("toBeDetached") @Nullable Boolean toBeDetached,
        @CustomType.Parameter("vhd") @Nullable VirtualHardDiskResponse vhd,
        @CustomType.Parameter("writeAcceleratorEnabled") @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = createOption;
        this.deleteOption = deleteOption;
        this.detachOption = detachOption;
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.lun = lun;
        this.managedDisk = managedDisk;
        this.name = name;
        this.toBeDetached = toBeDetached;
        this.vhd = vhd;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    /**
     * @return Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * @return Specifies how the virtual machine should be created.&lt;br&gt;&lt;br&gt; Possible values are:&lt;br&gt;&lt;br&gt; **Attach** \u2013 This value is used when you are using a specialized disk to create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    public String createOption() {
        return this.createOption;
    }
    /**
     * @return Specifies whether data disk should be deleted or detached upon VM deletion.&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the data disk is deleted when VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the data disk is retained after VM is deleted.&lt;br&gt;&lt;br&gt; The default value is set to **detach**
     * 
     */
    public Optional<String> deleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * @return Specifies the detach behavior to be used while detaching a disk or which is already in the process of detachment from the virtual machine. Supported values: **ForceDetach**. &lt;br&gt;&lt;br&gt; detachOption: **ForceDetach** is applicable only for managed data disks. If a previous detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the VM. All writes might not have been flushed when using this detach behavior. &lt;br&gt;&lt;br&gt; This feature is still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update toBeDetached to &#39;true&#39; along with setting detachOption: &#39;ForceDetach&#39;.
     * 
     */
    public Optional<String> detachOption() {
        return Optional.ofNullable(this.detachOption);
    }
    /**
     * @return Specifies the Read-Write IOPS for the managed disk when StorageAccountType is UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     * 
     */
    public Double diskIOPSReadWrite() {
        return this.diskIOPSReadWrite;
    }
    /**
     * @return Specifies the bandwidth in MB per second for the managed disk when StorageAccountType is UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     * 
     */
    public Double diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }
    /**
     * @return Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * @return The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    public Optional<VirtualHardDiskResponse> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    public Integer lun() {
        return this.lun;
    }
    /**
     * @return The managed disk parameters.
     * 
     */
    public Optional<ManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * @return The disk name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies whether the data disk is in process of detachment from the VirtualMachine/VirtualMachineScaleset
     * 
     */
    public Optional<Boolean> toBeDetached() {
        return Optional.ofNullable(this.toBeDetached);
    }
    /**
     * @return The virtual hard disk.
     * 
     */
    public Optional<VirtualHardDiskResponse> vhd() {
        return Optional.ofNullable(this.vhd);
    }
    /**
     * @return Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    public Optional<Boolean> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable String deleteOption;
        private @Nullable String detachOption;
        private Double diskIOPSReadWrite;
        private Double diskMBpsReadWrite;
        private @Nullable Integer diskSizeGB;
        private @Nullable VirtualHardDiskResponse image;
        private Integer lun;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable Boolean toBeDetached;
        private @Nullable VirtualHardDiskResponse vhd;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.deleteOption = defaults.deleteOption;
    	      this.detachOption = defaults.detachOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.toBeDetached = defaults.toBeDetached;
    	      this.vhd = defaults.vhd;
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
        public Builder deleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }
        public Builder detachOption(@Nullable String detachOption) {
            this.detachOption = detachOption;
            return this;
        }
        public Builder diskIOPSReadWrite(Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = Objects.requireNonNull(diskIOPSReadWrite);
            return this;
        }
        public Builder diskMBpsReadWrite(Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = Objects.requireNonNull(diskMBpsReadWrite);
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder image(@Nullable VirtualHardDiskResponse image) {
            this.image = image;
            return this;
        }
        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder managedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder toBeDetached(@Nullable Boolean toBeDetached) {
            this.toBeDetached = toBeDetached;
            return this;
        }
        public Builder vhd(@Nullable VirtualHardDiskResponse vhd) {
            this.vhd = vhd;
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }        public DataDiskResponse build() {
            return new DataDiskResponse(caching, createOption, deleteOption, detachOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, image, lun, managedDisk, name, toBeDetached, vhd, writeAcceleratorEnabled);
        }
    }
}
