// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ExpressRouteCircuitArgs;
import com.pulumi.azurenative.network.outputs.ExpressRouteCircuitAuthorizationResponse;
import com.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringResponse;
import com.pulumi.azurenative.network.outputs.ExpressRouteCircuitServiceProviderPropertiesResponse;
import com.pulumi.azurenative.network.outputs.ExpressRouteCircuitSkuResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ExpressRouteCircuit resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create ExpressRouteCircuit
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
 *         var expressRouteCircuit = new ExpressRouteCircuit(&#34;expressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .allowClassicOperations(false)
 *             .authorizations()
 *             .circuitName(&#34;circuitName&#34;)
 *             .location(&#34;Brazil South&#34;)
 *             .peerings()
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceProviderProperties(Map.ofEntries(
 *                 Map.entry(&#34;bandwidthInMbps&#34;, 200),
 *                 Map.entry(&#34;peeringLocation&#34;, &#34;Silicon Valley&#34;),
 *                 Map.entry(&#34;serviceProviderName&#34;, &#34;Equinix&#34;)
 *             ))
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;family&#34;, &#34;MeteredData&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;Standard_MeteredData&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Standard&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create ExpressRouteCircuit on ExpressRoutePort
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
 *         var expressRouteCircuit = new ExpressRouteCircuit(&#34;expressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .bandwidthInGbps(10)
 *             .circuitName(&#34;expressRouteCircuit1&#34;)
 *             .expressRoutePort(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/expressRoutePorts/portName&#34;))
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;family&#34;, &#34;MeteredData&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;Premium_MeteredData&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Premium&#34;)
 *             ))
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
 * $ pulumi import azure-native:network:ExpressRouteCircuit expressRouteCircuit1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/expressRouteCircuits/expressRouteCircuit1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ExpressRouteCircuit")
public class ExpressRouteCircuit extends com.pulumi.resources.CustomResource {
    /**
     * Allow classic operations.
     * 
     */
    @Export(name="allowClassicOperations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowClassicOperations;

    /**
     * @return Allow classic operations.
     * 
     */
    public Output<Optional<Boolean>> allowClassicOperations() {
        return Codegen.optional(this.allowClassicOperations);
    }
    /**
     * The list of authorizations.
     * 
     */
    @Export(name="authorizations", type=List.class, parameters={ExpressRouteCircuitAuthorizationResponse.class})
    private Output</* @Nullable */ List<ExpressRouteCircuitAuthorizationResponse>> authorizations;

    /**
     * @return The list of authorizations.
     * 
     */
    public Output<Optional<List<ExpressRouteCircuitAuthorizationResponse>>> authorizations() {
        return Codegen.optional(this.authorizations);
    }
    /**
     * The bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource.
     * 
     */
    @Export(name="bandwidthInGbps", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> bandwidthInGbps;

    /**
     * @return The bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource.
     * 
     */
    public Output<Optional<Double>> bandwidthInGbps() {
        return Codegen.optional(this.bandwidthInGbps);
    }
    /**
     * The CircuitProvisioningState state of the resource.
     * 
     */
    @Export(name="circuitProvisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> circuitProvisioningState;

    /**
     * @return The CircuitProvisioningState state of the resource.
     * 
     */
    public Output<Optional<String>> circuitProvisioningState() {
        return Codegen.optional(this.circuitProvisioningState);
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
     * The reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource.
     * 
     */
    @Export(name="expressRoutePort", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> expressRoutePort;

    /**
     * @return The reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource.
     * 
     */
    public Output<Optional<SubResourceResponse>> expressRoutePort() {
        return Codegen.optional(this.expressRoutePort);
    }
    /**
     * The GatewayManager Etag.
     * 
     */
    @Export(name="gatewayManagerEtag", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayManagerEtag;

    /**
     * @return The GatewayManager Etag.
     * 
     */
    public Output<Optional<String>> gatewayManagerEtag() {
        return Codegen.optional(this.gatewayManagerEtag);
    }
    /**
     * Flag denoting global reach status.
     * 
     */
    @Export(name="globalReachEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> globalReachEnabled;

    /**
     * @return Flag denoting global reach status.
     * 
     */
    public Output<Optional<Boolean>> globalReachEnabled() {
        return Codegen.optional(this.globalReachEnabled);
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
     * The list of peerings.
     * 
     */
    @Export(name="peerings", type=List.class, parameters={ExpressRouteCircuitPeeringResponse.class})
    private Output</* @Nullable */ List<ExpressRouteCircuitPeeringResponse>> peerings;

    /**
     * @return The list of peerings.
     * 
     */
    public Output<Optional<List<ExpressRouteCircuitPeeringResponse>>> peerings() {
        return Codegen.optional(this.peerings);
    }
    /**
     * The provisioning state of the express route circuit resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the express route circuit resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The ServiceKey.
     * 
     */
    @Export(name="serviceKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceKey;

    /**
     * @return The ServiceKey.
     * 
     */
    public Output<Optional<String>> serviceKey() {
        return Codegen.optional(this.serviceKey);
    }
    /**
     * The ServiceProviderNotes.
     * 
     */
    @Export(name="serviceProviderNotes", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceProviderNotes;

    /**
     * @return The ServiceProviderNotes.
     * 
     */
    public Output<Optional<String>> serviceProviderNotes() {
        return Codegen.optional(this.serviceProviderNotes);
    }
    /**
     * The ServiceProviderProperties.
     * 
     */
    @Export(name="serviceProviderProperties", type=ExpressRouteCircuitServiceProviderPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ExpressRouteCircuitServiceProviderPropertiesResponse> serviceProviderProperties;

    /**
     * @return The ServiceProviderProperties.
     * 
     */
    public Output<Optional<ExpressRouteCircuitServiceProviderPropertiesResponse>> serviceProviderProperties() {
        return Codegen.optional(this.serviceProviderProperties);
    }
    /**
     * The ServiceProviderProvisioningState state of the resource.
     * 
     */
    @Export(name="serviceProviderProvisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceProviderProvisioningState;

    /**
     * @return The ServiceProviderProvisioningState state of the resource.
     * 
     */
    public Output<Optional<String>> serviceProviderProvisioningState() {
        return Codegen.optional(this.serviceProviderProvisioningState);
    }
    /**
     * The SKU.
     * 
     */
    @Export(name="sku", type=ExpressRouteCircuitSkuResponse.class, parameters={})
    private Output</* @Nullable */ ExpressRouteCircuitSkuResponse> sku;

    /**
     * @return The SKU.
     * 
     */
    public Output<Optional<ExpressRouteCircuitSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     * 
     */
    @Export(name="stag", type=Integer.class, parameters={})
    private Output<Integer> stag;

    /**
     * @return The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     * 
     */
    public Output<Integer> stag() {
        return this.stag;
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
    public ExpressRouteCircuit(String name) {
        this(name, ExpressRouteCircuitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteCircuit(String name, ExpressRouteCircuitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteCircuit(String name, ExpressRouteCircuitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteCircuit", name, args == null ? ExpressRouteCircuitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteCircuit(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteCircuit", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:ExpressRouteCircuit").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:ExpressRouteCircuit").build())
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
    public static ExpressRouteCircuit get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteCircuit(name, id, options);
    }
}
