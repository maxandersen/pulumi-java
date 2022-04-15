// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.signalrservice.SignalRSharedPrivateLinkResourceArgs;
import io.pulumi.azurenative.signalrservice.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a Shared Private Link Resource
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:signalrservice:SignalRSharedPrivateLinkResource upstream /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService/privateEndpointConnections/upstream 
 * ```
 * 
 */
@ResourceType(type="azure-native:signalrservice:SignalRSharedPrivateLinkResource")
public class SignalRSharedPrivateLinkResource extends io.pulumi.resources.CustomResource {
    /**
     * The group id from the provider of resource the shared private link resource is for
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The group id from the provider of resource the shared private link resource is for
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
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
     * The resource id of the resource the shared private link resource is for
     * 
     */
    @Export(name="privateLinkResourceId", type=String.class, parameters={})
    private Output<String> privateLinkResourceId;

    /**
     * @return The resource id of the resource the shared private link resource is for
     * 
     */
    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId;
    }
    /**
     * Provisioning state of the shared private link resource
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the shared private link resource
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The request message for requesting approval of the shared private link resource
     * 
     */
    @Export(name="requestMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestMessage;

    /**
     * @return The request message for requesting approval of the shared private link resource
     * 
     */
    public Output</* @Nullable */ String> requestMessage() {
        return this.requestMessage;
    }
    /**
     * Status of the shared private link resource
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the shared private link resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SignalRSharedPrivateLinkResource(String name) {
        this(name, SignalRSharedPrivateLinkResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SignalRSharedPrivateLinkResource(String name, SignalRSharedPrivateLinkResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SignalRSharedPrivateLinkResource(String name, SignalRSharedPrivateLinkResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRSharedPrivateLinkResource", name, args == null ? SignalRSharedPrivateLinkResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SignalRSharedPrivateLinkResource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRSharedPrivateLinkResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:signalrservice/v20210401preview:SignalRSharedPrivateLinkResource").build()),
                Output.of(Alias.builder().type("azure-native:signalrservice/v20210601preview:SignalRSharedPrivateLinkResource").build()),
                Output.of(Alias.builder().type("azure-native:signalrservice/v20210901preview:SignalRSharedPrivateLinkResource").build()),
                Output.of(Alias.builder().type("azure-native:signalrservice/v20211001:SignalRSharedPrivateLinkResource").build())
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
    public static SignalRSharedPrivateLinkResource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SignalRSharedPrivateLinkResource(name, id, options);
    }
}
