// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateLinkServicePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * PrivateEndpointConnection resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PrivateLinkServicePrivateEndpointConnection testPlePeConnection /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/privateLinkServices/{serviceName}/privateEndpointConnections/{peConnectionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateLinkServicePrivateEndpointConnection")
public class PrivateLinkServicePrivateEndpointConnection extends io.pulumi.resources.CustomResource {
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
     * The consumer link id.
     * 
     */
    @Export(name="linkIdentifier", type=String.class, parameters={})
    private Output<String> linkIdentifier;

    /**
     * @return The consumer link id.
     * 
     */
    public Output<String> linkIdentifier() {
        return this.linkIdentifier;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output<PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output<PrivateEndpointResponse> privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output</* @Nullable */ PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkServicePrivateEndpointConnection(String name) {
        this(name, PrivateLinkServicePrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkServicePrivateEndpointConnection(String name, PrivateLinkServicePrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkServicePrivateEndpointConnection(String name, PrivateLinkServicePrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateLinkServicePrivateEndpointConnection", name, args == null ? PrivateLinkServicePrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkServicePrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateLinkServicePrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190901:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:PrivateLinkServicePrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:PrivateLinkServicePrivateEndpointConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateLinkServicePrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkServicePrivateEndpointConnection(name, id, options);
    }
}
