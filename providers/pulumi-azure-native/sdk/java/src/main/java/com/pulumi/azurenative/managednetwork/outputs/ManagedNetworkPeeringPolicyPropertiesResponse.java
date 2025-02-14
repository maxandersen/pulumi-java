// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.outputs;

import com.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedNetworkPeeringPolicyPropertiesResponse {
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Gets or sets the hub virtual network ID
     * 
     */
    private final @Nullable ResourceIdResponse hub;
    /**
     * @return Gets or sets the mesh group IDs
     * 
     */
    private final @Nullable List<ResourceIdResponse> mesh;
    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Gets or sets the spokes group IDs
     * 
     */
    private final @Nullable List<ResourceIdResponse> spokes;
    /**
     * @return Gets or sets the connectivity type of a network structure policy
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ManagedNetworkPeeringPolicyPropertiesResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("hub") @Nullable ResourceIdResponse hub,
        @CustomType.Parameter("mesh") @Nullable List<ResourceIdResponse> mesh,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("spokes") @Nullable List<ResourceIdResponse> spokes,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.hub = hub;
        this.mesh = mesh;
        this.provisioningState = provisioningState;
        this.spokes = spokes;
        this.type = type;
    }

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Gets or sets the hub virtual network ID
     * 
     */
    public Optional<ResourceIdResponse> hub() {
        return Optional.ofNullable(this.hub);
    }
    /**
     * @return Gets or sets the mesh group IDs
     * 
     */
    public List<ResourceIdResponse> mesh() {
        return this.mesh == null ? List.of() : this.mesh;
    }
    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Gets or sets the spokes group IDs
     * 
     */
    public List<ResourceIdResponse> spokes() {
        return this.spokes == null ? List.of() : this.spokes;
    }
    /**
     * @return Gets or sets the connectivity type of a network structure policy
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable ResourceIdResponse hub;
        private @Nullable List<ResourceIdResponse> mesh;
        private String provisioningState;
        private @Nullable List<ResourceIdResponse> spokes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.hub = defaults.hub;
    	      this.mesh = defaults.mesh;
    	      this.provisioningState = defaults.provisioningState;
    	      this.spokes = defaults.spokes;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder hub(@Nullable ResourceIdResponse hub) {
            this.hub = hub;
            return this;
        }
        public Builder mesh(@Nullable List<ResourceIdResponse> mesh) {
            this.mesh = mesh;
            return this;
        }
        public Builder mesh(ResourceIdResponse... mesh) {
            return mesh(List.of(mesh));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder spokes(@Nullable List<ResourceIdResponse> spokes) {
            this.spokes = spokes;
            return this;
        }
        public Builder spokes(ResourceIdResponse... spokes) {
            return spokes(List.of(spokes));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ManagedNetworkPeeringPolicyPropertiesResponse build() {
            return new ManagedNetworkPeeringPolicyPropertiesResponse(etag, hub, mesh, provisioningState, spokes, type);
        }
    }
}
