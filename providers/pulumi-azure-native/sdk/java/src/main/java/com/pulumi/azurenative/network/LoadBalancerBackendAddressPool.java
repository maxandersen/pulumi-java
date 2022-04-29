// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.LoadBalancerBackendAddressPoolArgs;
import com.pulumi.azurenative.network.outputs.LoadBalancerBackendAddressResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Pool of backend IP addresses.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:LoadBalancerBackendAddressPool backend /subscriptions/subid/resourceGroups/testrg/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/backend 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:LoadBalancerBackendAddressPool")
public class LoadBalancerBackendAddressPool extends CustomResource {
    /**
     * An array of references to IP addresses defined in network interfaces.
     * 
     */
    @Export(name="backendIPConfigurations", type=List.class, parameters={NetworkInterfaceIPConfigurationResponse.class})
    private Output<List<NetworkInterfaceIPConfigurationResponse>> backendIPConfigurations;

    /**
     * @return An array of references to IP addresses defined in network interfaces.
     * 
     */
    public Output<List<NetworkInterfaceIPConfigurationResponse>> backendIPConfigurations() {
        return this.backendIPConfigurations;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * An array of backend addresses.
     * 
     */
    @Export(name="loadBalancerBackendAddresses", type=List.class, parameters={LoadBalancerBackendAddressResponse.class})
    private Output</* @Nullable */ List<LoadBalancerBackendAddressResponse>> loadBalancerBackendAddresses;

    /**
     * @return An array of backend addresses.
     * 
     */
    public Output<Optional<List<LoadBalancerBackendAddressResponse>>> loadBalancerBackendAddresses() {
        return Codegen.optional(this.loadBalancerBackendAddresses);
    }
    /**
     * An array of references to load balancing rules that use this backend address pool.
     * 
     */
    @Export(name="loadBalancingRules", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> loadBalancingRules;

    /**
     * @return An array of references to load balancing rules that use this backend address pool.
     * 
     */
    public Output<List<SubResourceResponse>> loadBalancingRules() {
        return this.loadBalancingRules;
    }
    /**
     * The location of the backend address pool.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the backend address pool.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * A reference to an outbound rule that uses this backend address pool.
     * 
     */
    @Export(name="outboundRule", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> outboundRule;

    /**
     * @return A reference to an outbound rule that uses this backend address pool.
     * 
     */
    public Output<SubResourceResponse> outboundRule() {
        return this.outboundRule;
    }
    /**
     * An array of references to outbound rules that use this backend address pool.
     * 
     */
    @Export(name="outboundRules", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> outboundRules;

    /**
     * @return An array of references to outbound rules that use this backend address pool.
     * 
     */
    public Output<List<SubResourceResponse>> outboundRules() {
        return this.outboundRules;
    }
    /**
     * The provisioning state of the backend address pool resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the backend address pool resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerBackendAddressPool(String name) {
        this(name, LoadBalancerBackendAddressPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerBackendAddressPool(String name, LoadBalancerBackendAddressPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerBackendAddressPool(String name, LoadBalancerBackendAddressPoolArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:LoadBalancerBackendAddressPool", name, args == null ? LoadBalancerBackendAddressPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerBackendAddressPool(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:LoadBalancerBackendAddressPool", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200401:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:LoadBalancerBackendAddressPool").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:LoadBalancerBackendAddressPool").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancerBackendAddressPool get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new LoadBalancerBackendAddressPool(name, id, options);
    }
}
