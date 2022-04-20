// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudtrail.inputs;

import com.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import com.pulumi.awsnative.cloudtrail.inputs.TrailDataResource;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The type of email sending events to publish to the event destination.
 * 
 */
public final class TrailEventSelector extends com.pulumi.resources.InvokeArgs {

    public static final TrailEventSelector Empty = new TrailEventSelector();

    @Import(name="dataResources")
      private final @Nullable List<TrailDataResource> dataResources;

    public List<TrailDataResource> dataResources() {
        return this.dataResources == null ? List.of() : this.dataResources;
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @Import(name="excludeManagementEventSources")
      private final @Nullable List<String> excludeManagementEventSources;

    public List<String> excludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? List.of() : this.excludeManagementEventSources;
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @Import(name="includeManagementEvents")
      private final @Nullable Boolean includeManagementEvents;

    public Optional<Boolean> includeManagementEvents() {
        return this.includeManagementEvents == null ? Optional.empty() : Optional.ofNullable(this.includeManagementEvents);
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @Import(name="readWriteType")
      private final @Nullable TrailEventSelectorReadWriteType readWriteType;

    public Optional<TrailEventSelectorReadWriteType> readWriteType() {
        return this.readWriteType == null ? Optional.empty() : Optional.ofNullable(this.readWriteType);
    }

    public TrailEventSelector(
        @Nullable List<TrailDataResource> dataResources,
        @Nullable List<String> excludeManagementEventSources,
        @Nullable Boolean includeManagementEvents,
        @Nullable TrailEventSelectorReadWriteType readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    private TrailEventSelector() {
        this.dataResources = List.of();
        this.excludeManagementEventSources = List.of();
        this.includeManagementEvents = null;
        this.readWriteType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrailDataResource> dataResources;
        private @Nullable List<String> excludeManagementEventSources;
        private @Nullable Boolean includeManagementEvents;
        private @Nullable TrailEventSelectorReadWriteType readWriteType;

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

        public Builder dataResources(@Nullable List<TrailDataResource> dataResources) {
            this.dataResources = dataResources;
            return this;
        }
        public Builder dataResources(TrailDataResource... dataResources) {
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
        public Builder readWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }        public TrailEventSelector build() {
            return new TrailEventSelector(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
