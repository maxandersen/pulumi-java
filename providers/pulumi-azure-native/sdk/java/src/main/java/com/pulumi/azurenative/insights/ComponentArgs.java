// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.enums.ApplicationType;
import com.pulumi.azurenative.insights.enums.FlowType;
import com.pulumi.azurenative.insights.enums.IngestionMode;
import com.pulumi.azurenative.insights.enums.RequestSource;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    /**
     * Type of application being monitored.
     * 
     */
    @Import(name="applicationType", required=true)
    private Output<Either<String,ApplicationType>> applicationType;

    /**
     * @return Type of application being monitored.
     * 
     */
    public Output<Either<String,ApplicationType>> applicationType() {
        return this.applicationType;
    }

    /**
     * Disable IP masking.
     * 
     */
    @Import(name="disableIpMasking")
    private @Nullable Output<Boolean> disableIpMasking;

    /**
     * @return Disable IP masking.
     * 
     */
    public Optional<Output<Boolean>> disableIpMasking() {
        return Optional.ofNullable(this.disableIpMasking);
    }

    /**
     * Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    @Import(name="flowType")
    private @Nullable Output<Either<String,FlowType>> flowType;

    /**
     * @return Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    public Optional<Output<Either<String,FlowType>>> flowType() {
        return Optional.ofNullable(this.flowType);
    }

    /**
     * The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    @Import(name="hockeyAppId")
    private @Nullable Output<String> hockeyAppId;

    /**
     * @return The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    public Optional<Output<String>> hockeyAppId() {
        return Optional.ofNullable(this.hockeyAppId);
    }

    /**
     * Purge data immediately after 30 days.
     * 
     */
    @Import(name="immediatePurgeDataOn30Days")
    private @Nullable Output<Boolean> immediatePurgeDataOn30Days;

    /**
     * @return Purge data immediately after 30 days.
     * 
     */
    public Optional<Output<Boolean>> immediatePurgeDataOn30Days() {
        return Optional.ofNullable(this.immediatePurgeDataOn30Days);
    }

    /**
     * Indicates the flow of the ingestion.
     * 
     */
    @Import(name="ingestionMode")
    private @Nullable Output<Either<String,IngestionMode>> ingestionMode;

    /**
     * @return Indicates the flow of the ingestion.
     * 
     */
    public Optional<Output<Either<String,IngestionMode>>> ingestionMode() {
        return Optional.ofNullable(this.ingestionMode);
    }

    /**
     * The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    @Import(name="kind", required=true)
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
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    @Import(name="requestSource")
    private @Nullable Output<Either<String,RequestSource>> requestSource;

    /**
     * @return Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    public Optional<Output<Either<String,RequestSource>>> requestSource() {
        return Optional.ofNullable(this.requestSource);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the Application Insights component resource.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Retention period in days.
     * 
     */
    @Import(name="retentionInDays")
    private @Nullable Output<Integer> retentionInDays;

    /**
     * @return Retention period in days.
     * 
     */
    public Optional<Output<Integer>> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    /**
     * Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    @Import(name="samplingPercentage")
    private @Nullable Output<Double> samplingPercentage;

    /**
     * @return Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    public Optional<Output<Double>> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ComponentArgs() {}

    private ComponentArgs(ComponentArgs $) {
        this.applicationType = $.applicationType;
        this.disableIpMasking = $.disableIpMasking;
        this.flowType = $.flowType;
        this.hockeyAppId = $.hockeyAppId;
        this.immediatePurgeDataOn30Days = $.immediatePurgeDataOn30Days;
        this.ingestionMode = $.ingestionMode;
        this.kind = $.kind;
        this.location = $.location;
        this.requestSource = $.requestSource;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.retentionInDays = $.retentionInDays;
        this.samplingPercentage = $.samplingPercentage;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentArgs $;

        public Builder() {
            $ = new ComponentArgs();
        }

        public Builder(ComponentArgs defaults) {
            $ = new ComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationType Type of application being monitored.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(Output<Either<String,ApplicationType>> applicationType) {
            $.applicationType = applicationType;
            return this;
        }

        /**
         * @param applicationType Type of application being monitored.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(Either<String,ApplicationType> applicationType) {
            return applicationType(Output.of(applicationType));
        }

        /**
         * @param applicationType Type of application being monitored.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(String applicationType) {
            return applicationType(Either.ofLeft(applicationType));
        }

        /**
         * @param applicationType Type of application being monitored.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(ApplicationType applicationType) {
            return applicationType(Either.ofRight(applicationType));
        }

        /**
         * @param disableIpMasking Disable IP masking.
         * 
         * @return builder
         * 
         */
        public Builder disableIpMasking(@Nullable Output<Boolean> disableIpMasking) {
            $.disableIpMasking = disableIpMasking;
            return this;
        }

        /**
         * @param disableIpMasking Disable IP masking.
         * 
         * @return builder
         * 
         */
        public Builder disableIpMasking(Boolean disableIpMasking) {
            return disableIpMasking(Output.of(disableIpMasking));
        }

        /**
         * @param flowType Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
         * 
         * @return builder
         * 
         */
        public Builder flowType(@Nullable Output<Either<String,FlowType>> flowType) {
            $.flowType = flowType;
            return this;
        }

        /**
         * @param flowType Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
         * 
         * @return builder
         * 
         */
        public Builder flowType(Either<String,FlowType> flowType) {
            return flowType(Output.of(flowType));
        }

        /**
         * @param flowType Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
         * 
         * @return builder
         * 
         */
        public Builder flowType(String flowType) {
            return flowType(Either.ofLeft(flowType));
        }

        /**
         * @param flowType Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
         * 
         * @return builder
         * 
         */
        public Builder flowType(FlowType flowType) {
            return flowType(Either.ofRight(flowType));
        }

        /**
         * @param hockeyAppId The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
         * 
         * @return builder
         * 
         */
        public Builder hockeyAppId(@Nullable Output<String> hockeyAppId) {
            $.hockeyAppId = hockeyAppId;
            return this;
        }

        /**
         * @param hockeyAppId The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
         * 
         * @return builder
         * 
         */
        public Builder hockeyAppId(String hockeyAppId) {
            return hockeyAppId(Output.of(hockeyAppId));
        }

        /**
         * @param immediatePurgeDataOn30Days Purge data immediately after 30 days.
         * 
         * @return builder
         * 
         */
        public Builder immediatePurgeDataOn30Days(@Nullable Output<Boolean> immediatePurgeDataOn30Days) {
            $.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }

        /**
         * @param immediatePurgeDataOn30Days Purge data immediately after 30 days.
         * 
         * @return builder
         * 
         */
        public Builder immediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
            return immediatePurgeDataOn30Days(Output.of(immediatePurgeDataOn30Days));
        }

        /**
         * @param ingestionMode Indicates the flow of the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder ingestionMode(@Nullable Output<Either<String,IngestionMode>> ingestionMode) {
            $.ingestionMode = ingestionMode;
            return this;
        }

        /**
         * @param ingestionMode Indicates the flow of the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder ingestionMode(Either<String,IngestionMode> ingestionMode) {
            return ingestionMode(Output.of(ingestionMode));
        }

        /**
         * @param ingestionMode Indicates the flow of the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder ingestionMode(String ingestionMode) {
            return ingestionMode(Either.ofLeft(ingestionMode));
        }

        /**
         * @param ingestionMode Indicates the flow of the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder ingestionMode(IngestionMode ingestionMode) {
            return ingestionMode(Either.ofRight(ingestionMode));
        }

        /**
         * @param kind The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param requestSource Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder requestSource(@Nullable Output<Either<String,RequestSource>> requestSource) {
            $.requestSource = requestSource;
            return this;
        }

        /**
         * @param requestSource Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder requestSource(Either<String,RequestSource> requestSource) {
            return requestSource(Output.of(requestSource));
        }

        /**
         * @param requestSource Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder requestSource(String requestSource) {
            return requestSource(Either.ofLeft(requestSource));
        }

        /**
         * @param requestSource Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder requestSource(RequestSource requestSource) {
            return requestSource(Either.ofRight(requestSource));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param retentionInDays Retention period in days.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays Retention period in days.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param samplingPercentage Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(@Nullable Output<Double> samplingPercentage) {
            $.samplingPercentage = samplingPercentage;
            return this;
        }

        /**
         * @param samplingPercentage Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(Double samplingPercentage) {
            return samplingPercentage(Output.of(samplingPercentage));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ComponentArgs build() {
            $.applicationType = Codegen.stringProp("applicationType").left(ApplicationType.class).output().arg($.applicationType).def("web").require();
            $.flowType = Codegen.stringProp("flowType").left(FlowType.class).output().arg($.flowType).def("Bluefield").getNullable();
            $.ingestionMode = Codegen.stringProp("ingestionMode").left(IngestionMode.class).output().arg($.ingestionMode).def("ApplicationInsights").getNullable();
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.requestSource = Codegen.stringProp("requestSource").left(RequestSource.class).output().arg($.requestSource).def("rest").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.retentionInDays = Codegen.integerProp("retentionInDays").output().arg($.retentionInDays).def(90).getNullable();
            return $;
        }
    }

}
