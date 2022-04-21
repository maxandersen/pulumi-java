// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.timeseriesinsights.enums.IngressStartAtType;
import com.pulumi.azurenative.timeseriesinsights.inputs.LocalTimestampArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventHubEventSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventHubEventSourceArgs Empty = new EventHubEventSourceArgs();

    /**
     * The name of the event hub&#39;s consumer group that holds the partitions from which events will be read.
     * 
     */
    @Import(name="consumerGroupName", required=true)
    private Output<String> consumerGroupName;

    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * The name of the event hub.
     * 
     */
    @Import(name="eventHubName", required=true)
    private Output<String> eventHubName;

    public Output<String> eventHubName() {
        return this.eventHubName;
    }

    /**
     * Name of the event source.
     * 
     */
    @Import(name="eventSourceName")
    private @Nullable Output<String> eventSourceName;

    public Optional<Output<String>> eventSourceName() {
        return Optional.ofNullable(this.eventSourceName);
    }

    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    @Import(name="eventSourceResourceId", required=true)
    private Output<String> eventSourceResourceId;

    public Output<String> eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * The name of the SAS key that grants the Time Series Insights service access to the event hub. The shared access policies for this key must grant &#39;Listen&#39; permissions to the event hub.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The kind of the event source.
     * Expected value is &#39;Microsoft.EventHub&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn&#39;t specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @Import(name="localTimestamp")
    private @Nullable Output<LocalTimestampArgs> localTimestamp;

    public Optional<Output<LocalTimestampArgs>> localTimestamp() {
        return Optional.ofNullable(this.localTimestamp);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service bus that contains the event hub.
     * 
     */
    @Import(name="serviceBusNamespace", required=true)
    private Output<String> serviceBusNamespace;

    public Output<String> serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * The value of the shared access key that grants the Time Series Insights service read access to the event hub. This property is not shown in event source responses.
     * 
     */
    @Import(name="sharedAccessKey", required=true)
    private Output<String> sharedAccessKey;

    public Output<String> sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    /**
     * The event property that will be used as the event source&#39;s timestamp. If a value isn&#39;t specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    @Import(name="timestampPropertyName")
    private @Nullable Output<String> timestampPropertyName;

    public Optional<Output<String>> timestampPropertyName() {
        return Optional.ofNullable(this.timestampPropertyName);
    }

    /**
     * The type of the ingressStartAt, It can be &#34;EarliestAvailable&#34;, &#34;EventSourceCreationTime&#34;, &#34;CustomEnqueuedTime&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,IngressStartAtType>> type;

    public Optional<Output<Either<String,IngressStartAtType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private EventHubEventSourceArgs() {}

    private EventHubEventSourceArgs(EventHubEventSourceArgs $) {
        this.consumerGroupName = $.consumerGroupName;
        this.environmentName = $.environmentName;
        this.eventHubName = $.eventHubName;
        this.eventSourceName = $.eventSourceName;
        this.eventSourceResourceId = $.eventSourceResourceId;
        this.keyName = $.keyName;
        this.kind = $.kind;
        this.localTimestamp = $.localTimestamp;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceBusNamespace = $.serviceBusNamespace;
        this.sharedAccessKey = $.sharedAccessKey;
        this.tags = $.tags;
        this.time = $.time;
        this.timestampPropertyName = $.timestampPropertyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubEventSourceArgs $;

        public Builder() {
            $ = new EventHubEventSourceArgs();
        }

        public Builder(EventHubEventSourceArgs defaults) {
            $ = new EventHubEventSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder consumerGroupName(Output<String> consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder consumerGroupName(String consumerGroupName) {
            return consumerGroupName(Output.of(consumerGroupName));
        }

        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        public Builder eventHubName(Output<String> eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        public Builder eventHubName(String eventHubName) {
            return eventHubName(Output.of(eventHubName));
        }

        public Builder eventSourceName(@Nullable Output<String> eventSourceName) {
            $.eventSourceName = eventSourceName;
            return this;
        }

        public Builder eventSourceName(String eventSourceName) {
            return eventSourceName(Output.of(eventSourceName));
        }

        public Builder eventSourceResourceId(Output<String> eventSourceResourceId) {
            $.eventSourceResourceId = eventSourceResourceId;
            return this;
        }

        public Builder eventSourceResourceId(String eventSourceResourceId) {
            return eventSourceResourceId(Output.of(eventSourceResourceId));
        }

        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder localTimestamp(@Nullable Output<LocalTimestampArgs> localTimestamp) {
            $.localTimestamp = localTimestamp;
            return this;
        }

        public Builder localTimestamp(LocalTimestampArgs localTimestamp) {
            return localTimestamp(Output.of(localTimestamp));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceBusNamespace(Output<String> serviceBusNamespace) {
            $.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder serviceBusNamespace(String serviceBusNamespace) {
            return serviceBusNamespace(Output.of(serviceBusNamespace));
        }

        public Builder sharedAccessKey(Output<String> sharedAccessKey) {
            $.sharedAccessKey = sharedAccessKey;
            return this;
        }

        public Builder sharedAccessKey(String sharedAccessKey) {
            return sharedAccessKey(Output.of(sharedAccessKey));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        public Builder time(String time) {
            return time(Output.of(time));
        }

        public Builder timestampPropertyName(@Nullable Output<String> timestampPropertyName) {
            $.timestampPropertyName = timestampPropertyName;
            return this;
        }

        public Builder timestampPropertyName(String timestampPropertyName) {
            return timestampPropertyName(Output.of(timestampPropertyName));
        }

        public Builder type(@Nullable Output<Either<String,IngressStartAtType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,IngressStartAtType> type) {
            return type(Output.of(type));
        }

        public EventHubEventSourceArgs build() {
            $.consumerGroupName = Objects.requireNonNull($.consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.eventHubName = Objects.requireNonNull($.eventHubName, "expected parameter 'eventHubName' to be non-null");
            $.eventSourceResourceId = Objects.requireNonNull($.eventSourceResourceId, "expected parameter 'eventSourceResourceId' to be non-null");
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceBusNamespace = Objects.requireNonNull($.serviceBusNamespace, "expected parameter 'serviceBusNamespace' to be non-null");
            $.sharedAccessKey = Objects.requireNonNull($.sharedAccessKey, "expected parameter 'sharedAccessKey' to be non-null");
            return $;
        }
    }

}
