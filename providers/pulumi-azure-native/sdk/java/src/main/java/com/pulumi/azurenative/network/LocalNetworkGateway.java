// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.LocalNetworkGatewayArgs;
import com.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import com.pulumi.azurenative.network.outputs.BgpSettingsResponse;
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
 * A common class for general resource information.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:LocalNetworkGateway localgw /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/localNetworkGateways/localgw 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:LocalNetworkGateway")
public class LocalNetworkGateway extends com.pulumi.resources.CustomResource {
    /**
     * Local network gateway&#39;s BGP speaker settings.
     * 
     */
    @Export(name="bgpSettings", type=BgpSettingsResponse.class, parameters={})
    private Output</* @Nullable */ BgpSettingsResponse> bgpSettings;

    /**
     * @return Local network gateway&#39;s BGP speaker settings.
     * 
     */
    public Output</* @Nullable */ BgpSettingsResponse> bgpSettings() {
        return this.bgpSettings;
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
     * FQDN of local network gateway.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output</* @Nullable */ String> fqdn;

    /**
     * @return FQDN of local network gateway.
     * 
     */
    public Output</* @Nullable */ String> fqdn() {
        return this.fqdn;
    }
    /**
     * IP address of local network gateway.
     * 
     */
    @Export(name="gatewayIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayIpAddress;

    /**
     * @return IP address of local network gateway.
     * 
     */
    public Output</* @Nullable */ String> gatewayIpAddress() {
        return this.gatewayIpAddress;
    }
    /**
     * Local network site address space.
     * 
     */
    @Export(name="localNetworkAddressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> localNetworkAddressSpace;

    /**
     * @return Local network site address space.
     * 
     */
    public Output</* @Nullable */ AddressSpaceResponse> localNetworkAddressSpace() {
        return this.localNetworkAddressSpace;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> location() {
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
     * The provisioning state of the local network gateway resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the local network gateway resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the local network gateway resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the local network gateway resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalNetworkGateway(String name) {
        this(name, LocalNetworkGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalNetworkGateway(String name, LocalNetworkGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalNetworkGateway(String name, LocalNetworkGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:LocalNetworkGateway", name, args == null ? LocalNetworkGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocalNetworkGateway(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:LocalNetworkGateway", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150615:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:LocalNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:LocalNetworkGateway").build())
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
    public static LocalNetworkGateway get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocalNetworkGateway(name, id, options);
    }
}
