// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudtrail.inputs;

import com.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import com.pulumi.awsnative.cloudtrail.inputs.TrailDataResourceArgs;
import com.pulumi.core.Output;
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
public final class TrailEventSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorArgs Empty = new TrailEventSelectorArgs();

    @Import(name="dataResources")
    private @Nullable Output<List<TrailDataResourceArgs>> dataResources;

    public Optional<Output<List<TrailDataResourceArgs>>> dataResources() {
        return Optional.ofNullable(this.dataResources);
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @Import(name="excludeManagementEventSources")
    private @Nullable Output<List<String>> excludeManagementEventSources;

    public Optional<Output<List<String>>> excludeManagementEventSources() {
        return Optional.ofNullable(this.excludeManagementEventSources);
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @Import(name="includeManagementEvents")
    private @Nullable Output<Boolean> includeManagementEvents;

    public Optional<Output<Boolean>> includeManagementEvents() {
        return Optional.ofNullable(this.includeManagementEvents);
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @Import(name="readWriteType")
    private @Nullable Output<TrailEventSelectorReadWriteType> readWriteType;

    public Optional<Output<TrailEventSelectorReadWriteType>> readWriteType() {
        return Optional.ofNullable(this.readWriteType);
    }

    private TrailEventSelectorArgs() {}

    private TrailEventSelectorArgs(TrailEventSelectorArgs $) {
        this.dataResources = $.dataResources;
        this.excludeManagementEventSources = $.excludeManagementEventSources;
        this.includeManagementEvents = $.includeManagementEvents;
        this.readWriteType = $.readWriteType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailEventSelectorArgs $;

        public Builder() {
            $ = new TrailEventSelectorArgs();
        }

        public Builder(TrailEventSelectorArgs defaults) {
            $ = new TrailEventSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataResources(@Nullable Output<List<TrailDataResourceArgs>> dataResources) {
            $.dataResources = dataResources;
            return this;
        }

        public Builder dataResources(List<TrailDataResourceArgs> dataResources) {
            return dataResources(Output.of(dataResources));
        }

        public Builder dataResources(TrailDataResourceArgs... dataResources) {
            return dataResources(List.of(dataResources));
        }

        public Builder excludeManagementEventSources(@Nullable Output<List<String>> excludeManagementEventSources) {
            $.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }

        public Builder excludeManagementEventSources(List<String> excludeManagementEventSources) {
            return excludeManagementEventSources(Output.of(excludeManagementEventSources));
        }

        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }

        public Builder includeManagementEvents(@Nullable Output<Boolean> includeManagementEvents) {
            $.includeManagementEvents = includeManagementEvents;
            return this;
        }

        public Builder includeManagementEvents(Boolean includeManagementEvents) {
            return includeManagementEvents(Output.of(includeManagementEvents));
        }

        public Builder readWriteType(@Nullable Output<TrailEventSelectorReadWriteType> readWriteType) {
            $.readWriteType = readWriteType;
            return this;
        }

        public Builder readWriteType(TrailEventSelectorReadWriteType readWriteType) {
            return readWriteType(Output.of(readWriteType));
        }

        public TrailEventSelectorArgs build() {
            return $;
        }
    }

}
