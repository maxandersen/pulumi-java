// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.lb.OutboundRuleArgs;
import com.pulumi.azure.lb.inputs.OutboundRuleState;
import com.pulumi.azure.lb.outputs.OutboundRuleFrontendIpConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Load Balancer Outbound Rule.
 * 
 * &gt; **NOTE** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration and a Backend Address Pool Attached.
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
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Static&#34;)
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .frontendIpConfigurations(LoadBalancerFrontendIpConfiguration.builder()
 *                 .name(&#34;PublicIPAddress&#34;)
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .build())
 *             .build());
 * 
 *         var exampleBackendAddressPool = new BackendAddressPool(&#34;exampleBackendAddressPool&#34;, BackendAddressPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .loadbalancerId(exampleLoadBalancer.getId())
 *             .build());
 * 
 *         var exampleOutboundRule = new OutboundRule(&#34;exampleOutboundRule&#34;, OutboundRuleArgs.builder()        
 *             .loadbalancerId(exampleLoadBalancer.getId())
 *             .protocol(&#34;Tcp&#34;)
 *             .backendAddressPoolId(exampleBackendAddressPool.getId())
 *             .frontendIpConfigurations(OutboundRuleFrontendIpConfiguration.builder()
 *                 .name(&#34;PublicIPAddress&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load Balancer Outbound Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:lb/outboundRule:OutboundRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/lb1/outboundRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:lb/outboundRule:OutboundRule")
public class OutboundRule extends com.pulumi.resources.CustomResource {
    /**
     * The number of outbound ports to be used for NAT. Defaults to `1024`.
     * 
     */
    @Export(name="allocatedOutboundPorts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> allocatedOutboundPorts;

    /**
     * @return The number of outbound ports to be used for NAT. Defaults to `1024`.
     * 
     */
    public Output<Optional<Integer>> allocatedOutboundPorts() {
        return Codegen.optional(this.allocatedOutboundPorts);
    }
    /**
     * The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Export(name="backendAddressPoolId", type=String.class, parameters={})
    private Output<String> backendAddressPoolId;

    /**
     * @return The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    public Output<String> backendAddressPoolId() {
        return this.backendAddressPoolId;
    }
    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Export(name="enableTcpReset", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableTcpReset;

    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Output<Optional<Boolean>> enableTcpReset() {
        return Codegen.optional(this.enableTcpReset);
    }
    /**
     * One or more `frontend_ip_configuration` blocks as defined below.
     * 
     */
    @Export(name="frontendIpConfigurations", type=List.class, parameters={OutboundRuleFrontendIpConfiguration.class})
    private Output</* @Nullable */ List<OutboundRuleFrontendIpConfiguration>> frontendIpConfigurations;

    /**
     * @return One or more `frontend_ip_configuration` blocks as defined below.
     * 
     */
    public Output<Optional<List<OutboundRuleFrontendIpConfiguration>>> frontendIpConfigurations() {
        return Codegen.optional(this.frontendIpConfigurations);
    }
    /**
     * The timeout for the TCP idle connection
     * 
     */
    @Export(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeoutInMinutes;

    /**
     * @return The timeout for the TCP idle connection
     * 
     */
    public Output<Optional<Integer>> idleTimeoutInMinutes() {
        return Codegen.optional(this.idleTimeoutInMinutes);
    }
    /**
     * The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="loadbalancerId", type=String.class, parameters={})
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OutboundRule(String name) {
        this(name, OutboundRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OutboundRule(String name, OutboundRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OutboundRule(String name, OutboundRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/outboundRule:OutboundRule", name, args == null ? OutboundRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OutboundRule(String name, Output<String> id, @Nullable OutboundRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/outboundRule:OutboundRule", name, state, makeResourceOptions(options, id));
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
    public static OutboundRule get(String name, Output<String> id, @Nullable OutboundRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OutboundRule(name, id, state, options);
    }
}
