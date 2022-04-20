// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cache.RedisEnterpriseArgs;
import com.pulumi.azurenative.cache.outputs.EnterpriseSkuResponse;
import com.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes the RedisEnterprise cluster
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:RedisEnterprise cache1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/redisEnterprise/cache1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:RedisEnterprise")
public class RedisEnterprise extends com.pulumi.resources.CustomResource {
    /**
     * DNS name of the cluster endpoint
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return DNS name of the cluster endpoint
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The minimum TLS version for the cluster to support, e.g. &#39;1.2&#39;
     * 
     */
    @Export(name="minimumTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimumTlsVersion;

    /**
     * @return The minimum TLS version for the cluster to support, e.g. &#39;1.2&#39;
     * 
     */
    public Output</* @Nullable */ String> minimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Current provisioning status of the cluster
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning status of the cluster
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Version of redis the cluster supports, e.g. &#39;6&#39;
     * 
     */
    @Export(name="redisVersion", type=String.class, parameters={})
    private Output<String> redisVersion;

    /**
     * @return Version of redis the cluster supports, e.g. &#39;6&#39;
     * 
     */
    public Output<String> redisVersion() {
        return this.redisVersion;
    }
    /**
     * Current resource status of the cluster
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Current resource status of the cluster
     * 
     */
    public Output<String> resourceState() {
        return this.resourceState;
    }
    /**
     * The SKU to create, which affects price, performance, and features.
     * 
     */
    @Export(name="sku", type=EnterpriseSkuResponse.class, parameters={})
    private Output<EnterpriseSkuResponse> sku;

    /**
     * @return The SKU to create, which affects price, performance, and features.
     * 
     */
    public Output<EnterpriseSkuResponse> sku() {
        return this.sku;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The Availability Zones where this cluster will be deployed.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The Availability Zones where this cluster will be deployed.
     * 
     */
    public Output</* @Nullable */ List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RedisEnterprise(String name) {
        this(name, RedisEnterpriseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RedisEnterprise(String name, RedisEnterpriseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RedisEnterprise(String name, RedisEnterpriseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:RedisEnterprise", name, args == null ? RedisEnterpriseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RedisEnterprise(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:RedisEnterprise", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cache/v20201001preview:RedisEnterprise").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20210201preview:RedisEnterprise").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20210301:RedisEnterprise").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20210801:RedisEnterprise").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20220101:RedisEnterprise").build())
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
    public static RedisEnterprise get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RedisEnterprise(name, id, options);
    }
}
