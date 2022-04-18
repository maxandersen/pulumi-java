// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sqs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
     * 
     */
    @Import(name="contentBasedDeduplication")
      private final @Nullable Output<Boolean> contentBasedDeduplication;

    public Output<Boolean> contentBasedDeduplication() {
        return this.contentBasedDeduplication == null ? Codegen.empty() : this.contentBasedDeduplication;
    }

    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are `messageGroup` and `queue` (default).
     * 
     */
    @Import(name="deduplicationScope")
      private final @Nullable Output<String> deduplicationScope;

    public Output<String> deduplicationScope() {
        return this.deduplicationScope == null ? Codegen.empty() : this.deduplicationScope;
    }

    /**
     * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
     * 
     */
    @Import(name="delaySeconds")
      private final @Nullable Output<Integer> delaySeconds;

    public Output<Integer> delaySeconds() {
        return this.delaySeconds == null ? Codegen.empty() : this.delaySeconds;
    }

    /**
     * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
     * 
     */
    @Import(name="fifoQueue")
      private final @Nullable Output<Boolean> fifoQueue;

    public Output<Boolean> fifoQueue() {
        return this.fifoQueue == null ? Codegen.empty() : this.fifoQueue;
    }

    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are `perQueue` (default) and `perMessageGroupId`.
     * 
     */
    @Import(name="fifoThroughputLimit")
      private final @Nullable Output<String> fifoThroughputLimit;

    public Output<String> fifoThroughputLimit() {
        return this.fifoThroughputLimit == null ? Codegen.empty() : this.fifoThroughputLimit;
    }

    /**
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
     * 
     */
    @Import(name="kmsDataKeyReusePeriodSeconds")
      private final @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds;

    public Output<Integer> kmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds == null ? Codegen.empty() : this.kmsDataKeyReusePeriodSeconds;
    }

    /**
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
     * 
     */
    @Import(name="kmsMasterKeyId")
      private final @Nullable Output<String> kmsMasterKeyId;

    public Output<String> kmsMasterKeyId() {
        return this.kmsMasterKeyId == null ? Codegen.empty() : this.kmsMasterKeyId;
    }

    /**
     * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
     * 
     */
    @Import(name="maxMessageSize")
      private final @Nullable Output<Integer> maxMessageSize;

    public Output<Integer> maxMessageSize() {
        return this.maxMessageSize == null ? Codegen.empty() : this.maxMessageSize;
    }

    /**
     * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * 
     */
    @Import(name="messageRetentionSeconds")
      private final @Nullable Output<Integer> messageRetentionSeconds;

    public Output<Integer> messageRetentionSeconds() {
        return this.messageRetentionSeconds == null ? Codegen.empty() : this.messageRetentionSeconds;
    }

    /**
     * The name of the queue. Queue names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 80 characters long. For a FIFO (first-in-first-out) queue, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
     * 
     */
    @Import(name="receiveWaitTimeSeconds")
      private final @Nullable Output<Integer> receiveWaitTimeSeconds;

    public Output<Integer> receiveWaitTimeSeconds() {
        return this.receiveWaitTimeSeconds == null ? Codegen.empty() : this.receiveWaitTimeSeconds;
    }

    /**
     * The JSON policy to set up the Dead Letter Queue redrive permission, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html).
     * 
     */
    @Import(name="redriveAllowPolicy")
      private final @Nullable Output<String> redriveAllowPolicy;

    public Output<String> redriveAllowPolicy() {
        return this.redriveAllowPolicy == null ? Codegen.empty() : this.redriveAllowPolicy;
    }

    /**
     * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
     * 
     */
    @Import(name="redrivePolicy")
      private final @Nullable Output<String> redrivePolicy;

    public Output<String> redrivePolicy() {
        return this.redrivePolicy == null ? Codegen.empty() : this.redrivePolicy;
    }

    /**
     * Boolean to enable server-side encryption (SSE) of message content with SQS-owned encryption keys. Defaults to `false`. See [Encryption at rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html).
     * 
     */
    @Import(name="sqsManagedSseEnabled")
      private final @Nullable Output<Boolean> sqsManagedSseEnabled;

    public Output<Boolean> sqsManagedSseEnabled() {
        return this.sqsManagedSseEnabled == null ? Codegen.empty() : this.sqsManagedSseEnabled;
    }

    /**
     * A map of tags to assign to the queue. If configured with a provider `default_tags` configuration block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
     * 
     */
    @Import(name="visibilityTimeoutSeconds")
      private final @Nullable Output<Integer> visibilityTimeoutSeconds;

    public Output<Integer> visibilityTimeoutSeconds() {
        return this.visibilityTimeoutSeconds == null ? Codegen.empty() : this.visibilityTimeoutSeconds;
    }

    public QueueArgs(
        @Nullable Output<Boolean> contentBasedDeduplication,
        @Nullable Output<String> deduplicationScope,
        @Nullable Output<Integer> delaySeconds,
        @Nullable Output<Boolean> fifoQueue,
        @Nullable Output<String> fifoThroughputLimit,
        @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds,
        @Nullable Output<String> kmsMasterKeyId,
        @Nullable Output<Integer> maxMessageSize,
        @Nullable Output<Integer> messageRetentionSeconds,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> policy,
        @Nullable Output<Integer> receiveWaitTimeSeconds,
        @Nullable Output<String> redriveAllowPolicy,
        @Nullable Output<String> redrivePolicy,
        @Nullable Output<Boolean> sqsManagedSseEnabled,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> visibilityTimeoutSeconds) {
        this.contentBasedDeduplication = contentBasedDeduplication;
        this.deduplicationScope = deduplicationScope;
        this.delaySeconds = delaySeconds;
        this.fifoQueue = fifoQueue;
        this.fifoThroughputLimit = fifoThroughputLimit;
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.maxMessageSize = maxMessageSize;
        this.messageRetentionSeconds = messageRetentionSeconds;
        this.name = name;
        this.namePrefix = namePrefix;
        this.policy = policy;
        this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
        this.redriveAllowPolicy = redriveAllowPolicy;
        this.redrivePolicy = redrivePolicy;
        this.sqsManagedSseEnabled = sqsManagedSseEnabled;
        this.tags = tags;
        this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
    }

    private QueueArgs() {
        this.contentBasedDeduplication = Codegen.empty();
        this.deduplicationScope = Codegen.empty();
        this.delaySeconds = Codegen.empty();
        this.fifoQueue = Codegen.empty();
        this.fifoThroughputLimit = Codegen.empty();
        this.kmsDataKeyReusePeriodSeconds = Codegen.empty();
        this.kmsMasterKeyId = Codegen.empty();
        this.maxMessageSize = Codegen.empty();
        this.messageRetentionSeconds = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.policy = Codegen.empty();
        this.receiveWaitTimeSeconds = Codegen.empty();
        this.redriveAllowPolicy = Codegen.empty();
        this.redrivePolicy = Codegen.empty();
        this.sqsManagedSseEnabled = Codegen.empty();
        this.tags = Codegen.empty();
        this.visibilityTimeoutSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> contentBasedDeduplication;
        private @Nullable Output<String> deduplicationScope;
        private @Nullable Output<Integer> delaySeconds;
        private @Nullable Output<Boolean> fifoQueue;
        private @Nullable Output<String> fifoThroughputLimit;
        private @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds;
        private @Nullable Output<String> kmsMasterKeyId;
        private @Nullable Output<Integer> maxMessageSize;
        private @Nullable Output<Integer> messageRetentionSeconds;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> policy;
        private @Nullable Output<Integer> receiveWaitTimeSeconds;
        private @Nullable Output<String> redriveAllowPolicy;
        private @Nullable Output<String> redrivePolicy;
        private @Nullable Output<Boolean> sqsManagedSseEnabled;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> visibilityTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentBasedDeduplication = defaults.contentBasedDeduplication;
    	      this.deduplicationScope = defaults.deduplicationScope;
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.fifoQueue = defaults.fifoQueue;
    	      this.fifoThroughputLimit = defaults.fifoThroughputLimit;
    	      this.kmsDataKeyReusePeriodSeconds = defaults.kmsDataKeyReusePeriodSeconds;
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.maxMessageSize = defaults.maxMessageSize;
    	      this.messageRetentionSeconds = defaults.messageRetentionSeconds;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.policy = defaults.policy;
    	      this.receiveWaitTimeSeconds = defaults.receiveWaitTimeSeconds;
    	      this.redriveAllowPolicy = defaults.redriveAllowPolicy;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.sqsManagedSseEnabled = defaults.sqsManagedSseEnabled;
    	      this.tags = defaults.tags;
    	      this.visibilityTimeoutSeconds = defaults.visibilityTimeoutSeconds;
        }

        public Builder contentBasedDeduplication(@Nullable Output<Boolean> contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }
        public Builder contentBasedDeduplication(@Nullable Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = Codegen.ofNullable(contentBasedDeduplication);
            return this;
        }
        public Builder deduplicationScope(@Nullable Output<String> deduplicationScope) {
            this.deduplicationScope = deduplicationScope;
            return this;
        }
        public Builder deduplicationScope(@Nullable String deduplicationScope) {
            this.deduplicationScope = Codegen.ofNullable(deduplicationScope);
            return this;
        }
        public Builder delaySeconds(@Nullable Output<Integer> delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Builder delaySeconds(@Nullable Integer delaySeconds) {
            this.delaySeconds = Codegen.ofNullable(delaySeconds);
            return this;
        }
        public Builder fifoQueue(@Nullable Output<Boolean> fifoQueue) {
            this.fifoQueue = fifoQueue;
            return this;
        }
        public Builder fifoQueue(@Nullable Boolean fifoQueue) {
            this.fifoQueue = Codegen.ofNullable(fifoQueue);
            return this;
        }
        public Builder fifoThroughputLimit(@Nullable Output<String> fifoThroughputLimit) {
            this.fifoThroughputLimit = fifoThroughputLimit;
            return this;
        }
        public Builder fifoThroughputLimit(@Nullable String fifoThroughputLimit) {
            this.fifoThroughputLimit = Codegen.ofNullable(fifoThroughputLimit);
            return this;
        }
        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Output<Integer> kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }
        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = Codegen.ofNullable(kmsDataKeyReusePeriodSeconds);
            return this;
        }
        public Builder kmsMasterKeyId(@Nullable Output<String> kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }
        public Builder kmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = Codegen.ofNullable(kmsMasterKeyId);
            return this;
        }
        public Builder maxMessageSize(@Nullable Output<Integer> maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }
        public Builder maxMessageSize(@Nullable Integer maxMessageSize) {
            this.maxMessageSize = Codegen.ofNullable(maxMessageSize);
            return this;
        }
        public Builder messageRetentionSeconds(@Nullable Output<Integer> messageRetentionSeconds) {
            this.messageRetentionSeconds = messageRetentionSeconds;
            return this;
        }
        public Builder messageRetentionSeconds(@Nullable Integer messageRetentionSeconds) {
            this.messageRetentionSeconds = Codegen.ofNullable(messageRetentionSeconds);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder receiveWaitTimeSeconds(@Nullable Output<Integer> receiveWaitTimeSeconds) {
            this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
            return this;
        }
        public Builder receiveWaitTimeSeconds(@Nullable Integer receiveWaitTimeSeconds) {
            this.receiveWaitTimeSeconds = Codegen.ofNullable(receiveWaitTimeSeconds);
            return this;
        }
        public Builder redriveAllowPolicy(@Nullable Output<String> redriveAllowPolicy) {
            this.redriveAllowPolicy = redriveAllowPolicy;
            return this;
        }
        public Builder redriveAllowPolicy(@Nullable String redriveAllowPolicy) {
            this.redriveAllowPolicy = Codegen.ofNullable(redriveAllowPolicy);
            return this;
        }
        public Builder redrivePolicy(@Nullable Output<String> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }
        public Builder redrivePolicy(@Nullable String redrivePolicy) {
            this.redrivePolicy = Codegen.ofNullable(redrivePolicy);
            return this;
        }
        public Builder sqsManagedSseEnabled(@Nullable Output<Boolean> sqsManagedSseEnabled) {
            this.sqsManagedSseEnabled = sqsManagedSseEnabled;
            return this;
        }
        public Builder sqsManagedSseEnabled(@Nullable Boolean sqsManagedSseEnabled) {
            this.sqsManagedSseEnabled = Codegen.ofNullable(sqsManagedSseEnabled);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder visibilityTimeoutSeconds(@Nullable Output<Integer> visibilityTimeoutSeconds) {
            this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
            return this;
        }
        public Builder visibilityTimeoutSeconds(@Nullable Integer visibilityTimeoutSeconds) {
            this.visibilityTimeoutSeconds = Codegen.ofNullable(visibilityTimeoutSeconds);
            return this;
        }        public QueueArgs build() {
            return new QueueArgs(contentBasedDeduplication, deduplicationScope, delaySeconds, fifoQueue, fifoThroughputLimit, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maxMessageSize, messageRetentionSeconds, name, namePrefix, policy, receiveWaitTimeSeconds, redriveAllowPolicy, redrivePolicy, sqsManagedSseEnabled, tags, visibilityTimeoutSeconds);
        }
    }
}
