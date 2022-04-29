// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.JobActionType;
import com.pulumi.azurenative.scheduler.inputs.HttpRequestArgs;
import com.pulumi.azurenative.scheduler.inputs.RetryPolicyArgs;
import com.pulumi.azurenative.scheduler.inputs.ServiceBusQueueMessageArgs;
import com.pulumi.azurenative.scheduler.inputs.ServiceBusTopicMessageArgs;
import com.pulumi.azurenative.scheduler.inputs.StorageQueueMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobErrorActionArgs extends ResourceArgs {

    public static final JobErrorActionArgs Empty = new JobErrorActionArgs();

    /**
     * Gets or sets the storage queue message.
     * 
     */
    @Import(name="queueMessage")
    private @Nullable Output<StorageQueueMessageArgs> queueMessage;

    /**
     * @return Gets or sets the storage queue message.
     * 
     */
    public Optional<Output<StorageQueueMessageArgs>> queueMessage() {
        return Optional.ofNullable(this.queueMessage);
    }

    /**
     * Gets or sets the http requests.
     * 
     */
    @Import(name="request")
    private @Nullable Output<HttpRequestArgs> request;

    /**
     * @return Gets or sets the http requests.
     * 
     */
    public Optional<Output<HttpRequestArgs>> request() {
        return Optional.ofNullable(this.request);
    }

    /**
     * Gets or sets the retry policy.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RetryPolicyArgs> retryPolicy;

    /**
     * @return Gets or sets the retry policy.
     * 
     */
    public Optional<Output<RetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Gets or sets the service bus queue message.
     * 
     */
    @Import(name="serviceBusQueueMessage")
    private @Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage;

    /**
     * @return Gets or sets the service bus queue message.
     * 
     */
    public Optional<Output<ServiceBusQueueMessageArgs>> serviceBusQueueMessage() {
        return Optional.ofNullable(this.serviceBusQueueMessage);
    }

    /**
     * Gets or sets the service bus topic message.
     * 
     */
    @Import(name="serviceBusTopicMessage")
    private @Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage;

    /**
     * @return Gets or sets the service bus topic message.
     * 
     */
    public Optional<Output<ServiceBusTopicMessageArgs>> serviceBusTopicMessage() {
        return Optional.ofNullable(this.serviceBusTopicMessage);
    }

    /**
     * Gets or sets the job error action type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<JobActionType> type;

    /**
     * @return Gets or sets the job error action type.
     * 
     */
    public Optional<Output<JobActionType>> type() {
        return Optional.ofNullable(this.type);
    }

    private JobErrorActionArgs() {}

    private JobErrorActionArgs(JobErrorActionArgs $) {
        this.queueMessage = $.queueMessage;
        this.request = $.request;
        this.retryPolicy = $.retryPolicy;
        this.serviceBusQueueMessage = $.serviceBusQueueMessage;
        this.serviceBusTopicMessage = $.serviceBusTopicMessage;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobErrorActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobErrorActionArgs $;

        public Builder() {
            $ = new JobErrorActionArgs();
        }

        public Builder(JobErrorActionArgs defaults) {
            $ = new JobErrorActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queueMessage Gets or sets the storage queue message.
         * 
         * @return builder
         * 
         */
        public Builder queueMessage(@Nullable Output<StorageQueueMessageArgs> queueMessage) {
            $.queueMessage = queueMessage;
            return this;
        }

        /**
         * @param queueMessage Gets or sets the storage queue message.
         * 
         * @return builder
         * 
         */
        public Builder queueMessage(StorageQueueMessageArgs queueMessage) {
            return queueMessage(Output.of(queueMessage));
        }

        /**
         * @param request Gets or sets the http requests.
         * 
         * @return builder
         * 
         */
        public Builder request(@Nullable Output<HttpRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request Gets or sets the http requests.
         * 
         * @return builder
         * 
         */
        public Builder request(HttpRequestArgs request) {
            return request(Output.of(request));
        }

        /**
         * @param retryPolicy Gets or sets the retry policy.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Gets or sets the retry policy.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(RetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param serviceBusQueueMessage Gets or sets the service bus queue message.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueMessage(@Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage) {
            $.serviceBusQueueMessage = serviceBusQueueMessage;
            return this;
        }

        /**
         * @param serviceBusQueueMessage Gets or sets the service bus queue message.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueMessage(ServiceBusQueueMessageArgs serviceBusQueueMessage) {
            return serviceBusQueueMessage(Output.of(serviceBusQueueMessage));
        }

        /**
         * @param serviceBusTopicMessage Gets or sets the service bus topic message.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicMessage(@Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage) {
            $.serviceBusTopicMessage = serviceBusTopicMessage;
            return this;
        }

        /**
         * @param serviceBusTopicMessage Gets or sets the service bus topic message.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicMessage(ServiceBusTopicMessageArgs serviceBusTopicMessage) {
            return serviceBusTopicMessage(Output.of(serviceBusTopicMessage));
        }

        /**
         * @param type Gets or sets the job error action type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<JobActionType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Gets or sets the job error action type.
         * 
         * @return builder
         * 
         */
        public Builder type(JobActionType type) {
            return type(Output.of(type));
        }

        public JobErrorActionArgs build() {
            return $;
        }
    }

}
