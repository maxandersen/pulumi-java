// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabricmesh.GatewayArgs;
import com.pulumi.azurenative.servicefabricmesh.outputs.HttpConfigResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.NetworkRefResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.TcpConfigResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This type describes a gateway resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:Gateway sampleGateway /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/gateways/sampleGateway 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:Gateway")
public class Gateway extends CustomResource {
    /**
     * User readable description of the gateway.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User readable description of the gateway.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Network that the Application is using.
     * 
     */
    @Export(name="destinationNetwork", type=NetworkRefResponse.class, parameters={})
    private Output<NetworkRefResponse> destinationNetwork;

    /**
     * @return Network that the Application is using.
     * 
     */
    public Output<NetworkRefResponse> destinationNetwork() {
        return this.destinationNetwork;
    }
    /**
     * Configuration for http connectivity for this gateway.
     * 
     */
    @Export(name="http", type=List.class, parameters={HttpConfigResponse.class})
    private Output</* @Nullable */ List<HttpConfigResponse>> http;

    /**
     * @return Configuration for http connectivity for this gateway.
     * 
     */
    public Output<Optional<List<HttpConfigResponse>>> http() {
        return Codegen.optional(this.http);
    }
    /**
     * IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
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
     * State of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Network the gateway should listen on for requests.
     * 
     */
    @Export(name="sourceNetwork", type=NetworkRefResponse.class, parameters={})
    private Output<NetworkRefResponse> sourceNetwork;

    /**
     * @return Network the gateway should listen on for requests.
     * 
     */
    public Output<NetworkRefResponse> sourceNetwork() {
        return this.sourceNetwork;
    }
    /**
     * Status of the resource.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the gateway.
     * 
     */
    @Export(name="statusDetails", type=String.class, parameters={})
    private Output<String> statusDetails;

    /**
     * @return Gives additional information about the current status of the gateway.
     * 
     */
    public Output<String> statusDetails() {
        return this.statusDetails;
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
     * Configuration for tcp connectivity for this gateway.
     * 
     */
    @Export(name="tcp", type=List.class, parameters={TcpConfigResponse.class})
    private Output</* @Nullable */ List<TcpConfigResponse>> tcp;

    /**
     * @return Configuration for tcp connectivity for this gateway.
     * 
     */
    public Output<Optional<List<TcpConfigResponse>>> tcp() {
        return Codegen.optional(this.tcp);
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Gateway", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicefabricmesh/v20180901preview:Gateway").build())
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
    public static Gateway get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Gateway(name, id, options);
    }
}
