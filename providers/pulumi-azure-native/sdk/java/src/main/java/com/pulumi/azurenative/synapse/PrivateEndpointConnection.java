// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.synapse.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.synapse.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A private endpoint connection
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:PrivateEndpointConnection sql /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/privateEndpointConnections/ExamplePrivateEndpointConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:PrivateEndpointConnection")
public class PrivateEndpointConnection extends CustomResource {
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
     * The private endpoint which the connection belongs to.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The private endpoint which the connection belongs to.
     * 
     */
    public Output<Optional<PrivateEndpointResponse>> privateEndpoint() {
        return Codegen.optional(this.privateEndpoint);
    }
    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return Connection state of the private endpoint connection.
     * 
     */
    public Output<Optional<PrivateLinkServiceConnectionStateResponse>> privateLinkServiceConnectionState() {
        return Codegen.optional(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the private endpoint connection.
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
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:synapse:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:synapse:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:PrivateEndpointConnection").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
