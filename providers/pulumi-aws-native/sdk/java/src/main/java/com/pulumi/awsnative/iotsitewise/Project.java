// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotsitewise.ProjectArgs;
import com.pulumi.awsnative.iotsitewise.outputs.ProjectTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::Project
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * The IDs of the assets to be associated to the project.
     * 
     */
    @Export(name="assetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> assetIds;

    /**
     * @return The IDs of the assets to be associated to the project.
     * 
     */
    public Output</* @Nullable */ List<String>> assetIds() {
        return this.assetIds;
    }
    /**
     * The ID of the portal in which to create the project.
     * 
     */
    @Export(name="portalId", type=String.class, parameters={})
    private Output<String> portalId;

    /**
     * @return The ID of the portal in which to create the project.
     * 
     */
    public Output<String> portalId() {
        return this.portalId;
    }
    /**
     * The ARN of the project.
     * 
     */
    @Export(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    /**
     * @return The ARN of the project.
     * 
     */
    public Output<String> projectArn() {
        return this.projectArn;
    }
    /**
     * A description for the project.
     * 
     */
    @Export(name="projectDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectDescription;

    /**
     * @return A description for the project.
     * 
     */
    public Output</* @Nullable */ String> projectDescription() {
        return this.projectDescription;
    }
    /**
     * The ID of the project.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The ID of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * A friendly name for the project.
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return A friendly name for the project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * A list of key-value pairs that contain metadata for the project.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the project.
     * 
     */
    public Output</* @Nullable */ List<ProjectTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, null, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
