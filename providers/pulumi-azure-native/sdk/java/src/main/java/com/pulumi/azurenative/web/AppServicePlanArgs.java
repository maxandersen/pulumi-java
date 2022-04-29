// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import com.pulumi.azurenative.web.inputs.KubeEnvironmentProfileArgs;
import com.pulumi.azurenative.web.inputs.SkuDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppServicePlanArgs extends ResourceArgs {

    public static final AppServicePlanArgs Empty = new AppServicePlanArgs();

    /**
     * The time when the server farm free offer expires.
     * 
     */
    @Import(name="freeOfferExpirationTime")
    private @Nullable Output<String> freeOfferExpirationTime;

    /**
     * @return The time when the server farm free offer expires.
     * 
     */
    public Optional<Output<String>> freeOfferExpirationTime() {
        return Optional.ofNullable(this.freeOfferExpirationTime);
    }

    /**
     * Specification for the App Service Environment to use for the App Service plan.
     * 
     */
    @Import(name="hostingEnvironmentProfile")
    private @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    /**
     * @return Specification for the App Service Environment to use for the App Service plan.
     * 
     */
    public Optional<Output<HostingEnvironmentProfileArgs>> hostingEnvironmentProfile() {
        return Optional.ofNullable(this.hostingEnvironmentProfile);
    }

    /**
     * If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Import(name="hyperV")
    private @Nullable Output<Boolean> hyperV;

    /**
     * @return If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Optional<Output<Boolean>> hyperV() {
        return Optional.ofNullable(this.hyperV);
    }

    /**
     * If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     */
    @Import(name="isSpot")
    private @Nullable Output<Boolean> isSpot;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     */
    public Optional<Output<Boolean>> isSpot() {
        return Optional.ofNullable(this.isSpot);
    }

    /**
     * Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Import(name="isXenon")
    private @Nullable Output<Boolean> isXenon;

    /**
     * @return Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Optional<Output<Boolean>> isXenon() {
        return Optional.ofNullable(this.isXenon);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     */
    @Import(name="kubeEnvironmentProfile")
    private @Nullable Output<KubeEnvironmentProfileArgs> kubeEnvironmentProfile;

    /**
     * @return Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     */
    public Optional<Output<KubeEnvironmentProfileArgs>> kubeEnvironmentProfile() {
        return Optional.ofNullable(this.kubeEnvironmentProfile);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     * 
     */
    @Import(name="maximumElasticWorkerCount")
    private @Nullable Output<Integer> maximumElasticWorkerCount;

    /**
     * @return Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     * 
     */
    public Optional<Output<Integer>> maximumElasticWorkerCount() {
        return Optional.ofNullable(this.maximumElasticWorkerCount);
    }

    /**
     * Name of the App Service plan.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the App Service plan.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     */
    @Import(name="perSiteScaling")
    private @Nullable Output<Boolean> perSiteScaling;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     */
    public Optional<Output<Boolean>> perSiteScaling() {
        return Optional.ofNullable(this.perSiteScaling);
    }

    /**
     * If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    /**
     * @return If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     */
    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Description of a SKU for a scalable resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuDescriptionArgs> sku;

    /**
     * @return Description of a SKU for a scalable resource.
     * 
     */
    public Optional<Output<SkuDescriptionArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     */
    @Import(name="spotExpirationTime")
    private @Nullable Output<String> spotExpirationTime;

    /**
     * @return The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     */
    public Optional<Output<String>> spotExpirationTime() {
        return Optional.ofNullable(this.spotExpirationTime);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Scaling worker count.
     * 
     */
    @Import(name="targetWorkerCount")
    private @Nullable Output<Integer> targetWorkerCount;

    /**
     * @return Scaling worker count.
     * 
     */
    public Optional<Output<Integer>> targetWorkerCount() {
        return Optional.ofNullable(this.targetWorkerCount);
    }

    /**
     * Scaling worker size ID.
     * 
     */
    @Import(name="targetWorkerSizeId")
    private @Nullable Output<Integer> targetWorkerSizeId;

    /**
     * @return Scaling worker size ID.
     * 
     */
    public Optional<Output<Integer>> targetWorkerSizeId() {
        return Optional.ofNullable(this.targetWorkerSizeId);
    }

    /**
     * Target worker tier assigned to the App Service plan.
     * 
     */
    @Import(name="workerTierName")
    private @Nullable Output<String> workerTierName;

    /**
     * @return Target worker tier assigned to the App Service plan.
     * 
     */
    public Optional<Output<String>> workerTierName() {
        return Optional.ofNullable(this.workerTierName);
    }

    private AppServicePlanArgs() {}

    private AppServicePlanArgs(AppServicePlanArgs $) {
        this.freeOfferExpirationTime = $.freeOfferExpirationTime;
        this.hostingEnvironmentProfile = $.hostingEnvironmentProfile;
        this.hyperV = $.hyperV;
        this.isSpot = $.isSpot;
        this.isXenon = $.isXenon;
        this.kind = $.kind;
        this.kubeEnvironmentProfile = $.kubeEnvironmentProfile;
        this.location = $.location;
        this.maximumElasticWorkerCount = $.maximumElasticWorkerCount;
        this.name = $.name;
        this.perSiteScaling = $.perSiteScaling;
        this.reserved = $.reserved;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.spotExpirationTime = $.spotExpirationTime;
        this.tags = $.tags;
        this.targetWorkerCount = $.targetWorkerCount;
        this.targetWorkerSizeId = $.targetWorkerSizeId;
        this.workerTierName = $.workerTierName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServicePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServicePlanArgs $;

        public Builder() {
            $ = new AppServicePlanArgs();
        }

        public Builder(AppServicePlanArgs defaults) {
            $ = new AppServicePlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param freeOfferExpirationTime The time when the server farm free offer expires.
         * 
         * @return builder
         * 
         */
        public Builder freeOfferExpirationTime(@Nullable Output<String> freeOfferExpirationTime) {
            $.freeOfferExpirationTime = freeOfferExpirationTime;
            return this;
        }

        /**
         * @param freeOfferExpirationTime The time when the server farm free offer expires.
         * 
         * @return builder
         * 
         */
        public Builder freeOfferExpirationTime(String freeOfferExpirationTime) {
            return freeOfferExpirationTime(Output.of(freeOfferExpirationTime));
        }

        /**
         * @param hostingEnvironmentProfile Specification for the App Service Environment to use for the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironmentProfile(@Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            $.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        /**
         * @param hostingEnvironmentProfile Specification for the App Service Environment to use for the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironmentProfile(HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            return hostingEnvironmentProfile(Output.of(hostingEnvironmentProfile));
        }

        /**
         * @param hyperV If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder hyperV(@Nullable Output<Boolean> hyperV) {
            $.hyperV = hyperV;
            return this;
        }

        /**
         * @param hyperV If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder hyperV(Boolean hyperV) {
            return hyperV(Output.of(hyperV));
        }

        /**
         * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
         * 
         * @return builder
         * 
         */
        public Builder isSpot(@Nullable Output<Boolean> isSpot) {
            $.isSpot = isSpot;
            return this;
        }

        /**
         * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
         * 
         * @return builder
         * 
         */
        public Builder isSpot(Boolean isSpot) {
            return isSpot(Output.of(isSpot));
        }

        /**
         * @param isXenon Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder isXenon(@Nullable Output<Boolean> isXenon) {
            $.isXenon = isXenon;
            return this;
        }

        /**
         * @param isXenon Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder isXenon(Boolean isXenon) {
            return isXenon(Output.of(isXenon));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kubeEnvironmentProfile Specification for the Kubernetes Environment to use for the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder kubeEnvironmentProfile(@Nullable Output<KubeEnvironmentProfileArgs> kubeEnvironmentProfile) {
            $.kubeEnvironmentProfile = kubeEnvironmentProfile;
            return this;
        }

        /**
         * @param kubeEnvironmentProfile Specification for the Kubernetes Environment to use for the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder kubeEnvironmentProfile(KubeEnvironmentProfileArgs kubeEnvironmentProfile) {
            return kubeEnvironmentProfile(Output.of(kubeEnvironmentProfile));
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
         * 
         * @return builder
         * 
         */
        public Builder maximumElasticWorkerCount(@Nullable Output<Integer> maximumElasticWorkerCount) {
            $.maximumElasticWorkerCount = maximumElasticWorkerCount;
            return this;
        }

        /**
         * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
         * 
         * @return builder
         * 
         */
        public Builder maximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
            return maximumElasticWorkerCount(Output.of(maximumElasticWorkerCount));
        }

        /**
         * @param name Name of the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
         * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
         * 
         * @return builder
         * 
         */
        public Builder perSiteScaling(@Nullable Output<Boolean> perSiteScaling) {
            $.perSiteScaling = perSiteScaling;
            return this;
        }

        /**
         * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
         * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
         * 
         * @return builder
         * 
         */
        public Builder perSiteScaling(Boolean perSiteScaling) {
            return perSiteScaling(Output.of(perSiteScaling));
        }

        /**
         * @param reserved If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        /**
         * @param reserved If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
         * 
         * @return builder
         * 
         */
        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Description of a SKU for a scalable resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuDescriptionArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Description of a SKU for a scalable resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuDescriptionArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm.
         * 
         * @return builder
         * 
         */
        public Builder spotExpirationTime(@Nullable Output<String> spotExpirationTime) {
            $.spotExpirationTime = spotExpirationTime;
            return this;
        }

        /**
         * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm.
         * 
         * @return builder
         * 
         */
        public Builder spotExpirationTime(String spotExpirationTime) {
            return spotExpirationTime(Output.of(spotExpirationTime));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetWorkerCount Scaling worker count.
         * 
         * @return builder
         * 
         */
        public Builder targetWorkerCount(@Nullable Output<Integer> targetWorkerCount) {
            $.targetWorkerCount = targetWorkerCount;
            return this;
        }

        /**
         * @param targetWorkerCount Scaling worker count.
         * 
         * @return builder
         * 
         */
        public Builder targetWorkerCount(Integer targetWorkerCount) {
            return targetWorkerCount(Output.of(targetWorkerCount));
        }

        /**
         * @param targetWorkerSizeId Scaling worker size ID.
         * 
         * @return builder
         * 
         */
        public Builder targetWorkerSizeId(@Nullable Output<Integer> targetWorkerSizeId) {
            $.targetWorkerSizeId = targetWorkerSizeId;
            return this;
        }

        /**
         * @param targetWorkerSizeId Scaling worker size ID.
         * 
         * @return builder
         * 
         */
        public Builder targetWorkerSizeId(Integer targetWorkerSizeId) {
            return targetWorkerSizeId(Output.of(targetWorkerSizeId));
        }

        /**
         * @param workerTierName Target worker tier assigned to the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder workerTierName(@Nullable Output<String> workerTierName) {
            $.workerTierName = workerTierName;
            return this;
        }

        /**
         * @param workerTierName Target worker tier assigned to the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder workerTierName(String workerTierName) {
            return workerTierName(Output.of(workerTierName));
        }

        public AppServicePlanArgs build() {
            $.hyperV = Codegen.booleanProp("hyperV").output().arg($.hyperV).def(false).getNullable();
            $.isXenon = Codegen.booleanProp("isXenon").output().arg($.isXenon).def(false).getNullable();
            $.perSiteScaling = Codegen.booleanProp("perSiteScaling").output().arg($.perSiteScaling).def(false).getNullable();
            $.reserved = Codegen.booleanProp("reserved").output().arg($.reserved).def(false).getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
