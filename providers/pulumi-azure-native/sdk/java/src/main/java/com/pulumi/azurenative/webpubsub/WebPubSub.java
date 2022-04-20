// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.webpubsub.WebPubSubArgs;
import com.pulumi.azurenative.webpubsub.outputs.EventHandlerSettingsResponse;
import com.pulumi.azurenative.webpubsub.outputs.ManagedIdentityResponse;
import com.pulumi.azurenative.webpubsub.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.webpubsub.outputs.ResourceSkuResponse;
import com.pulumi.azurenative.webpubsub.outputs.SharedPrivateLinkResourceResponse;
import com.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import com.pulumi.azurenative.webpubsub.outputs.WebPubSubFeatureResponse;
import com.pulumi.azurenative.webpubsub.outputs.WebPubSubNetworkACLsResponse;
import com.pulumi.azurenative.webpubsub.outputs.WebPubSubTlsSettingsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A class represent a resource.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:webpubsub:WebPubSub myWebPubSubService /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/WebPubSub/myWebPubSubService 
 * ```
 * 
 */
@ResourceType(type="azure-native:webpubsub:WebPubSub")
public class WebPubSub extends com.pulumi.resources.CustomResource {
    /**
     * The settings for event handler in webpubsub service.
     * 
     */
    @Export(name="eventHandler", type=EventHandlerSettingsResponse.class, parameters={})
    private Output</* @Nullable */ EventHandlerSettingsResponse> eventHandler;

    /**
     * @return The settings for event handler in webpubsub service.
     * 
     */
    public Output</* @Nullable */ EventHandlerSettingsResponse> eventHandler() {
        return this.eventHandler;
    }
    /**
     * The publicly accessible IP of the resource.
     * 
     */
    @Export(name="externalIP", type=String.class, parameters={})
    private Output<String> externalIP;

    /**
     * @return The publicly accessible IP of the resource.
     * 
     */
    public Output<String> externalIP() {
        return this.externalIP;
    }
    /**
     * List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn&#39;t mean &#34;false&#34;. It varies in terms of different FeatureFlags.
     * 
     */
    @Export(name="features", type=List.class, parameters={WebPubSubFeatureResponse.class})
    private Output</* @Nullable */ List<WebPubSubFeatureResponse>> features;

    /**
     * @return List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn&#39;t mean &#34;false&#34;. It varies in terms of different FeatureFlags.
     * 
     */
    public Output</* @Nullable */ List<WebPubSubFeatureResponse>> features() {
        return this.features;
    }
    /**
     * FQDN of the service instance.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return FQDN of the service instance.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * The managed identity response
     * 
     */
    @Export(name="identity", type=ManagedIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedIdentityResponse> identity;

    /**
     * @return The managed identity response
     * 
     */
    public Output</* @Nullable */ ManagedIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The GEO location of the resource. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The GEO location of the resource. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
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
     * Network ACLs
     * 
     */
    @Export(name="networkACLs", type=WebPubSubNetworkACLsResponse.class, parameters={})
    private Output</* @Nullable */ WebPubSubNetworkACLsResponse> networkACLs;

    /**
     * @return Network ACLs
     * 
     */
    public Output</* @Nullable */ WebPubSubNetworkACLsResponse> networkACLs() {
        return this.networkACLs;
    }
    /**
     * Private endpoint connections to the resource.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return Private endpoint connections to the resource.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Enable or disable public network access. Default to &#34;Enabled&#34;.
     * When it&#39;s Enabled, network ACLs still apply.
     * When it&#39;s Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Enable or disable public network access. Default to &#34;Enabled&#34;.
     * When it&#39;s Enabled, network ACLs still apply.
     * When it&#39;s Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
     */
    public Output</* @Nullable */ String> publicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The publicly accessible port of the resource which is designed for browser/client side usage.
     * 
     */
    @Export(name="publicPort", type=Integer.class, parameters={})
    private Output<Integer> publicPort;

    /**
     * @return The publicly accessible port of the resource which is designed for browser/client side usage.
     * 
     */
    public Output<Integer> publicPort() {
        return this.publicPort;
    }
    /**
     * The publicly accessible port of the resource which is designed for customer server side usage.
     * 
     */
    @Export(name="serverPort", type=Integer.class, parameters={})
    private Output<Integer> serverPort;

    /**
     * @return The publicly accessible port of the resource which is designed for customer server side usage.
     * 
     */
    public Output<Integer> serverPort() {
        return this.serverPort;
    }
    /**
     * The list of shared private link resources.
     * 
     */
    @Export(name="sharedPrivateLinkResources", type=List.class, parameters={SharedPrivateLinkResourceResponse.class})
    private Output<List<SharedPrivateLinkResourceResponse>> sharedPrivateLinkResources;

    /**
     * @return The list of shared private link resources.
     * 
     */
    public Output<List<SharedPrivateLinkResourceResponse>> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    @Export(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSkuResponse> sku;

    /**
     * @return The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    public Output</* @Nullable */ ResourceSkuResponse> sku() {
        return this.sku;
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
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * TLS settings.
     * 
     */
    @Export(name="tls", type=WebPubSubTlsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ WebPubSubTlsSettingsResponse> tls;

    /**
     * @return TLS settings.
     * 
     */
    public Output</* @Nullable */ WebPubSubTlsSettingsResponse> tls() {
        return this.tls;
    }
    /**
     * The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Version of the resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of the resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebPubSub(String name) {
        this(name, WebPubSubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebPubSub(String name, WebPubSubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebPubSub(String name, WebPubSubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:webpubsub:WebPubSub", name, args == null ? WebPubSubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebPubSub(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:webpubsub:WebPubSub", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:webpubsub/v20210401preview:WebPubSub").build()),
                Output.of(Alias.builder().type("azure-native:webpubsub/v20210601preview:WebPubSub").build()),
                Output.of(Alias.builder().type("azure-native:webpubsub/v20210901preview:WebPubSub").build()),
                Output.of(Alias.builder().type("azure-native:webpubsub/v20211001:WebPubSub").build())
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
    public static WebPubSub get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebPubSub(name, id, options);
    }
}
