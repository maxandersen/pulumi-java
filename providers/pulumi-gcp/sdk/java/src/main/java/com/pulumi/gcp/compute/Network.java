// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.NetworkArgs;
import com.pulumi.gcp.compute.inputs.NetworkState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a VPC network or legacy network resource on GCP.
 * 
 * To get more information about Network, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/networks)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/vpc/docs/vpc)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Network can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/network:Network default projects/{{project}}/global/networks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/network:Network default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/network:Network default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/network:Network")
public class Network extends com.pulumi.resources.CustomResource {
    /**
     * When set to `true`, the network is created in "auto subnet mode" and
     * it will create a subnet for each region automatically across the
     * `10.128.0.0/9` address range.
     * When set to `false`, the network is created in "custom subnet mode" so
     * the user can explicitly connect subnetwork resources.
     * 
     */
    @Export(name="autoCreateSubnetworks", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoCreateSubnetworks;

    /**
     * @return When set to `true`, the network is created in "auto subnet mode" and
     * it will create a subnet for each region automatically across the
     * `10.128.0.0/9` address range.
     * When set to `false`, the network is created in "custom subnet mode" so
     * the user can explicitly connect subnetwork resources.
     * 
     */
    public Output</* @Nullable */ Boolean> autoCreateSubnetworks() {
        return this.autoCreateSubnetworks;
    }
    /**
     * If set to `true`, default routes (`0.0.0.0/0`) will be deleted
     * immediately after network creation. Defaults to `false`.
     * 
     */
    @Export(name="deleteDefaultRoutesOnCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteDefaultRoutesOnCreate;

    /**
     * @return If set to `true`, default routes (`0.0.0.0/0`) will be deleted
     * immediately after network creation. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> deleteDefaultRoutesOnCreate() {
        return this.deleteDefaultRoutesOnCreate;
    }
    /**
     * An optional description of this resource. The resource must be
     * recreated to modify this field.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. The resource must be
     * recreated to modify this field.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The gateway address for default routing out of the network. This value is selected by GCP.
     * 
     */
    @Export(name="gatewayIpv4", type=String.class, parameters={})
    private Output<String> gatewayIpv4;

    /**
     * @return The gateway address for default routing out of the network. This value is selected by GCP.
     * 
     */
    public Output<String> gatewayIpv4() {
        return this.gatewayIpv4;
    }
    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460
     * and the maximum value is 1500 bytes.
     * 
     */
    @Export(name="mtu", type=Integer.class, parameters={})
    private Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460
     * and the maximum value is 1500 bytes.
     * 
     */
    public Output<Integer> mtu() {
        return this.mtu;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The network-wide routing mode to use. If set to `REGIONAL`, this
     * network's cloud routers will only advertise routes with subnetworks
     * of this network in the same region as the router. If set to `GLOBAL`,
     * this network's cloud routers will advertise routes with all
     * subnetworks of this network, across regions.
     * Possible values are `REGIONAL` and `GLOBAL`.
     * 
     */
    @Export(name="routingMode", type=String.class, parameters={})
    private Output<String> routingMode;

    /**
     * @return The network-wide routing mode to use. If set to `REGIONAL`, this
     * network's cloud routers will only advertise routes with subnetworks
     * of this network in the same region as the router. If set to `GLOBAL`,
     * this network's cloud routers will advertise routes with all
     * subnetworks of this network, across regions.
     * Possible values are `REGIONAL` and `GLOBAL`.
     * 
     */
    public Output<String> routingMode() {
        return this.routingMode;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(String name, @Nullable NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(String name, @Nullable NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/network:Network", name, args == null ? NetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Network(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/network:Network", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Network get(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, state, options);
    }
}
