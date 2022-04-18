// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudfront.FunctionArgs;
import com.pulumi.awsnative.cloudfront.outputs.FunctionConfig;
import com.pulumi.awsnative.cloudfront.outputs.FunctionMetadata;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::Function
 * 
 */
@ResourceType(type="aws-native:cloudfront:Function")
public class Function extends com.pulumi.resources.CustomResource {
    @Export(name="autoPublish", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoPublish;

    public Output</* @Nullable */ Boolean> autoPublish() {
        return this.autoPublish;
    }
    @Export(name="functionARN", type=String.class, parameters={})
    private Output<String> functionARN;

    public Output<String> functionARN() {
        return this.functionARN;
    }
    @Export(name="functionCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionCode;

    public Output</* @Nullable */ String> functionCode() {
        return this.functionCode;
    }
    @Export(name="functionConfig", type=FunctionConfig.class, parameters={})
    private Output</* @Nullable */ FunctionConfig> functionConfig;

    public Output</* @Nullable */ FunctionConfig> functionConfig() {
        return this.functionConfig;
    }
    @Export(name="functionMetadata", type=FunctionMetadata.class, parameters={})
    private Output</* @Nullable */ FunctionMetadata> functionMetadata;

    public Output</* @Nullable */ FunctionMetadata> functionMetadata() {
        return this.functionMetadata;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="stage", type=String.class, parameters={})
    private Output<String> stage;

    public Output<String> stage() {
        return this.stage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(String name, @Nullable FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, @Nullable FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Function(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:Function", name, null, makeResourceOptions(options, id));
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
    public static Function get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, options);
    }
}
