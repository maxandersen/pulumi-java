// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.FusionAlertRuleArgs;
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
 * Represents Fusion alert rule.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:FusionAlertRule 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/alertRules/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:FusionAlertRule")
public class FusionAlertRule extends CustomResource {
    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @Export(name="alertRuleTemplateName", type=String.class, parameters={})
    private Output<String> alertRuleTemplateName;

    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    public Output<String> alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }
    /**
     * The description of the alert rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the alert rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name for alerts created by this alert rule.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Determines whether this alert rule is enabled or disabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
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
     * The kind of the alert rule
     * Expected value is &#39;Fusion&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the alert rule
     * Expected value is &#39;Fusion&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The last time that this alert has been modified.
     * 
     */
    @Export(name="lastModifiedUtc", type=String.class, parameters={})
    private Output<String> lastModifiedUtc;

    /**
     * @return The last time that this alert has been modified.
     * 
     */
    public Output<String> lastModifiedUtc() {
        return this.lastModifiedUtc;
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
     * The severity for alerts created by this alert rule.
     * 
     */
    @Export(name="severity", type=String.class, parameters={})
    private Output<String> severity;

    /**
     * @return The severity for alerts created by this alert rule.
     * 
     */
    public Output<String> severity() {
        return this.severity;
    }
    /**
     * The tactics of the alert rule
     * 
     */
    @Export(name="tactics", type=List.class, parameters={String.class})
    private Output<List<String>> tactics;

    /**
     * @return The tactics of the alert rule
     * 
     */
    public Output<List<String>> tactics() {
        return this.tactics;
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
    public FusionAlertRule(String name) {
        this(name, FusionAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FusionAlertRule(String name, FusionAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FusionAlertRule(String name, FusionAlertRuleArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:FusionAlertRule", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private FusionAlertRule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:FusionAlertRule", name, null, makeResourceOptions(options, id));
    }

    private static FusionAlertRuleArgs makeArgs(FusionAlertRuleArgs args) {
        var builder = args == null ? FusionAlertRuleArgs.builder() : FusionAlertRuleArgs.builder(args);
        return builder
            .kind("Fusion")
            .build();
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:FusionAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20200101:FusionAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:FusionAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:FusionAlertRule").build())
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
    public static FusionAlertRule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new FusionAlertRule(name, id, options);
    }
}
