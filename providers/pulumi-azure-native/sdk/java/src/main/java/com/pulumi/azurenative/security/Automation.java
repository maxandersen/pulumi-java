// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.security.AutomationArgs;
import com.pulumi.azurenative.security.outputs.AutomationActionEventHubResponse;
import com.pulumi.azurenative.security.outputs.AutomationActionLogicAppResponse;
import com.pulumi.azurenative.security.outputs.AutomationActionWorkspaceResponse;
import com.pulumi.azurenative.security.outputs.AutomationScopeResponse;
import com.pulumi.azurenative.security.outputs.AutomationSourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The security automation resource.
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:Automation exampleAutomation /subscriptions/a5caac9c-5c04-49af-b3d0-e204f40345d5/resourceGroups/exampleResourceGroup/providers/Microsoft.Security/SecurityAutomations/exampleAutomation 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:Automation")
public class Automation extends com.pulumi.resources.CustomResource {
    /**
     * A collection of the actions which are triggered if all the configured rules evaluations, within at least one rule set, are true.
     * 
     */
    @Export(name="actions", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> actions;

    /**
     * @return A collection of the actions which are triggered if all the configured rules evaluations, within at least one rule set, are true.
     * 
     */
    public Output<Optional<List<Object>>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * The security automation description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The security automation description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Indicates whether the security automation is enabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Indicates whether the security automation is enabled.
     * 
     */
    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    /**
     * Kind of the resource
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A collection of scopes on which the security automations logic is applied. Supported scopes are the subscription itself or a resource group under that subscription. The automation will only apply on defined scopes.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={AutomationScopeResponse.class})
    private Output</* @Nullable */ List<AutomationScopeResponse>> scopes;

    /**
     * @return A collection of scopes on which the security automations logic is applied. Supported scopes are the subscription itself or a resource group under that subscription. The automation will only apply on defined scopes.
     * 
     */
    public Output<Optional<List<AutomationScopeResponse>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * A collection of the source event types which evaluate the security automation set of rules.
     * 
     */
    @Export(name="sources", type=List.class, parameters={AutomationSourceResponse.class})
    private Output</* @Nullable */ List<AutomationSourceResponse>> sources;

    /**
     * @return A collection of the source event types which evaluate the security automation set of rules.
     * 
     */
    public Output<Optional<List<AutomationSourceResponse>>> sources() {
        return Codegen.optional(this.sources);
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key value pairs that describe the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Automation(String name) {
        this(name, AutomationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Automation(String name, AutomationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Automation(String name, AutomationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Automation", name, args == null ? AutomationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Automation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Automation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20190101preview:Automation").build())
            ))
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
    public static Automation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Automation(name, id, options);
    }
}
