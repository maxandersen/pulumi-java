// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VpnGatewayArgs;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnConnectionResponse;
import io.pulumi.azurenative.network.outputs.VpnGatewayIpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.VpnGatewayNatRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * VpnGateway Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VpnGateway gateway1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnGateways/gateway1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VpnGateway")
public class VpnGateway extends io.pulumi.resources.CustomResource {
    /**
     * Local network gateway's BGP speaker settings.
     * 
     */
    @Export(name="bgpSettings", type=BgpSettingsResponse.class, parameters={})
    private Output</* @Nullable */ BgpSettingsResponse> bgpSettings;

    /**
     * @return Local network gateway's BGP speaker settings.
     * 
     */
    public Output</* @Nullable */ BgpSettingsResponse> bgpSettings() {
        return this.bgpSettings;
    }
    /**
     * List of all vpn connections to the gateway.
     * 
     */
    @Export(name="connections", type=List.class, parameters={VpnConnectionResponse.class})
    private Output</* @Nullable */ List<VpnConnectionResponse>> connections;

    /**
     * @return List of all vpn connections to the gateway.
     * 
     */
    public Output</* @Nullable */ List<VpnConnectionResponse>> connections() {
        return this.connections;
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
     * List of all IPs configured on the gateway.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={VpnGatewayIpConfigurationResponse.class})
    private Output<List<VpnGatewayIpConfigurationResponse>> ipConfigurations;

    /**
     * @return List of all IPs configured on the gateway.
     * 
     */
    public Output<List<VpnGatewayIpConfigurationResponse>> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * Enable Routing Preference property for the Public IP Interface of the VpnGateway.
     * 
     */
    @Export(name="isRoutingPreferenceInternet", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isRoutingPreferenceInternet;

    /**
     * @return Enable Routing Preference property for the Public IP Interface of the VpnGateway.
     * 
     */
    public Output</* @Nullable */ Boolean> isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of all the nat Rules associated with the gateway.
     * 
     */
    @Export(name="natRules", type=List.class, parameters={VpnGatewayNatRuleResponse.class})
    private Output</* @Nullable */ List<VpnGatewayNatRuleResponse>> natRules;

    /**
     * @return List of all the nat Rules associated with the gateway.
     * 
     */
    public Output</* @Nullable */ List<VpnGatewayNatRuleResponse>> natRules() {
        return this.natRules;
    }
    /**
     * The provisioning state of the VPN gateway resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the VPN gateway resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The VirtualHub to which the gateway belongs.
     * 
     */
    @Export(name="virtualHub", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualHub;

    /**
     * @return The VirtualHub to which the gateway belongs.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> virtualHub() {
        return this.virtualHub;
    }
    /**
     * The scale unit for this vpn gateway.
     * 
     */
    @Export(name="vpnGatewayScaleUnit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> vpnGatewayScaleUnit;

    /**
     * @return The scale unit for this vpn gateway.
     * 
     */
    public Output</* @Nullable */ Integer> vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnGateway(String name) {
        this(name, VpnGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnGateway(String name, VpnGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGateway(String name, VpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VpnGateway", name, args == null ? VpnGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnGateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VpnGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180401:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VpnGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VpnGateway").build())
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
    public static VpnGateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpnGateway(name, id, options);
    }
}
