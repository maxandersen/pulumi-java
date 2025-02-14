// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.alertsmanagement.ActionRuleByNameArgs;
import com.pulumi.azurenative.alertsmanagement.outputs.ActionGroupResponse;
import com.pulumi.azurenative.alertsmanagement.outputs.DiagnosticsResponse;
import com.pulumi.azurenative.alertsmanagement.outputs.SuppressionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Action rule object containing target scope, conditions and suppression logic
 * API Version: 2019-05-05-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:alertsmanagement:ActionRuleByName DailySuppression /subscriptions/1e3ff1c0-771a-4119-a03b-be82a51e232d/resourceGroups/alertscorrelationrg/providers/Microsoft.AlertsManagement/actionRules/DailySuppression 
 * ```
 * 
 */
@ResourceType(type="azure-native:alertsmanagement:ActionRuleByName")
public class ActionRuleByName extends com.pulumi.resources.CustomResource {
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
     * action rule properties
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return action rule properties
     * 
     */
    public Output<Object> properties() {
        return this.properties;
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
    public ActionRuleByName(String name) {
        this(name, ActionRuleByNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionRuleByName(String name, ActionRuleByNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionRuleByName(String name, ActionRuleByNameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:ActionRuleByName", name, args == null ? ActionRuleByNameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionRuleByName(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:ActionRuleByName", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:alertsmanagement/v20181102privatepreview:ActionRuleByName").build()),
                Output.of(Alias.builder().type("azure-native:alertsmanagement/v20190505preview:ActionRuleByName").build()),
                Output.of(Alias.builder().type("azure-native:alertsmanagement/v20210808:ActionRuleByName").build()),
                Output.of(Alias.builder().type("azure-native:alertsmanagement/v20210808preview:ActionRuleByName").build())
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
    public static ActionRuleByName get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionRuleByName(name, id, options);
    }
}
