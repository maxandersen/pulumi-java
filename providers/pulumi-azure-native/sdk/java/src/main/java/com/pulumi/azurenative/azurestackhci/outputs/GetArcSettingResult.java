// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.outputs;

import com.pulumi.azurenative.azurestackhci.outputs.PerNodeStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetArcSettingResult {
    /**
     * @return Aggregate state of Arc agent across the nodes in this HCI cluster.
     * 
     */
    private final String aggregateState;
    /**
     * @return The resource group that hosts the Arc agents, ie. Hybrid Compute Machine resources.
     * 
     */
    private final String arcInstanceResourceGroup;
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * @return The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * @return The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * @return The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return State of Arc agent in each of the nodes.
     * 
     */
    private final List<PerNodeStateResponse> perNodeDetails;
    /**
     * @return Provisioning state of the ArcSetting proxy resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetArcSettingResult(
        @CustomType.Parameter("aggregateState") String aggregateState,
        @CustomType.Parameter("arcInstanceResourceGroup") String arcInstanceResourceGroup,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("createdBy") @Nullable String createdBy,
        @CustomType.Parameter("createdByType") @Nullable String createdByType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedAt") @Nullable String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedByType") @Nullable String lastModifiedByType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("perNodeDetails") List<PerNodeStateResponse> perNodeDetails,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.aggregateState = aggregateState;
        this.arcInstanceResourceGroup = arcInstanceResourceGroup;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.id = id;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.name = name;
        this.perNodeDetails = perNodeDetails;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return Aggregate state of Arc agent across the nodes in this HCI cluster.
     * 
     */
    public String aggregateState() {
        return this.aggregateState;
    }
    /**
     * @return The resource group that hosts the Arc agents, ie. Hybrid Compute Machine resources.
     * 
     */
    public String arcInstanceResourceGroup() {
        return this.arcInstanceResourceGroup;
    }
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The identity that created the resource.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of Arc agent in each of the nodes.
     * 
     */
    public List<PerNodeStateResponse> perNodeDetails() {
        return this.perNodeDetails;
    }
    /**
     * @return Provisioning state of the ArcSetting proxy resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArcSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregateState;
        private String arcInstanceResourceGroup;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private String id;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String name;
        private List<PerNodeStateResponse> perNodeDetails;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArcSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateState = defaults.aggregateState;
    	      this.arcInstanceResourceGroup = defaults.arcInstanceResourceGroup;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.id = defaults.id;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.name = defaults.name;
    	      this.perNodeDetails = defaults.perNodeDetails;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder aggregateState(String aggregateState) {
            this.aggregateState = Objects.requireNonNull(aggregateState);
            return this;
        }
        public Builder arcInstanceResourceGroup(String arcInstanceResourceGroup) {
            this.arcInstanceResourceGroup = Objects.requireNonNull(arcInstanceResourceGroup);
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder perNodeDetails(List<PerNodeStateResponse> perNodeDetails) {
            this.perNodeDetails = Objects.requireNonNull(perNodeDetails);
            return this;
        }
        public Builder perNodeDetails(PerNodeStateResponse... perNodeDetails) {
            return perNodeDetails(List.of(perNodeDetails));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetArcSettingResult build() {
            return new GetArcSettingResult(aggregateState, arcInstanceResourceGroup, createdAt, createdBy, createdByType, id, lastModifiedAt, lastModifiedBy, lastModifiedByType, name, perNodeDetails, provisioningState, type);
        }
    }
}
