// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.EyesOnArgs;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
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
 * Settings with single toggle.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:EyesOn EyesOn /subscriptions/bd794837-4d29-4647-9105-6339bfdb4e6a/resourceGroups/mms-eus/providers/Microsoft.OperationalInsights/workspaces/avdvirInt/providers/Microsoft.SecurityInsights/settings/EyesOn 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:EyesOn")
public class EyesOn extends CustomResource {
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Determines whether the setting is enable or disabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return Determines whether the setting is enable or disabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * The kind of the setting
     * Expected value is &#39;EyesOn&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the setting
     * Expected value is &#39;EyesOn&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public EyesOn(String name) {
        this(name, EyesOnArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EyesOn(String name, EyesOnArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EyesOn(String name, EyesOnArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:EyesOn", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private EyesOn(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:EyesOn", name, null, makeResourceOptions(options, id));
    }

    private static EyesOnArgs makeArgs(EyesOnArgs args) {
        var builder = args == null ? EyesOnArgs.builder() : EyesOnArgs.builder(args);
        return builder
            .kind("EyesOn")
            .build();
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:EyesOn").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:EyesOn").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:EyesOn").build())
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
    public static EyesOn get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new EyesOn(name, id, options);
    }
}
