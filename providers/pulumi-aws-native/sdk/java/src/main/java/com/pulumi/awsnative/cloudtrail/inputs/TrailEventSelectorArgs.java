// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudtrail.inputs;

import com.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import com.pulumi.awsnative.cloudtrail.inputs.TrailDataResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The type of email sending events to publish to the event destination.
 * 
 */
public final class TrailEventSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorArgs Empty = new TrailEventSelectorArgs();

    @Import(name="dataResources")
      private final @Nullable Output<List<TrailDataResourceArgs>> dataResources;

    public Output<List<TrailDataResourceArgs>> dataResources() {
        return this.dataResources == null ? Codegen.empty() : this.dataResources;
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing "kms.amazonaws.com". By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @Import(name="excludeManagementEventSources")
      private final @Nullable Output<List<String>> excludeManagementEventSources;

    public Output<List<String>> excludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? Codegen.empty() : this.excludeManagementEventSources;
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @Import(name="includeManagementEvents")
      private final @Nullable Output<Boolean> includeManagementEvents;

    public Output<Boolean> includeManagementEvents() {
        return this.includeManagementEvents == null ? Codegen.empty() : this.includeManagementEvents;
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @Import(name="readWriteType")
      private final @Nullable Output<TrailEventSelectorReadWriteType> readWriteType;

    public Output<TrailEventSelectorReadWriteType> readWriteType() {
        return this.readWriteType == null ? Codegen.empty() : this.readWriteType;
    }

    public TrailEventSelectorArgs(
        @Nullable Output<List<TrailDataResourceArgs>> dataResources,
        @Nullable Output<List<String>> excludeManagementEventSources,
        @Nullable Output<Boolean> includeManagementEvents,
        @Nullable Output<TrailEventSelectorReadWriteType> readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    private TrailEventSelectorArgs() {
        this.dataResources = Codegen.empty();
        this.excludeManagementEventSources = Codegen.empty();
        this.includeManagementEvents = Codegen.empty();
        this.readWriteType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TrailDataResourceArgs>> dataResources;
        private @Nullable Output<List<String>> excludeManagementEventSources;
        private @Nullable Output<Boolean> includeManagementEvents;
        private @Nullable Output<TrailEventSelectorReadWriteType> readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder dataResources(@Nullable Output<List<TrailDataResourceArgs>> dataResources) {
            this.dataResources = dataResources;
            return this;
        }
        public Builder dataResources(@Nullable List<TrailDataResourceArgs> dataResources) {
            this.dataResources = Codegen.ofNullable(dataResources);
            return this;
        }
        public Builder dataResources(TrailDataResourceArgs... dataResources) {
            return dataResources(List.of(dataResources));
        }
        public Builder excludeManagementEventSources(@Nullable Output<List<String>> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }
        public Builder excludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = Codegen.ofNullable(excludeManagementEventSources);
            return this;
        }
        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }
        public Builder includeManagementEvents(@Nullable Output<Boolean> includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }
        public Builder includeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = Codegen.ofNullable(includeManagementEvents);
            return this;
        }
        public Builder readWriteType(@Nullable Output<TrailEventSelectorReadWriteType> readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }
        public Builder readWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            this.readWriteType = Codegen.ofNullable(readWriteType);
            return this;
        }        public TrailEventSelectorArgs build() {
            return new TrailEventSelectorArgs(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
