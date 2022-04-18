// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.CachingTypes;
import com.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import com.pulumi.azurenative.compute.enums.DiskDeleteOptionTypes;
import com.pulumi.azurenative.compute.enums.DiskDetachOptionTypes;
import com.pulumi.azurenative.compute.inputs.ManagedDiskParametersArgs;
import com.pulumi.azurenative.compute.inputs.VirtualHardDiskArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class DataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataDiskArgs Empty = new DataDiskArgs();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
      private final @Nullable Output<CachingTypes> caching;

    public Output<CachingTypes> caching() {
        return this.caching == null ? Codegen.empty() : this.caching;
    }

    /**
     * Specifies how the virtual machine should be created.<br><br> Possible values are:<br><br> **Attach** \u2013 This value is used when you are using a specialized disk to create the virtual machine.<br><br> **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @Import(name="createOption", required=true)
      private final Output<Either<String,DiskCreateOptionTypes>> createOption;

    public Output<Either<String,DiskCreateOptionTypes>> createOption() {
        return this.createOption;
    }

    /**
     * Specifies whether data disk should be deleted or detached upon VM deletion.<br><br> Possible values: <br><br> **Delete** If this value is used, the data disk is deleted when VM is deleted.<br><br> **Detach** If this value is used, the data disk is retained after VM is deleted.<br><br> The default value is set to **detach**
     * 
     */
    @Import(name="deleteOption")
      private final @Nullable Output<Either<String,DiskDeleteOptionTypes>> deleteOption;

    public Output<Either<String,DiskDeleteOptionTypes>> deleteOption() {
        return this.deleteOption == null ? Codegen.empty() : this.deleteOption;
    }

    /**
     * Specifies the detach behavior to be used while detaching a disk or which is already in the process of detachment from the virtual machine. Supported values: **ForceDetach**. <br><br> detachOption: **ForceDetach** is applicable only for managed data disks. If a previous detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the VM. All writes might not have been flushed when using this detach behavior. <br><br> This feature is still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update toBeDetached to 'true' along with setting detachOption: 'ForceDetach'.
     * 
     */
    @Import(name="detachOption")
      private final @Nullable Output<Either<String,DiskDetachOptionTypes>> detachOption;

    public Output<Either<String,DiskDetachOptionTypes>> detachOption() {
        return this.detachOption == null ? Codegen.empty() : this.detachOption;
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
      private final @Nullable Output<Integer> diskSizeGB;

    public Output<Integer> diskSizeGB() {
        return this.diskSizeGB == null ? Codegen.empty() : this.diskSizeGB;
    }

    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<VirtualHardDiskArgs> image;

    public Output<VirtualHardDiskArgs> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @Import(name="lun", required=true)
      private final Output<Integer> lun;

    public Output<Integer> lun() {
        return this.lun;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @Import(name="managedDisk")
      private final @Nullable Output<ManagedDiskParametersArgs> managedDisk;

    public Output<ManagedDiskParametersArgs> managedDisk() {
        return this.managedDisk == null ? Codegen.empty() : this.managedDisk;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies whether the data disk is in process of detachment from the VirtualMachine/VirtualMachineScaleset
     * 
     */
    @Import(name="toBeDetached")
      private final @Nullable Output<Boolean> toBeDetached;

    public Output<Boolean> toBeDetached() {
        return this.toBeDetached == null ? Codegen.empty() : this.toBeDetached;
    }

    /**
     * The virtual hard disk.
     * 
     */
    @Import(name="vhd")
      private final @Nullable Output<VirtualHardDiskArgs> vhd;

    public Output<VirtualHardDiskArgs> vhd() {
        return this.vhd == null ? Codegen.empty() : this.vhd;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
      private final @Nullable Output<Boolean> writeAcceleratorEnabled;

    public Output<Boolean> writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Codegen.empty() : this.writeAcceleratorEnabled;
    }

    public DataDiskArgs(
        @Nullable Output<CachingTypes> caching,
        Output<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Output<Either<String,DiskDeleteOptionTypes>> deleteOption,
        @Nullable Output<Either<String,DiskDetachOptionTypes>> detachOption,
        @Nullable Output<Integer> diskSizeGB,
        @Nullable Output<VirtualHardDiskArgs> image,
        Output<Integer> lun,
        @Nullable Output<ManagedDiskParametersArgs> managedDisk,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> toBeDetached,
        @Nullable Output<VirtualHardDiskArgs> vhd,
        @Nullable Output<Boolean> writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.deleteOption = deleteOption;
        this.detachOption = detachOption;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.name = name;
        this.toBeDetached = toBeDetached;
        this.vhd = vhd;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private DataDiskArgs() {
        this.caching = Codegen.empty();
        this.createOption = Codegen.empty();
        this.deleteOption = Codegen.empty();
        this.detachOption = Codegen.empty();
        this.diskSizeGB = Codegen.empty();
        this.image = Codegen.empty();
        this.lun = Codegen.empty();
        this.managedDisk = Codegen.empty();
        this.name = Codegen.empty();
        this.toBeDetached = Codegen.empty();
        this.vhd = Codegen.empty();
        this.writeAcceleratorEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CachingTypes> caching;
        private Output<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Output<Either<String,DiskDeleteOptionTypes>> deleteOption;
        private @Nullable Output<Either<String,DiskDetachOptionTypes>> detachOption;
        private @Nullable Output<Integer> diskSizeGB;
        private @Nullable Output<VirtualHardDiskArgs> image;
        private Output<Integer> lun;
        private @Nullable Output<ManagedDiskParametersArgs> managedDisk;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> toBeDetached;
        private @Nullable Output<VirtualHardDiskArgs> vhd;
        private @Nullable Output<Boolean> writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.deleteOption = defaults.deleteOption;
    	      this.detachOption = defaults.detachOption;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.toBeDetached = defaults.toBeDetached;
    	      this.vhd = defaults.vhd;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable Output<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }
        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Codegen.ofNullable(caching);
            return this;
        }
        public Builder createOption(Output<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder createOption(Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Output.of(Objects.requireNonNull(createOption));
            return this;
        }
        public Builder deleteOption(@Nullable Output<Either<String,DiskDeleteOptionTypes>> deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }
        public Builder deleteOption(@Nullable Either<String,DiskDeleteOptionTypes> deleteOption) {
            this.deleteOption = Codegen.ofNullable(deleteOption);
            return this;
        }
        public Builder detachOption(@Nullable Output<Either<String,DiskDetachOptionTypes>> detachOption) {
            this.detachOption = detachOption;
            return this;
        }
        public Builder detachOption(@Nullable Either<String,DiskDetachOptionTypes> detachOption) {
            this.detachOption = Codegen.ofNullable(detachOption);
            return this;
        }
        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Codegen.ofNullable(diskSizeGB);
            return this;
        }
        public Builder image(@Nullable Output<VirtualHardDiskArgs> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable VirtualHardDiskArgs image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder lun(Output<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder lun(Integer lun) {
            this.lun = Output.of(Objects.requireNonNull(lun));
            return this;
        }
        public Builder managedDisk(@Nullable Output<ManagedDiskParametersArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder managedDisk(@Nullable ManagedDiskParametersArgs managedDisk) {
            this.managedDisk = Codegen.ofNullable(managedDisk);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder toBeDetached(@Nullable Output<Boolean> toBeDetached) {
            this.toBeDetached = toBeDetached;
            return this;
        }
        public Builder toBeDetached(@Nullable Boolean toBeDetached) {
            this.toBeDetached = Codegen.ofNullable(toBeDetached);
            return this;
        }
        public Builder vhd(@Nullable Output<VirtualHardDiskArgs> vhd) {
            this.vhd = vhd;
            return this;
        }
        public Builder vhd(@Nullable VirtualHardDiskArgs vhd) {
            this.vhd = Codegen.ofNullable(vhd);
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = Codegen.ofNullable(writeAcceleratorEnabled);
            return this;
        }        public DataDiskArgs build() {
            return new DataDiskArgs(caching, createOption, deleteOption, detachOption, diskSizeGB, image, lun, managedDisk, name, toBeDetached, vhd, writeAcceleratorEnabled);
        }
    }
}
