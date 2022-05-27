// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.appplatform.ServiceArgs;
import com.pulumi.azurenative.appplatform.outputs.ClusterResourcePropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.SkuResponse;
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
 * Service resource
 * API Version: 2020-07-01.
 * 
 * ## Example Usage
 * ### Services_CreateOrUpdate
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
 *         var service = new Service(&#34;service&#34;, ServiceArgs.builder()        
 *             .location(&#34;eastus&#34;)
 *             .properties()
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .serviceName(&#34;myservice&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;S0&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Standard&#34;)
 *             ))
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Services_CreateOrUpdate_VNetInjection
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
 *         var service = new Service(&#34;service&#34;, ServiceArgs.builder()        
 *             .location(&#34;eastus&#34;)
 *             .properties(Map.of(&#34;networkProfile&#34;, Map.ofEntries(
 *                 Map.entry(&#34;appNetworkResourceGroup&#34;, &#34;my-app-network-rg&#34;),
 *                 Map.entry(&#34;appSubnetId&#34;, &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVirtualNetwork/subnets/apps&#34;),
 *                 Map.entry(&#34;serviceCidr&#34;, &#34;10.8.0.0/16,10.244.0.0/16,10.245.0.1/16&#34;),
 *                 Map.entry(&#34;serviceRuntimeNetworkResourceGroup&#34;, &#34;my-service-runtime-network-rg&#34;),
 *                 Map.entry(&#34;serviceRuntimeSubnetId&#34;, &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVirtualNetwork/subnets/serviceRuntime&#34;)
 *             )))
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .serviceName(&#34;myservice&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;S0&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Standard&#34;)
 *             ))
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
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
 * $ pulumi import azure-native:appplatform:Service myservice /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * The GEO location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The GEO location of the resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of the Service resource
     * 
     */
    @Export(name="properties", type=ClusterResourcePropertiesResponse.class, parameters={})
    private Output<ClusterResourcePropertiesResponse> properties;

    /**
     * @return Properties of the Service resource
     * 
     */
    public Output<ClusterResourcePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Sku of the Service resource
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Sku of the Service resource
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Service", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:appplatform/v20200701:Service").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20201101preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20210601preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20210901preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20220101preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20220301preview:Service").build())
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
    public static Service get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
