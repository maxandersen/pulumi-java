// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociationArgs;
import com.pulumi.azure.network.inputs.NetworkInterfaceBackendAddressPoolAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages the association between a Network Interface and a Load Balancer&#39;s Backend Address Pool.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Static&#34;)
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .frontendIpConfigurations(LoadBalancerFrontendIpConfiguration.builder()
 *                 .name(&#34;primary&#34;)
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .build())
 *             .build());
 * 
 *         var exampleBackendAddressPool = new BackendAddressPool(&#34;exampleBackendAddressPool&#34;, BackendAddressPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .loadbalancerId(exampleLoadBalancer.getId())
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .ipConfigurations(NetworkInterfaceIpConfiguration.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .subnetId(exampleSubnet.getId())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleNetworkInterfaceBackendAddressPoolAssociation = new NetworkInterfaceBackendAddressPoolAssociation(&#34;exampleNetworkInterfaceBackendAddressPoolAssociation&#34;, NetworkInterfaceBackendAddressPoolAssociationArgs.builder()        
 *             .networkInterfaceId(exampleNetworkInterface.getId())
 *             .ipConfigurationName(&#34;testconfiguration1&#34;)
 *             .backendAddressPoolId(exampleBackendAddressPool.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Associations between Network Interfaces and Load Balancer Backend Address Pools can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/networkInterfaceBackendAddressPoolAssociation:NetworkInterfaceBackendAddressPoolAssociation association1 &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.network/networkInterfaces/nic1/ipConfigurations/example|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/lb1/backendAddressPools/pool1&#34;
 * ```
 * 
 */
@ResourceType(type="azure:network/networkInterfaceBackendAddressPoolAssociation:NetworkInterfaceBackendAddressPoolAssociation")
public class NetworkInterfaceBackendAddressPoolAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Load Balancer Backend Address Pool which this Network Interface should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="backendAddressPoolId", type=String.class, parameters={})
    private Output<String> backendAddressPoolId;

    /**
     * @return The ID of the Load Balancer Backend Address Pool which this Network Interface should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> backendAddressPoolId() {
        return this.backendAddressPoolId;
    }
    /**
     * The Name of the IP Configuration within the Network Interface which should be connected to the Backend Address Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ipConfigurationName", type=String.class, parameters={})
    private Output<String> ipConfigurationName;

    /**
     * @return The Name of the IP Configuration within the Network Interface which should be connected to the Backend Address Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> ipConfigurationName() {
        return this.ipConfigurationName;
    }
    /**
     * The ID of the Network Interface. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the Network Interface. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterfaceBackendAddressPoolAssociation(String name) {
        this(name, NetworkInterfaceBackendAddressPoolAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterfaceBackendAddressPoolAssociation(String name, NetworkInterfaceBackendAddressPoolAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterfaceBackendAddressPoolAssociation(String name, NetworkInterfaceBackendAddressPoolAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkInterfaceBackendAddressPoolAssociation:NetworkInterfaceBackendAddressPoolAssociation", name, args == null ? NetworkInterfaceBackendAddressPoolAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInterfaceBackendAddressPoolAssociation(String name, Output<String> id, @Nullable NetworkInterfaceBackendAddressPoolAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkInterfaceBackendAddressPoolAssociation:NetworkInterfaceBackendAddressPoolAssociation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkInterfaceBackendAddressPoolAssociation get(String name, Output<String> id, @Nullable NetworkInterfaceBackendAddressPoolAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterfaceBackendAddressPoolAssociation(name, id, state, options);
    }
}
