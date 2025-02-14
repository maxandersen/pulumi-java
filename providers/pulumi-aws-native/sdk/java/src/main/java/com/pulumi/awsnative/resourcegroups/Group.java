// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.resourcegroups.GroupArgs;
import com.pulumi.awsnative.resourcegroups.outputs.GroupConfigurationItem;
import com.pulumi.awsnative.resourcegroups.outputs.GroupResourceQuery;
import com.pulumi.awsnative.resourcegroups.outputs.GroupTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Schema for ResourceGroups::Group
 * 
 */
@ResourceType(type="aws-native:resourcegroups:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * The Resource Group ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Resource Group ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="configuration", type=List.class, parameters={GroupConfigurationItem.class})
    private Output</* @Nullable */ List<GroupConfigurationItem>> configuration;

    public Output<Optional<List<GroupConfigurationItem>>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * The description of the resource group
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the resource group
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the resource group
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource group
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="resourceQuery", type=GroupResourceQuery.class, parameters={})
    private Output</* @Nullable */ GroupResourceQuery> resourceQuery;

    public Output<Optional<GroupResourceQuery>> resourceQuery() {
        return Codegen.optional(this.resourceQuery);
    }
    @Export(name="resources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resources;

    public Output<Optional<List<String>>> resources() {
        return Codegen.optional(this.resources);
    }
    @Export(name="tags", type=List.class, parameters={GroupTag.class})
    private Output</* @Nullable */ List<GroupTag>> tags;

    public Output<Optional<List<GroupTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, @Nullable GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, @Nullable GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resourcegroups:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resourcegroups:Group", name, null, makeResourceOptions(options, id));
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
    public static Group get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}
