// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalNetworkGatewayResult {
    /**
     * Local network gateway's BGP speaker settings.
     * 
     */
    private final @Nullable BgpSettingsResponse bgpSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * FQDN of local network gateway.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * IP address of local network gateway.
     * 
     */
    private final @Nullable String gatewayIpAddress;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Local network site address space.
     * 
     */
    private final @Nullable AddressSpaceResponse localNetworkAddressSpace;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the local network gateway resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the local network gateway resource.
     * 
     */
    private final String resourceGuid;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLocalNetworkGatewayResult(
        @CustomType.Parameter("bgpSettings") @Nullable BgpSettingsResponse bgpSettings,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("fqdn") @Nullable String fqdn,
        @CustomType.Parameter("gatewayIpAddress") @Nullable String gatewayIpAddress,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("localNetworkAddressSpace") @Nullable AddressSpaceResponse localNetworkAddressSpace,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.bgpSettings = bgpSettings;
        this.etag = etag;
        this.fqdn = fqdn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.id = id;
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Local network gateway's BGP speaker settings.
     * 
    */
    public Optional<BgpSettingsResponse> bgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * FQDN of local network gateway.
     * 
    */
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * IP address of local network gateway.
     * 
    */
    public Optional<String> gatewayIpAddress() {
        return Optional.ofNullable(this.gatewayIpAddress);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Local network site address space.
     * 
    */
    public Optional<AddressSpaceResponse> localNetworkAddressSpace() {
        return Optional.ofNullable(this.localNetworkAddressSpace);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the local network gateway resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the local network gateway resource.
     * 
    */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalNetworkGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BgpSettingsResponse bgpSettings;
        private String etag;
        private @Nullable String fqdn;
        private @Nullable String gatewayIpAddress;
        private @Nullable String id;
        private @Nullable AddressSpaceResponse localNetworkAddressSpace;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalNetworkGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.id = defaults.id;
    	      this.localNetworkAddressSpace = defaults.localNetworkAddressSpace;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder bgpSettings(@Nullable BgpSettingsResponse bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder gatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder localNetworkAddressSpace(@Nullable AddressSpaceResponse localNetworkAddressSpace) {
            this.localNetworkAddressSpace = localNetworkAddressSpace;
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLocalNetworkGatewayResult build() {
            return new GetLocalNetworkGatewayResult(bgpSettings, etag, fqdn, gatewayIpAddress, id, localNetworkAddressSpace, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}
