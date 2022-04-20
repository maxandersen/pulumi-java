// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.outputs;

import com.pulumi.azurenative.storagepool.outputs.DiskResponse;
import com.pulumi.azurenative.storagepool.outputs.SystemMetadataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDiskPoolResult {
    /**
     * List of additional capabilities for Disk pool.
     * 
     */
    private final @Nullable List<String> additionalCapabilities;
    /**
     * Logical zone for Disk pool resource; example: [&#34;1&#34;].
     * 
     */
    private final List<String> availabilityZones;
    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
     */
    private final @Nullable List<DiskResponse> disks;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives.
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the operation on the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Operational status of the Disk pool.
     * 
     */
    private final String status;
    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
     */
    private final String subnetId;
    /**
     * Resource metadata required by ARM RPC
     * 
     */
    private final SystemMetadataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Determines the SKU of VM deployed for Disk pool
     * 
     */
    private final String tier;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDiskPoolResult(
        @CustomType.Parameter("additionalCapabilities") @Nullable List<String> additionalCapabilities,
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("disks") @Nullable List<DiskResponse> disks,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("systemData") SystemMetadataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("type") String type) {
        this.additionalCapabilities = additionalCapabilities;
        this.availabilityZones = availabilityZones;
        this.disks = disks;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.status = status;
        this.subnetId = subnetId;
        this.systemData = systemData;
        this.tags = tags;
        this.tier = tier;
        this.type = type;
    }

    /**
     * List of additional capabilities for Disk pool.
     * 
    */
    public List<String> additionalCapabilities() {
        return this.additionalCapabilities == null ? List.of() : this.additionalCapabilities;
    }
    /**
     * Logical zone for Disk pool resource; example: [&#34;1&#34;].
     * 
    */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
    */
    public List<DiskResponse> disks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * State of the operation on the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Operational status of the Disk pool.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
    */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * Resource metadata required by ARM RPC
     * 
    */
    public SystemMetadataResponse systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Determines the SKU of VM deployed for Disk pool
     * 
    */
    public String tier() {
        return this.tier;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> additionalCapabilities;
        private List<String> availabilityZones;
        private @Nullable List<DiskResponse> disks;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String status;
        private String subnetId;
        private SystemMetadataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tier;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCapabilities = defaults.additionalCapabilities;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.disks = defaults.disks;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.subnetId = defaults.subnetId;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
        }

        public Builder additionalCapabilities(@Nullable List<String> additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            return this;
        }
        public Builder additionalCapabilities(String... additionalCapabilities) {
            return additionalCapabilities(List.of(additionalCapabilities));
        }
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder disks(@Nullable List<DiskResponse> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(DiskResponse... disks) {
            return disks(List.of(disks));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder systemData(SystemMetadataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDiskPoolResult build() {
            return new GetDiskPoolResult(additionalCapabilities, availabilityZones, disks, id, location, name, provisioningState, status, subnetId, systemData, tags, tier, type);
        }
    }
}
