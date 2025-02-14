// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.netapp.PoolArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Capacity pool resource
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:Pool account1/pool1 /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:Pool")
public class Pool extends com.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * UUID v4 used to identify the Pool
     * 
     */
    @Export(name="poolId", type=String.class, parameters={})
    private Output<String> poolId;

    /**
     * @return UUID v4 used to identify the Pool
     * 
     */
    public Output<String> poolId() {
        return this.poolId;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The qos type of the pool
     * 
     */
    @Export(name="qosType", type=String.class, parameters={})
    private Output</* @Nullable */ String> qosType;

    /**
     * @return The qos type of the pool
     * 
     */
    public Output<Optional<String>> qosType() {
        return Codegen.optional(this.qosType);
    }
    /**
     * The service level of the file system
     * 
     */
    @Export(name="serviceLevel", type=String.class, parameters={})
    private Output<String> serviceLevel;

    /**
     * @return The service level of the file system
     * 
     */
    public Output<String> serviceLevel() {
        return this.serviceLevel;
    }
    /**
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    @Export(name="size", type=Double.class, parameters={})
    private Output<Double> size;

    /**
     * @return Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    public Output<Double> size() {
        return this.size;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Total throughput of pool in Mibps
     * 
     */
    @Export(name="totalThroughputMibps", type=Double.class, parameters={})
    private Output<Double> totalThroughputMibps;

    /**
     * @return Total throughput of pool in Mibps
     * 
     */
    public Output<Double> totalThroughputMibps() {
        return this.totalThroughputMibps;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Utilized throughput of pool in Mibps
     * 
     */
    @Export(name="utilizedThroughputMibps", type=Double.class, parameters={})
    private Output<Double> utilizedThroughputMibps;

    /**
     * @return Utilized throughput of pool in Mibps
     * 
     */
    public Output<Double> utilizedThroughputMibps() {
        return this.utilizedThroughputMibps;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Pool", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:netapp/v20170815:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190501:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190601:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190701:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190801:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191001:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191101:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200201:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200301:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200501:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200601:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200701:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200801:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200901:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201101:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201201:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210201:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401preview:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210601:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210801:Pool").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20211001:Pool").build())
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
    public static Pool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, options);
    }
}
