// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.m365securityandcompliance.PrivateEndpointConnectionsForSCCPowershellArgs;
import com.pulumi.azurenative.m365securityandcompliance.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.m365securityandcompliance.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.azurenative.m365securityandcompliance.outputs.SystemDataResponse;
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
 * The Private Endpoint Connection resource.
 * API Version: 2021-03-25-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:m365securityandcompliance:PrivateEndpointConnectionsForSCCPowershell myConnection /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.M365SecurityAndCompliance/privateLinkServicesForSCCPowershell/service1/privateEndpointConnections/myConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:m365securityandcompliance:PrivateEndpointConnectionsForSCCPowershell")
public class PrivateEndpointConnectionsForSCCPowershell extends CustomResource {
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
    public Output<Optional<PrivateEndpointResponse>> privateEndpoint() {
        return Codegen.optional(this.privateEndpoint);
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
    public PrivateEndpointConnectionsForSCCPowershell(String name) {
        this(name, PrivateEndpointConnectionsForSCCPowershellArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnectionsForSCCPowershell(String name, PrivateEndpointConnectionsForSCCPowershellArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnectionsForSCCPowershell(String name, PrivateEndpointConnectionsForSCCPowershellArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:PrivateEndpointConnectionsForSCCPowershell", name, args == null ? PrivateEndpointConnectionsForSCCPowershellArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnectionsForSCCPowershell(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:PrivateEndpointConnectionsForSCCPowershell", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:m365securityandcompliance/v20210325preview:PrivateEndpointConnectionsForSCCPowershell").build())
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
    public static PrivateEndpointConnectionsForSCCPowershell get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PrivateEndpointConnectionsForSCCPowershell(name, id, options);
    }
}
