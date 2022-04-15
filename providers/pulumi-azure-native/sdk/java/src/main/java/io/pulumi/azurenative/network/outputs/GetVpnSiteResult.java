// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.DevicePropertiesResponse;
import io.pulumi.azurenative.network.outputs.O365PolicyPropertiesResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnSiteLinkResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpnSiteResult {
    /**
     * The AddressSpace that contains an array of IP address ranges.
     * 
     */
    private final @Nullable AddressSpaceResponse addressSpace;
    /**
     * The set of bgp properties.
     * 
     */
    private final @Nullable BgpSettingsResponse bgpProperties;
    /**
     * The device properties.
     * 
     */
    private final @Nullable DevicePropertiesResponse deviceProperties;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The ip-address for the vpn-site.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * IsSecuritySite flag.
     * 
     */
    private final @Nullable Boolean isSecuritySite;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Office365 Policy.
     * 
     */
    private final @Nullable O365PolicyPropertiesResponse o365Policy;
    /**
     * The provisioning state of the VPN site resource.
     * 
     */
    private final String provisioningState;
    /**
     * The key for vpn-site that can be used for connections.
     * 
     */
    private final @Nullable String siteKey;
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
    /**
     * The VirtualWAN to which the vpnSite belongs.
     * 
     */
    private final @Nullable SubResourceResponse virtualWan;
    /**
     * List of all vpn site links.
     * 
     */
    private final @Nullable List<VpnSiteLinkResponse> vpnSiteLinks;

    @CustomType.Constructor
    private GetVpnSiteResult(
        @CustomType.Parameter("addressSpace") @Nullable AddressSpaceResponse addressSpace,
        @CustomType.Parameter("bgpProperties") @Nullable BgpSettingsResponse bgpProperties,
        @CustomType.Parameter("deviceProperties") @Nullable DevicePropertiesResponse deviceProperties,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("isSecuritySite") @Nullable Boolean isSecuritySite,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("o365Policy") @Nullable O365PolicyPropertiesResponse o365Policy,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("siteKey") @Nullable String siteKey,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualWan") @Nullable SubResourceResponse virtualWan,
        @CustomType.Parameter("vpnSiteLinks") @Nullable List<VpnSiteLinkResponse> vpnSiteLinks) {
        this.addressSpace = addressSpace;
        this.bgpProperties = bgpProperties;
        this.deviceProperties = deviceProperties;
        this.etag = etag;
        this.id = id;
        this.ipAddress = ipAddress;
        this.isSecuritySite = isSecuritySite;
        this.location = location;
        this.name = name;
        this.o365Policy = o365Policy;
        this.provisioningState = provisioningState;
        this.siteKey = siteKey;
        this.tags = tags;
        this.type = type;
        this.virtualWan = virtualWan;
        this.vpnSiteLinks = vpnSiteLinks;
    }

    /**
     * The AddressSpace that contains an array of IP address ranges.
     * 
    */
    public Optional<AddressSpaceResponse> addressSpace() {
        return Optional.ofNullable(this.addressSpace);
    }
    /**
     * The set of bgp properties.
     * 
    */
    public Optional<BgpSettingsResponse> bgpProperties() {
        return Optional.ofNullable(this.bgpProperties);
    }
    /**
     * The device properties.
     * 
    */
    public Optional<DevicePropertiesResponse> deviceProperties() {
        return Optional.ofNullable(this.deviceProperties);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The ip-address for the vpn-site.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * IsSecuritySite flag.
     * 
    */
    public Optional<Boolean> isSecuritySite() {
        return Optional.ofNullable(this.isSecuritySite);
    }
    /**
     * Resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Office365 Policy.
     * 
    */
    public Optional<O365PolicyPropertiesResponse> o365Policy() {
        return Optional.ofNullable(this.o365Policy);
    }
    /**
     * The provisioning state of the VPN site resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The key for vpn-site that can be used for connections.
     * 
    */
    public Optional<String> siteKey() {
        return Optional.ofNullable(this.siteKey);
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
    /**
     * The VirtualWAN to which the vpnSite belongs.
     * 
    */
    public Optional<SubResourceResponse> virtualWan() {
        return Optional.ofNullable(this.virtualWan);
    }
    /**
     * List of all vpn site links.
     * 
    */
    public List<VpnSiteLinkResponse> vpnSiteLinks() {
        return this.vpnSiteLinks == null ? List.of() : this.vpnSiteLinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AddressSpaceResponse addressSpace;
        private @Nullable BgpSettingsResponse bgpProperties;
        private @Nullable DevicePropertiesResponse deviceProperties;
        private String etag;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable Boolean isSecuritySite;
        private String location;
        private String name;
        private @Nullable O365PolicyPropertiesResponse o365Policy;
        private String provisioningState;
        private @Nullable String siteKey;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable SubResourceResponse virtualWan;
        private @Nullable List<VpnSiteLinkResponse> vpnSiteLinks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.bgpProperties = defaults.bgpProperties;
    	      this.deviceProperties = defaults.deviceProperties;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.isSecuritySite = defaults.isSecuritySite;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.o365Policy = defaults.o365Policy;
    	      this.provisioningState = defaults.provisioningState;
    	      this.siteKey = defaults.siteKey;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnSiteLinks = defaults.vpnSiteLinks;
        }

        public Builder addressSpace(@Nullable AddressSpaceResponse addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }
        public Builder bgpProperties(@Nullable BgpSettingsResponse bgpProperties) {
            this.bgpProperties = bgpProperties;
            return this;
        }
        public Builder deviceProperties(@Nullable DevicePropertiesResponse deviceProperties) {
            this.deviceProperties = deviceProperties;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder isSecuritySite(@Nullable Boolean isSecuritySite) {
            this.isSecuritySite = isSecuritySite;
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
        public Builder o365Policy(@Nullable O365PolicyPropertiesResponse o365Policy) {
            this.o365Policy = o365Policy;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder siteKey(@Nullable String siteKey) {
            this.siteKey = siteKey;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualWan(@Nullable SubResourceResponse virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }
        public Builder vpnSiteLinks(@Nullable List<VpnSiteLinkResponse> vpnSiteLinks) {
            this.vpnSiteLinks = vpnSiteLinks;
            return this;
        }
        public Builder vpnSiteLinks(VpnSiteLinkResponse... vpnSiteLinks) {
            return vpnSiteLinks(List.of(vpnSiteLinks));
        }        public GetVpnSiteResult build() {
            return new GetVpnSiteResult(addressSpace, bgpProperties, deviceProperties, etag, id, ipAddress, isSecuritySite, location, name, o365Policy, provisioningState, siteKey, tags, type, virtualWan, vpnSiteLinks);
        }
    }
}
