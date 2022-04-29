// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.VariableArgs;
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
 * Definition of the variable.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Variable sampleVariable /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/sampleAccount9/variables/sampleVariable 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Variable")
public class Variable extends CustomResource {
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
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    @Export(name="isEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEncrypted;

    /**
     * @return Gets or sets the encrypted flag of the variable.
     * 
     */
    public Output<Optional<Boolean>> isEncrypted() {
        return Codegen.optional(this.isEncrypted);
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
     * Gets or sets the value of the variable.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Gets or sets the value of the variable.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Variable(String name) {
        this(name, VariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Variable(String name, VariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Variable(String name, VariableArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Variable(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:Variable", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20151031:Variable").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:Variable").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:Variable").build())
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
    public static Variable get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Variable(name, id, options);
    }
}
