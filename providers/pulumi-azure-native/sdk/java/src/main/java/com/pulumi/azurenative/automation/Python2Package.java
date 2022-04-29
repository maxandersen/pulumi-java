// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.Python2PackageArgs;
import com.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import com.pulumi.azurenative.automation.outputs.ModuleErrorInfoResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of the module type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Python2Package OmsCompositeResources /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount33/python2Packages/OmsCompositeResources 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Python2Package")
public class Python2Package extends CustomResource {
    /**
     * Gets or sets the activity count of the module.
     * 
     */
    @Export(name="activityCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> activityCount;

    /**
     * @return Gets or sets the activity count of the module.
     * 
     */
    public Output<Optional<Integer>> activityCount() {
        return Codegen.optional(this.activityCount);
    }
    /**
     * Gets or sets the contentLink of the module.
     * 
     */
    @Export(name="contentLink", type=ContentLinkResponse.class, parameters={})
    private Output</* @Nullable */ ContentLinkResponse> contentLink;

    /**
     * @return Gets or sets the contentLink of the module.
     * 
     */
    public Output<Optional<ContentLinkResponse>> contentLink() {
        return Codegen.optional(this.contentLink);
    }
    /**
     * Gets or sets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output<Optional<String>> creationTime() {
        return Codegen.optional(this.creationTime);
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Gets or sets the error info of the module.
     * 
     */
    @Export(name="error", type=ModuleErrorInfoResponse.class, parameters={})
    private Output</* @Nullable */ ModuleErrorInfoResponse> error;

    /**
     * @return Gets or sets the error info of the module.
     * 
     */
    public Output<Optional<ModuleErrorInfoResponse>> error() {
        return Codegen.optional(this.error);
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Gets or sets type of module, if its composite or not.
     * 
     */
    @Export(name="isComposite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isComposite;

    /**
     * @return Gets or sets type of module, if its composite or not.
     * 
     */
    public Output<Optional<Boolean>> isComposite() {
        return Codegen.optional(this.isComposite);
    }
    /**
     * Gets or sets the isGlobal flag of the module.
     * 
     */
    @Export(name="isGlobal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGlobal;

    /**
     * @return Gets or sets the isGlobal flag of the module.
     * 
     */
    public Output<Optional<Boolean>> isGlobal() {
        return Codegen.optional(this.isGlobal);
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output<Optional<String>> lastModifiedTime() {
        return Codegen.optional(this.lastModifiedTime);
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
     * Gets or sets the provisioning state of the module.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Gets or sets the provisioning state of the module.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Gets or sets the size in bytes of the module.
     * 
     */
    @Export(name="sizeInBytes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> sizeInBytes;

    /**
     * @return Gets or sets the size in bytes of the module.
     * 
     */
    public Output<Optional<Double>> sizeInBytes() {
        return Codegen.optional(this.sizeInBytes);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * Gets or sets the version of the module.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Gets or sets the version of the module.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Python2Package(String name) {
        this(name, Python2PackageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Python2Package(String name, Python2PackageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Python2Package(String name, Python2PackageArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:Python2Package", name, args == null ? Python2PackageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Python2Package(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:Python2Package", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20180630:Python2Package").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:Python2Package").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:Python2Package").build())
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
    public static Python2Package get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Python2Package(name, id, options);
    }
}
