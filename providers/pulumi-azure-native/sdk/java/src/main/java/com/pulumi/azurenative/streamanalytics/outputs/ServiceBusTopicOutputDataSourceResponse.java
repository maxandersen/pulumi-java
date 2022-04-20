// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceBusTopicOutputDataSourceResponse {
    /**
     * A string array of the names of output columns to be attached to Service Bus messages as custom properties.
     * 
     */
    private final @Nullable List<String> propertyColumns;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String serviceBusNamespace;
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyKey;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyName;
    /**
     * The name of the Service Bus Topic. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String topicName;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/Topic&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ServiceBusTopicOutputDataSourceResponse(
        @CustomType.Parameter("propertyColumns") @Nullable List<String> propertyColumns,
        @CustomType.Parameter("serviceBusNamespace") @Nullable String serviceBusNamespace,
        @CustomType.Parameter("sharedAccessPolicyKey") @Nullable String sharedAccessPolicyKey,
        @CustomType.Parameter("sharedAccessPolicyName") @Nullable String sharedAccessPolicyName,
        @CustomType.Parameter("topicName") @Nullable String topicName,
        @CustomType.Parameter("type") String type) {
        this.propertyColumns = propertyColumns;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.topicName = topicName;
        this.type = type;
    }

    /**
     * A string array of the names of output columns to be attached to Service Bus messages as custom properties.
     * 
    */
    public List<String> propertyColumns() {
        return this.propertyColumns == null ? List.of() : this.propertyColumns;
    }
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> serviceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }
    /**
     * The name of the Service Bus Topic. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> topicName() {
        return Optional.ofNullable(this.topicName);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/Topic&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> propertyColumns;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private @Nullable String topicName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyColumns = defaults.propertyColumns;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.topicName = defaults.topicName;
    	      this.type = defaults.type;
        }

        public Builder propertyColumns(@Nullable List<String> propertyColumns) {
            this.propertyColumns = propertyColumns;
            return this;
        }
        public Builder propertyColumns(String... propertyColumns) {
            return propertyColumns(List.of(propertyColumns));
        }
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }
        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }
        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }
        public Builder topicName(@Nullable String topicName) {
            this.topicName = topicName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServiceBusTopicOutputDataSourceResponse build() {
            return new ServiceBusTopicOutputDataSourceResponse(propertyColumns, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, topicName, type);
        }
    }
}
