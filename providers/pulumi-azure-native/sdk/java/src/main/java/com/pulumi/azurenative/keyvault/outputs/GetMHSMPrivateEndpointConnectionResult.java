// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.outputs;

import com.pulumi.azurenative.keyvault.outputs.MHSMPrivateEndpointResponse;
import com.pulumi.azurenative.keyvault.outputs.MHSMPrivateLinkServiceConnectionStateResponse;
import com.pulumi.azurenative.keyvault.outputs.ManagedHsmSkuResponse;
import com.pulumi.azurenative.keyvault.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMHSMPrivateEndpointConnectionResult {
    /**
     * @return Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return The Azure Resource Manager resource ID for the managed HSM Pool.
     * 
     */
    private final String id;
    /**
     * @return The supported Azure location where the managed HSM Pool should be created.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the managed HSM Pool.
     * 
     */
    private final String name;
    /**
     * @return Properties of the private endpoint object.
     * 
     */
    private final @Nullable MHSMPrivateEndpointResponse privateEndpoint;
    /**
     * @return Approval state of the private link connection.
     * 
     */
    private final @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * @return Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * @return SKU details
     * 
     */
    private final @Nullable ManagedHsmSkuResponse sku;
    /**
     * @return Metadata pertaining to creation and last modification of the key vault resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The resource type of the managed HSM Pool.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMHSMPrivateEndpointConnectionResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable MHSMPrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") @Nullable ManagedHsmSkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return The Azure Resource Manager resource ID for the managed HSM Pool.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The supported Azure location where the managed HSM Pool should be created.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the managed HSM Pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of the private endpoint object.
     * 
     */
    public Optional<MHSMPrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return Approval state of the private link connection.
     * 
     */
    public Optional<MHSMPrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return Provisioning state of the private endpoint connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return SKU details
     * 
     */
    public Optional<ManagedHsmSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Metadata pertaining to creation and last modification of the key vault resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The resource type of the managed HSM Pool.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMHSMPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable MHSMPrivateEndpointResponse privateEndpoint;
        private @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private @Nullable ManagedHsmSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMHSMPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable MHSMPrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(@Nullable ManagedHsmSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
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
        }        public GetMHSMPrivateEndpointConnectionResult build() {
            return new GetMHSMPrivateEndpointConnectionResult(etag, id, location, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, sku, systemData, tags, type);
        }
    }
}
