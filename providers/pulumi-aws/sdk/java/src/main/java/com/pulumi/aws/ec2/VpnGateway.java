// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpnGatewayArgs;
import com.pulumi.aws.ec2.inputs.VpnGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a VPC VPN Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPN Gateways can be imported using the `vpn gateway id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpnGateway:VpnGateway testvpngateway vgw-9a4cacf3
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpnGateway:VpnGateway")
public class VpnGateway extends com.pulumi.resources.CustomResource {
    /**
     * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
     * 
     */
    @Export(name="amazonSideAsn", type=String.class, parameters={})
    private Output<String> amazonSideAsn;

    /**
     * @return The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
     * 
     */
    public Output<String> amazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * Amazon Resource Name (ARN) of the VPN Gateway.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the VPN Gateway.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Availability Zone for the virtual private gateway.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    /**
     * @return The Availability Zone for the virtual private gateway.
     * 
     */
    public Output</* @Nullable */ String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The VPC ID to create in.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID to create in.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
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
    public VpnGateway(String name, @Nullable VpnGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGateway(String name, @Nullable VpnGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGateway:VpnGateway", name, args == null ? VpnGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnGateway(String name, Output<String> id, @Nullable VpnGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGateway:VpnGateway", name, state, makeResourceOptions(options, id));
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
    public static VpnGateway get(String name, Output<String> id, @Nullable VpnGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpnGateway(name, id, state, options);
    }
}
