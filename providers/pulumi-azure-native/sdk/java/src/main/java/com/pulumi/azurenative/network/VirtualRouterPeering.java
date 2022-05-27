// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.VirtualRouterPeeringArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Virtual Router Peering resource.
 * API Version: 2021-08-01.
 * 
 * ## Example Usage
 * ### Create Virtual Router Peering
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
 *         var virtualRouterPeering = new VirtualRouterPeering(&#34;virtualRouterPeering&#34;, VirtualRouterPeeringArgs.builder()        
 *             .peerAsn(20000)
 *             .peerIp(&#34;192.168.1.5&#34;)
 *             .peeringName(&#34;peering1&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .virtualRouterName(&#34;virtualRouter&#34;)
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
 * $ pulumi import azure-native:network:VirtualRouterPeering peering1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualRouters/virtualRouter/peerings/peering1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualRouterPeering")
public class VirtualRouterPeering extends com.pulumi.resources.CustomResource {
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
     * Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Peer ASN.
     * 
     */
    @Export(name="peerAsn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> peerAsn;

    /**
     * @return Peer ASN.
     * 
     */
    public Output<Optional<Double>> peerAsn() {
        return Codegen.optional(this.peerAsn);
    }
    /**
     * Peer IP.
     * 
     */
    @Export(name="peerIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerIp;

    /**
     * @return Peer IP.
     * 
     */
    public Output<Optional<String>> peerIp() {
        return Codegen.optional(this.peerIp);
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Peering type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Peering type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualRouterPeering(String name) {
        this(name, VirtualRouterPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualRouterPeering(String name, VirtualRouterPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualRouterPeering(String name, VirtualRouterPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualRouterPeering", name, args == null ? VirtualRouterPeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualRouterPeering(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualRouterPeering", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190701:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualRouterPeering").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:VirtualRouterPeering").build())
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
    public static VirtualRouterPeering get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualRouterPeering(name, id, options);
    }
}
