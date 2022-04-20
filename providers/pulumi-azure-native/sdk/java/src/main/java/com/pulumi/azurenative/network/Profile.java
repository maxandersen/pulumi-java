// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ProfileArgs;
import com.pulumi.azurenative.network.outputs.DnsConfigResponse;
import com.pulumi.azurenative.network.outputs.EndpointResponse;
import com.pulumi.azurenative.network.outputs.MonitorConfigResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Class representing a Traffic Manager profile.
 * API Version: 2018-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:Profile parentprofile /subscriptions/{subscription-id}/resourceGroups/myresourcegroup/providers/Microsoft.Network/trafficManagerProfiles/parentprofile 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:Profile")
public class Profile extends com.pulumi.resources.CustomResource {
    /**
     * The list of allowed endpoint record types.
     * 
     */
    @Export(name="allowedEndpointRecordTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedEndpointRecordTypes;

    /**
     * @return The list of allowed endpoint record types.
     * 
     */
    public Output</* @Nullable */ List<String>> allowedEndpointRecordTypes() {
        return this.allowedEndpointRecordTypes;
    }
    /**
     * The DNS settings of the Traffic Manager profile.
     * 
     */
    @Export(name="dnsConfig", type=DnsConfigResponse.class, parameters={})
    private Output</* @Nullable */ DnsConfigResponse> dnsConfig;

    /**
     * @return The DNS settings of the Traffic Manager profile.
     * 
     */
    public Output</* @Nullable */ DnsConfigResponse> dnsConfig() {
        return this.dnsConfig;
    }
    /**
     * The list of endpoints in the Traffic Manager profile.
     * 
     */
    @Export(name="endpoints", type=List.class, parameters={EndpointResponse.class})
    private Output</* @Nullable */ List<EndpointResponse>> endpoints;

    /**
     * @return The list of endpoints in the Traffic Manager profile.
     * 
     */
    public Output</* @Nullable */ List<EndpointResponse>> endpoints() {
        return this.endpoints;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     */
    @Export(name="maxReturn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxReturn;

    /**
     * @return Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     */
    public Output</* @Nullable */ Double> maxReturn() {
        return this.maxReturn;
    }
    /**
     * The endpoint monitoring settings of the Traffic Manager profile.
     * 
     */
    @Export(name="monitorConfig", type=MonitorConfigResponse.class, parameters={})
    private Output</* @Nullable */ MonitorConfigResponse> monitorConfig;

    /**
     * @return The endpoint monitoring settings of the Traffic Manager profile.
     * 
     */
    public Output</* @Nullable */ MonitorConfigResponse> monitorConfig() {
        return this.monitorConfig;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The status of the Traffic Manager profile.
     * 
     */
    @Export(name="profileStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> profileStatus;

    /**
     * @return The status of the Traffic Manager profile.
     * 
     */
    public Output</* @Nullable */ String> profileStatus() {
        return this.profileStatus;
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
     * The traffic routing method of the Traffic Manager profile.
     * 
     */
    @Export(name="trafficRoutingMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> trafficRoutingMethod;

    /**
     * @return The traffic routing method of the Traffic Manager profile.
     * 
     */
    public Output</* @Nullable */ String> trafficRoutingMethod() {
        return this.trafficRoutingMethod;
    }
    /**
     * Indicates whether Traffic View is &#39;Enabled&#39; or &#39;Disabled&#39; for the Traffic Manager profile. Null, indicates &#39;Disabled&#39;. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
     */
    @Export(name="trafficViewEnrollmentStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> trafficViewEnrollmentStatus;

    /**
     * @return Indicates whether Traffic View is &#39;Enabled&#39; or &#39;Disabled&#39; for the Traffic Manager profile. Null, indicates &#39;Disabled&#39;. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
     */
    public Output</* @Nullable */ String> trafficViewEnrollmentStatus() {
        return this.trafficViewEnrollmentStatus;
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    public Output</* @Nullable */ String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Profile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Profile", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20151101:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170501:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180301:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:Profile").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:Profile").build())
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
    public static Profile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, options);
    }
}
