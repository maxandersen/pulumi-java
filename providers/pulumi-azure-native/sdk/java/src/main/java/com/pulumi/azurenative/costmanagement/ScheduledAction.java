// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.costmanagement.ScheduledActionArgs;
import com.pulumi.azurenative.costmanagement.outputs.FileDestinationResponse;
import com.pulumi.azurenative.costmanagement.outputs.NotificationPropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.SchedulePropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Scheduled action definition.
 * API Version: 2022-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:costmanagement:ScheduledAction monthlyCostByResource providers/Microsoft.CostManagement/scheduledActions/monthlyCostByResource 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:ScheduledAction")
public class ScheduledAction extends com.pulumi.resources.CustomResource {
    /**
     * Scheduled action name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Scheduled action name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource Etag.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> eTag() {
        return this.eTag;
    }
    /**
     * Destination format of the view data.
     * 
     */
    @Export(name="fileDestination", type=FileDestinationResponse.class, parameters={})
    private Output</* @Nullable */ FileDestinationResponse> fileDestination;

    /**
     * @return Destination format of the view data.
     * 
     */
    public Output<Optional<FileDestinationResponse>> fileDestination() {
        return Codegen.optional(this.fileDestination);
    }
    /**
     * Kind of the scheduled action.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the scheduled action.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Notification properties based on scheduled action kind.
     * 
     */
    @Export(name="notification", type=NotificationPropertiesResponse.class, parameters={})
    private Output<NotificationPropertiesResponse> notification;

    /**
     * @return Notification properties based on scheduled action kind.
     * 
     */
    public Output<NotificationPropertiesResponse> notification() {
        return this.notification;
    }
    /**
     * Schedule of the scheduled action.
     * 
     */
    @Export(name="schedule", type=SchedulePropertiesResponse.class, parameters={})
    private Output<SchedulePropertiesResponse> schedule;

    /**
     * @return Schedule of the scheduled action.
     * 
     */
    public Output<SchedulePropertiesResponse> schedule() {
        return this.schedule;
    }
    /**
     * Cost Management scope like &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Cost Management scope like &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Status of the scheduled action.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the scheduled action.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Cost analysis viewId used for scheduled action. For example, &#39;/providers/Microsoft.CostManagement/views/swaggerExample&#39;
     * 
     */
    @Export(name="viewId", type=String.class, parameters={})
    private Output<String> viewId;

    /**
     * @return Cost analysis viewId used for scheduled action. For example, &#39;/providers/Microsoft.CostManagement/views/swaggerExample&#39;
     * 
     */
    public Output<String> viewId() {
        return this.viewId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledAction(String name) {
        this(name, ScheduledActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAction(String name, ScheduledActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAction(String name, ScheduledActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ScheduledAction", name, args == null ? ScheduledActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledAction(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ScheduledAction", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20220401preview:ScheduledAction").build())
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
    public static ScheduledAction get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAction(name, id, options);
    }
}
