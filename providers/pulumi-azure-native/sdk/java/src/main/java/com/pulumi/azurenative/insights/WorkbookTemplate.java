// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.WorkbookTemplateArgs;
import com.pulumi.azurenative.insights.outputs.WorkbookTemplateGalleryResponse;
import com.pulumi.azurenative.insights.outputs.WorkbookTemplateLocalizedGalleryResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Application Insights workbook template definition.
 * API Version: 2019-10-17-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:WorkbookTemplate testtemplate2 /subscriptions/50359d91-7b9d-4823-85af-eb298a61ba95/resourceGroups/testrg/providers/microsoft.insights/workbooktemplates/testtemplate2 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:WorkbookTemplate")
public class WorkbookTemplate extends CustomResource {
    /**
     * Information about the author of the workbook template.
     * 
     */
    @Export(name="author", type=String.class, parameters={})
    private Output</* @Nullable */ String> author;

    /**
     * @return Information about the author of the workbook template.
     * 
     */
    public Output<Optional<String>> author() {
        return Codegen.optional(this.author);
    }
    /**
     * Workbook galleries supported by the template.
     * 
     */
    @Export(name="galleries", type=List.class, parameters={WorkbookTemplateGalleryResponse.class})
    private Output<List<WorkbookTemplateGalleryResponse>> galleries;

    /**
     * @return Workbook galleries supported by the template.
     * 
     */
    public Output<List<WorkbookTemplateGalleryResponse>> galleries() {
        return this.galleries;
    }
    /**
     * Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    @Export(name="localized", type=Map.class, parameters={String.class, List.class})
    private Output</* @Nullable */ Map<String,List<WorkbookTemplateLocalizedGalleryResponse>>> localized;

    /**
     * @return Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    public Output<Optional<Map<String,List<WorkbookTemplateLocalizedGalleryResponse>>>> localized() {
        return Codegen.optional(this.localized);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    @Export(name="templateData", type=Object.class, parameters={})
    private Output<Object> templateData;

    /**
     * @return Valid JSON object containing workbook template payload.
     * 
     */
    public Output<Object> templateData() {
        return this.templateData;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkbookTemplate(String name) {
        this(name, WorkbookTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkbookTemplate(String name, WorkbookTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkbookTemplate(String name, WorkbookTemplateArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:WorkbookTemplate", name, args == null ? WorkbookTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkbookTemplate(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:WorkbookTemplate", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20191017preview:WorkbookTemplate").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20201120:WorkbookTemplate").build())
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
    public static WorkbookTemplate get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new WorkbookTemplate(name, id, options);
    }
}
