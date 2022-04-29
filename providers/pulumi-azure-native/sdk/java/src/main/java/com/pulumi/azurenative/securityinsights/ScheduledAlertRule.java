// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.ScheduledAlertRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents scheduled alert rule.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:ScheduledAlertRule 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/alertRules/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:ScheduledAlertRule")
public class ScheduledAlertRule extends CustomResource {
    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @Export(name="alertRuleTemplateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertRuleTemplateName;

    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    public Output<Optional<String>> alertRuleTemplateName() {
        return Codegen.optional(this.alertRuleTemplateName);
    }
    /**
     * The description of the alert rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the alert rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * Expected value is &#39;Scheduled&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the alert rule
     * Expected value is &#39;Scheduled&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The last time that this alert rule has been modified.
     * 
     */
    @Export(name="lastModifiedUtc", type=String.class, parameters={})
    private Output<String> lastModifiedUtc;

    /**
     * @return The last time that this alert rule has been modified.
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
     * The query that creates alerts for this rule.
     * 
     */
    @Export(name="query", type=String.class, parameters={})
    private Output<String> query;

    /**
     * @return The query that creates alerts for this rule.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    @Export(name="queryFrequency", type=String.class, parameters={})
    private Output<String> queryFrequency;

    /**
     * @return The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    public Output<String> queryFrequency() {
        return this.queryFrequency;
    }
    /**
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    @Export(name="queryPeriod", type=String.class, parameters={})
    private Output<String> queryPeriod;

    /**
     * @return The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    public Output<String> queryPeriod() {
        return this.queryPeriod;
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
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    @Export(name="suppressionDuration", type=String.class, parameters={})
    private Output<String> suppressionDuration;

    /**
     * @return The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    public Output<String> suppressionDuration() {
        return this.suppressionDuration;
    }
    /**
     * Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    @Export(name="suppressionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> suppressionEnabled;

    /**
     * @return Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    public Output<Boolean> suppressionEnabled() {
        return this.suppressionEnabled;
    }
    /**
     * The tactics of the alert rule
     * 
     */
    @Export(name="tactics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tactics;

    /**
     * @return The tactics of the alert rule
     * 
     */
    public Output<Optional<List<String>>> tactics() {
        return Codegen.optional(this.tactics);
    }
    /**
     * The operation against the threshold that triggers alert rule.
     * 
     */
    @Export(name="triggerOperator", type=String.class, parameters={})
    private Output<String> triggerOperator;

    /**
     * @return The operation against the threshold that triggers alert rule.
     * 
     */
    public Output<String> triggerOperator() {
        return this.triggerOperator;
    }
    /**
     * The threshold triggers this alert rule.
     * 
     */
    @Export(name="triggerThreshold", type=Integer.class, parameters={})
    private Output<Integer> triggerThreshold;

    /**
     * @return The threshold triggers this alert rule.
     * 
     */
    public Output<Integer> triggerThreshold() {
        return this.triggerThreshold;
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
    public ScheduledAlertRule(String name) {
        this(name, ScheduledAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAlertRule(String name, ScheduledAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAlertRule(String name, ScheduledAlertRuleArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:ScheduledAlertRule", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledAlertRule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:ScheduledAlertRule", name, null, makeResourceOptions(options, id));
    }

    private static ScheduledAlertRuleArgs makeArgs(ScheduledAlertRuleArgs args) {
        var builder = args == null ? ScheduledAlertRuleArgs.builder() : ScheduledAlertRuleArgs.builder(args);
        return builder
            .kind("Scheduled")
            .build();
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:ScheduledAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20200101:ScheduledAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:ScheduledAlertRule").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:ScheduledAlertRule").build())
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
    public static ScheduledAlertRule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ScheduledAlertRule(name, id, options);
    }
}
