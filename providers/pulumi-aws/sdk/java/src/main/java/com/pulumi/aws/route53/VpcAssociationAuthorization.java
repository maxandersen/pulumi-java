// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.VpcAssociationAuthorizationArgs;
import com.pulumi.aws.route53.inputs.VpcAssociationAuthorizationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Authorizes a VPC in a different account to be associated with a local Route53 Hosted Zone.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route 53 VPC Association Authorizations can be imported via the Hosted Zone ID and VPC ID, separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization example Z123456ABCDEFG:vpc-12345678
 * ```
 * 
 */
@ResourceType(type="aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization")
public class VpcAssociationAuthorization extends com.pulumi.resources.CustomResource {
    /**
     * The VPC to authorize for association with the private hosted zone.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC to authorize for association with the private hosted zone.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The VPC&#39;s region. Defaults to the region of the AWS provider.
     * 
     */
    @Export(name="vpcRegion", type=String.class, parameters={})
    private Output<String> vpcRegion;

    /**
     * @return The VPC&#39;s region. Defaults to the region of the AWS provider.
     * 
     */
    public Output<String> vpcRegion() {
        return this.vpcRegion;
    }
    /**
     * The ID of the private hosted zone that you want to authorize associating a VPC with.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The ID of the private hosted zone that you want to authorize associating a VPC with.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcAssociationAuthorization(String name) {
        this(name, VpcAssociationAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcAssociationAuthorization(String name, VpcAssociationAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcAssociationAuthorization(String name, VpcAssociationAuthorizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, args == null ? VpcAssociationAuthorizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcAssociationAuthorization(String name, Output<String> id, @Nullable VpcAssociationAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, state, makeResourceOptions(options, id));
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
    public static VpcAssociationAuthorization get(String name, Output<String> id, @Nullable VpcAssociationAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcAssociationAuthorization(name, id, state, options);
    }
}
