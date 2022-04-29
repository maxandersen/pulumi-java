// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.migrate.ProjectArgs;
import com.pulumi.azurenative.migrate.outputs.ProjectPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Azure Migrate Project.
 * API Version: 2019-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:migrate:Project abGoyalProject2 /subscriptions/6393a73f-8d55-47ef-b6dd-179b3e0c7910/resourceGroups/abgoyal-westeurope/providers/Microsoft.Migrate/assessmentprojects/abGoyalProject2 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:Project")
public class Project extends CustomResource {
    /**
     * For optimistic concurrency control.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return For optimistic concurrency control.
     * 
     */
    public Output<Optional<String>> eTag() {
        return Codegen.optional(this.eTag);
    }
    /**
     * Azure location in which project is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Azure location in which project is created.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Name of the project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of the project.
     * 
     */
    @Export(name="properties", type=ProjectPropertiesResponse.class, parameters={})
    private Output<ProjectPropertiesResponse> properties;

    /**
     * @return Properties of the project.
     * 
     */
    public Output<ProjectPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Tags provided by Azure Tagging service.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return Tags provided by Azure Tagging service.
     * 
     */
    public Output<Optional<Object>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects].
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object = [Microsoft.Migrate/assessmentProjects].
     * 
     */
    public Output<String> type() {
        return this.type;
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
    public Project(String name, ProjectArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:migrate:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:migrate:Project", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:migrate/v20191001:Project").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Project get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
