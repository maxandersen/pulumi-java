// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.purview.outputs;

import com.pulumi.azurenative.purview.outputs.AccountPropertiesResponseEndpoints;
import com.pulumi.azurenative.purview.outputs.AccountPropertiesResponseManagedResources;
import com.pulumi.azurenative.purview.outputs.AccountPropertiesResponseSystemData;
import com.pulumi.azurenative.purview.outputs.AccountResponseSku;
import com.pulumi.azurenative.purview.outputs.CloudConnectorsResponse;
import com.pulumi.azurenative.purview.outputs.IdentityResponse;
import com.pulumi.azurenative.purview.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * @return Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
     */
    private final @Nullable CloudConnectorsResponse cloudConnectors;
    /**
     * @return Gets the time at which the entity was created.
     * 
     */
    private final String createdAt;
    /**
     * @return Gets the creator of the entity.
     * 
     */
    private final String createdBy;
    /**
     * @return Gets the creators of the entity&#39;s object id.
     * 
     */
    private final String createdByObjectId;
    /**
     * @return The URIs that are the public endpoints of the account.
     * 
     */
    private final AccountPropertiesResponseEndpoints endpoints;
    /**
     * @return Gets or sets the friendly name.
     * 
     */
    private final String friendlyName;
    /**
     * @return Gets or sets the identifier.
     * 
     */
    private final String id;
    /**
     * @return Identity Info on the tracked resource
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return Gets or sets the location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Gets or sets the managed resource group name
     * 
     */
    private final @Nullable String managedResourceGroupName;
    /**
     * @return Gets the resource identifiers of the managed resources.
     * 
     */
    private final AccountPropertiesResponseManagedResources managedResources;
    /**
     * @return Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * @return Gets the private endpoint connections information.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Gets or sets the state of the provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * @return Gets or sets the public network access.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * @return Gets or sets the Sku.
     * 
     */
    private final AccountResponseSku sku;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final AccountPropertiesResponseSystemData systemData;
    /**
     * @return Tags on the azure resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Gets or sets the type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("cloudConnectors") @Nullable CloudConnectorsResponse cloudConnectors,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("createdByObjectId") String createdByObjectId,
        @CustomType.Parameter("endpoints") AccountPropertiesResponseEndpoints endpoints,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedResourceGroupName") @Nullable String managedResourceGroupName,
        @CustomType.Parameter("managedResources") AccountPropertiesResponseManagedResources managedResources,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("sku") AccountResponseSku sku,
        @CustomType.Parameter("systemData") AccountPropertiesResponseSystemData systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.cloudConnectors = cloudConnectors;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByObjectId = createdByObjectId;
        this.endpoints = endpoints;
        this.friendlyName = friendlyName;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.managedResourceGroupName = managedResourceGroupName;
        this.managedResources = managedResources;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
     */
    public Optional<CloudConnectorsResponse> cloudConnectors() {
        return Optional.ofNullable(this.cloudConnectors);
    }
    /**
     * @return Gets the time at which the entity was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Gets the creator of the entity.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Gets the creators of the entity&#39;s object id.
     * 
     */
    public String createdByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * @return The URIs that are the public endpoints of the account.
     * 
     */
    public AccountPropertiesResponseEndpoints endpoints() {
        return this.endpoints;
    }
    /**
     * @return Gets or sets the friendly name.
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return Gets or sets the identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity Info on the tracked resource
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Gets or sets the location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Gets or sets the managed resource group name
     * 
     */
    public Optional<String> managedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }
    /**
     * @return Gets the resource identifiers of the managed resources.
     * 
     */
    public AccountPropertiesResponseManagedResources managedResources() {
        return this.managedResources;
    }
    /**
     * @return Gets or sets the name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets the private endpoint connections information.
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * @return Gets or sets the state of the provisioning.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Gets or sets the public network access.
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return Gets or sets the Sku.
     * 
     */
    public AccountResponseSku sku() {
        return this.sku;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public AccountPropertiesResponseSystemData systemData() {
        return this.systemData;
    }
    /**
     * @return Tags on the azure resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Gets or sets the type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudConnectorsResponse cloudConnectors;
        private String createdAt;
        private String createdBy;
        private String createdByObjectId;
        private AccountPropertiesResponseEndpoints endpoints;
        private String friendlyName;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private @Nullable String managedResourceGroupName;
        private AccountPropertiesResponseManagedResources managedResources;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private AccountResponseSku sku;
        private AccountPropertiesResponseSystemData systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudConnectors = defaults.cloudConnectors;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByObjectId = defaults.createdByObjectId;
    	      this.endpoints = defaults.endpoints;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedResourceGroupName = defaults.managedResourceGroupName;
    	      this.managedResources = defaults.managedResources;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder cloudConnectors(@Nullable CloudConnectorsResponse cloudConnectors) {
            this.cloudConnectors = cloudConnectors;
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder createdByObjectId(String createdByObjectId) {
            this.createdByObjectId = Objects.requireNonNull(createdByObjectId);
            return this;
        }
        public Builder endpoints(AccountPropertiesResponseEndpoints endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
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
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedResourceGroupName(@Nullable String managedResourceGroupName) {
            this.managedResourceGroupName = managedResourceGroupName;
            return this;
        }
        public Builder managedResources(AccountPropertiesResponseManagedResources managedResources) {
            this.managedResources = Objects.requireNonNull(managedResources);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder sku(AccountResponseSku sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder systemData(AccountPropertiesResponseSystemData systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccountResult build() {
            return new GetAccountResult(cloudConnectors, createdAt, createdBy, createdByObjectId, endpoints, friendlyName, id, identity, location, managedResourceGroupName, managedResources, name, privateEndpointConnections, provisioningState, publicNetworkAccess, sku, systemData, tags, type);
        }
    }
}
