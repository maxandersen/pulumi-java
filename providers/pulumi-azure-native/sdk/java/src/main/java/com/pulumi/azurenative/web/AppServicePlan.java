// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.AppServicePlanArgs;
import com.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import com.pulumi.azurenative.web.outputs.KubeEnvironmentProfileResponse;
import com.pulumi.azurenative.web.outputs.SkuDescriptionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * App Service plan.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:AppServicePlan testsf6141 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Web/serverfarms/testsf6141 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:AppServicePlan")
public class AppServicePlan extends com.pulumi.resources.CustomResource {
    /**
     * The time when the server farm free offer expires.
     * 
     */
    @Export(name="freeOfferExpirationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> freeOfferExpirationTime;

    /**
     * @return The time when the server farm free offer expires.
     * 
     */
    public Output</* @Nullable */ String> freeOfferExpirationTime() {
        return this.freeOfferExpirationTime;
    }
    /**
     * Geographical location for the App Service plan.
     * 
     */
    @Export(name="geoRegion", type=String.class, parameters={})
    private Output<String> geoRegion;

    /**
     * @return Geographical location for the App Service plan.
     * 
     */
    public Output<String> geoRegion() {
        return this.geoRegion;
    }
    /**
     * Specification for the App Service Environment to use for the App Service plan.
     * 
     */
    @Export(name="hostingEnvironmentProfile", type=HostingEnvironmentProfileResponse.class, parameters={})
    private Output</* @Nullable */ HostingEnvironmentProfileResponse> hostingEnvironmentProfile;

    /**
     * @return Specification for the App Service Environment to use for the App Service plan.
     * 
     */
    public Output</* @Nullable */ HostingEnvironmentProfileResponse> hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }
    /**
     * If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Export(name="hyperV", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hyperV;

    /**
     * @return If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Output</* @Nullable */ Boolean> hyperV() {
        return this.hyperV;
    }
    /**
     * If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     */
    @Export(name="isSpot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSpot;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     */
    public Output</* @Nullable */ Boolean> isSpot() {
        return this.isSpot;
    }
    /**
     * Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Export(name="isXenon", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isXenon;

    /**
     * @return Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Output</* @Nullable */ Boolean> isXenon() {
        return this.isXenon;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     */
    @Export(name="kubeEnvironmentProfile", type=KubeEnvironmentProfileResponse.class, parameters={})
    private Output</* @Nullable */ KubeEnvironmentProfileResponse> kubeEnvironmentProfile;

    /**
     * @return Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     */
    public Output</* @Nullable */ KubeEnvironmentProfileResponse> kubeEnvironmentProfile() {
        return this.kubeEnvironmentProfile;
    }
    /**
     * Resource Location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     * 
     */
    @Export(name="maximumElasticWorkerCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumElasticWorkerCount;

    /**
     * @return Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     * 
     */
    public Output</* @Nullable */ Integer> maximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount;
    }
    /**
     * Maximum number of instances that can be assigned to this App Service plan.
     * 
     */
    @Export(name="maximumNumberOfWorkers", type=Integer.class, parameters={})
    private Output<Integer> maximumNumberOfWorkers;

    /**
     * @return Maximum number of instances that can be assigned to this App Service plan.
     * 
     */
    public Output<Integer> maximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Number of apps assigned to this App Service plan.
     * 
     */
    @Export(name="numberOfSites", type=Integer.class, parameters={})
    private Output<Integer> numberOfSites;

    /**
     * @return Number of apps assigned to this App Service plan.
     * 
     */
    public Output<Integer> numberOfSites() {
        return this.numberOfSites;
    }
    /**
     * If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     */
    @Export(name="perSiteScaling", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> perSiteScaling;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     */
    public Output</* @Nullable */ Boolean> perSiteScaling() {
        return this.perSiteScaling;
    }
    /**
     * Provisioning state of the App Service Plan.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the App Service Plan.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Export(name="reserved", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reserved;

    /**
     * @return If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Output</* @Nullable */ Boolean> reserved() {
        return this.reserved;
    }
    /**
     * Resource group of the App Service plan.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of the App Service plan.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Description of a SKU for a scalable resource.
     * 
     */
    @Export(name="sku", type=SkuDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ SkuDescriptionResponse> sku;

    /**
     * @return Description of a SKU for a scalable resource.
     * 
     */
    public Output</* @Nullable */ SkuDescriptionResponse> sku() {
        return this.sku;
    }
    /**
     * The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     */
    @Export(name="spotExpirationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotExpirationTime;

    /**
     * @return The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     */
    public Output</* @Nullable */ String> spotExpirationTime() {
        return this.spotExpirationTime;
    }
    /**
     * App Service plan status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return App Service plan status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * App Service plan subscription.
     * 
     */
    @Export(name="subscription", type=String.class, parameters={})
    private Output<String> subscription;

    /**
     * @return App Service plan subscription.
     * 
     */
    public Output<String> subscription() {
        return this.subscription;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Scaling worker count.
     * 
     */
    @Export(name="targetWorkerCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> targetWorkerCount;

    /**
     * @return Scaling worker count.
     * 
     */
    public Output</* @Nullable */ Integer> targetWorkerCount() {
        return this.targetWorkerCount;
    }
    /**
     * Scaling worker size ID.
     * 
     */
    @Export(name="targetWorkerSizeId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> targetWorkerSizeId;

    /**
     * @return Scaling worker size ID.
     * 
     */
    public Output</* @Nullable */ Integer> targetWorkerSizeId() {
        return this.targetWorkerSizeId;
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
     * Target worker tier assigned to the App Service plan.
     * 
     */
    @Export(name="workerTierName", type=String.class, parameters={})
    private Output</* @Nullable */ String> workerTierName;

    /**
     * @return Target worker tier assigned to the App Service plan.
     * 
     */
    public Output</* @Nullable */ String> workerTierName() {
        return this.workerTierName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppServicePlan(String name) {
        this(name, AppServicePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppServicePlan(String name, AppServicePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppServicePlan(String name, AppServicePlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:AppServicePlan", name, args == null ? AppServicePlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppServicePlan(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:AppServicePlan", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160901:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:AppServicePlan").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:AppServicePlan").build())
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
    public static AppServicePlan get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppServicePlan(name, id, options);
    }
}
