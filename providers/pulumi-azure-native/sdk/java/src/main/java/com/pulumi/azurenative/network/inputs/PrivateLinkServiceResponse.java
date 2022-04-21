// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.inputs.FrontendIPConfigurationResponse;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.network.inputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceIpConfigurationResponse;
import com.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesResponseAutoApproval;
import com.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesResponseVisibility;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private link service resource.
 * 
 */
public final class PrivateLinkServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceResponse Empty = new PrivateLinkServiceResponse();

    /**
     * The alias of the private link service.
     * 
     */
    @Import(name="alias", required=true)
    private String alias;

    public String alias() {
        return this.alias;
    }

    /**
     * The auto-approval list of the private link service.
     * 
     */
    @Import(name="autoApproval")
    private @Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval;

    public Optional<PrivateLinkServicePropertiesResponseAutoApproval> autoApproval() {
        return Optional.ofNullable(this.autoApproval);
    }

    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    @Import(name="enableProxyProtocol")
    private @Nullable Boolean enableProxyProtocol;

    public Optional<Boolean> enableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable ExtendedLocationResponse extendedLocation;

    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The list of Fqdn.
     * 
     */
    @Import(name="fqdns")
    private @Nullable List<String> fqdns;

    public Optional<List<String>> fqdns() {
        return Optional.ofNullable(this.fqdns);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An array of private link service IP configurations.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations;

    public Optional<List<PrivateLinkServiceIpConfigurationResponse>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    @Import(name="loadBalancerFrontendIpConfigurations")
    private @Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations;

    public Optional<List<FrontendIPConfigurationResponse>> loadBalancerFrontendIpConfigurations() {
        return Optional.ofNullable(this.loadBalancerFrontendIpConfigurations);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * An array of references to the network interfaces created for this private link service.
     * 
     */
    @Import(name="networkInterfaces", required=true)
    private List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * An array of list about connections to the private endpoint.
     * 
     */
    @Import(name="privateEndpointConnections", required=true)
    private List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The provisioning state of the private link service resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The visibility list of the private link service.
     * 
     */
    @Import(name="visibility")
    private @Nullable PrivateLinkServicePropertiesResponseVisibility visibility;

    public Optional<PrivateLinkServicePropertiesResponseVisibility> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private PrivateLinkServiceResponse() {}

    private PrivateLinkServiceResponse(PrivateLinkServiceResponse $) {
        this.alias = $.alias;
        this.autoApproval = $.autoApproval;
        this.enableProxyProtocol = $.enableProxyProtocol;
        this.etag = $.etag;
        this.extendedLocation = $.extendedLocation;
        this.fqdns = $.fqdns;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.loadBalancerFrontendIpConfigurations = $.loadBalancerFrontendIpConfigurations;
        this.location = $.location;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.privateEndpointConnections = $.privateEndpointConnections;
        this.provisioningState = $.provisioningState;
        this.tags = $.tags;
        this.type = $.type;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceResponse $;

        public Builder() {
            $ = new PrivateLinkServiceResponse();
        }

        public Builder(PrivateLinkServiceResponse defaults) {
            $ = new PrivateLinkServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder alias(String alias) {
            $.alias = alias;
            return this;
        }

        public Builder autoApproval(@Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval) {
            $.autoApproval = autoApproval;
            return this;
        }

        public Builder enableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            $.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder fqdns(@Nullable List<String> fqdns) {
            $.fqdns = fqdns;
            return this;
        }

        public Builder fqdns(String... fqdns) {
            return fqdns(List.of(fqdns));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder ipConfigurations(@Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(PrivateLinkServiceIpConfigurationResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder loadBalancerFrontendIpConfigurations(@Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations) {
            $.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
            return this;
        }

        public Builder loadBalancerFrontendIpConfigurations(FrontendIPConfigurationResponse... loadBalancerFrontendIpConfigurations) {
            return loadBalancerFrontendIpConfigurations(List.of(loadBalancerFrontendIpConfigurations));
        }

        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder visibility(@Nullable PrivateLinkServicePropertiesResponseVisibility visibility) {
            $.visibility = visibility;
            return this;
        }

        public PrivateLinkServiceResponse build() {
            $.alias = Objects.requireNonNull($.alias, "expected parameter 'alias' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.networkInterfaces = Objects.requireNonNull($.networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
            $.privateEndpointConnections = Objects.requireNonNull($.privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
