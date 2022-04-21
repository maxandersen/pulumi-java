// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayIPConfigurationResponse;
import com.pulumi.azurenative.network.inputs.DelegationResponse;
import com.pulumi.azurenative.network.inputs.IPConfigurationProfileResponse;
import com.pulumi.azurenative.network.inputs.IPConfigurationResponse;
import com.pulumi.azurenative.network.inputs.NetworkSecurityGroupResponse;
import com.pulumi.azurenative.network.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.inputs.ResourceNavigationLinkResponse;
import com.pulumi.azurenative.network.inputs.RouteTableResponse;
import com.pulumi.azurenative.network.inputs.ServiceAssociationLinkResponse;
import com.pulumi.azurenative.network.inputs.ServiceEndpointPolicyResponse;
import com.pulumi.azurenative.network.inputs.ServiceEndpointPropertiesFormatResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subnet in a virtual network resource.
 * 
 */
public final class SubnetResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubnetResponse Empty = new SubnetResponse();

    /**
     * The address prefix for the subnet.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable String addressPrefix;

    public Optional<String> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * List of address prefixes for the subnet.
     * 
     */
    @Import(name="addressPrefixes")
    private @Nullable List<String> addressPrefixes;

    public Optional<List<String>> addressPrefixes() {
        return Optional.ofNullable(this.addressPrefixes);
    }

    /**
     * Application gateway IP configurations of virtual network resource.
     * 
     */
    @Import(name="applicationGatewayIpConfigurations")
    private @Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations;

    public Optional<List<ApplicationGatewayIPConfigurationResponse>> applicationGatewayIpConfigurations() {
        return Optional.ofNullable(this.applicationGatewayIpConfigurations);
    }

    /**
     * An array of references to the delegations on the subnet.
     * 
     */
    @Import(name="delegations")
    private @Nullable List<DelegationResponse> delegations;

    public Optional<List<DelegationResponse>> delegations() {
        return Optional.ofNullable(this.delegations);
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
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Array of IpAllocation which reference this subnet.
     * 
     */
    @Import(name="ipAllocations")
    private @Nullable List<SubResourceResponse> ipAllocations;

    public Optional<List<SubResourceResponse>> ipAllocations() {
        return Optional.ofNullable(this.ipAllocations);
    }

    /**
     * Array of IP configuration profiles which reference this subnet.
     * 
     */
    @Import(name="ipConfigurationProfiles", required=true)
    private List<IPConfigurationProfileResponse> ipConfigurationProfiles;

    public List<IPConfigurationProfileResponse> ipConfigurationProfiles() {
        return this.ipConfigurationProfiles;
    }

    /**
     * An array of references to the network interface IP configurations using subnet.
     * 
     */
    @Import(name="ipConfigurations", required=true)
    private List<IPConfigurationResponse> ipConfigurations;

    public List<IPConfigurationResponse> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Nat gateway associated with this subnet.
     * 
     */
    @Import(name="natGateway")
    private @Nullable SubResourceResponse natGateway;

    public Optional<SubResourceResponse> natGateway() {
        return Optional.ofNullable(this.natGateway);
    }

    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Import(name="networkSecurityGroup")
    private @Nullable NetworkSecurityGroupResponse networkSecurityGroup;

    public Optional<NetworkSecurityGroupResponse> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    @Import(name="privateEndpointNetworkPolicies")
    private @Nullable String privateEndpointNetworkPolicies;

    public Optional<String> privateEndpointNetworkPolicies() {
        return Optional.ofNullable(this.privateEndpointNetworkPolicies);
    }

    /**
     * An array of references to private endpoints.
     * 
     */
    @Import(name="privateEndpoints", required=true)
    private List<PrivateEndpointResponse> privateEndpoints;

    public List<PrivateEndpointResponse> privateEndpoints() {
        return this.privateEndpoints;
    }

    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    @Import(name="privateLinkServiceNetworkPolicies")
    private @Nullable String privateLinkServiceNetworkPolicies;

    public Optional<String> privateLinkServiceNetworkPolicies() {
        return Optional.ofNullable(this.privateLinkServiceNetworkPolicies);
    }

    /**
     * The provisioning state of the subnet resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * A read-only string identifying the intention of use for this subnet based on delegations and other user-defined properties.
     * 
     */
    @Import(name="purpose", required=true)
    private String purpose;

    public String purpose() {
        return this.purpose;
    }

    /**
     * An array of references to the external resources using subnet.
     * 
     */
    @Import(name="resourceNavigationLinks", required=true)
    private List<ResourceNavigationLinkResponse> resourceNavigationLinks;

    public List<ResourceNavigationLinkResponse> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * The reference to the RouteTable resource.
     * 
     */
    @Import(name="routeTable")
    private @Nullable RouteTableResponse routeTable;

    public Optional<RouteTableResponse> routeTable() {
        return Optional.ofNullable(this.routeTable);
    }

    /**
     * An array of references to services injecting into this subnet.
     * 
     */
    @Import(name="serviceAssociationLinks", required=true)
    private List<ServiceAssociationLinkResponse> serviceAssociationLinks;

    public List<ServiceAssociationLinkResponse> serviceAssociationLinks() {
        return this.serviceAssociationLinks;
    }

    /**
     * An array of service endpoint policies.
     * 
     */
    @Import(name="serviceEndpointPolicies")
    private @Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies;

    public Optional<List<ServiceEndpointPolicyResponse>> serviceEndpointPolicies() {
        return Optional.ofNullable(this.serviceEndpointPolicies);
    }

    /**
     * An array of service endpoints.
     * 
     */
    @Import(name="serviceEndpoints")
    private @Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints;

    public Optional<List<ServiceEndpointPropertiesFormatResponse>> serviceEndpoints() {
        return Optional.ofNullable(this.serviceEndpoints);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private SubnetResponse() {}

    private SubnetResponse(SubnetResponse $) {
        this.addressPrefix = $.addressPrefix;
        this.addressPrefixes = $.addressPrefixes;
        this.applicationGatewayIpConfigurations = $.applicationGatewayIpConfigurations;
        this.delegations = $.delegations;
        this.etag = $.etag;
        this.id = $.id;
        this.ipAllocations = $.ipAllocations;
        this.ipConfigurationProfiles = $.ipConfigurationProfiles;
        this.ipConfigurations = $.ipConfigurations;
        this.name = $.name;
        this.natGateway = $.natGateway;
        this.networkSecurityGroup = $.networkSecurityGroup;
        this.privateEndpointNetworkPolicies = $.privateEndpointNetworkPolicies;
        this.privateEndpoints = $.privateEndpoints;
        this.privateLinkServiceNetworkPolicies = $.privateLinkServiceNetworkPolicies;
        this.provisioningState = $.provisioningState;
        this.purpose = $.purpose;
        this.resourceNavigationLinks = $.resourceNavigationLinks;
        this.routeTable = $.routeTable;
        this.serviceAssociationLinks = $.serviceAssociationLinks;
        this.serviceEndpointPolicies = $.serviceEndpointPolicies;
        this.serviceEndpoints = $.serviceEndpoints;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetResponse $;

        public Builder() {
            $ = new SubnetResponse();
        }

        public Builder(SubnetResponse defaults) {
            $ = new SubnetResponse(Objects.requireNonNull(defaults));
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        public Builder applicationGatewayIpConfigurations(@Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations) {
            $.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
            return this;
        }

        public Builder applicationGatewayIpConfigurations(ApplicationGatewayIPConfigurationResponse... applicationGatewayIpConfigurations) {
            return applicationGatewayIpConfigurations(List.of(applicationGatewayIpConfigurations));
        }

        public Builder delegations(@Nullable List<DelegationResponse> delegations) {
            $.delegations = delegations;
            return this;
        }

        public Builder delegations(DelegationResponse... delegations) {
            return delegations(List.of(delegations));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder ipAllocations(@Nullable List<SubResourceResponse> ipAllocations) {
            $.ipAllocations = ipAllocations;
            return this;
        }

        public Builder ipAllocations(SubResourceResponse... ipAllocations) {
            return ipAllocations(List.of(ipAllocations));
        }

        public Builder ipConfigurationProfiles(List<IPConfigurationProfileResponse> ipConfigurationProfiles) {
            $.ipConfigurationProfiles = ipConfigurationProfiles;
            return this;
        }

        public Builder ipConfigurationProfiles(IPConfigurationProfileResponse... ipConfigurationProfiles) {
            return ipConfigurationProfiles(List.of(ipConfigurationProfiles));
        }

        public Builder ipConfigurations(List<IPConfigurationResponse> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(IPConfigurationResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder natGateway(@Nullable SubResourceResponse natGateway) {
            $.natGateway = natGateway;
            return this;
        }

        public Builder networkSecurityGroup(@Nullable NetworkSecurityGroupResponse networkSecurityGroup) {
            $.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder privateEndpointNetworkPolicies(@Nullable String privateEndpointNetworkPolicies) {
            $.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
            return this;
        }

        public Builder privateEndpoints(List<PrivateEndpointResponse> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder privateEndpoints(PrivateEndpointResponse... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        public Builder privateLinkServiceNetworkPolicies(@Nullable String privateLinkServiceNetworkPolicies) {
            $.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder purpose(String purpose) {
            $.purpose = purpose;
            return this;
        }

        public Builder resourceNavigationLinks(List<ResourceNavigationLinkResponse> resourceNavigationLinks) {
            $.resourceNavigationLinks = resourceNavigationLinks;
            return this;
        }

        public Builder resourceNavigationLinks(ResourceNavigationLinkResponse... resourceNavigationLinks) {
            return resourceNavigationLinks(List.of(resourceNavigationLinks));
        }

        public Builder routeTable(@Nullable RouteTableResponse routeTable) {
            $.routeTable = routeTable;
            return this;
        }

        public Builder serviceAssociationLinks(List<ServiceAssociationLinkResponse> serviceAssociationLinks) {
            $.serviceAssociationLinks = serviceAssociationLinks;
            return this;
        }

        public Builder serviceAssociationLinks(ServiceAssociationLinkResponse... serviceAssociationLinks) {
            return serviceAssociationLinks(List.of(serviceAssociationLinks));
        }

        public Builder serviceEndpointPolicies(@Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies) {
            $.serviceEndpointPolicies = serviceEndpointPolicies;
            return this;
        }

        public Builder serviceEndpointPolicies(ServiceEndpointPolicyResponse... serviceEndpointPolicies) {
            return serviceEndpointPolicies(List.of(serviceEndpointPolicies));
        }

        public Builder serviceEndpoints(@Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints) {
            $.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public Builder serviceEndpoints(ServiceEndpointPropertiesFormatResponse... serviceEndpoints) {
            return serviceEndpoints(List.of(serviceEndpoints));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public SubnetResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.ipConfigurationProfiles = Objects.requireNonNull($.ipConfigurationProfiles, "expected parameter 'ipConfigurationProfiles' to be non-null");
            $.ipConfigurations = Objects.requireNonNull($.ipConfigurations, "expected parameter 'ipConfigurations' to be non-null");
            $.privateEndpointNetworkPolicies = Codegen.stringProp("privateEndpointNetworkPolicies").arg($.privateEndpointNetworkPolicies).def("Enabled").getNullable();
            $.privateEndpoints = Objects.requireNonNull($.privateEndpoints, "expected parameter 'privateEndpoints' to be non-null");
            $.privateLinkServiceNetworkPolicies = Codegen.stringProp("privateLinkServiceNetworkPolicies").arg($.privateLinkServiceNetworkPolicies).def("Enabled").getNullable();
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.purpose = Objects.requireNonNull($.purpose, "expected parameter 'purpose' to be non-null");
            $.resourceNavigationLinks = Objects.requireNonNull($.resourceNavigationLinks, "expected parameter 'resourceNavigationLinks' to be non-null");
            $.serviceAssociationLinks = Objects.requireNonNull($.serviceAssociationLinks, "expected parameter 'serviceAssociationLinks' to be non-null");
            return $;
        }
    }

}
