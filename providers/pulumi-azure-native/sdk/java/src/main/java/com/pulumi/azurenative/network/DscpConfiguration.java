// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.DscpConfigurationArgs;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.network.outputs.QosIpRangeResponse;
import com.pulumi.azurenative.network.outputs.QosPortRangeResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * DSCP Configuration in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create DSCP Configuration
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
 *         var dscpConfiguration = new DscpConfiguration(&#34;dscpConfiguration&#34;, DscpConfigurationArgs.builder()        
 *             .destinationIpRanges(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;endIP&#34;, &#34;127.0.10.2&#34;),
 *                     Map.entry(&#34;startIP&#34;, &#34;127.0.10.1&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;endIP&#34;, &#34;127.0.11.2&#34;),
 *                     Map.entry(&#34;startIP&#34;, &#34;127.0.11.1&#34;)
 *                 ))
 *             .destinationPortRanges(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;end&#34;, 15),
 *                     Map.entry(&#34;start&#34;, 15)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;end&#34;, 27),
 *                     Map.entry(&#34;start&#34;, 26)
 *                 ))
 *             .dscpConfigurationName(&#34;mydscpconfig&#34;)
 *             .location(&#34;eastus&#34;)
 *             .markings(            
 *                 46,
 *                 10)
 *             .protocol(&#34;Tcp&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sourceIpRanges(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;endIP&#34;, &#34;127.0.0.2&#34;),
 *                     Map.entry(&#34;startIP&#34;, &#34;127.0.0.1&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;endIP&#34;, &#34;127.0.1.2&#34;),
 *                     Map.entry(&#34;startIP&#34;, &#34;127.0.1.1&#34;)
 *                 ))
 *             .sourcePortRanges(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;end&#34;, 11),
 *                     Map.entry(&#34;start&#34;, 10)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;end&#34;, 21),
 *                     Map.entry(&#34;start&#34;, 20)
 *                 ))
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
 * $ pulumi import azure-native:network:DscpConfiguration mydscpConfig /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/dscpConfiguration/mydscpConfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DscpConfiguration")
public class DscpConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    @Export(name="associatedNetworkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> associatedNetworkInterfaces;

    /**
     * @return Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> associatedNetworkInterfaces() {
        return this.associatedNetworkInterfaces;
    }
    /**
     * Destination IP ranges.
     * 
     */
    @Export(name="destinationIpRanges", type=List.class, parameters={QosIpRangeResponse.class})
    private Output</* @Nullable */ List<QosIpRangeResponse>> destinationIpRanges;

    /**
     * @return Destination IP ranges.
     * 
     */
    public Output<Optional<List<QosIpRangeResponse>>> destinationIpRanges() {
        return Codegen.optional(this.destinationIpRanges);
    }
    /**
     * Destination port ranges.
     * 
     */
    @Export(name="destinationPortRanges", type=List.class, parameters={QosPortRangeResponse.class})
    private Output</* @Nullable */ List<QosPortRangeResponse>> destinationPortRanges;

    /**
     * @return Destination port ranges.
     * 
     */
    public Output<Optional<List<QosPortRangeResponse>>> destinationPortRanges() {
        return Codegen.optional(this.destinationPortRanges);
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
     * List of markings to be used in the configuration.
     * 
     */
    @Export(name="markings", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> markings;

    /**
     * @return List of markings to be used in the configuration.
     * 
     */
    public Output<Optional<List<Integer>>> markings() {
        return Codegen.optional(this.markings);
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
     * RNM supported protocol types.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return RNM supported protocol types.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The provisioning state of the DSCP Configuration resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the DSCP Configuration resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Qos Collection ID generated by RNM.
     * 
     */
    @Export(name="qosCollectionId", type=String.class, parameters={})
    private Output<String> qosCollectionId;

    /**
     * @return Qos Collection ID generated by RNM.
     * 
     */
    public Output<String> qosCollectionId() {
        return this.qosCollectionId;
    }
    /**
     * The resource GUID property of the DSCP Configuration resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the DSCP Configuration resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Source IP ranges.
     * 
     */
    @Export(name="sourceIpRanges", type=List.class, parameters={QosIpRangeResponse.class})
    private Output</* @Nullable */ List<QosIpRangeResponse>> sourceIpRanges;

    /**
     * @return Source IP ranges.
     * 
     */
    public Output<Optional<List<QosIpRangeResponse>>> sourceIpRanges() {
        return Codegen.optional(this.sourceIpRanges);
    }
    /**
     * Sources port ranges.
     * 
     */
    @Export(name="sourcePortRanges", type=List.class, parameters={QosPortRangeResponse.class})
    private Output</* @Nullable */ List<QosPortRangeResponse>> sourcePortRanges;

    /**
     * @return Sources port ranges.
     * 
     */
    public Output<Optional<List<QosPortRangeResponse>>> sourcePortRanges() {
        return Codegen.optional(this.sourcePortRanges);
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
    public DscpConfiguration(String name) {
        this(name, DscpConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DscpConfiguration(String name, DscpConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DscpConfiguration(String name, DscpConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DscpConfiguration", name, args == null ? DscpConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DscpConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DscpConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200601:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:DscpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:DscpConfiguration").build())
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
    public static DscpConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DscpConfiguration(name, id, options);
    }
}
