// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.AppServicePlanRouteForVnetArgs;
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
 * Virtual Network route contract used to pass routing information for a Virtual Network.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:AppServicePlanRouteForVnet myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/serverfarms/{name}/virtualNetworkConnections/{vnetName}/routes/{routeName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:AppServicePlanRouteForVnet")
public class AppServicePlanRouteForVnet extends CustomResource {
    /**
     * The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     */
    @Export(name="endAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> endAddress;

    /**
     * @return The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     */
    public Output<Optional<String>> endAddress() {
        return Codegen.optional(this.endAddress);
    }
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
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app&#39;s routes with those from a Virtual Network.
     * 
     */
    @Export(name="routeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> routeType;

    /**
     * @return The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app&#39;s routes with those from a Virtual Network.
     * 
     */
    public Output<Optional<String>> routeType() {
        return Codegen.optional(this.routeType);
    }
    /**
     * The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     */
    @Export(name="startAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> startAddress;

    /**
     * @return The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     */
    public Output<Optional<String>> startAddress() {
        return Codegen.optional(this.startAddress);
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
    public AppServicePlanRouteForVnet(String name) {
        this(name, AppServicePlanRouteForVnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppServicePlanRouteForVnet(String name, AppServicePlanRouteForVnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppServicePlanRouteForVnet(String name, AppServicePlanRouteForVnetArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:web:AppServicePlanRouteForVnet", name, args == null ? AppServicePlanRouteForVnetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppServicePlanRouteForVnet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:web:AppServicePlanRouteForVnet", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160901:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:AppServicePlanRouteForVnet").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:AppServicePlanRouteForVnet").build())
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
    public static AppServicePlanRouteForVnet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AppServicePlanRouteForVnet(name, id, options);
    }
}
