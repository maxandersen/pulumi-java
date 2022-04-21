// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Service Bus Topic output data source.
 * 
 */
public final class ServiceBusTopicOutputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceBusTopicOutputDataSourceResponse Empty = new ServiceBusTopicOutputDataSourceResponse();

    /**
     * A string array of the names of output columns to be attached to Service Bus messages as custom properties.
     * 
     */
    @Import(name="propertyColumns")
    private @Nullable List<String> propertyColumns;

    public Optional<List<String>> propertyColumns() {
        return Optional.ofNullable(this.propertyColumns);
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
     * The name of the Service Bus Topic. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="topicName")
    private @Nullable String topicName;

    public Optional<String> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/Topic&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ServiceBusTopicOutputDataSourceResponse() {}

    private ServiceBusTopicOutputDataSourceResponse(ServiceBusTopicOutputDataSourceResponse $) {
        this.propertyColumns = $.propertyColumns;
        this.serviceBusNamespace = $.serviceBusNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.topicName = $.topicName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusTopicOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusTopicOutputDataSourceResponse $;

        public Builder() {
            $ = new ServiceBusTopicOutputDataSourceResponse();
        }

        public Builder(ServiceBusTopicOutputDataSourceResponse defaults) {
            $ = new ServiceBusTopicOutputDataSourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder propertyColumns(@Nullable List<String> propertyColumns) {
            $.propertyColumns = propertyColumns;
            return this;
        }

        public Builder propertyColumns(String... propertyColumns) {
            return propertyColumns(List.of(propertyColumns));
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

        public Builder topicName(@Nullable String topicName) {
            $.topicName = topicName;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ServiceBusTopicOutputDataSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
