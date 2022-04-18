// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.outputs;

import com.pulumi.aws.cloudtrail.outputs.TrailEventSelectorDataResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrailEventSelector {
    /**
     * Configuration block for data events. See details below.
     * 
     */
    private final @Nullable List<TrailEventSelectorDataResource> dataResources;
    /**
     * A set of event sources to exclude. Valid values include: `kms.amazonaws.com` and `rdsdata.amazonaws.com`. `include_management_events` must be set to`true` to allow this.
     * 
     */
    private final @Nullable List<String> excludeManagementEventSources;
    /**
     * Whether to include management events for your trail. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean includeManagementEvents;
    /**
     * Type of events to log. Valid values are `ReadOnly`, `WriteOnly`, `All`. Default value is `All`.
     * 
     */
    private final @Nullable String readWriteType;

    @CustomType.Constructor
    private TrailEventSelector(
        @CustomType.Parameter("dataResources") @Nullable List<TrailEventSelectorDataResource> dataResources,
        @CustomType.Parameter("excludeManagementEventSources") @Nullable List<String> excludeManagementEventSources,
        @CustomType.Parameter("includeManagementEvents") @Nullable Boolean includeManagementEvents,
        @CustomType.Parameter("readWriteType") @Nullable String readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    /**
     * Configuration block for data events. See details below.
     * 
    */
    public List<TrailEventSelectorDataResource> dataResources() {
        return this.dataResources == null ? List.of() : this.dataResources;
    }
    /**
     * A set of event sources to exclude. Valid values include: `kms.amazonaws.com` and `rdsdata.amazonaws.com`. `include_management_events` must be set to`true` to allow this.
     * 
    */
    public List<String> excludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? List.of() : this.excludeManagementEventSources;
    }
    /**
     * Whether to include management events for your trail. Defaults to `true`.
     * 
    */
    public Optional<Boolean> includeManagementEvents() {
        return Optional.ofNullable(this.includeManagementEvents);
    }
    /**
     * Type of events to log. Valid values are `ReadOnly`, `WriteOnly`, `All`. Default value is `All`.
     * 
    */
    public Optional<String> readWriteType() {
        return Optional.ofNullable(this.readWriteType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrailEventSelectorDataResource> dataResources;
        private @Nullable List<String> excludeManagementEventSources;
        private @Nullable Boolean includeManagementEvents;
        private @Nullable String readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder dataResources(@Nullable List<TrailEventSelectorDataResource> dataResources) {
            this.dataResources = dataResources;
            return this;
        }
        public Builder dataResources(TrailEventSelectorDataResource... dataResources) {
            return dataResources(List.of(dataResources));
        }
        public Builder excludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }
        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }
        public Builder includeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }
        public Builder readWriteType(@Nullable String readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }        public TrailEventSelector build() {
            return new TrailEventSelector(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
