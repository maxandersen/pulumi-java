// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.memorydb.ParameterGroupArgs;
import com.pulumi.awsnative.memorydb.outputs.ParameterGroupTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::MemoryDB::ParameterGroup resource creates an Amazon MemoryDB ParameterGroup.
 * 
 */
@ResourceType(type="aws-native:memorydb:ParameterGroup")
public class ParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    @Export(name="aRN", type=String.class, parameters={})
    private Output<String> aRN;

    /**
     * @return The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    public Output<String> aRN() {
        return this.aRN;
    }
    /**
     * A description of the parameter group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the parameter group.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the parameter group.
     * 
     */
    @Export(name="parameterGroupName", type=String.class, parameters={})
    private Output<String> parameterGroupName;

    /**
     * @return The name of the parameter group.
     * 
     */
    public Output<String> parameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    @Export(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    public Output</* @Nullable */ Object> parameters() {
        return this.parameters;
    }
    /**
     * An array of key-value pairs to apply to this parameter group.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ParameterGroupTag.class})
    private Output</* @Nullable */ List<ParameterGroupTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this parameter group.
     * 
     */
    public Output</* @Nullable */ List<ParameterGroupTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ParameterGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:ParameterGroup", name, null, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, options);
    }
}
