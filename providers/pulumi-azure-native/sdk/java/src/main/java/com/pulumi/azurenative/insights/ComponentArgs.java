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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    /**
     * Type of application being monitored.
     * 
     */
    @Import(name="applicationType", required=true)
      private final Output<Either<String,ApplicationType>> applicationType;

    public Output<Either<String,ApplicationType>> applicationType() {
        return this.applicationType;
    }

    /**
     * Disable IP masking.
     * 
     */
    @Import(name="disableIpMasking")
      private final @Nullable Output<Boolean> disableIpMasking;

    public Output<Boolean> disableIpMasking() {
        return this.disableIpMasking == null ? Codegen.empty() : this.disableIpMasking;
    }

    /**
     * Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     * 
     */
    @Import(name="flowType")
      private final @Nullable Output<Either<String,FlowType>> flowType;

    public Output<Either<String,FlowType>> flowType() {
        return this.flowType == null ? Codegen.empty() : this.flowType;
    }

    /**
     * The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    @Import(name="hockeyAppId")
      private final @Nullable Output<String> hockeyAppId;

    public Output<String> hockeyAppId() {
        return this.hockeyAppId == null ? Codegen.empty() : this.hockeyAppId;
    }

    /**
     * Purge data immediately after 30 days.
     * 
     */
    @Import(name="immediatePurgeDataOn30Days")
      private final @Nullable Output<Boolean> immediatePurgeDataOn30Days;

    public Output<Boolean> immediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days == null ? Codegen.empty() : this.immediatePurgeDataOn30Days;
    }

    /**
     * Indicates the flow of the ingestion.
     * 
     */
    @Import(name="ingestionMode")
      private final @Nullable Output<Either<String,IngestionMode>> ingestionMode;

    public Output<Either<String,IngestionMode>> ingestionMode() {
        return this.ingestionMode == null ? Codegen.empty() : this.ingestionMode;
    }

    /**
     * The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default 'rest'.
     * 
     */
    @Import(name="requestSource")
      private final @Nullable Output<Either<String,RequestSource>> requestSource;

    public Output<Either<String,RequestSource>> requestSource() {
        return this.requestSource == null ? Codegen.empty() : this.requestSource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * Retention period in days.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Output<Integer> retentionInDays;

    public Output<Integer> retentionInDays() {
        return this.retentionInDays == null ? Codegen.empty() : this.retentionInDays;
    }

    /**
     * Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    @Import(name="samplingPercentage")
      private final @Nullable Output<Double> samplingPercentage;

    public Output<Double> samplingPercentage() {
        return this.samplingPercentage == null ? Codegen.empty() : this.samplingPercentage;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ComponentArgs(
        Output<Either<String,ApplicationType>> applicationType,
        @Nullable Output<Boolean> disableIpMasking,
        @Nullable Output<Either<String,FlowType>> flowType,
        @Nullable Output<String> hockeyAppId,
        @Nullable Output<Boolean> immediatePurgeDataOn30Days,
        @Nullable Output<Either<String,IngestionMode>> ingestionMode,
        Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,RequestSource>> requestSource,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<Integer> retentionInDays,
        @Nullable Output<Double> samplingPercentage,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationType = applicationType == null ? Output.ofLeft("web") : Objects.requireNonNull(applicationType, "expected parameter 'applicationType' to be non-null");
        this.disableIpMasking = disableIpMasking;
        this.flowType = flowType == null ? Output.ofLeft("Bluefield") : flowType;
        this.hockeyAppId = hockeyAppId;
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
        this.ingestionMode = ingestionMode == null ? Output.ofLeft("ApplicationInsights") : ingestionMode;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.requestSource = requestSource == null ? Output.ofLeft("rest") : requestSource;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.retentionInDays = retentionInDays == null ? Codegen.ofNullable(90) : retentionInDays;
        this.samplingPercentage = samplingPercentage;
        this.tags = tags;
    }

    private ComponentArgs() {
        this.applicationType = Codegen.empty();
        this.disableIpMasking = Codegen.empty();
        this.flowType = Codegen.empty();
        this.hockeyAppId = Codegen.empty();
        this.immediatePurgeDataOn30Days = Codegen.empty();
        this.ingestionMode = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.requestSource = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.retentionInDays = Codegen.empty();
        this.samplingPercentage = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ApplicationType>> applicationType;
        private @Nullable Output<Boolean> disableIpMasking;
        private @Nullable Output<Either<String,FlowType>> flowType;
        private @Nullable Output<String> hockeyAppId;
        private @Nullable Output<Boolean> immediatePurgeDataOn30Days;
        private @Nullable Output<Either<String,IngestionMode>> ingestionMode;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,RequestSource>> requestSource;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<Integer> retentionInDays;
        private @Nullable Output<Double> samplingPercentage;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationType = defaults.applicationType;
    	      this.disableIpMasking = defaults.disableIpMasking;
    	      this.flowType = defaults.flowType;
    	      this.hockeyAppId = defaults.hockeyAppId;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
    	      this.ingestionMode = defaults.ingestionMode;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.requestSource = defaults.requestSource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.tags = defaults.tags;
        }

        public Builder applicationType(Output<Either<String,ApplicationType>> applicationType) {
            this.applicationType = Objects.requireNonNull(applicationType);
            return this;
        }
        public Builder applicationType(Either<String,ApplicationType> applicationType) {
            this.applicationType = Output.of(Objects.requireNonNull(applicationType));
            return this;
        }
        public Builder disableIpMasking(@Nullable Output<Boolean> disableIpMasking) {
            this.disableIpMasking = disableIpMasking;
            return this;
        }
        public Builder disableIpMasking(@Nullable Boolean disableIpMasking) {
            this.disableIpMasking = Codegen.ofNullable(disableIpMasking);
            return this;
        }
        public Builder flowType(@Nullable Output<Either<String,FlowType>> flowType) {
            this.flowType = flowType;
            return this;
        }
        public Builder flowType(@Nullable Either<String,FlowType> flowType) {
            this.flowType = Codegen.ofNullable(flowType);
            return this;
        }
        public Builder hockeyAppId(@Nullable Output<String> hockeyAppId) {
            this.hockeyAppId = hockeyAppId;
            return this;
        }
        public Builder hockeyAppId(@Nullable String hockeyAppId) {
            this.hockeyAppId = Codegen.ofNullable(hockeyAppId);
            return this;
        }
        public Builder immediatePurgeDataOn30Days(@Nullable Output<Boolean> immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }
        public Builder immediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = Codegen.ofNullable(immediatePurgeDataOn30Days);
            return this;
        }
        public Builder ingestionMode(@Nullable Output<Either<String,IngestionMode>> ingestionMode) {
            this.ingestionMode = ingestionMode;
            return this;
        }
        public Builder ingestionMode(@Nullable Either<String,IngestionMode> ingestionMode) {
            this.ingestionMode = Codegen.ofNullable(ingestionMode);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder requestSource(@Nullable Output<Either<String,RequestSource>> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public Builder requestSource(@Nullable Either<String,RequestSource> requestSource) {
            this.requestSource = Codegen.ofNullable(requestSource);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Codegen.ofNullable(retentionInDays);
            return this;
        }
        public Builder samplingPercentage(@Nullable Output<Double> samplingPercentage) {
            this.samplingPercentage = samplingPercentage;
            return this;
        }
        public Builder samplingPercentage(@Nullable Double samplingPercentage) {
            this.samplingPercentage = Codegen.ofNullable(samplingPercentage);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ComponentArgs build() {
            return new ComponentArgs(applicationType, disableIpMasking, flowType, hockeyAppId, immediatePurgeDataOn30Days, ingestionMode, kind, location, requestSource, resourceGroupName, resourceName, retentionInDays, samplingPercentage, tags);
        }
    }
}
