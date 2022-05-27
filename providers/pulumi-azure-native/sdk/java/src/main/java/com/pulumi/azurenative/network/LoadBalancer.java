// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.LoadBalancerArgs;
import com.pulumi.azurenative.network.outputs.BackendAddressPoolResponse;
import com.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import com.pulumi.azurenative.network.outputs.InboundNatPoolResponse;
import com.pulumi.azurenative.network.outputs.InboundNatRuleResponse;
import com.pulumi.azurenative.network.outputs.LoadBalancerSkuResponse;
import com.pulumi.azurenative.network.outputs.LoadBalancingRuleResponse;
import com.pulumi.azurenative.network.outputs.OutboundRuleResponse;
import com.pulumi.azurenative.network.outputs.ProbeResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * LoadBalancer resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create load balancer
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools(Map.of(&#34;name&#34;, &#34;be-lb&#34;))
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb&#34;))
 *             ))
 *             .inboundNatPools()
 *             .inboundNatRules(Map.ofEntries(
 *                 Map.entry(&#34;backendPort&#34;, 3389),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;enableTcpReset&#34;, false),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 3389),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;in-nat-rule&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;backendPort&#34;, 80),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;enableTcpReset&#34;, false),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 80),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;loadDistribution&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;rulelb&#34;),
 *                 Map.entry(&#34;probe&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb&#34;)),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .probes(Map.ofEntries(
 *                 Map.entry(&#34;intervalInSeconds&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;probe-lb&#34;),
 *                 Map.entry(&#34;numberOfProbes&#34;, 2),
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;protocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;requestPath&#34;, &#34;healthcheck.aspx&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create load balancer with Frontend IP in Zone 1
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools(Map.of(&#34;name&#34;, &#34;be-lb&#34;))
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb&#34;)),
 *                 Map.entry(&#34;zones&#34;, &#34;1&#34;)
 *             ))
 *             .inboundNatPools()
 *             .inboundNatRules(Map.ofEntries(
 *                 Map.entry(&#34;backendPort&#34;, 3389),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 3389),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;in-nat-rule&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;backendPort&#34;, 80),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 80),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;loadDistribution&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;rulelb&#34;),
 *                 Map.entry(&#34;probe&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb&#34;)),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .outboundRules()
 *             .probes(Map.ofEntries(
 *                 Map.entry(&#34;intervalInSeconds&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;probe-lb&#34;),
 *                 Map.entry(&#34;numberOfProbes&#34;, 2),
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;protocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;requestPath&#34;, &#34;healthcheck.aspx&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Standard&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create load balancer with Global Tier and one regional load balancer in its backend pool
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools(Map.ofEntries(
 *                 Map.entry(&#34;loadBalancerBackendAddresses&#34;, Map.ofEntries(
 *                     Map.entry(&#34;loadBalancerFrontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/regional-lb-rg1/providers/Microsoft.Network/loadBalancers/regional-lb/frontendIPConfigurations/fe-rlb&#34;)),
 *                     Map.entry(&#34;name&#34;, &#34;regional-lb1-address&#34;)
 *                 )),
 *                 Map.entry(&#34;name&#34;, &#34;be-lb&#34;)
 *             ))
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb&#34;))
 *             ))
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;backendPort&#34;, 80),
 *                 Map.entry(&#34;enableFloatingIP&#34;, false),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 80),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;loadDistribution&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;rulelb&#34;),
 *                 Map.entry(&#34;probe&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb&#34;)),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .probes(Map.ofEntries(
 *                 Map.entry(&#34;intervalInSeconds&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;probe-lb&#34;),
 *                 Map.entry(&#34;numberOfProbes&#34;, 2),
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;protocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;requestPath&#34;, &#34;healthcheck.aspx&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;Standard&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Global&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create load balancer with Standard SKU
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools(Map.of(&#34;name&#34;, &#34;be-lb&#34;))
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb&#34;))
 *             ))
 *             .inboundNatPools()
 *             .inboundNatRules(Map.ofEntries(
 *                 Map.entry(&#34;backendPort&#34;, 3389),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 3389),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;in-nat-rule&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;backendPort&#34;, 80),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 80),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;loadDistribution&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;rulelb&#34;),
 *                 Map.entry(&#34;probe&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb&#34;)),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .outboundRules()
 *             .probes(Map.ofEntries(
 *                 Map.entry(&#34;intervalInSeconds&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;probe-lb&#34;),
 *                 Map.entry(&#34;numberOfProbes&#34;, 2),
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;protocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;requestPath&#34;, &#34;healthcheck.aspx&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Standard&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create load balancer with inbound nat pool
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools()
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/test&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;test&#34;),
 *                 Map.entry(&#34;privateIPAllocationMethod&#34;, &#34;Dynamic&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/lbvnet/subnets/lbsubnet&#34;)),
 *                 Map.entry(&#34;zones&#34;, )
 *             ))
 *             .inboundNatPools(Map.ofEntries(
 *                 Map.entry(&#34;backendPort&#34;, 8888),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;enableTcpReset&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/test&#34;)),
 *                 Map.entry(&#34;frontendPortRangeEnd&#34;, 8085),
 *                 Map.entry(&#34;frontendPortRangeStart&#34;, 8080),
 *                 Map.entry(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/inboundNatPools/test&#34;),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 10),
 *                 Map.entry(&#34;name&#34;, &#34;test&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .inboundNatRules()
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules()
 *             .location(&#34;eastus&#34;)
 *             .outboundRules()
 *             .probes()
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Standard&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create load balancer with outbound rules
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
 *         var loadBalancer = new LoadBalancer(&#34;loadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .backendAddressPools(Map.of(&#34;name&#34;, &#34;be-lb&#34;))
 *             .frontendIPConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;publicIPAddress&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pip&#34;))
 *             ))
 *             .inboundNatPools()
 *             .inboundNatRules(Map.ofEntries(
 *                 Map.entry(&#34;backendPort&#34;, 3389),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 3389),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;in-nat-rule&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .loadBalancerName(&#34;lb&#34;)
 *             .loadBalancingRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;backendPort&#34;, 80),
 *                 Map.entry(&#34;disableOutboundSnat&#34;, true),
 *                 Map.entry(&#34;enableFloatingIP&#34;, true),
 *                 Map.entry(&#34;frontendIPConfiguration&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;frontendPort&#34;, 80),
 *                 Map.entry(&#34;idleTimeoutInMinutes&#34;, 15),
 *                 Map.entry(&#34;loadDistribution&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;rulelb&#34;),
 *                 Map.entry(&#34;probe&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb&#34;)),
 *                 Map.entry(&#34;protocol&#34;, &#34;Tcp&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .outboundRules(Map.ofEntries(
 *                 Map.entry(&#34;backendAddressPool&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb&#34;)),
 *                 Map.entry(&#34;frontendIPConfigurations&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;)),
 *                 Map.entry(&#34;name&#34;, &#34;rule1&#34;),
 *                 Map.entry(&#34;protocol&#34;, &#34;All&#34;)
 *             ))
 *             .probes(Map.ofEntries(
 *                 Map.entry(&#34;intervalInSeconds&#34;, 15),
 *                 Map.entry(&#34;name&#34;, &#34;probe-lb&#34;),
 *                 Map.entry(&#34;numberOfProbes&#34;, 2),
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;protocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;requestPath&#34;, &#34;healthcheck.aspx&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Standard&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:LoadBalancer lb /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * Collection of backend address pools used by a load balancer.
     * 
     */
    @Export(name="backendAddressPools", type=List.class, parameters={BackendAddressPoolResponse.class})
    private Output</* @Nullable */ List<BackendAddressPoolResponse>> backendAddressPools;

    /**
     * @return Collection of backend address pools used by a load balancer.
     * 
     */
    public Output<Optional<List<BackendAddressPoolResponse>>> backendAddressPools() {
        return Codegen.optional(this.backendAddressPools);
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
     * The extended location of the load balancer.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the load balancer.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Object representing the frontend IPs to be used for the load balancer.
     * 
     */
    @Export(name="frontendIPConfigurations", type=List.class, parameters={FrontendIPConfigurationResponse.class})
    private Output</* @Nullable */ List<FrontendIPConfigurationResponse>> frontendIPConfigurations;

    /**
     * @return Object representing the frontend IPs to be used for the load balancer.
     * 
     */
    public Output<Optional<List<FrontendIPConfigurationResponse>>> frontendIPConfigurations() {
        return Codegen.optional(this.frontendIPConfigurations);
    }
    /**
     * Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    @Export(name="inboundNatPools", type=List.class, parameters={InboundNatPoolResponse.class})
    private Output</* @Nullable */ List<InboundNatPoolResponse>> inboundNatPools;

    /**
     * @return Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    public Output<Optional<List<InboundNatPoolResponse>>> inboundNatPools() {
        return Codegen.optional(this.inboundNatPools);
    }
    /**
     * Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    @Export(name="inboundNatRules", type=List.class, parameters={InboundNatRuleResponse.class})
    private Output</* @Nullable */ List<InboundNatRuleResponse>> inboundNatRules;

    /**
     * @return Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    public Output<Optional<List<InboundNatRuleResponse>>> inboundNatRules() {
        return Codegen.optional(this.inboundNatRules);
    }
    /**
     * Object collection representing the load balancing rules Gets the provisioning.
     * 
     */
    @Export(name="loadBalancingRules", type=List.class, parameters={LoadBalancingRuleResponse.class})
    private Output</* @Nullable */ List<LoadBalancingRuleResponse>> loadBalancingRules;

    /**
     * @return Object collection representing the load balancing rules Gets the provisioning.
     * 
     */
    public Output<Optional<List<LoadBalancingRuleResponse>>> loadBalancingRules() {
        return Codegen.optional(this.loadBalancingRules);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The outbound rules.
     * 
     */
    @Export(name="outboundRules", type=List.class, parameters={OutboundRuleResponse.class})
    private Output</* @Nullable */ List<OutboundRuleResponse>> outboundRules;

    /**
     * @return The outbound rules.
     * 
     */
    public Output<Optional<List<OutboundRuleResponse>>> outboundRules() {
        return Codegen.optional(this.outboundRules);
    }
    /**
     * Collection of probe objects used in the load balancer.
     * 
     */
    @Export(name="probes", type=List.class, parameters={ProbeResponse.class})
    private Output</* @Nullable */ List<ProbeResponse>> probes;

    /**
     * @return Collection of probe objects used in the load balancer.
     * 
     */
    public Output<Optional<List<ProbeResponse>>> probes() {
        return Codegen.optional(this.probes);
    }
    /**
     * The provisioning state of the load balancer resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the load balancer resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the load balancer resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the load balancer resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The load balancer SKU.
     * 
     */
    @Export(name="sku", type=LoadBalancerSkuResponse.class, parameters={})
    private Output</* @Nullable */ LoadBalancerSkuResponse> sku;

    /**
     * @return The load balancer SKU.
     * 
     */
    public Output<Optional<LoadBalancerSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:LoadBalancer", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:LoadBalancer").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:LoadBalancer").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, options);
    }
}
