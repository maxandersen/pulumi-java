// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppSwiftVirtualNetworkConnectionArgs;
import com.pulumi.azurenative.web.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Swift Virtual Network Contract. This is used to enable the new Swift way of doing virtual network integration.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSwiftVirtualNetworkConnection myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/networkConfig/virtualNetwork 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSwiftVirtualNetworkConnection")
public class WebAppSwiftVirtualNetworkConnection extends CustomResource {
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    @Export(name="subnetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetResourceId;

    /**
     * @return The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    public Output<Optional<String>> subnetResourceId() {
        return Codegen.optional(this.subnetResourceId);
    }
    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    @Export(name="swiftSupported", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> swiftSupported;

    /**
     * @return A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    public Output<Optional<Boolean>> swiftSupported() {
        return Codegen.optional(this.swiftSupported);
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public WebAppSwiftVirtualNetworkConnection(String name) {
        this(name, WebAppSwiftVirtualNetworkConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSwiftVirtualNetworkConnection(String name, WebAppSwiftVirtualNetworkConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSwiftVirtualNetworkConnection(String name, WebAppSwiftVirtualNetworkConnectionArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:web:WebAppSwiftVirtualNetworkConnection", name, args == null ? WebAppSwiftVirtualNetworkConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSwiftVirtualNetworkConnection(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:web:WebAppSwiftVirtualNetworkConnection", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSwiftVirtualNetworkConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSwiftVirtualNetworkConnection").build())
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
    public static WebAppSwiftVirtualNetworkConnection get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new WebAppSwiftVirtualNetworkConnection(name, id, options);
    }
}
