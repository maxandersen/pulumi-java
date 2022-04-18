// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sqs.outputs;

import com.pulumi.awsnative.sqs.outputs.QueueTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetQueueResult {
    /**
     * Amazon Resource Name (ARN) of the queue.
     * 
     */
    private final @Nullable String arn;
    /**
     * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication. During the deduplication interval, Amazon SQS treats messages that are sent with identical content as duplicates and delivers only one copy of the message.
     * 
     */
    private final @Nullable Boolean contentBasedDeduplication;
    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are messageGroup and queue.
     * 
     */
    private final @Nullable String deduplicationScope;
    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed. You can specify an integer value of 0 to 900 (15 minutes). The default value is 0.
     * 
     */
    private final @Nullable Integer delaySeconds;
    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are perQueue and perMessageGroupId. The perMessageGroupId value is allowed only when the value for DeduplicationScope is messageGroup.
     * 
     */
    private final @Nullable String fifoThroughputLimit;
    /**
     * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300 (5 minutes).
     * 
     */
    private final @Nullable Integer kmsDataKeyReusePeriodSeconds;
    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK. To use the AWS managed CMK for Amazon SQS, specify the (default) alias alias/aws/sqs.
     * 
     */
    private final @Nullable String kmsMasterKeyId;
    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it. You can specify an integer value from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). The default value is 262,144 (256 KiB).
     * 
     */
    private final @Nullable Integer maximumMessageSize;
    /**
     * The number of seconds that Amazon SQS retains a message. You can specify an integer value from 60 seconds (1 minute) to 1,209,600 seconds (14 days). The default value is 345,600 seconds (4 days).
     * 
     */
    private final @Nullable Integer messageRetentionPeriod;
    /**
     * URL of the source queue.
     * 
     */
    private final @Nullable String queueUrl;
    /**
     * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message is in the queue in order to include it in the response, rather than returning an empty response if a message isn't yet available. You can specify an integer from 1 to 20. Short polling is used as the default or when you specify 0 for this property.
     * 
     */
    private final @Nullable Integer receiveMessageWaitTimeSeconds;
    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive permission and which source queues can specify dead-letter queues as a JSON object.
     * 
     */
    private final @Nullable Object redriveAllowPolicy;
    /**
     * A string that includes the parameters for the dead-letter queue functionality (redrive policy) of the source queue.
     * 
     */
    private final @Nullable Object redrivePolicy;
    /**
     * The tags that you attach to this queue.
     * 
     */
    private final @Nullable List<QueueTag> tags;
    /**
     * The length of time during which a message will be unavailable after a message is delivered from the queue. This blocks other components from receiving the same message and gives the initial component time to process and delete the message from the queue. Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS CloudFormation uses the default value of 30 seconds.
     * 
     */
    private final @Nullable Integer visibilityTimeout;

    @CustomType.Constructor
    private GetQueueResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("contentBasedDeduplication") @Nullable Boolean contentBasedDeduplication,
        @CustomType.Parameter("deduplicationScope") @Nullable String deduplicationScope,
        @CustomType.Parameter("delaySeconds") @Nullable Integer delaySeconds,
        @CustomType.Parameter("fifoThroughputLimit") @Nullable String fifoThroughputLimit,
        @CustomType.Parameter("kmsDataKeyReusePeriodSeconds") @Nullable Integer kmsDataKeyReusePeriodSeconds,
        @CustomType.Parameter("kmsMasterKeyId") @Nullable String kmsMasterKeyId,
        @CustomType.Parameter("maximumMessageSize") @Nullable Integer maximumMessageSize,
        @CustomType.Parameter("messageRetentionPeriod") @Nullable Integer messageRetentionPeriod,
        @CustomType.Parameter("queueUrl") @Nullable String queueUrl,
        @CustomType.Parameter("receiveMessageWaitTimeSeconds") @Nullable Integer receiveMessageWaitTimeSeconds,
        @CustomType.Parameter("redriveAllowPolicy") @Nullable Object redriveAllowPolicy,
        @CustomType.Parameter("redrivePolicy") @Nullable Object redrivePolicy,
        @CustomType.Parameter("tags") @Nullable List<QueueTag> tags,
        @CustomType.Parameter("visibilityTimeout") @Nullable Integer visibilityTimeout) {
        this.arn = arn;
        this.contentBasedDeduplication = contentBasedDeduplication;
        this.deduplicationScope = deduplicationScope;
        this.delaySeconds = delaySeconds;
        this.fifoThroughputLimit = fifoThroughputLimit;
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.maximumMessageSize = maximumMessageSize;
        this.messageRetentionPeriod = messageRetentionPeriod;
        this.queueUrl = queueUrl;
        this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
        this.redriveAllowPolicy = redriveAllowPolicy;
        this.redrivePolicy = redrivePolicy;
        this.tags = tags;
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * Amazon Resource Name (ARN) of the queue.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication. During the deduplication interval, Amazon SQS treats messages that are sent with identical content as duplicates and delivers only one copy of the message.
     * 
    */
    public Optional<Boolean> contentBasedDeduplication() {
        return Optional.ofNullable(this.contentBasedDeduplication);
    }
    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are messageGroup and queue.
     * 
    */
    public Optional<String> deduplicationScope() {
        return Optional.ofNullable(this.deduplicationScope);
    }
    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed. You can specify an integer value of 0 to 900 (15 minutes). The default value is 0.
     * 
    */
    public Optional<Integer> delaySeconds() {
        return Optional.ofNullable(this.delaySeconds);
    }
    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are perQueue and perMessageGroupId. The perMessageGroupId value is allowed only when the value for DeduplicationScope is messageGroup.
     * 
    */
    public Optional<String> fifoThroughputLimit() {
        return Optional.ofNullable(this.fifoThroughputLimit);
    }
    /**
     * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300 (5 minutes).
     * 
    */
    public Optional<Integer> kmsDataKeyReusePeriodSeconds() {
        return Optional.ofNullable(this.kmsDataKeyReusePeriodSeconds);
    }
    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK. To use the AWS managed CMK for Amazon SQS, specify the (default) alias alias/aws/sqs.
     * 
    */
    public Optional<String> kmsMasterKeyId() {
        return Optional.ofNullable(this.kmsMasterKeyId);
    }
    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it. You can specify an integer value from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). The default value is 262,144 (256 KiB).
     * 
    */
    public Optional<Integer> maximumMessageSize() {
        return Optional.ofNullable(this.maximumMessageSize);
    }
    /**
     * The number of seconds that Amazon SQS retains a message. You can specify an integer value from 60 seconds (1 minute) to 1,209,600 seconds (14 days). The default value is 345,600 seconds (4 days).
     * 
    */
    public Optional<Integer> messageRetentionPeriod() {
        return Optional.ofNullable(this.messageRetentionPeriod);
    }
    /**
     * URL of the source queue.
     * 
    */
    public Optional<String> queueUrl() {
        return Optional.ofNullable(this.queueUrl);
    }
    /**
     * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message is in the queue in order to include it in the response, rather than returning an empty response if a message isn't yet available. You can specify an integer from 1 to 20. Short polling is used as the default or when you specify 0 for this property.
     * 
    */
    public Optional<Integer> receiveMessageWaitTimeSeconds() {
        return Optional.ofNullable(this.receiveMessageWaitTimeSeconds);
    }
    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive permission and which source queues can specify dead-letter queues as a JSON object.
     * 
    */
    public Optional<Object> redriveAllowPolicy() {
        return Optional.ofNullable(this.redriveAllowPolicy);
    }
    /**
     * A string that includes the parameters for the dead-letter queue functionality (redrive policy) of the source queue.
     * 
    */
    public Optional<Object> redrivePolicy() {
        return Optional.ofNullable(this.redrivePolicy);
    }
    /**
     * The tags that you attach to this queue.
     * 
    */
    public List<QueueTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The length of time during which a message will be unavailable after a message is delivered from the queue. This blocks other components from receiving the same message and gives the initial component time to process and delete the message from the queue. Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS CloudFormation uses the default value of 30 seconds.
     * 
    */
    public Optional<Integer> visibilityTimeout() {
        return Optional.ofNullable(this.visibilityTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean contentBasedDeduplication;
        private @Nullable String deduplicationScope;
        private @Nullable Integer delaySeconds;
        private @Nullable String fifoThroughputLimit;
        private @Nullable Integer kmsDataKeyReusePeriodSeconds;
        private @Nullable String kmsMasterKeyId;
        private @Nullable Integer maximumMessageSize;
        private @Nullable Integer messageRetentionPeriod;
        private @Nullable String queueUrl;
        private @Nullable Integer receiveMessageWaitTimeSeconds;
        private @Nullable Object redriveAllowPolicy;
        private @Nullable Object redrivePolicy;
        private @Nullable List<QueueTag> tags;
        private @Nullable Integer visibilityTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contentBasedDeduplication = defaults.contentBasedDeduplication;
    	      this.deduplicationScope = defaults.deduplicationScope;
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.fifoThroughputLimit = defaults.fifoThroughputLimit;
    	      this.kmsDataKeyReusePeriodSeconds = defaults.kmsDataKeyReusePeriodSeconds;
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.maximumMessageSize = defaults.maximumMessageSize;
    	      this.messageRetentionPeriod = defaults.messageRetentionPeriod;
    	      this.queueUrl = defaults.queueUrl;
    	      this.receiveMessageWaitTimeSeconds = defaults.receiveMessageWaitTimeSeconds;
    	      this.redriveAllowPolicy = defaults.redriveAllowPolicy;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.tags = defaults.tags;
    	      this.visibilityTimeout = defaults.visibilityTimeout;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder contentBasedDeduplication(@Nullable Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }
        public Builder deduplicationScope(@Nullable String deduplicationScope) {
            this.deduplicationScope = deduplicationScope;
            return this;
        }
        public Builder delaySeconds(@Nullable Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Builder fifoThroughputLimit(@Nullable String fifoThroughputLimit) {
            this.fifoThroughputLimit = fifoThroughputLimit;
            return this;
        }
        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }
        public Builder kmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }
        public Builder maximumMessageSize(@Nullable Integer maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }
        public Builder messageRetentionPeriod(@Nullable Integer messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public Builder queueUrl(@Nullable String queueUrl) {
            this.queueUrl = queueUrl;
            return this;
        }
        public Builder receiveMessageWaitTimeSeconds(@Nullable Integer receiveMessageWaitTimeSeconds) {
            this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
            return this;
        }
        public Builder redriveAllowPolicy(@Nullable Object redriveAllowPolicy) {
            this.redriveAllowPolicy = redriveAllowPolicy;
            return this;
        }
        public Builder redrivePolicy(@Nullable Object redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }
        public Builder tags(@Nullable List<QueueTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(QueueTag... tags) {
            return tags(List.of(tags));
        }
        public Builder visibilityTimeout(@Nullable Integer visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }        public GetQueueResult build() {
            return new GetQueueResult(arn, contentBasedDeduplication, deduplicationScope, delaySeconds, fifoThroughputLimit, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maximumMessageSize, messageRetentionPeriod, queueUrl, receiveMessageWaitTimeSeconds, redriveAllowPolicy, redrivePolicy, tags, visibilityTimeout);
        }
    }
}
