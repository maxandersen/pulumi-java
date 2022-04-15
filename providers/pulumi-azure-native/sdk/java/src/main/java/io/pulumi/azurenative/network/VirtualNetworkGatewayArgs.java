// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayType;
import io.pulumi.azurenative.network.enums.VpnGatewayGeneration;
import io.pulumi.azurenative.network.enums.VpnType;
import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewayIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewaySkuArgs;
import io.pulumi.azurenative.network.inputs.VpnClientConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayArgs Empty = new VirtualNetworkGatewayArgs();

    /**
     * ActiveActive flag.
     * 
     */
    @Import(name="activeActive")
      private final @Nullable Output<Boolean> activeActive;

    public Output<Boolean> activeActive() {
        return this.activeActive == null ? Codegen.empty() : this.activeActive;
    }

    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    @Import(name="bgpSettings")
      private final @Nullable Output<BgpSettingsArgs> bgpSettings;

    public Output<BgpSettingsArgs> bgpSettings() {
        return this.bgpSettings == null ? Codegen.empty() : this.bgpSettings;
    }

    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    @Import(name="customRoutes")
      private final @Nullable Output<AddressSpaceArgs> customRoutes;

    public Output<AddressSpaceArgs> customRoutes() {
        return this.customRoutes == null ? Codegen.empty() : this.customRoutes;
    }

    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    @Import(name="enableBgp")
      private final @Nullable Output<Boolean> enableBgp;

    public Output<Boolean> enableBgp() {
        return this.enableBgp == null ? Codegen.empty() : this.enableBgp;
    }

    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    @Import(name="enableDnsForwarding")
      private final @Nullable Output<Boolean> enableDnsForwarding;

    public Output<Boolean> enableDnsForwarding() {
        return this.enableDnsForwarding == null ? Codegen.empty() : this.enableDnsForwarding;
    }

    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    @Import(name="enablePrivateIpAddress")
      private final @Nullable Output<Boolean> enablePrivateIpAddress;

    public Output<Boolean> enablePrivateIpAddress() {
        return this.enablePrivateIpAddress == null ? Codegen.empty() : this.enablePrivateIpAddress;
    }

    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> extendedLocation() {
        return this.extendedLocation == null ? Codegen.empty() : this.extendedLocation;
    }

    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    @Import(name="gatewayDefaultSite")
      private final @Nullable Output<SubResourceArgs> gatewayDefaultSite;

    public Output<SubResourceArgs> gatewayDefaultSite() {
        return this.gatewayDefaultSite == null ? Codegen.empty() : this.gatewayDefaultSite;
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="gatewayType")
      private final @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType;

    public Output<Either<String,VirtualNetworkGatewayType>> gatewayType() {
        return this.gatewayType == null ? Codegen.empty() : this.gatewayType;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * IP configurations for virtual network gateway.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations;

    public Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations() {
        return this.ipConfigurations == null ? Codegen.empty() : this.ipConfigurations;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<VirtualNetworkGatewaySkuArgs> sku;

    public Output<VirtualNetworkGatewaySkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    @Import(name="vNetExtendedLocationResourceId")
      private final @Nullable Output<String> vNetExtendedLocationResourceId;

    public Output<String> vNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId == null ? Codegen.empty() : this.vNetExtendedLocationResourceId;
    }

    /**
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName")
      private final @Nullable Output<String> virtualNetworkGatewayName;

    public Output<String> virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName == null ? Codegen.empty() : this.virtualNetworkGatewayName;
    }

    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    @Import(name="vpnClientConfiguration")
      private final @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration;

    public Output<VpnClientConfigurationArgs> vpnClientConfiguration() {
        return this.vpnClientConfiguration == null ? Codegen.empty() : this.vpnClientConfiguration;
    }

    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    @Import(name="vpnGatewayGeneration")
      private final @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration;

    public Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration() {
        return this.vpnGatewayGeneration == null ? Codegen.empty() : this.vpnGatewayGeneration;
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="vpnType")
      private final @Nullable Output<Either<String,VpnType>> vpnType;

    public Output<Either<String,VpnType>> vpnType() {
        return this.vpnType == null ? Codegen.empty() : this.vpnType;
    }

    public VirtualNetworkGatewayArgs(
        @Nullable Output<Boolean> activeActive,
        @Nullable Output<BgpSettingsArgs> bgpSettings,
        @Nullable Output<AddressSpaceArgs> customRoutes,
        @Nullable Output<Boolean> enableBgp,
        @Nullable Output<Boolean> enableDnsForwarding,
        @Nullable Output<Boolean> enablePrivateIpAddress,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<SubResourceArgs> gatewayDefaultSite,
        @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType,
        @Nullable Output<String> id,
        @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<VirtualNetworkGatewaySkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vNetExtendedLocationResourceId,
        @Nullable Output<String> virtualNetworkGatewayName,
        @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration,
        @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration,
        @Nullable Output<Either<String,VpnType>> vpnType) {
        this.activeActive = activeActive;
        this.bgpSettings = bgpSettings;
        this.customRoutes = customRoutes;
        this.enableBgp = enableBgp;
        this.enableDnsForwarding = enableDnsForwarding;
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        this.extendedLocation = extendedLocation;
        this.gatewayDefaultSite = gatewayDefaultSite;
        this.gatewayType = gatewayType;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        this.virtualNetworkGatewayName = virtualNetworkGatewayName;
        this.vpnClientConfiguration = vpnClientConfiguration;
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        this.vpnType = vpnType;
    }

    private VirtualNetworkGatewayArgs() {
        this.activeActive = Codegen.empty();
        this.bgpSettings = Codegen.empty();
        this.customRoutes = Codegen.empty();
        this.enableBgp = Codegen.empty();
        this.enableDnsForwarding = Codegen.empty();
        this.enablePrivateIpAddress = Codegen.empty();
        this.extendedLocation = Codegen.empty();
        this.gatewayDefaultSite = Codegen.empty();
        this.gatewayType = Codegen.empty();
        this.id = Codegen.empty();
        this.ipConfigurations = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.vNetExtendedLocationResourceId = Codegen.empty();
        this.virtualNetworkGatewayName = Codegen.empty();
        this.vpnClientConfiguration = Codegen.empty();
        this.vpnGatewayGeneration = Codegen.empty();
        this.vpnType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> activeActive;
        private @Nullable Output<BgpSettingsArgs> bgpSettings;
        private @Nullable Output<AddressSpaceArgs> customRoutes;
        private @Nullable Output<Boolean> enableBgp;
        private @Nullable Output<Boolean> enableDnsForwarding;
        private @Nullable Output<Boolean> enablePrivateIpAddress;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<SubResourceArgs> gatewayDefaultSite;
        private @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType;
        private @Nullable Output<String> id;
        private @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<VirtualNetworkGatewaySkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vNetExtendedLocationResourceId;
        private @Nullable Output<String> virtualNetworkGatewayName;
        private @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration;
        private @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration;
        private @Nullable Output<Either<String,VpnType>> vpnType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeActive = defaults.activeActive;
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.customRoutes = defaults.customRoutes;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableDnsForwarding = defaults.enableDnsForwarding;
    	      this.enablePrivateIpAddress = defaults.enablePrivateIpAddress;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.gatewayDefaultSite = defaults.gatewayDefaultSite;
    	      this.gatewayType = defaults.gatewayType;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.vNetExtendedLocationResourceId = defaults.vNetExtendedLocationResourceId;
    	      this.virtualNetworkGatewayName = defaults.virtualNetworkGatewayName;
    	      this.vpnClientConfiguration = defaults.vpnClientConfiguration;
    	      this.vpnGatewayGeneration = defaults.vpnGatewayGeneration;
    	      this.vpnType = defaults.vpnType;
        }

        public Builder activeActive(@Nullable Output<Boolean> activeActive) {
            this.activeActive = activeActive;
            return this;
        }
        public Builder activeActive(@Nullable Boolean activeActive) {
            this.activeActive = Codegen.ofNullable(activeActive);
            return this;
        }
        public Builder bgpSettings(@Nullable Output<BgpSettingsArgs> bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }
        public Builder bgpSettings(@Nullable BgpSettingsArgs bgpSettings) {
            this.bgpSettings = Codegen.ofNullable(bgpSettings);
            return this;
        }
        public Builder customRoutes(@Nullable Output<AddressSpaceArgs> customRoutes) {
            this.customRoutes = customRoutes;
            return this;
        }
        public Builder customRoutes(@Nullable AddressSpaceArgs customRoutes) {
            this.customRoutes = Codegen.ofNullable(customRoutes);
            return this;
        }
        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = Codegen.ofNullable(enableBgp);
            return this;
        }
        public Builder enableDnsForwarding(@Nullable Output<Boolean> enableDnsForwarding) {
            this.enableDnsForwarding = enableDnsForwarding;
            return this;
        }
        public Builder enableDnsForwarding(@Nullable Boolean enableDnsForwarding) {
            this.enableDnsForwarding = Codegen.ofNullable(enableDnsForwarding);
            return this;
        }
        public Builder enablePrivateIpAddress(@Nullable Output<Boolean> enablePrivateIpAddress) {
            this.enablePrivateIpAddress = enablePrivateIpAddress;
            return this;
        }
        public Builder enablePrivateIpAddress(@Nullable Boolean enablePrivateIpAddress) {
            this.enablePrivateIpAddress = Codegen.ofNullable(enablePrivateIpAddress);
            return this;
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Codegen.ofNullable(extendedLocation);
            return this;
        }
        public Builder gatewayDefaultSite(@Nullable Output<SubResourceArgs> gatewayDefaultSite) {
            this.gatewayDefaultSite = gatewayDefaultSite;
            return this;
        }
        public Builder gatewayDefaultSite(@Nullable SubResourceArgs gatewayDefaultSite) {
            this.gatewayDefaultSite = Codegen.ofNullable(gatewayDefaultSite);
            return this;
        }
        public Builder gatewayType(@Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public Builder gatewayType(@Nullable Either<String,VirtualNetworkGatewayType> gatewayType) {
            this.gatewayType = Codegen.ofNullable(gatewayType);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipConfigurations(@Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<VirtualNetworkGatewayIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Codegen.ofNullable(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(VirtualNetworkGatewayIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(@Nullable Output<VirtualNetworkGatewaySkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable VirtualNetworkGatewaySkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vNetExtendedLocationResourceId(@Nullable Output<String> vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
            return this;
        }
        public Builder vNetExtendedLocationResourceId(@Nullable String vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = Codegen.ofNullable(vNetExtendedLocationResourceId);
            return this;
        }
        public Builder virtualNetworkGatewayName(@Nullable Output<String> virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }
        public Builder virtualNetworkGatewayName(@Nullable String virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = Codegen.ofNullable(virtualNetworkGatewayName);
            return this;
        }
        public Builder vpnClientConfiguration(@Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration) {
            this.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }
        public Builder vpnClientConfiguration(@Nullable VpnClientConfigurationArgs vpnClientConfiguration) {
            this.vpnClientConfiguration = Codegen.ofNullable(vpnClientConfiguration);
            return this;
        }
        public Builder vpnGatewayGeneration(@Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration) {
            this.vpnGatewayGeneration = vpnGatewayGeneration;
            return this;
        }
        public Builder vpnGatewayGeneration(@Nullable Either<String,VpnGatewayGeneration> vpnGatewayGeneration) {
            this.vpnGatewayGeneration = Codegen.ofNullable(vpnGatewayGeneration);
            return this;
        }
        public Builder vpnType(@Nullable Output<Either<String,VpnType>> vpnType) {
            this.vpnType = vpnType;
            return this;
        }
        public Builder vpnType(@Nullable Either<String,VpnType> vpnType) {
            this.vpnType = Codegen.ofNullable(vpnType);
            return this;
        }        public VirtualNetworkGatewayArgs build() {
            return new VirtualNetworkGatewayArgs(activeActive, bgpSettings, customRoutes, enableBgp, enableDnsForwarding, enablePrivateIpAddress, extendedLocation, gatewayDefaultSite, gatewayType, id, ipConfigurations, location, resourceGroupName, sku, tags, vNetExtendedLocationResourceId, virtualNetworkGatewayName, vpnClientConfiguration, vpnGatewayGeneration, vpnType);
        }
    }
}
