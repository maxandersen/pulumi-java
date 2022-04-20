// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.HubVirtualNetworkConnectionArgs;
import com.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * HubVirtualNetworkConnection Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:HubVirtualNetworkConnection connection1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubVirtualNetworkConnections/connection1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:HubVirtualNetworkConnection")
public class HubVirtualNetworkConnection extends com.pulumi.resources.CustomResource {
    /**
     * Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     * 
     */
    @Export(name="allowHubToRemoteVnetTransit", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowHubToRemoteVnetTransit;

    /**
     * @return Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     * 
     */
    public Output</* @Nullable */ Boolean> allowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }
    /**
     * Deprecated: Allow RemoteVnet to use Virtual Hub&#39;s gateways.
     * 
     */
    @Export(name="allowRemoteVnetToUseHubVnetGateways", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowRemoteVnetToUseHubVnetGateways;

    /**
     * @return Deprecated: Allow RemoteVnet to use Virtual Hub&#39;s gateways.
     * 
     */
    public Output</* @Nullable */ Boolean> allowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }
    /**
     * Enable internet security.
     * 
     */
    @Export(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    /**
     * @return Enable internet security.
     * 
     */
    public Output</* @Nullable */ Boolean> enableInternetSecurity() {
        return this.enableInternetSecurity;
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
     * The provisioning state of the hub virtual network connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the hub virtual network connection resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Reference to the remote virtual network.
     * 
     */
    @Export(name="remoteVirtualNetwork", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> remoteVirtualNetwork;

    /**
     * @return Reference to the remote virtual network.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Export(name="routingConfiguration", type=RoutingConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration;

    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HubVirtualNetworkConnection(String name) {
        this(name, HubVirtualNetworkConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HubVirtualNetworkConnection(String name, HubVirtualNetworkConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HubVirtualNetworkConnection(String name, HubVirtualNetworkConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubVirtualNetworkConnection", name, args == null ? HubVirtualNetworkConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HubVirtualNetworkConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubVirtualNetworkConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200501:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:HubVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:HubVirtualNetworkConnection").build())
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
    public static HubVirtualNetworkConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HubVirtualNetworkConnection(name, id, options);
    }
}
