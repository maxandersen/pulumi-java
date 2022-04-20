// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ExportConfigurationArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Properties that define a Continuous Export configuration.
 * API Version: 2015-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ExportConfiguration myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration/{exportId} 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ExportConfiguration")
public class ExportConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Application Insights component.
     * 
     */
    @Export(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    /**
     * @return The name of the Application Insights component.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }
    /**
     * The name of the destination storage container.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return The name of the destination storage container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
    /**
     * The name of destination account.
     * 
     */
    @Export(name="destinationAccountId", type=String.class, parameters={})
    private Output<String> destinationAccountId;

    /**
     * @return The name of destination account.
     * 
     */
    public Output<String> destinationAccountId() {
        return this.destinationAccountId;
    }
    /**
     * The destination account location ID.
     * 
     */
    @Export(name="destinationStorageLocationId", type=String.class, parameters={})
    private Output<String> destinationStorageLocationId;

    /**
     * @return The destination account location ID.
     * 
     */
    public Output<String> destinationStorageLocationId() {
        return this.destinationStorageLocationId;
    }
    /**
     * The destination storage account subscription ID.
     * 
     */
    @Export(name="destinationStorageSubscriptionId", type=String.class, parameters={})
    private Output<String> destinationStorageSubscriptionId;

    /**
     * @return The destination storage account subscription ID.
     * 
     */
    public Output<String> destinationStorageSubscriptionId() {
        return this.destinationStorageSubscriptionId;
    }
    /**
     * The destination type.
     * 
     */
    @Export(name="destinationType", type=String.class, parameters={})
    private Output<String> destinationType;

    /**
     * @return The destination type.
     * 
     */
    public Output<String> destinationType() {
        return this.destinationType;
    }
    /**
     * The unique ID of the export configuration inside an Application Insights component. It is auto generated when the Continuous Export configuration is created.
     * 
     */
    @Export(name="exportId", type=String.class, parameters={})
    private Output<String> exportId;

    /**
     * @return The unique ID of the export configuration inside an Application Insights component. It is auto generated when the Continuous Export configuration is created.
     * 
     */
    public Output<String> exportId() {
        return this.exportId;
    }
    /**
     * This indicates current Continuous Export configuration status. The possible values are &#39;Preparing&#39;, &#39;Success&#39;, &#39;Failure&#39;.
     * 
     */
    @Export(name="exportStatus", type=String.class, parameters={})
    private Output<String> exportStatus;

    /**
     * @return This indicates current Continuous Export configuration status. The possible values are &#39;Preparing&#39;, &#39;Success&#39;, &#39;Failure&#39;.
     * 
     */
    public Output<String> exportStatus() {
        return this.exportStatus;
    }
    /**
     * The instrumentation key of the Application Insights component.
     * 
     */
    @Export(name="instrumentationKey", type=String.class, parameters={})
    private Output<String> instrumentationKey;

    /**
     * @return The instrumentation key of the Application Insights component.
     * 
     */
    public Output<String> instrumentationKey() {
        return this.instrumentationKey;
    }
    /**
     * This will be &#39;true&#39; if the Continuous Export configuration is enabled, otherwise it will be &#39;false&#39;.
     * 
     */
    @Export(name="isUserEnabled", type=String.class, parameters={})
    private Output<String> isUserEnabled;

    /**
     * @return This will be &#39;true&#39; if the Continuous Export configuration is enabled, otherwise it will be &#39;false&#39;.
     * 
     */
    public Output<String> isUserEnabled() {
        return this.isUserEnabled;
    }
    /**
     * The last time the Continuous Export configuration started failing.
     * 
     */
    @Export(name="lastGapTime", type=String.class, parameters={})
    private Output<String> lastGapTime;

    /**
     * @return The last time the Continuous Export configuration started failing.
     * 
     */
    public Output<String> lastGapTime() {
        return this.lastGapTime;
    }
    /**
     * The last time data was successfully delivered to the destination storage container for this Continuous Export configuration.
     * 
     */
    @Export(name="lastSuccessTime", type=String.class, parameters={})
    private Output<String> lastSuccessTime;

    /**
     * @return The last time data was successfully delivered to the destination storage container for this Continuous Export configuration.
     * 
     */
    public Output<String> lastSuccessTime() {
        return this.lastSuccessTime;
    }
    /**
     * Last time the Continuous Export configuration was updated.
     * 
     */
    @Export(name="lastUserUpdate", type=String.class, parameters={})
    private Output<String> lastUserUpdate;

    /**
     * @return Last time the Continuous Export configuration was updated.
     * 
     */
    public Output<String> lastUserUpdate() {
        return this.lastUserUpdate;
    }
    /**
     * Deprecated
     * 
     */
    @Export(name="notificationQueueEnabled", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationQueueEnabled;

    /**
     * @return Deprecated
     * 
     */
    public Output</* @Nullable */ String> notificationQueueEnabled() {
        return this.notificationQueueEnabled;
    }
    /**
     * This is the reason the Continuous Export configuration started failing. It can be &#39;AzureStorageNotFound&#39; or &#39;AzureStorageAccessDenied&#39;.
     * 
     */
    @Export(name="permanentErrorReason", type=String.class, parameters={})
    private Output<String> permanentErrorReason;

    /**
     * @return This is the reason the Continuous Export configuration started failing. It can be &#39;AzureStorageNotFound&#39; or &#39;AzureStorageAccessDenied&#39;.
     * 
     */
    public Output<String> permanentErrorReason() {
        return this.permanentErrorReason;
    }
    /**
     * This comma separated list of document types that will be exported. The possible values include &#39;Requests&#39;, &#39;Event&#39;, &#39;Exceptions&#39;, &#39;Metrics&#39;, &#39;PageViews&#39;, &#39;PageViewPerformance&#39;, &#39;Rdd&#39;, &#39;PerformanceCounters&#39;, &#39;Availability&#39;, &#39;Messages&#39;.
     * 
     */
    @Export(name="recordTypes", type=String.class, parameters={})
    private Output</* @Nullable */ String> recordTypes;

    /**
     * @return This comma separated list of document types that will be exported. The possible values include &#39;Requests&#39;, &#39;Event&#39;, &#39;Exceptions&#39;, &#39;Metrics&#39;, &#39;PageViews&#39;, &#39;PageViewPerformance&#39;, &#39;Rdd&#39;, &#39;PerformanceCounters&#39;, &#39;Availability&#39;, &#39;Messages&#39;.
     * 
     */
    public Output</* @Nullable */ String> recordTypes() {
        return this.recordTypes;
    }
    /**
     * The resource group of the Application Insights component.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return The resource group of the Application Insights component.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * The name of the destination storage account.
     * 
     */
    @Export(name="storageName", type=String.class, parameters={})
    private Output<String> storageName;

    /**
     * @return The name of the destination storage account.
     * 
     */
    public Output<String> storageName() {
        return this.storageName;
    }
    /**
     * The subscription of the Application Insights component.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The subscription of the Application Insights component.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExportConfiguration(String name) {
        this(name, ExportConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExportConfiguration(String name, ExportConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExportConfiguration(String name, ExportConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ExportConfiguration", name, args == null ? ExportConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExportConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ExportConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20150501:ExportConfiguration").build())
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
    public static ExportConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExportConfiguration(name, id, options);
    }
}
