// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.DdosSettingsResponse;
import io.pulumi.azurenative.network.inputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.inputs.IPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.IpTagResponse;
import io.pulumi.azurenative.network.inputs.NatGatewayResponse;
import io.pulumi.azurenative.network.inputs.PublicIPAddressDnsSettingsResponse;
import io.pulumi.azurenative.network.inputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Public IP address resource.
 * 
 */
public final class PublicIPAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublicIPAddressResponse Empty = new PublicIPAddressResponse();

    /**
     * The DDoS protection custom policy associated with the public IP address.
     * 
     */
    @Import(name="ddosSettings")
      private final @Nullable DdosSettingsResponse ddosSettings;

    public Optional<DdosSettingsResponse> ddosSettings() {
        return this.ddosSettings == null ? Optional.empty() : Optional.ofNullable(this.ddosSettings);
    }

    /**
     * The FQDN of the DNS record associated with the public IP address.
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable PublicIPAddressDnsSettingsResponse dnsSettings;

    public Optional<PublicIPAddressDnsSettingsResponse> dnsSettings() {
        return this.dnsSettings == null ? Optional.empty() : Optional.ofNullable(this.dnsSettings);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * The extended location of the public ip address.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable ExtendedLocationResponse extendedLocation;

    public Optional<ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation == null ? Optional.empty() : Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The idle timeout of the public IP address.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The IP address associated with the public IP address resource.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The IP configuration associated with the public IP address.
     * 
     */
    @Import(name="ipConfiguration", required=true)
      private final IPConfigurationResponse ipConfiguration;

    public IPConfigurationResponse ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * The list of tags associated with the public IP address.
     * 
     */
    @Import(name="ipTags")
      private final @Nullable List<IpTagResponse> ipTags;

    public List<IpTagResponse> ipTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }

    /**
     * The linked public IP address of the public IP address resource.
     * 
     */
    @Import(name="linkedPublicIPAddress")
      private final @Nullable PublicIPAddressResponse linkedPublicIPAddress;

    public Optional<PublicIPAddressResponse> linkedPublicIPAddress() {
        return this.linkedPublicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.linkedPublicIPAddress);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Migration phase of Public IP Address.
     * 
     */
    @Import(name="migrationPhase")
      private final @Nullable String migrationPhase;

    public Optional<String> migrationPhase() {
        return this.migrationPhase == null ? Optional.empty() : Optional.ofNullable(this.migrationPhase);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The NatGateway for the Public IP address.
     * 
     */
    @Import(name="natGateway")
      private final @Nullable NatGatewayResponse natGateway;

    public Optional<NatGatewayResponse> natGateway() {
        return this.natGateway == null ? Optional.empty() : Optional.ofNullable(this.natGateway);
    }

    /**
     * The provisioning state of the public IP address resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The public IP address version.
     * 
     */
    @Import(name="publicIPAddressVersion")
      private final @Nullable String publicIPAddressVersion;

    public Optional<String> publicIPAddressVersion() {
        return this.publicIPAddressVersion == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddressVersion);
    }

    /**
     * The public IP address allocation method.
     * 
     */
    @Import(name="publicIPAllocationMethod")
      private final @Nullable String publicIPAllocationMethod;

    public Optional<String> publicIPAllocationMethod() {
        return this.publicIPAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.publicIPAllocationMethod);
    }

    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     * 
     */
    @Import(name="publicIPPrefix")
      private final @Nullable SubResourceResponse publicIPPrefix;

    public Optional<SubResourceResponse> publicIPPrefix() {
        return this.publicIPPrefix == null ? Optional.empty() : Optional.ofNullable(this.publicIPPrefix);
    }

    /**
     * The resource GUID property of the public IP address resource.
     * 
     */
    @Import(name="resourceGuid", required=true)
      private final String resourceGuid;

    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * The service public IP address of the public IP address resource.
     * 
     */
    @Import(name="servicePublicIPAddress")
      private final @Nullable PublicIPAddressResponse servicePublicIPAddress;

    public Optional<PublicIPAddressResponse> servicePublicIPAddress() {
        return this.servicePublicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.servicePublicIPAddress);
    }

    /**
     * The public IP address SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable PublicIPAddressSkuResponse sku;

    public Optional<PublicIPAddressSkuResponse> sku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Import(name="zones")
      private final @Nullable List<String> zones;

    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public PublicIPAddressResponse(
        @Nullable DdosSettingsResponse ddosSettings,
        @Nullable PublicIPAddressDnsSettingsResponse dnsSettings,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String ipAddress,
        IPConfigurationResponse ipConfiguration,
        @Nullable List<IpTagResponse> ipTags,
        @Nullable PublicIPAddressResponse linkedPublicIPAddress,
        @Nullable String location,
        @Nullable String migrationPhase,
        String name,
        @Nullable NatGatewayResponse natGateway,
        String provisioningState,
        @Nullable String publicIPAddressVersion,
        @Nullable String publicIPAllocationMethod,
        @Nullable SubResourceResponse publicIPPrefix,
        String resourceGuid,
        @Nullable PublicIPAddressResponse servicePublicIPAddress,
        @Nullable PublicIPAddressSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> zones) {
        this.ddosSettings = ddosSettings;
        this.dnsSettings = dnsSettings;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipAddress = ipAddress;
        this.ipConfiguration = Objects.requireNonNull(ipConfiguration, "expected parameter 'ipConfiguration' to be non-null");
        this.ipTags = ipTags;
        this.linkedPublicIPAddress = linkedPublicIPAddress;
        this.location = location;
        this.migrationPhase = migrationPhase;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.natGateway = natGateway;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.servicePublicIPAddress = servicePublicIPAddress;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.zones = zones;
    }

    private PublicIPAddressResponse() {
        this.ddosSettings = null;
        this.dnsSettings = null;
        this.etag = null;
        this.extendedLocation = null;
        this.id = null;
        this.idleTimeoutInMinutes = null;
        this.ipAddress = null;
        this.ipConfiguration = null;
        this.ipTags = List.of();
        this.linkedPublicIPAddress = null;
        this.location = null;
        this.migrationPhase = null;
        this.name = null;
        this.natGateway = null;
        this.provisioningState = null;
        this.publicIPAddressVersion = null;
        this.publicIPAllocationMethod = null;
        this.publicIPPrefix = null;
        this.resourceGuid = null;
        this.servicePublicIPAddress = null;
        this.sku = null;
        this.tags = Map.of();
        this.type = null;
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressResponse defaults) {
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

        public Builder(PublicIPAddressResponse defaults) {
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
        }        public PublicIPAddressResponse build() {
            return new PublicIPAddressResponse(ddosSettings, dnsSettings, etag, extendedLocation, id, idleTimeoutInMinutes, ipAddress, ipConfiguration, ipTags, linkedPublicIPAddress, location, migrationPhase, name, natGateway, provisioningState, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, resourceGuid, servicePublicIPAddress, sku, tags, type, zones);
        }
    }
}
