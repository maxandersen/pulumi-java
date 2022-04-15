// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.inputs.ConnectionPropertiesResponsePrivateEndpoint;
import io.pulumi.azurenative.digitaltwins.inputs.ConnectionPropertiesResponsePrivateLinkServiceConnectionState;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponseProperties Empty = new PrivateEndpointConnectionResponseProperties();

    /**
     * The list of group ids for the private endpoint connection.
     * 
     */
    @Import(name="groupIds")
      private final @Nullable List<String> groupIds;

    public List<String> groupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }

    @Import(name="privateEndpoint")
      private final @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint;

    public Optional<ConnectionPropertiesResponsePrivateEndpoint> privateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    public Optional<ConnectionPropertiesResponsePrivateLinkServiceConnectionState> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionResponseProperties(
        @Nullable List<String> groupIds,
        @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint,
        @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState,
        String provisioningState) {
        this.groupIds = groupIds;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private PrivateEndpointConnectionResponseProperties() {
        this.groupIds = List.of();
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint;
        private @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder privateEndpoint(@Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public PrivateEndpointConnectionResponseProperties build() {
            return new PrivateEndpointConnectionResponseProperties(groupIds, privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
