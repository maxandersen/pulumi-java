// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.VpcLinkArgs;
import com.pulumi.aws.apigatewayv2.inputs.VpcLinkState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 VPC Link.
 * 
 * &gt; **Note:** Amazon API Gateway Version 2 VPC Links enable private integrations that connect HTTP APIs to private resources in a VPC.
 * To enable private integration for REST APIs, use the `Amazon API Gateway Version 1 VPC Link` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_vpc_link` can be imported by using the VPC Link identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/vpcLink:VpcLink example aabbccddee
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/vpcLink:VpcLink")
public class VpcLink extends com.pulumi.resources.CustomResource {
    /**
     * The VPC Link ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The VPC Link ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the VPC Link. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the VPC Link. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Security group IDs for the VPC Link.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupIds;

    /**
     * @return Security group IDs for the VPC Link.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Subnet IDs for the VPC Link.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return Subnet IDs for the VPC Link.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the VPC Link. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the VPC Link. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcLink(String name) {
        this(name, VpcLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcLink(String name, VpcLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcLink(String name, VpcLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/vpcLink:VpcLink", name, args == null ? VpcLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcLink(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/vpcLink:VpcLink", name, state, makeResourceOptions(options, id));
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
    public static VpcLink get(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcLink(name, id, state, options);
    }
}
