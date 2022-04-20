// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.azurenative.operationalinsights.outputs.AssociatedWorkspaceResponse;
import com.pulumi.azurenative.operationalinsights.outputs.CapacityReservationPropertiesResponse;
import com.pulumi.azurenative.operationalinsights.outputs.ClusterSkuResponse;
import com.pulumi.azurenative.operationalinsights.outputs.IdentityResponse;
import com.pulumi.azurenative.operationalinsights.outputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterResult {
    /**
     * The list of Log Analytics workspaces associated with the cluster
     * 
     */
    private final @Nullable List<AssociatedWorkspaceResponse> associatedWorkspaces;
    /**
     * The cluster&#39;s billing type.
     * 
     */
    private final @Nullable String billingType;
    /**
     * Additional properties for capacity reservation
     * 
     */
    private final @Nullable CapacityReservationPropertiesResponse capacityReservationProperties;
    /**
     * The ID associated with the cluster.
     * 
     */
    private final String clusterId;
    /**
     * The cluster creation time
     * 
     */
    private final String createdDate;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is &#39;true&#39; if region supports Availability Zones.
     * 
     */
    private final @Nullable Boolean isAvailabilityZonesEnabled;
    /**
     * The associated key properties.
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;
    /**
     * The last time the cluster was updated.
     * 
     */
    private final String lastModifiedDate;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioning state of the cluster.
     * 
     */
    private final String provisioningState;
    /**
     * The sku properties.
     * 
     */
    private final @Nullable ClusterSkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("associatedWorkspaces") @Nullable List<AssociatedWorkspaceResponse> associatedWorkspaces,
        @CustomType.Parameter("billingType") @Nullable String billingType,
        @CustomType.Parameter("capacityReservationProperties") @Nullable CapacityReservationPropertiesResponse capacityReservationProperties,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("isAvailabilityZonesEnabled") @Nullable Boolean isAvailabilityZonesEnabled,
        @CustomType.Parameter("keyVaultProperties") @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        @CustomType.Parameter("lastModifiedDate") String lastModifiedDate,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") @Nullable ClusterSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.associatedWorkspaces = associatedWorkspaces;
        this.billingType = billingType;
        this.capacityReservationProperties = capacityReservationProperties;
        this.clusterId = clusterId;
        this.createdDate = createdDate;
        this.id = id;
        this.identity = identity;
        this.isAvailabilityZonesEnabled = isAvailabilityZonesEnabled;
        this.keyVaultProperties = keyVaultProperties;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The list of Log Analytics workspaces associated with the cluster
     * 
    */
    public List<AssociatedWorkspaceResponse> associatedWorkspaces() {
        return this.associatedWorkspaces == null ? List.of() : this.associatedWorkspaces;
    }
    /**
     * The cluster&#39;s billing type.
     * 
    */
    public Optional<String> billingType() {
        return Optional.ofNullable(this.billingType);
    }
    /**
     * Additional properties for capacity reservation
     * 
    */
    public Optional<CapacityReservationPropertiesResponse> capacityReservationProperties() {
        return Optional.ofNullable(this.capacityReservationProperties);
    }
    /**
     * The ID associated with the cluster.
     * 
    */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * The cluster creation time
     * 
    */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is &#39;true&#39; if region supports Availability Zones.
     * 
    */
    public Optional<Boolean> isAvailabilityZonesEnabled() {
        return Optional.ofNullable(this.isAvailabilityZonesEnabled);
    }
    /**
     * The associated key properties.
     * 
    */
    public Optional<KeyVaultPropertiesResponse> keyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }
    /**
     * The last time the cluster was updated.
     * 
    */
    public String lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The geo-location where the resource lives
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
     * The provisioning state of the cluster.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku properties.
     * 
    */
    public Optional<ClusterSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssociatedWorkspaceResponse> associatedWorkspaces;
        private @Nullable String billingType;
        private @Nullable CapacityReservationPropertiesResponse capacityReservationProperties;
        private String clusterId;
        private String createdDate;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable Boolean isAvailabilityZonesEnabled;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private String lastModifiedDate;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable ClusterSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedWorkspaces = defaults.associatedWorkspaces;
    	      this.billingType = defaults.billingType;
    	      this.capacityReservationProperties = defaults.capacityReservationProperties;
    	      this.clusterId = defaults.clusterId;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isAvailabilityZonesEnabled = defaults.isAvailabilityZonesEnabled;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder associatedWorkspaces(@Nullable List<AssociatedWorkspaceResponse> associatedWorkspaces) {
            this.associatedWorkspaces = associatedWorkspaces;
            return this;
        }
        public Builder associatedWorkspaces(AssociatedWorkspaceResponse... associatedWorkspaces) {
            return associatedWorkspaces(List.of(associatedWorkspaces));
        }
        public Builder billingType(@Nullable String billingType) {
            this.billingType = billingType;
            return this;
        }
        public Builder capacityReservationProperties(@Nullable CapacityReservationPropertiesResponse capacityReservationProperties) {
            this.capacityReservationProperties = capacityReservationProperties;
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder isAvailabilityZonesEnabled(@Nullable Boolean isAvailabilityZonesEnabled) {
            this.isAvailabilityZonesEnabled = isAvailabilityZonesEnabled;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public Builder lastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = Objects.requireNonNull(lastModifiedDate);
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
        public Builder sku(@Nullable ClusterSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(associatedWorkspaces, billingType, capacityReservationProperties, clusterId, createdDate, id, identity, isAvailabilityZonesEnabled, keyVaultProperties, lastModifiedDate, location, name, provisioningState, sku, tags, type);
        }
    }
}
