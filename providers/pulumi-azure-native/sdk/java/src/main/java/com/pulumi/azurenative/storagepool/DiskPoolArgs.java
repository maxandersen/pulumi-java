// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool;

import com.pulumi.azurenative.storagepool.enums.DiskPoolTier;
import com.pulumi.azurenative.storagepool.inputs.DiskArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskPoolArgs Empty = new DiskPoolArgs();

    /**
     * List of additional capabilities for a Disk pool.
     * 
     */
    @Import(name="additionalCapabilities")
      private final @Nullable Output<List<String>> additionalCapabilities;

    public Output<List<String>> additionalCapabilities() {
        return this.additionalCapabilities == null ? Codegen.empty() : this.additionalCapabilities;
    }

    /**
     * Logical zone for Disk pool resource; example: [&#34;1&#34;].
     * 
     */
    @Import(name="availabilityZones", required=true)
      private final Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName")
      private final @Nullable Output<String> diskPoolName;

    public Output<String> diskPoolName() {
        return this.diskPoolName == null ? Codegen.empty() : this.diskPoolName;
    }

    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
     */
    @Import(name="disks")
      private final @Nullable Output<List<DiskArgs>> disks;

    public Output<List<DiskArgs>> disks() {
        return this.disks == null ? Codegen.empty() : this.disks;
    }

    /**
     * The geo-location where the resource lives.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Determines the SKU of VM deployed for Disk pool
     * 
     */
    @Import(name="tier", required=true)
      private final Output<Either<String,DiskPoolTier>> tier;

    public Output<Either<String,DiskPoolTier>> tier() {
        return this.tier;
    }

    public DiskPoolArgs(
        @Nullable Output<List<String>> additionalCapabilities,
        Output<List<String>> availabilityZones,
        @Nullable Output<String> diskPoolName,
        @Nullable Output<List<DiskArgs>> disks,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        Output<Either<String,DiskPoolTier>> tier) {
        this.additionalCapabilities = additionalCapabilities;
        this.availabilityZones = Objects.requireNonNull(availabilityZones, "expected parameter 'availabilityZones' to be non-null");
        this.diskPoolName = diskPoolName;
        this.disks = disks;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private DiskPoolArgs() {
        this.additionalCapabilities = Codegen.empty();
        this.availabilityZones = Codegen.empty();
        this.diskPoolName = Codegen.empty();
        this.disks = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> additionalCapabilities;
        private Output<List<String>> availabilityZones;
        private @Nullable Output<String> diskPoolName;
        private @Nullable Output<List<DiskArgs>> disks;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<Either<String,DiskPoolTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCapabilities = defaults.additionalCapabilities;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.diskPoolName = defaults.diskPoolName;
    	      this.disks = defaults.disks;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
        }

        public Builder additionalCapabilities(@Nullable Output<List<String>> additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            return this;
        }
        public Builder additionalCapabilities(@Nullable List<String> additionalCapabilities) {
            this.additionalCapabilities = Codegen.ofNullable(additionalCapabilities);
            return this;
        }
        public Builder additionalCapabilities(String... additionalCapabilities) {
            return additionalCapabilities(List.of(additionalCapabilities));
        }
        public Builder availabilityZones(Output<List<String>> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Output.of(Objects.requireNonNull(availabilityZones));
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder diskPoolName(@Nullable Output<String> diskPoolName) {
            this.diskPoolName = diskPoolName;
            return this;
        }
        public Builder diskPoolName(@Nullable String diskPoolName) {
            this.diskPoolName = Codegen.ofNullable(diskPoolName);
            return this;
        }
        public Builder disks(@Nullable Output<List<DiskArgs>> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(@Nullable List<DiskArgs> disks) {
            this.disks = Codegen.ofNullable(disks);
            return this;
        }
        public Builder disks(DiskArgs... disks) {
            return disks(List.of(disks));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tier(Output<Either<String,DiskPoolTier>> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(Either<String,DiskPoolTier> tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }        public DiskPoolArgs build() {
            return new DiskPoolArgs(additionalCapabilities, availabilityZones, diskPoolName, disks, location, resourceGroupName, subnetId, tags, tier);
        }
    }
}
