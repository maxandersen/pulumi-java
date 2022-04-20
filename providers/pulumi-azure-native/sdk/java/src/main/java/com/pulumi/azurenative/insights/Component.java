// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ComponentArgs;
import com.pulumi.azurenative.insights.outputs.PrivateLinkScopedResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Application Insights component definition.
 * API Version: 2015-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:Component my-component /subscriptions/subid/resourceGroups/my-resource-group/providers/Microsoft.Insights/components/my-component 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:Component")
public class Component extends com.pulumi.resources.CustomResource {
    /**
     * Application Insights Unique ID for your Application.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Application Insights Unique ID for your Application.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The unique ID of your application. This field mirrors the &#39;Name&#39; field and cannot be changed.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The unique ID of your application. This field mirrors the &#39;Name&#39; field and cannot be changed.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Type of application being monitored.
     * 
     */
    @Export(name="applicationType", type=String.class, parameters={})
    private Output<String> applicationType;

    /**
     * @return Type of application being monitored.
     * 
     */
    public Output<String> applicationType() {
        return this.applicationType;
    }
    /**
     * Application Insights component connection string.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return Application Insights component connection string.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * Creation Date for the Application Insights component, in ISO 8601 format.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return Creation Date for the Application Insights component, in ISO 8601 format.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * Disable IP masking.
     * 
     */
    @Export(name="disableIpMasking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableIpMasking;

    /**
     * @return Disable IP masking.
     * 
     */
    public Output</* @Nullable */ Boolean> disableIpMasking() {
        return this.disableIpMasking;
    }
    /**
     * Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    @Export(name="flowType", type=String.class, parameters={})
    private Output</* @Nullable */ String> flowType;

    /**
     * @return Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    public Output</* @Nullable */ String> flowType() {
        return this.flowType;
    }
    /**
     * The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    @Export(name="hockeyAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> hockeyAppId;

    /**
     * @return The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    public Output</* @Nullable */ String> hockeyAppId() {
        return this.hockeyAppId;
    }
    /**
     * Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
     */
    @Export(name="hockeyAppToken", type=String.class, parameters={})
    private Output<String> hockeyAppToken;

    /**
     * @return Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
     */
    public Output<String> hockeyAppToken() {
        return this.hockeyAppToken;
    }
    /**
     * Purge data immediately after 30 days.
     * 
     */
    @Export(name="immediatePurgeDataOn30Days", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> immediatePurgeDataOn30Days;

    /**
     * @return Purge data immediately after 30 days.
     * 
     */
    public Output</* @Nullable */ Boolean> immediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days;
    }
    /**
     * Indicates the flow of the ingestion.
     * 
     */
    @Export(name="ingestionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> ingestionMode;

    /**
     * @return Indicates the flow of the ingestion.
     * 
     */
    public Output</* @Nullable */ String> ingestionMode() {
        return this.ingestionMode;
    }
    /**
     * Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
     */
    @Export(name="instrumentationKey", type=String.class, parameters={})
    private Output<String> instrumentationKey;

    /**
     * @return Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
     */
    public Output<String> instrumentationKey() {
        return this.instrumentationKey;
    }
    /**
     * The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * List of linked private link scope resources.
     * 
     */
    @Export(name="privateLinkScopedResources", type=List.class, parameters={PrivateLinkScopedResourceResponse.class})
    private Output<List<PrivateLinkScopedResourceResponse>> privateLinkScopedResources;

    /**
     * @return List of linked private link scope resources.
     * 
     */
    public Output<List<PrivateLinkScopedResourceResponse>> privateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }
    /**
     * Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    @Export(name="requestSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestSource;

    /**
     * @return Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    public Output</* @Nullable */ String> requestSource() {
        return this.requestSource;
    }
    /**
     * Retention period in days.
     * 
     */
    @Export(name="retentionInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionInDays;

    /**
     * @return Retention period in days.
     * 
     */
    public Output</* @Nullable */ Integer> retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    @Export(name="samplingPercentage", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> samplingPercentage;

    /**
     * @return Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    public Output</* @Nullable */ Double> samplingPercentage() {
        return this.samplingPercentage;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Azure Tenant Id.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return Azure Tenant Id.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
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
    public Component(String name) {
        this(name, ComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Component(String name, ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, ComponentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Component(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Component", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20150501:Component").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180501preview:Component").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20200202:Component").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20200202preview:Component").build())
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
    public static Component get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}
