// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkmanagement.ConnectivityTestArgs;
import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestDestination;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestSource;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A connectivity test are a static analysis of your resource configurations
 * that enables you to evaluate connectivity to and from Google Cloud
 * resources in your Virtual Private Cloud (VPC) network.
 * 
 * To get more information about ConnectivityTest, see:
 * 
 * * [API documentation](https://cloud.google.com/network-intelligence-center/docs/connectivity-tests/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ConnectivityTest can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default projects/{{project}}/locations/global/connectivityTests/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkmanagement/connectivityTest:ConnectivityTest")
public class ConnectivityTest extends com.pulumi.resources.CustomResource {
    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, Compute
     * Engine VM instance, or VPC network to uniquely identify the
     * destination location.
     * Even if the destination IP address is not unique, the source IP
     * location is unique. Usually, the analysis can infer the destination
     * endpoint from route information.
     * If the destination you specify is a VM instance and the instance has
     * multiple network interfaces, then you must also specify either a
     * destination IP address or VPC network to identify the destination
     * interface.
     * A reachability analysis proceeds even if the destination location
     * is ambiguous. However, the result can include endpoints that you
     * don't intend to test.
     * Structure is documented below.
     * 
     */
    @Export(name="destination", type=ConnectivityTestDestination.class, parameters={})
    private Output<ConnectivityTestDestination> destination;

    /**
     * @return Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, Compute
     * Engine VM instance, or VPC network to uniquely identify the
     * destination location.
     * Even if the destination IP address is not unique, the source IP
     * location is unique. Usually, the analysis can infer the destination
     * endpoint from route information.
     * If the destination you specify is a VM instance and the instance has
     * multiple network interfaces, then you must also specify either a
     * destination IP address or VPC network to identify the destination
     * interface.
     * A reachability analysis proceeds even if the destination location
     * is ambiguous. However, the result can include endpoints that you
     * don't intend to test.
     * Structure is documented below.
     * 
     */
    public Output<ConnectivityTestDestination> destination() {
        return this.destination;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Unique name for the connectivity test.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the connectivity test.
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
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return IP Protocol of the test. When not provided, "TCP" is assumed.
     * 
     */
    public Output</* @Nullable */ String> protocol() {
        return this.protocol;
    }
    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    @Export(name="relatedProjects", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> relatedProjects;

    /**
     * @return Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    public Output</* @Nullable */ List<String>> relatedProjects() {
        return this.relatedProjects;
    }
    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, virtual machine
     * (VM) instance, or Compute Engine network to uniquely identify the
     * source location.
     * Examples: If the source IP address is an internal IP address within
     * a Google Cloud Virtual Private Cloud (VPC) network, then you must
     * also specify the VPC network. Otherwise, specify the VM instance,
     * which already contains its internal IP address and VPC network
     * information.
     * If the source of the test is within an on-premises network, then
     * you must provide the destination VPC network.
     * If the source endpoint is a Compute Engine VM instance with multiple
     * network interfaces, the instance itself is not sufficient to
     * identify the endpoint. So, you must also specify the source IP
     * address or VPC network.
     * A reachability analysis proceeds even if the source location is
     * ambiguous. However, the test result may include endpoints that
     * you don't intend to test.
     * Structure is documented below.
     * 
     */
    @Export(name="source", type=ConnectivityTestSource.class, parameters={})
    private Output<ConnectivityTestSource> source;

    /**
     * @return Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, virtual machine
     * (VM) instance, or Compute Engine network to uniquely identify the
     * source location.
     * Examples: If the source IP address is an internal IP address within
     * a Google Cloud Virtual Private Cloud (VPC) network, then you must
     * also specify the VPC network. Otherwise, specify the VM instance,
     * which already contains its internal IP address and VPC network
     * information.
     * If the source of the test is within an on-premises network, then
     * you must provide the destination VPC network.
     * If the source endpoint is a Compute Engine VM instance with multiple
     * network interfaces, the instance itself is not sufficient to
     * identify the endpoint. So, you must also specify the source IP
     * address or VPC network.
     * A reachability analysis proceeds even if the source location is
     * ambiguous. However, the test result may include endpoints that
     * you don't intend to test.
     * Structure is documented below.
     * 
     */
    public Output<ConnectivityTestSource> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectivityTest(String name) {
        this(name, ConnectivityTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectivityTest(String name, ConnectivityTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectivityTest(String name, ConnectivityTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkmanagement/connectivityTest:ConnectivityTest", name, args == null ? ConnectivityTestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectivityTest(String name, Output<String> id, @Nullable ConnectivityTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkmanagement/connectivityTest:ConnectivityTest", name, state, makeResourceOptions(options, id));
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
    public static ConnectivityTest get(String name, Output<String> id, @Nullable ConnectivityTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectivityTest(name, id, state, options);
    }
}
