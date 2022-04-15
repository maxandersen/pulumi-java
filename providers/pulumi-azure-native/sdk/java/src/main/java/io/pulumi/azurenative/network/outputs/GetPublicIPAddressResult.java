// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.DdosSettingsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.IPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.IpTagResponse;
import io.pulumi.azurenative.network.outputs.NatGatewayResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressDnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIPAddressResult {
    /**
     * The DDoS protection custom policy associated with the public IP address.
     * 
     */
    private final @Nullable DdosSettingsResponse ddosSettings;
    /**
     * The FQDN of the DNS record associated with the public IP address.
     * 
     */
    private final @Nullable PublicIPAddressDnsSettingsResponse dnsSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of the public ip address.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The idle timeout of the public IP address.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * The IP address associated with the public IP address resource.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The IP configuration associated with the public IP address.
     * 
     */
    private final IPConfigurationResponse ipConfiguration;
    /**
     * The list of tags associated with the public IP address.
     * 
     */
    private final @Nullable List<IpTagResponse> ipTags;
    /**
     * The linked public IP address of the public IP address resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse linkedPublicIPAddress;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Migration phase of Public IP Address.
     * 
     */
    private final @Nullable String migrationPhase;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The NatGateway for the Public IP address.
     * 
     */
    private final @Nullable NatGatewayResponse natGateway;
    /**
     * The provisioning state of the public IP address resource.
     * 
     */
    private final String provisioningState;
    /**
     * The public IP address version.
     * 
     */
    private final @Nullable String publicIPAddressVersion;
    /**
     * The public IP address allocation method.
     * 
     */
    private final @Nullable String publicIPAllocationMethod;
    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     * 
     */
    private final @Nullable SubResourceResponse publicIPPrefix;
    /**
     * The resource GUID property of the public IP address resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The service public IP address of the public IP address resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse servicePublicIPAddress;
    /**
     * The public IP address SKU.
     * 
     */
    private final @Nullable PublicIPAddressSkuResponse sku;
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
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetPublicIPAddressResult(
        @CustomType.Parameter("ddosSettings") @Nullable DdosSettingsResponse ddosSettings,
        @CustomType.Parameter("dnsSettings") @Nullable PublicIPAddressDnsSettingsResponse dnsSettings,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("ipConfiguration") IPConfigurationResponse ipConfiguration,
        @CustomType.Parameter("ipTags") @Nullable List<IpTagResponse> ipTags,
        @CustomType.Parameter("linkedPublicIPAddress") @Nullable PublicIPAddressResponse linkedPublicIPAddress,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("migrationPhase") @Nullable String migrationPhase,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natGateway") @Nullable NatGatewayResponse natGateway,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIPAddressVersion") @Nullable String publicIPAddressVersion,
        @CustomType.Parameter("publicIPAllocationMethod") @Nullable String publicIPAllocationMethod,
        @CustomType.Parameter("publicIPPrefix") @Nullable SubResourceResponse publicIPPrefix,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("servicePublicIPAddress") @Nullable PublicIPAddressResponse servicePublicIPAddress,
        @CustomType.Parameter("sku") @Nullable PublicIPAddressSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.ddosSettings = ddosSettings;
        this.dnsSettings = dnsSettings;
        this.etag = etag;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipAddress = ipAddress;
        this.ipConfiguration = ipConfiguration;
        this.ipTags = ipTags;
        this.linkedPublicIPAddress = linkedPublicIPAddress;
        this.location = location;
        this.migrationPhase = migrationPhase;
        this.name = name;
        this.natGateway = natGateway;
        this.provisioningState = provisioningState;
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.resourceGuid = resourceGuid;
        this.servicePublicIPAddress = servicePublicIPAddress;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * The DDoS protection custom policy associated with the public IP address.
     * 
    */
    public Optional<DdosSettingsResponse> ddosSettings() {
        return Optional.ofNullable(this.ddosSettings);
    }
    /**
     * The FQDN of the DNS record associated with the public IP address.
     * 
    */
    public Optional<PublicIPAddressDnsSettingsResponse> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The extended location of the public ip address.
     * 
    */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The idle timeout of the public IP address.
     * 
    */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * The IP address associated with the public IP address resource.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The IP configuration associated with the public IP address.
     * 
    */
    public IPConfigurationResponse ipConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * The list of tags associated with the public IP address.
     * 
    */
    public List<IpTagResponse> ipTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * The linked public IP address of the public IP address resource.
     * 
    */
    public Optional<PublicIPAddressResponse> linkedPublicIPAddress() {
        return Optional.ofNullable(this.linkedPublicIPAddress);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Migration phase of Public IP Address.
     * 
    */
    public Optional<String> migrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The NatGateway for the Public IP address.
     * 
    */
    public Optional<NatGatewayResponse> natGateway() {
        return Optional.ofNullable(this.natGateway);
    }
    /**
     * The provisioning state of the public IP address resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address version.
     * 
    */
    public Optional<String> publicIPAddressVersion() {
        return Optional.ofNullable(this.publicIPAddressVersion);
    }
    /**
     * The public IP address allocation method.
     * 
    */
    public Optional<String> publicIPAllocationMethod() {
        return Optional.ofNullable(this.publicIPAllocationMethod);
    }
    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     * 
    */
    public Optional<SubResourceResponse> publicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    /**
     * The resource GUID property of the public IP address resource.
     * 
    */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The service public IP address of the public IP address resource.
     * 
    */
    public Optional<PublicIPAddressResponse> servicePublicIPAddress() {
        return Optional.ofNullable(this.servicePublicIPAddress);
    }
    /**
     * The public IP address SKU.
     * 
    */
    public Optional<PublicIPAddressSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
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
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
    */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIPAddressResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DdosSettingsResponse ddosSettings;
        private @Nullable PublicIPAddressDnsSettingsResponse dnsSettings;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String ipAddress;
        private IPConfigurationResponse ipConfiguration;
        private @Nullable List<IpTagResponse> ipTags;
        private @Nullable PublicIPAddressResponse linkedPublicIPAddress;
        private @Nullable String location;
        private @Nullable String migrationPhase;
        private String name;
        private @Nullable NatGatewayResponse natGateway;
        private String provisioningState;
        private @Nullable String publicIPAddressVersion;
        private @Nullable String publicIPAllocationMethod;
        private @Nullable SubResourceResponse publicIPPrefix;
        private String resourceGuid;
        private @Nullable PublicIPAddressResponse servicePublicIPAddress;
        private @Nullable PublicIPAddressSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIPAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosSettings = defaults.ddosSettings;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.ipTags = defaults.ipTags;
    	      this.linkedPublicIPAddress = defaults.linkedPublicIPAddress;
    	      this.location = defaults.location;
    	      this.migrationPhase = defaults.migrationPhase;
    	      this.name = defaults.name;
    	      this.natGateway = defaults.natGateway;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAllocationMethod = defaults.publicIPAllocationMethod;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.servicePublicIPAddress = defaults.servicePublicIPAddress;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder ddosSettings(@Nullable DdosSettingsResponse ddosSettings) {
            this.ddosSettings = ddosSettings;
            return this;
        }
        public Builder dnsSettings(@Nullable PublicIPAddressDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipConfiguration(IPConfigurationResponse ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }
        public Builder ipTags(@Nullable List<IpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }
        public Builder ipTags(IpTagResponse... ipTags) {
            return ipTags(List.of(ipTags));
        }
        public Builder linkedPublicIPAddress(@Nullable PublicIPAddressResponse linkedPublicIPAddress) {
            this.linkedPublicIPAddress = linkedPublicIPAddress;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder migrationPhase(@Nullable String migrationPhase) {
            this.migrationPhase = migrationPhase;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder natGateway(@Nullable NatGatewayResponse natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }
        public Builder publicIPAllocationMethod(@Nullable String publicIPAllocationMethod) {
            this.publicIPAllocationMethod = publicIPAllocationMethod;
            return this;
        }
        public Builder publicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder servicePublicIPAddress(@Nullable PublicIPAddressResponse servicePublicIPAddress) {
            this.servicePublicIPAddress = servicePublicIPAddress;
            return this;
        }
        public Builder sku(@Nullable PublicIPAddressSkuResponse sku) {
            this.sku = sku;
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
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetPublicIPAddressResult build() {
            return new GetPublicIPAddressResult(ddosSettings, dnsSettings, etag, extendedLocation, id, idleTimeoutInMinutes, ipAddress, ipConfiguration, ipTags, linkedPublicIPAddress, location, migrationPhase, name, natGateway, provisioningState, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, resourceGuid, servicePublicIPAddress, sku, tags, type, zones);
        }
    }
}
