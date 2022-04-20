// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs;
import com.pulumi.aws.ec2.inputs.VpcDhcpOptionsAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a VPC DHCP Options Association resource.
 * 
 * ## Example Usage
 * ## Remarks
 * 
 * * You can only associate one DHCP Options Set to a given VPC ID.
 * * Removing the DHCP Options Association automatically sets AWS&#39;s `default` DHCP Options Set to the VPC.
 * 
 * ## Import
 * 
 * DHCP associations can be imported by providing the VPC ID associated with the options
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation imported vpc-0f001273ec18911b1
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation")
public class VpcDhcpOptionsAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     * 
     */
    @Export(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    /**
     * @return The ID of the DHCP Options Set to associate to the VPC.
     * 
     */
    public Output<String> dhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to which we would like to associate a DHCP Options Set.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcDhcpOptionsAssociation(String name) {
        this(name, VpcDhcpOptionsAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcDhcpOptionsAssociation(String name, VpcDhcpOptionsAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcDhcpOptionsAssociation(String name, VpcDhcpOptionsAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation", name, args == null ? VpcDhcpOptionsAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcDhcpOptionsAssociation(String name, Output<String> id, @Nullable VpcDhcpOptionsAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation", name, state, makeResourceOptions(options, id));
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
    public static VpcDhcpOptionsAssociation get(String name, Output<String> id, @Nullable VpcDhcpOptionsAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcDhcpOptionsAssociation(name, id, state, options);
    }
}
