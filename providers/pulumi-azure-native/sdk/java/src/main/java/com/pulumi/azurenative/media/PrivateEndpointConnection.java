// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.media.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.media.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.media.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Private Endpoint Connection resource.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:PrivateEndpointConnection connectionName1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/fabrikam/providers/Microsoft.Media/mediaservices/contososports/privateEndpointConnections/connectionName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
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
     * The resource of private end point.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20200501:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210501:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
