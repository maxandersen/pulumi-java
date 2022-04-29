// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.SourceControlArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of the source control.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:SourceControl sampleSourceControl /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/sampleAccount9/sourcecontrols/sampleSourceControl 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:SourceControl")
public class SourceControl extends CustomResource {
    /**
     * The auto sync of the source control. Default is false.
     * 
     */
    @Export(name="autoSync", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoSync;

    /**
     * @return The auto sync of the source control. Default is false.
     * 
     */
    public Output<Optional<Boolean>> autoSync() {
        return Codegen.optional(this.autoSync);
    }
    /**
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    @Export(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    /**
     * @return The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    public Output<Optional<String>> branch() {
        return Codegen.optional(this.branch);
    }
    /**
     * The creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<Optional<String>> creationTime() {
        return Codegen.optional(this.creationTime);
    }
    /**
     * The description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The folder path of the source control.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderPath;

    /**
     * @return The folder path of the source control.
     * 
     */
    public Output<Optional<String>> folderPath() {
        return Codegen.optional(this.folderPath);
    }
    /**
     * The last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return The last modified time.
     * 
     */
    public Output<Optional<String>> lastModifiedTime() {
        return Codegen.optional(this.lastModifiedTime);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The auto publish of the source control. Default is true.
     * 
     */
    @Export(name="publishRunbook", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publishRunbook;

    /**
     * @return The auto publish of the source control. Default is true.
     * 
     */
    public Output<Optional<Boolean>> publishRunbook() {
        return Codegen.optional(this.publishRunbook);
    }
    /**
     * The repo url of the source control.
     * 
     */
    @Export(name="repoUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repoUrl;

    /**
     * @return The repo url of the source control.
     * 
     */
    public Output<Optional<String>> repoUrl() {
        return Codegen.optional(this.repoUrl);
    }
    /**
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     */
    public Output<Optional<String>> sourceType() {
        return Codegen.optional(this.sourceType);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceControl(String name) {
        this(name, SourceControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceControl(String name, SourceControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceControl(String name, SourceControlArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, args == null ? SourceControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceControl(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20170515preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:SourceControl").build())
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
    public static SourceControl get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new SourceControl(name, id, options);
    }
}
