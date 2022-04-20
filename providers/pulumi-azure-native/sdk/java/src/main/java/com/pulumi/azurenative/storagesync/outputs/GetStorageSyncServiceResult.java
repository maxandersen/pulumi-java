// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.azurenative.storagesync.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStorageSyncServiceResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Incoming Traffic Policy
     * 
     */
    private final @Nullable String incomingTrafficPolicy;
    /**
     * Resource Last Operation Name
     * 
     */
    private final String lastOperationName;
    /**
     * StorageSyncService lastWorkflowId
     * 
     */
    private final String lastWorkflowId;
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
     * List of private endpoint connection associated with the specified storage sync service
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * StorageSyncService Provisioning State
     * 
     */
    private final String provisioningState;
    /**
     * Storage Sync service status.
     * 
     */
    private final Integer storageSyncServiceStatus;
    /**
     * Storage Sync service Uid
     * 
     */
    private final String storageSyncServiceUid;
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
    private GetStorageSyncServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("incomingTrafficPolicy") @Nullable String incomingTrafficPolicy,
        @CustomType.Parameter("lastOperationName") String lastOperationName,
        @CustomType.Parameter("lastWorkflowId") String lastWorkflowId,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("storageSyncServiceStatus") Integer storageSyncServiceStatus,
        @CustomType.Parameter("storageSyncServiceUid") String storageSyncServiceUid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.incomingTrafficPolicy = incomingTrafficPolicy;
        this.lastOperationName = lastOperationName;
        this.lastWorkflowId = lastWorkflowId;
        this.location = location;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.storageSyncServiceStatus = storageSyncServiceStatus;
        this.storageSyncServiceUid = storageSyncServiceUid;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Incoming Traffic Policy
     * 
    */
    public Optional<String> incomingTrafficPolicy() {
        return Optional.ofNullable(this.incomingTrafficPolicy);
    }
    /**
     * Resource Last Operation Name
     * 
    */
    public String lastOperationName() {
        return this.lastOperationName;
    }
    /**
     * StorageSyncService lastWorkflowId
     * 
    */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
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
     * List of private endpoint connection associated with the specified storage sync service
     * 
    */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * StorageSyncService Provisioning State
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Storage Sync service status.
     * 
    */
    public Integer storageSyncServiceStatus() {
        return this.storageSyncServiceStatus;
    }
    /**
     * Storage Sync service Uid
     * 
    */
    public String storageSyncServiceUid() {
        return this.storageSyncServiceUid;
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

    public static Builder builder(GetStorageSyncServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String incomingTrafficPolicy;
        private String lastOperationName;
        private String lastWorkflowId;
        private String location;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private Integer storageSyncServiceStatus;
        private String storageSyncServiceUid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageSyncServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.incomingTrafficPolicy = defaults.incomingTrafficPolicy;
    	      this.lastOperationName = defaults.lastOperationName;
    	      this.lastWorkflowId = defaults.lastWorkflowId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageSyncServiceStatus = defaults.storageSyncServiceStatus;
    	      this.storageSyncServiceUid = defaults.storageSyncServiceUid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder incomingTrafficPolicy(@Nullable String incomingTrafficPolicy) {
            this.incomingTrafficPolicy = incomingTrafficPolicy;
            return this;
        }
        public Builder lastOperationName(String lastOperationName) {
            this.lastOperationName = Objects.requireNonNull(lastOperationName);
            return this;
        }
        public Builder lastWorkflowId(String lastWorkflowId) {
            this.lastWorkflowId = Objects.requireNonNull(lastWorkflowId);
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
        public Builder storageSyncServiceStatus(Integer storageSyncServiceStatus) {
            this.storageSyncServiceStatus = Objects.requireNonNull(storageSyncServiceStatus);
            return this;
        }
        public Builder storageSyncServiceUid(String storageSyncServiceUid) {
            this.storageSyncServiceUid = Objects.requireNonNull(storageSyncServiceUid);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetStorageSyncServiceResult build() {
            return new GetStorageSyncServiceResult(id, incomingTrafficPolicy, lastOperationName, lastWorkflowId, location, name, privateEndpointConnections, provisioningState, storageSyncServiceStatus, storageSyncServiceUid, tags, type);
        }
    }
}
