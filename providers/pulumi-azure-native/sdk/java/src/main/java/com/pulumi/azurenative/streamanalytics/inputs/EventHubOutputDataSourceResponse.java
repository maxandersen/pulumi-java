// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub output data source.
 * 
 */
public final class EventHubOutputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventHubOutputDataSourceResponse Empty = new EventHubOutputDataSourceResponse();

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="eventHubName")
    private @Nullable String eventHubName;

    public Optional<String> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }

    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable String partitionKey;

    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serviceBusNamespace")
    private @Nullable String serviceBusNamespace;

    public Optional<String> serviceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
    private @Nullable String sharedAccessPolicyKey;

    public Optional<String> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyName")
    private @Nullable String sharedAccessPolicyName;

    public Optional<String> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private EventHubOutputDataSourceResponse() {}

    private EventHubOutputDataSourceResponse(EventHubOutputDataSourceResponse $) {
        this.eventHubName = $.eventHubName;
        this.partitionKey = $.partitionKey;
        this.serviceBusNamespace = $.serviceBusNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubOutputDataSourceResponse $;

        public Builder() {
            $ = new EventHubOutputDataSourceResponse();
        }

        public Builder(EventHubOutputDataSourceResponse defaults) {
            $ = new EventHubOutputDataSourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            $.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public EventHubOutputDataSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
