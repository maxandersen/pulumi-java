// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.vmmigration_v1alpha1.enums.VmwareVmDetailsPowerState;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VmwareVmDetails describes a VM in vCenter.
 * 
 */
public final class VmwareVmDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmwareVmDetailsArgs Empty = new VmwareVmDetailsArgs();

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @Import(name="committedStorage")
      private final @Nullable Output<String> committedStorage;

    public Output<String> committedStorage() {
        return this.committedStorage == null ? Codegen.empty() : this.committedStorage;
    }

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @Import(name="committedStorageMb")
      private final @Nullable Output<String> committedStorageMb;

    public Output<String> committedStorageMb() {
        return this.committedStorageMb == null ? Codegen.empty() : this.committedStorageMb;
    }

    /**
     * The number of cpus in the VM.
     * 
     */
    @Import(name="cpuCount")
      private final @Nullable Output<Integer> cpuCount;

    public Output<Integer> cpuCount() {
        return this.cpuCount == null ? Codegen.empty() : this.cpuCount;
    }

    /**
     * The descriptive name of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    @Import(name="datacenterDescription")
      private final @Nullable Output<String> datacenterDescription;

    public Output<String> datacenterDescription() {
        return this.datacenterDescription == null ? Codegen.empty() : this.datacenterDescription;
    }

    /**
     * The id of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    @Import(name="datacenterId")
      private final @Nullable Output<String> datacenterId;

    public Output<String> datacenterId() {
        return this.datacenterId == null ? Codegen.empty() : this.datacenterId;
    }

    /**
     * The number of disks the VM has.
     * 
     */
    @Import(name="diskCount")
      private final @Nullable Output<Integer> diskCount;

    public Output<Integer> diskCount() {
        return this.diskCount == null ? Codegen.empty() : this.diskCount;
    }

    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The VM&#39;s OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    @Import(name="guestDescription")
      private final @Nullable Output<String> guestDescription;

    public Output<String> guestDescription() {
        return this.guestDescription == null ? Codegen.empty() : this.guestDescription;
    }

    /**
     * The size of the memory of the VM in MB.
     * 
     */
    @Import(name="memoryMb")
      private final @Nullable Output<Integer> memoryMb;

    public Output<Integer> memoryMb() {
        return this.memoryMb == null ? Codegen.empty() : this.memoryMb;
    }

    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    @Import(name="powerState")
      private final @Nullable Output<VmwareVmDetailsPowerState> powerState;

    public Output<VmwareVmDetailsPowerState> powerState() {
        return this.powerState == null ? Codegen.empty() : this.powerState;
    }

    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    @Import(name="uuid")
      private final @Nullable Output<String> uuid;

    public Output<String> uuid() {
        return this.uuid == null ? Codegen.empty() : this.uuid;
    }

    /**
     * The VM&#39;s id in the source (note that this is not the MigratingVm&#39;s id). This is the moref id of the VM.
     * 
     */
    @Import(name="vmId")
      private final @Nullable Output<String> vmId;

    public Output<String> vmId() {
        return this.vmId == null ? Codegen.empty() : this.vmId;
    }

    public VmwareVmDetailsArgs(
        @Nullable Output<String> committedStorage,
        @Nullable Output<String> committedStorageMb,
        @Nullable Output<Integer> cpuCount,
        @Nullable Output<String> datacenterDescription,
        @Nullable Output<String> datacenterId,
        @Nullable Output<Integer> diskCount,
        @Nullable Output<String> displayName,
        @Nullable Output<String> guestDescription,
        @Nullable Output<Integer> memoryMb,
        @Nullable Output<VmwareVmDetailsPowerState> powerState,
        @Nullable Output<String> uuid,
        @Nullable Output<String> vmId) {
        this.committedStorage = committedStorage;
        this.committedStorageMb = committedStorageMb;
        this.cpuCount = cpuCount;
        this.datacenterDescription = datacenterDescription;
        this.datacenterId = datacenterId;
        this.diskCount = diskCount;
        this.displayName = displayName;
        this.guestDescription = guestDescription;
        this.memoryMb = memoryMb;
        this.powerState = powerState;
        this.uuid = uuid;
        this.vmId = vmId;
    }

    private VmwareVmDetailsArgs() {
        this.committedStorage = Codegen.empty();
        this.committedStorageMb = Codegen.empty();
        this.cpuCount = Codegen.empty();
        this.datacenterDescription = Codegen.empty();
        this.datacenterId = Codegen.empty();
        this.diskCount = Codegen.empty();
        this.displayName = Codegen.empty();
        this.guestDescription = Codegen.empty();
        this.memoryMb = Codegen.empty();
        this.powerState = Codegen.empty();
        this.uuid = Codegen.empty();
        this.vmId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> committedStorage;
        private @Nullable Output<String> committedStorageMb;
        private @Nullable Output<Integer> cpuCount;
        private @Nullable Output<String> datacenterDescription;
        private @Nullable Output<String> datacenterId;
        private @Nullable Output<Integer> diskCount;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> guestDescription;
        private @Nullable Output<Integer> memoryMb;
        private @Nullable Output<VmwareVmDetailsPowerState> powerState;
        private @Nullable Output<String> uuid;
        private @Nullable Output<String> vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.committedStorage = defaults.committedStorage;
    	      this.committedStorageMb = defaults.committedStorageMb;
    	      this.cpuCount = defaults.cpuCount;
    	      this.datacenterDescription = defaults.datacenterDescription;
    	      this.datacenterId = defaults.datacenterId;
    	      this.diskCount = defaults.diskCount;
    	      this.displayName = defaults.displayName;
    	      this.guestDescription = defaults.guestDescription;
    	      this.memoryMb = defaults.memoryMb;
    	      this.powerState = defaults.powerState;
    	      this.uuid = defaults.uuid;
    	      this.vmId = defaults.vmId;
        }

        public Builder committedStorage(@Nullable Output<String> committedStorage) {
            this.committedStorage = committedStorage;
            return this;
        }
        public Builder committedStorage(@Nullable String committedStorage) {
            this.committedStorage = Codegen.ofNullable(committedStorage);
            return this;
        }
        public Builder committedStorageMb(@Nullable Output<String> committedStorageMb) {
            this.committedStorageMb = committedStorageMb;
            return this;
        }
        public Builder committedStorageMb(@Nullable String committedStorageMb) {
            this.committedStorageMb = Codegen.ofNullable(committedStorageMb);
            return this;
        }
        public Builder cpuCount(@Nullable Output<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Builder cpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Codegen.ofNullable(cpuCount);
            return this;
        }
        public Builder datacenterDescription(@Nullable Output<String> datacenterDescription) {
            this.datacenterDescription = datacenterDescription;
            return this;
        }
        public Builder datacenterDescription(@Nullable String datacenterDescription) {
            this.datacenterDescription = Codegen.ofNullable(datacenterDescription);
            return this;
        }
        public Builder datacenterId(@Nullable Output<String> datacenterId) {
            this.datacenterId = datacenterId;
            return this;
        }
        public Builder datacenterId(@Nullable String datacenterId) {
            this.datacenterId = Codegen.ofNullable(datacenterId);
            return this;
        }
        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = Codegen.ofNullable(diskCount);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder guestDescription(@Nullable Output<String> guestDescription) {
            this.guestDescription = guestDescription;
            return this;
        }
        public Builder guestDescription(@Nullable String guestDescription) {
            this.guestDescription = Codegen.ofNullable(guestDescription);
            return this;
        }
        public Builder memoryMb(@Nullable Output<Integer> memoryMb) {
            this.memoryMb = memoryMb;
            return this;
        }
        public Builder memoryMb(@Nullable Integer memoryMb) {
            this.memoryMb = Codegen.ofNullable(memoryMb);
            return this;
        }
        public Builder powerState(@Nullable Output<VmwareVmDetailsPowerState> powerState) {
            this.powerState = powerState;
            return this;
        }
        public Builder powerState(@Nullable VmwareVmDetailsPowerState powerState) {
            this.powerState = Codegen.ofNullable(powerState);
            return this;
        }
        public Builder uuid(@Nullable Output<String> uuid) {
            this.uuid = uuid;
            return this;
        }
        public Builder uuid(@Nullable String uuid) {
            this.uuid = Codegen.ofNullable(uuid);
            return this;
        }
        public Builder vmId(@Nullable Output<String> vmId) {
            this.vmId = vmId;
            return this;
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = Codegen.ofNullable(vmId);
            return this;
        }        public VmwareVmDetailsArgs build() {
            return new VmwareVmDetailsArgs(committedStorage, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
