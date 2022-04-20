// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.outputs;

import com.pulumi.azurenative.azurestackhci.outputs.ClusterReportedPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterResult {
    /**
     * App id of cluster AAD identity.
     * 
     */
    private final String aadClientId;
    /**
     * Tenant id of cluster AAD identity.
     * 
     */
    private final String aadTenantId;
    /**
     * Type of billing applied to the resource.
     * 
     */
    private final String billingModel;
    /**
     * Unique, immutable resource id.
     * 
     */
    private final String cloudId;
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Most recent billing meter timestamp.
     * 
     */
    private final String lastBillingTimestamp;
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * Most recent cluster sync timestamp.
     * 
     */
    private final String lastSyncTimestamp;
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
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * First cluster sync timestamp.
     * 
     */
    private final String registrationTimestamp;
    /**
     * Properties reported by cluster agent.
     * 
     */
    private final @Nullable ClusterReportedPropertiesResponse reportedProperties;
    /**
     * Status of the cluster agent.
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Number of days remaining in the trial period.
     * 
     */
    private final Double trialDaysRemaining;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("aadClientId") String aadClientId,
        @CustomType.Parameter("aadTenantId") String aadTenantId,
        @CustomType.Parameter("billingModel") String billingModel,
        @CustomType.Parameter("cloudId") String cloudId,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("createdBy") @Nullable String createdBy,
        @CustomType.Parameter("createdByType") @Nullable String createdByType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastBillingTimestamp") String lastBillingTimestamp,
        @CustomType.Parameter("lastModifiedAt") @Nullable String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedByType") @Nullable String lastModifiedByType,
        @CustomType.Parameter("lastSyncTimestamp") String lastSyncTimestamp,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("registrationTimestamp") String registrationTimestamp,
        @CustomType.Parameter("reportedProperties") @Nullable ClusterReportedPropertiesResponse reportedProperties,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("trialDaysRemaining") Double trialDaysRemaining,
        @CustomType.Parameter("type") String type) {
        this.aadClientId = aadClientId;
        this.aadTenantId = aadTenantId;
        this.billingModel = billingModel;
        this.cloudId = cloudId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.id = id;
        this.lastBillingTimestamp = lastBillingTimestamp;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.lastSyncTimestamp = lastSyncTimestamp;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.registrationTimestamp = registrationTimestamp;
        this.reportedProperties = reportedProperties;
        this.status = status;
        this.tags = tags;
        this.trialDaysRemaining = trialDaysRemaining;
        this.type = type;
    }

    /**
     * App id of cluster AAD identity.
     * 
    */
    public String aadClientId() {
        return this.aadClientId;
    }
    /**
     * Tenant id of cluster AAD identity.
     * 
    */
    public String aadTenantId() {
        return this.aadTenantId;
    }
    /**
     * Type of billing applied to the resource.
     * 
    */
    public String billingModel() {
        return this.billingModel;
    }
    /**
     * Unique, immutable resource id.
     * 
    */
    public String cloudId() {
        return this.cloudId;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
    */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
    */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
    */
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Most recent billing meter timestamp.
     * 
    */
    public String lastBillingTimestamp() {
        return this.lastBillingTimestamp;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
    */
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
    */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
    */
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * Most recent cluster sync timestamp.
     * 
    */
    public String lastSyncTimestamp() {
        return this.lastSyncTimestamp;
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
     * Provisioning state.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * First cluster sync timestamp.
     * 
    */
    public String registrationTimestamp() {
        return this.registrationTimestamp;
    }
    /**
     * Properties reported by cluster agent.
     * 
    */
    public Optional<ClusterReportedPropertiesResponse> reportedProperties() {
        return Optional.ofNullable(this.reportedProperties);
    }
    /**
     * Status of the cluster agent.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Number of days remaining in the trial period.
     * 
    */
    public Double trialDaysRemaining() {
        return this.trialDaysRemaining;
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
        private String aadClientId;
        private String aadTenantId;
        private String billingModel;
        private String cloudId;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private String id;
        private String lastBillingTimestamp;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String lastSyncTimestamp;
        private String location;
        private String name;
        private String provisioningState;
        private String registrationTimestamp;
        private @Nullable ClusterReportedPropertiesResponse reportedProperties;
        private String status;
        private @Nullable Map<String,String> tags;
        private Double trialDaysRemaining;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.billingModel = defaults.billingModel;
    	      this.cloudId = defaults.cloudId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.id = defaults.id;
    	      this.lastBillingTimestamp = defaults.lastBillingTimestamp;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.lastSyncTimestamp = defaults.lastSyncTimestamp;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationTimestamp = defaults.registrationTimestamp;
    	      this.reportedProperties = defaults.reportedProperties;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.trialDaysRemaining = defaults.trialDaysRemaining;
    	      this.type = defaults.type;
        }

        public Builder aadClientId(String aadClientId) {
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }
        public Builder aadTenantId(String aadTenantId) {
            this.aadTenantId = Objects.requireNonNull(aadTenantId);
            return this;
        }
        public Builder billingModel(String billingModel) {
            this.billingModel = Objects.requireNonNull(billingModel);
            return this;
        }
        public Builder cloudId(String cloudId) {
            this.cloudId = Objects.requireNonNull(cloudId);
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
        public Builder lastBillingTimestamp(String lastBillingTimestamp) {
            this.lastBillingTimestamp = Objects.requireNonNull(lastBillingTimestamp);
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
        public Builder lastSyncTimestamp(String lastSyncTimestamp) {
            this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
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
        public Builder registrationTimestamp(String registrationTimestamp) {
            this.registrationTimestamp = Objects.requireNonNull(registrationTimestamp);
            return this;
        }
        public Builder reportedProperties(@Nullable ClusterReportedPropertiesResponse reportedProperties) {
            this.reportedProperties = reportedProperties;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder trialDaysRemaining(Double trialDaysRemaining) {
            this.trialDaysRemaining = Objects.requireNonNull(trialDaysRemaining);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(aadClientId, aadTenantId, billingModel, cloudId, createdAt, createdBy, createdByType, id, lastBillingTimestamp, lastModifiedAt, lastModifiedBy, lastModifiedByType, lastSyncTimestamp, location, name, provisioningState, registrationTimestamp, reportedProperties, status, tags, trialDaysRemaining, type);
        }
    }
}
