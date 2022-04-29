// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.MetricAlertArgs;
import com.pulumi.azurenative.insights.outputs.MetricAlertActionResponse;
import com.pulumi.azurenative.insights.outputs.MetricAlertMultipleResourceMultipleMetricCriteriaResponse;
import com.pulumi.azurenative.insights.outputs.MetricAlertSingleResourceMultipleMetricCriteriaResponse;
import com.pulumi.azurenative.insights.outputs.WebtestLocationAvailabilityCriteriaResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The metric alert resource.
 * API Version: 2018-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:MetricAlert webtest-name-example /subscriptions/14ddf0c5-77c5-4b53-84f6-e1fa43ad68f7/resourceGroups/gigtest/providers/providers/microsoft.insights/metricalerts/MetricAlertWithDimensions 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:MetricAlert")
public class MetricAlert extends CustomResource {
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @Export(name="actions", type=List.class, parameters={MetricAlertActionResponse.class})
    private Output</* @Nullable */ List<MetricAlertActionResponse>> actions;

    /**
     * @return the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    public Output<Optional<List<MetricAlertActionResponse>>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    @Export(name="autoMitigate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMitigate;

    /**
     * @return the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    public Output<Optional<Boolean>> autoMitigate() {
        return Codegen.optional(this.autoMitigate);
    }
    /**
     * defines the specific alert criteria information.
     * 
     */
    @Export(name="criteria", type=Object.class, parameters={})
    private Output<Object> criteria;

    /**
     * @return defines the specific alert criteria information.
     * 
     */
    public Output<Object> criteria() {
        return this.criteria;
    }
    /**
     * the description of the metric alert that will be included in the alert email.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return the description of the metric alert that will be included in the alert email.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * the flag that indicates whether the metric alert is enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return the flag that indicates whether the metric alert is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    @Export(name="evaluationFrequency", type=String.class, parameters={})
    private Output<String> evaluationFrequency;

    /**
     * @return how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    public Output<String> evaluationFrequency() {
        return this.evaluationFrequency;
    }
    /**
     * the value indicating whether this alert rule is migrated.
     * 
     */
    @Export(name="isMigrated", type=Boolean.class, parameters={})
    private Output<Boolean> isMigrated;

    /**
     * @return the value indicating whether this alert rule is migrated.
     * 
     */
    public Output<Boolean> isMigrated() {
        return this.isMigrated;
    }
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return Last time the rule was updated in ISO8601 format.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
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
     * the list of resource id&#39;s that this metric alert is scoped to.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return the list of resource id&#39;s that this metric alert is scoped to.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }
    /**
     * Alert severity {0, 1, 2, 3, 4}
     * 
     */
    @Export(name="severity", type=Integer.class, parameters={})
    private Output<Integer> severity;

    /**
     * @return Alert severity {0, 1, 2, 3, 4}
     * 
     */
    public Output<Integer> severity() {
        return this.severity;
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
     * the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @Export(name="targetResourceRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceRegion;

    /**
     * @return the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Output<Optional<String>> targetResourceRegion() {
        return Codegen.optional(this.targetResourceRegion);
    }
    /**
     * the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @Export(name="targetResourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceType;

    /**
     * @return the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Output<Optional<String>> targetResourceType() {
        return Codegen.optional(this.targetResourceType);
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
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    @Export(name="windowSize", type=String.class, parameters={})
    private Output<String> windowSize;

    /**
     * @return the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    public Output<String> windowSize() {
        return this.windowSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricAlert(String name) {
        this(name, MetricAlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricAlert(String name, MetricAlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricAlert(String name, MetricAlertArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:MetricAlert", name, args == null ? MetricAlertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetricAlert(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:MetricAlert", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20180301:MetricAlert").build())
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
    public static MetricAlert get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new MetricAlert(name, id, options);
    }
}
