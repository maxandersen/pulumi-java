// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.RouteTableArgs;
import com.pulumi.awsnative.ec2.outputs.RouteTableTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::RouteTable
 * 
 */
@ResourceType(type="aws-native:ec2:RouteTable")
public class RouteTable extends com.pulumi.resources.CustomResource {
    /**
     * The route table ID.
     * 
     */
    @Export(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    /**
     * @return The route table ID.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * Any tags assigned to the route table.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RouteTableTag.class})
    private Output</* @Nullable */ List<RouteTableTag>> tags;

    /**
     * @return Any tags assigned to the route table.
     * 
     */
    public Output<Optional<List<RouteTableTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTable(String name) {
        this(name, RouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTable(String name, RouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTable(String name, RouteTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:RouteTable", name, args == null ? RouteTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteTable(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:RouteTable", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RouteTable get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteTable(name, id, options);
    }
}
