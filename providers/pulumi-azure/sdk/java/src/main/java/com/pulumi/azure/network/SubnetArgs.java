// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * The address prefixes to use for the subnet.
     * 
     */
    @Import(name="addressPrefixes", required=true)
    private Output<List<String>> addressPrefixes;

    /**
     * @return The address prefixes to use for the subnet.
     * 
     */
    public Output<List<String>> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * One or more `delegation` blocks as defined below.
     * 
     */
    @Import(name="delegations")
    private @Nullable Output<List<SubnetDelegationArgs>> delegations;

    /**
     * @return One or more `delegation` blocks as defined below.
     * 
     */
    public Optional<Output<List<SubnetDelegationArgs>>> delegations() {
        return Optional.ofNullable(this.delegations);
    }

    /**
     * Enable or Disable network policies for the private link endpoint on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
     * 
     */
    @Import(name="enforcePrivateLinkEndpointNetworkPolicies")
    private @Nullable Output<Boolean> enforcePrivateLinkEndpointNetworkPolicies;

    /**
     * @return Enable or Disable network policies for the private link endpoint on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> enforcePrivateLinkEndpointNetworkPolicies() {
        return Optional.ofNullable(this.enforcePrivateLinkEndpointNetworkPolicies);
    }

    /**
     * Enable or Disable network policies for the private link service on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
     * 
     */
    @Import(name="enforcePrivateLinkServiceNetworkPolicies")
    private @Nullable Output<Boolean> enforcePrivateLinkServiceNetworkPolicies;

    /**
     * @return Enable or Disable network policies for the private link service on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> enforcePrivateLinkServiceNetworkPolicies() {
        return Optional.ofNullable(this.enforcePrivateLinkServiceNetworkPolicies);
    }

    /**
     * The name of the subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the subnet. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of IDs of Service Endpoint Policies to associate with the subnet.
     * 
     */
    @Import(name="serviceEndpointPolicyIds")
    private @Nullable Output<List<String>> serviceEndpointPolicyIds;

    /**
     * @return The list of IDs of Service Endpoint Policies to associate with the subnet.
     * 
     */
    public Optional<Output<List<String>>> serviceEndpointPolicyIds() {
        return Optional.ofNullable(this.serviceEndpointPolicyIds);
    }

    /**
     * The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage` and `Microsoft.Web`.
     * 
     */
    @Import(name="serviceEndpoints")
    private @Nullable Output<List<String>> serviceEndpoints;

    /**
     * @return The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage` and `Microsoft.Web`.
     * 
     */
    public Optional<Output<List<String>>> serviceEndpoints() {
        return Optional.ofNullable(this.serviceEndpoints);
    }

    /**
     * The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private Output<String> virtualNetworkName;

    /**
     * @return The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private SubnetArgs() {}

    private SubnetArgs(SubnetArgs $) {
        this.addressPrefixes = $.addressPrefixes;
        this.delegations = $.delegations;
        this.enforcePrivateLinkEndpointNetworkPolicies = $.enforcePrivateLinkEndpointNetworkPolicies;
        this.enforcePrivateLinkServiceNetworkPolicies = $.enforcePrivateLinkServiceNetworkPolicies;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceEndpointPolicyIds = $.serviceEndpointPolicyIds;
        this.serviceEndpoints = $.serviceEndpoints;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetArgs $;

        public Builder() {
            $ = new SubnetArgs();
        }

        public Builder(SubnetArgs defaults) {
            $ = new SubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes The address prefixes to use for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes The address prefixes to use for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes The address prefixes to use for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param delegations One or more `delegation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder delegations(@Nullable Output<List<SubnetDelegationArgs>> delegations) {
            $.delegations = delegations;
            return this;
        }

        /**
         * @param delegations One or more `delegation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder delegations(List<SubnetDelegationArgs> delegations) {
            return delegations(Output.of(delegations));
        }

        /**
         * @param delegations One or more `delegation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder delegations(SubnetDelegationArgs... delegations) {
            return delegations(List.of(delegations));
        }

        /**
         * @param enforcePrivateLinkEndpointNetworkPolicies Enable or Disable network policies for the private link endpoint on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforcePrivateLinkEndpointNetworkPolicies(@Nullable Output<Boolean> enforcePrivateLinkEndpointNetworkPolicies) {
            $.enforcePrivateLinkEndpointNetworkPolicies = enforcePrivateLinkEndpointNetworkPolicies;
            return this;
        }

        /**
         * @param enforcePrivateLinkEndpointNetworkPolicies Enable or Disable network policies for the private link endpoint on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforcePrivateLinkEndpointNetworkPolicies(Boolean enforcePrivateLinkEndpointNetworkPolicies) {
            return enforcePrivateLinkEndpointNetworkPolicies(Output.of(enforcePrivateLinkEndpointNetworkPolicies));
        }

        /**
         * @param enforcePrivateLinkServiceNetworkPolicies Enable or Disable network policies for the private link service on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforcePrivateLinkServiceNetworkPolicies(@Nullable Output<Boolean> enforcePrivateLinkServiceNetworkPolicies) {
            $.enforcePrivateLinkServiceNetworkPolicies = enforcePrivateLinkServiceNetworkPolicies;
            return this;
        }

        /**
         * @param enforcePrivateLinkServiceNetworkPolicies Enable or Disable network policies for the private link service on the subnet. Setting this to `true` will **Disable** the policy and setting this to `false` will **Enable** the policy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforcePrivateLinkServiceNetworkPolicies(Boolean enforcePrivateLinkServiceNetworkPolicies) {
            return enforcePrivateLinkServiceNetworkPolicies(Output.of(enforcePrivateLinkServiceNetworkPolicies));
        }

        /**
         * @param name The name of the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceEndpointPolicyIds The list of IDs of Service Endpoint Policies to associate with the subnet.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyIds(@Nullable Output<List<String>> serviceEndpointPolicyIds) {
            $.serviceEndpointPolicyIds = serviceEndpointPolicyIds;
            return this;
        }

        /**
         * @param serviceEndpointPolicyIds The list of IDs of Service Endpoint Policies to associate with the subnet.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyIds(List<String> serviceEndpointPolicyIds) {
            return serviceEndpointPolicyIds(Output.of(serviceEndpointPolicyIds));
        }

        /**
         * @param serviceEndpointPolicyIds The list of IDs of Service Endpoint Policies to associate with the subnet.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyIds(String... serviceEndpointPolicyIds) {
            return serviceEndpointPolicyIds(List.of(serviceEndpointPolicyIds));
        }

        /**
         * @param serviceEndpoints The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage` and `Microsoft.Web`.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(@Nullable Output<List<String>> serviceEndpoints) {
            $.serviceEndpoints = serviceEndpoints;
            return this;
        }

        /**
         * @param serviceEndpoints The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage` and `Microsoft.Web`.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(List<String> serviceEndpoints) {
            return serviceEndpoints(Output.of(serviceEndpoints));
        }

        /**
         * @param serviceEndpoints The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage` and `Microsoft.Web`.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(String... serviceEndpoints) {
            return serviceEndpoints(List.of(serviceEndpoints));
        }

        /**
         * @param virtualNetworkName The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkName The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public SubnetArgs build() {
            $.addressPrefixes = Objects.requireNonNull($.addressPrefixes, "expected parameter 'addressPrefixes' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            return $;
        }
    }

}
