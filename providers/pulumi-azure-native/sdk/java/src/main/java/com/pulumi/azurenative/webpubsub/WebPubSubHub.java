// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.webpubsub.WebPubSubHubArgs;
import com.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import com.pulumi.azurenative.webpubsub.outputs.WebPubSubHubPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A hub setting
 * API Version: 2021-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:webpubsub:WebPubSubHub exampleHub /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/WebPubSub/myWebPubSubService/hubs/exampleHub 
 * ```
 * 
 */
@ResourceType(type="azure-native:webpubsub:WebPubSubHub")
public class WebPubSubHub extends com.pulumi.resources.CustomResource {
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
     * Properties of a hub.
     * 
     */
    @Export(name="properties", type=WebPubSubHubPropertiesResponse.class, parameters={})
    private Output<WebPubSubHubPropertiesResponse> properties;

    /**
     * @return Properties of a hub.
     * 
     */
    public Output<WebPubSubHubPropertiesResponse> properties() {
        return this.properties;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebPubSubHub(String name) {
        this(name, WebPubSubHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebPubSubHub(String name, WebPubSubHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebPubSubHub(String name, WebPubSubHubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:webpubsub:WebPubSubHub", name, args == null ? WebPubSubHubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebPubSubHub(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:webpubsub:WebPubSubHub", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:webpubsub/v20211001:WebPubSubHub").build())
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
    public static WebPubSubHub get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebPubSubHub(name, id, options);
    }
}
