// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.outputs;

import com.pulumi.azurenative.timeseriesinsights.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.timeseriesinsights.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The resource of private end point.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    private final PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @CustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The provisioning state of the private endpoint connection resource.
     * 
    */
    public List<String> groupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
    */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
    */
    public PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
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

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(groupIds, id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
