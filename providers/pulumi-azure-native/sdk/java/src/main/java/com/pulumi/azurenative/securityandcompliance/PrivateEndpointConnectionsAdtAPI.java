// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityandcompliance.PrivateEndpointConnectionsAdtAPIArgs;
import com.pulumi.azurenative.securityandcompliance.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.securityandcompliance.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.azurenative.securityandcompliance.outputs.SystemDataResponse;
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
 * API Version: 2021-03-08.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityandcompliance:PrivateEndpointConnectionsAdtAPI myConnection /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.SecurityAndCompliance/privateLinkServicesForO365ManagementActivityAPI/service1/privateEndpointConnections/myConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityandcompliance:PrivateEndpointConnectionsAdtAPI")
public class PrivateEndpointConnectionsAdtAPI extends com.pulumi.resources.CustomResource {
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
     * Required property for system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Required property for system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnectionsAdtAPI(String name) {
        this(name, PrivateEndpointConnectionsAdtAPIArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnectionsAdtAPI(String name, PrivateEndpointConnectionsAdtAPIArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnectionsAdtAPI(String name, PrivateEndpointConnectionsAdtAPIArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:PrivateEndpointConnectionsAdtAPI", name, args == null ? PrivateEndpointConnectionsAdtAPIArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnectionsAdtAPI(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:PrivateEndpointConnectionsAdtAPI", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityandcompliance/v20210111:PrivateEndpointConnectionsAdtAPI").build()),
                Output.of(Alias.builder().type("azure-native:securityandcompliance/v20210308:PrivateEndpointConnectionsAdtAPI").build())
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
    public static PrivateEndpointConnectionsAdtAPI get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnectionsAdtAPI(name, id, options);
    }
}
