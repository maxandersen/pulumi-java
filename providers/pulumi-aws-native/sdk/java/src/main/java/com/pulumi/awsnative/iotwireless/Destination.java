// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotwireless.DestinationArgs;
import com.pulumi.awsnative.iotwireless.enums.DestinationExpressionType;
import com.pulumi.awsnative.iotwireless.outputs.DestinationTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Destination&#39;s resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:iotwireless:Destination")
public class Destination extends com.pulumi.resources.CustomResource {
    /**
     * Destination arn. Returned after successful create.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Destination arn. Returned after successful create.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Destination description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Destination description
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Destination expression
     * 
     */
    @Export(name="expression", type=String.class, parameters={})
    private Output<String> expression;

    /**
     * @return Destination expression
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }
    /**
     * Must be RuleName
     * 
     */
    @Export(name="expressionType", type=DestinationExpressionType.class, parameters={})
    private Output<DestinationExpressionType> expressionType;

    /**
     * @return Must be RuleName
     * 
     */
    public Output<DestinationExpressionType> expressionType() {
        return this.expressionType;
    }
    /**
     * Unique name of destination
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name of destination
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * AWS role ARN that grants access
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return AWS role ARN that grants access
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DestinationTag.class})
    private Output</* @Nullable */ List<DestinationTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the destination.
     * 
     */
    public Output</* @Nullable */ List<DestinationTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Destination(String name) {
        this(name, DestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Destination(String name, DestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Destination(String name, DestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:Destination", name, args == null ? DestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Destination(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:Destination", name, null, makeResourceOptions(options, id));
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
    public static Destination get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Destination(name, id, options);
    }
}
