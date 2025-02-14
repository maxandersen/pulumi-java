// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RouterArgs;
import com.pulumi.gcp.compute.inputs.RouterState;
import com.pulumi.gcp.compute.outputs.RouterBgp;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a Router resource.
 * 
 * To get more information about Router, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * ### Router Basic
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
 *         var foobarNetwork = new Network(&#34;foobarNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var foobarRouter = new Router(&#34;foobarRouter&#34;, RouterArgs.builder()        
 *             .network(foobarNetwork.getName())
 *             .bgp(RouterBgp.builder()
 *                 .asn(64514)
 *                 .advertiseMode(&#34;CUSTOM&#34;)
 *                 .advertisedGroups(&#34;ALL_SUBNETS&#34;)
 *                 .advertisedIpRanges(                
 *                     RouterBgpAdvertisedIpRange.builder()
 *                         .range(&#34;1.2.3.4&#34;)
 *                         .build(),
 *                     RouterBgpAdvertisedIpRange.builder()
 *                         .range(&#34;6.7.0.0/16&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Compute Router Encrypted Interconnect
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
 *         var network = new Network(&#34;network&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var encrypted_interconnect_router = new Router(&#34;encrypted-interconnect-router&#34;, RouterArgs.builder()        
 *             .network(network.getName())
 *             .encryptedInterconnectRouter(true)
 *             .bgp(RouterBgp.builder()
 *                 .asn(64514)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Router can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default projects/{{project}}/regions/{{region}}/routers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/router:Router")
public class Router extends com.pulumi.resources.CustomResource {
    /**
     * BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    @Export(name="bgp", type=RouterBgp.class, parameters={})
    private Output</* @Nullable */ RouterBgp> bgp;

    /**
     * @return BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RouterBgp>> bgp() {
        return Codegen.optional(this.bgp);
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * User-specified description for the IP range.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User-specified description for the IP range.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    @Export(name="encryptedInterconnectRouter", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryptedInterconnectRouter;

    /**
     * @return Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    public Output<Optional<Boolean>> encryptedInterconnectRouter() {
        return Codegen.optional(this.encryptedInterconnectRouter);
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A reference to the network to which this router belongs.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return A reference to the network to which this router belongs.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Region where the router resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the router resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Router(String name) {
        this(name, RouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Router(String name, RouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Router(String name, RouterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/router:Router", name, args == null ? RouterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Router(String name, Output<String> id, @Nullable RouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/router:Router", name, state, makeResourceOptions(options, id));
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
    public static Router get(String name, Output<String> id, @Nullable RouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Router(name, id, state, options);
    }
}
