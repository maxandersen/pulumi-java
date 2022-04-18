// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.azurenative.scheduler.outputs.HttpRequestResponse;
import com.pulumi.azurenative.scheduler.outputs.RetryPolicyResponse;
import com.pulumi.azurenative.scheduler.outputs.ServiceBusQueueMessageResponse;
import com.pulumi.azurenative.scheduler.outputs.ServiceBusTopicMessageResponse;
import com.pulumi.azurenative.scheduler.outputs.StorageQueueMessageResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobErrorActionResponse {
    /**
     * Gets or sets the storage queue message.
     * 
     */
    private final @Nullable StorageQueueMessageResponse queueMessage;
    /**
     * Gets or sets the http requests.
     * 
     */
    private final @Nullable HttpRequestResponse request;
    /**
     * Gets or sets the retry policy.
     * 
     */
    private final @Nullable RetryPolicyResponse retryPolicy;
    /**
     * Gets or sets the service bus queue message.
     * 
     */
    private final @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;
    /**
     * Gets or sets the service bus topic message.
     * 
     */
    private final @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;
    /**
     * Gets or sets the job error action type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private JobErrorActionResponse(
        @CustomType.Parameter("queueMessage") @Nullable StorageQueueMessageResponse queueMessage,
        @CustomType.Parameter("request") @Nullable HttpRequestResponse request,
        @CustomType.Parameter("retryPolicy") @Nullable RetryPolicyResponse retryPolicy,
        @CustomType.Parameter("serviceBusQueueMessage") @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage,
        @CustomType.Parameter("serviceBusTopicMessage") @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage,
        @CustomType.Parameter("type") @Nullable String type) {
        this.queueMessage = queueMessage;
        this.request = request;
        this.retryPolicy = retryPolicy;
        this.serviceBusQueueMessage = serviceBusQueueMessage;
        this.serviceBusTopicMessage = serviceBusTopicMessage;
        this.type = type;
    }

    /**
     * Gets or sets the storage queue message.
     * 
    */
    public Optional<StorageQueueMessageResponse> queueMessage() {
        return Optional.ofNullable(this.queueMessage);
    }
    /**
     * Gets or sets the http requests.
     * 
    */
    public Optional<HttpRequestResponse> request() {
        return Optional.ofNullable(this.request);
    }
    /**
     * Gets or sets the retry policy.
     * 
    */
    public Optional<RetryPolicyResponse> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Gets or sets the service bus queue message.
     * 
    */
    public Optional<ServiceBusQueueMessageResponse> serviceBusQueueMessage() {
        return Optional.ofNullable(this.serviceBusQueueMessage);
    }
    /**
     * Gets or sets the service bus topic message.
     * 
    */
    public Optional<ServiceBusTopicMessageResponse> serviceBusTopicMessage() {
        return Optional.ofNullable(this.serviceBusTopicMessage);
    }
    /**
     * Gets or sets the job error action type.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobErrorActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageQueueMessageResponse queueMessage;
        private @Nullable HttpRequestResponse request;
        private @Nullable RetryPolicyResponse retryPolicy;
        private @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;
        private @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobErrorActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueMessage = defaults.queueMessage;
    	      this.request = defaults.request;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.serviceBusQueueMessage = defaults.serviceBusQueueMessage;
    	      this.serviceBusTopicMessage = defaults.serviceBusTopicMessage;
    	      this.type = defaults.type;
        }

        public Builder queueMessage(@Nullable StorageQueueMessageResponse queueMessage) {
            this.queueMessage = queueMessage;
            return this;
        }
        public Builder request(@Nullable HttpRequestResponse request) {
            this.request = request;
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder serviceBusQueueMessage(@Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage) {
            this.serviceBusQueueMessage = serviceBusQueueMessage;
            return this;
        }
        public Builder serviceBusTopicMessage(@Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage) {
            this.serviceBusTopicMessage = serviceBusTopicMessage;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public JobErrorActionResponse build() {
            return new JobErrorActionResponse(queueMessage, request, retryPolicy, serviceBusQueueMessage, serviceBusTopicMessage, type);
        }
    }
}
