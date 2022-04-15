// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.azurenative.servicebus.outputs.MessageCountDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetQueueResult {
    /**
     * Last time a message was sent, or the last time there was a receive request to this queue.
     * 
     */
    private final String accessedAt;
    /**
     * ISO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    private final @Nullable String autoDeleteOnIdle;
    /**
     * Message Count Details.
     * 
     */
    private final MessageCountDetailsResponse countDetails;
    /**
     * The exact time the message was created.
     * 
     */
    private final String createdAt;
    /**
     * A value that indicates whether this queue has dead letter support when a message expires.
     * 
     */
    private final @Nullable Boolean deadLetteringOnMessageExpiration;
    /**
     * ISO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    private final @Nullable String defaultMessageTimeToLive;
    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    private final @Nullable String duplicateDetectionHistoryTimeWindow;
    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
     */
    private final @Nullable Boolean enableBatchedOperations;
    /**
     * A value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    private final @Nullable Boolean enableExpress;
    /**
     * A value that indicates whether the queue is to be partitioned across multiple message brokers.
     * 
     */
    private final @Nullable Boolean enablePartitioning;
    /**
     * Queue/Topic name to forward the Dead Letter message
     * 
     */
    private final @Nullable String forwardDeadLetteredMessagesTo;
    /**
     * Queue/Topic name to forward the messages
     * 
     */
    private final @Nullable String forwardTo;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     * 
     */
    private final @Nullable String lockDuration;
    /**
     * The maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;
    /**
     * The maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024.
     * 
     */
    private final @Nullable Integer maxSizeInMegabytes;
    /**
     * The number of messages in the queue.
     * 
     */
    private final Double messageCount;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * A value indicating if this queue requires duplicate detection.
     * 
     */
    private final @Nullable Boolean requiresDuplicateDetection;
    /**
     * A value that indicates whether the queue supports the concept of sessions.
     * 
     */
    private final @Nullable Boolean requiresSession;
    /**
     * The size of the queue, in bytes.
     * 
     */
    private final Double sizeInBytes;
    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
     */
    private final @Nullable String status;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The exact time the message was updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetQueueResult(
        @CustomType.Parameter("accessedAt") String accessedAt,
        @CustomType.Parameter("autoDeleteOnIdle") @Nullable String autoDeleteOnIdle,
        @CustomType.Parameter("countDetails") MessageCountDetailsResponse countDetails,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("deadLetteringOnMessageExpiration") @Nullable Boolean deadLetteringOnMessageExpiration,
        @CustomType.Parameter("defaultMessageTimeToLive") @Nullable String defaultMessageTimeToLive,
        @CustomType.Parameter("duplicateDetectionHistoryTimeWindow") @Nullable String duplicateDetectionHistoryTimeWindow,
        @CustomType.Parameter("enableBatchedOperations") @Nullable Boolean enableBatchedOperations,
        @CustomType.Parameter("enableExpress") @Nullable Boolean enableExpress,
        @CustomType.Parameter("enablePartitioning") @Nullable Boolean enablePartitioning,
        @CustomType.Parameter("forwardDeadLetteredMessagesTo") @Nullable String forwardDeadLetteredMessagesTo,
        @CustomType.Parameter("forwardTo") @Nullable String forwardTo,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lockDuration") @Nullable String lockDuration,
        @CustomType.Parameter("maxDeliveryCount") @Nullable Integer maxDeliveryCount,
        @CustomType.Parameter("maxSizeInMegabytes") @Nullable Integer maxSizeInMegabytes,
        @CustomType.Parameter("messageCount") Double messageCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requiresDuplicateDetection") @Nullable Boolean requiresDuplicateDetection,
        @CustomType.Parameter("requiresSession") @Nullable Boolean requiresSession,
        @CustomType.Parameter("sizeInBytes") Double sizeInBytes,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.accessedAt = accessedAt;
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.countDetails = countDetails;
        this.createdAt = createdAt;
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.enableExpress = enableExpress;
        this.enablePartitioning = enablePartitioning;
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        this.forwardTo = forwardTo;
        this.id = id;
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        this.messageCount = messageCount;
        this.name = name;
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        this.requiresSession = requiresSession;
        this.sizeInBytes = sizeInBytes;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * Last time a message was sent, or the last time there was a receive request to this queue.
     * 
    */
    public String accessedAt() {
        return this.accessedAt;
    }
    /**
     * ISO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     * 
    */
    public Optional<String> autoDeleteOnIdle() {
        return Optional.ofNullable(this.autoDeleteOnIdle);
    }
    /**
     * Message Count Details.
     * 
    */
    public MessageCountDetailsResponse countDetails() {
        return this.countDetails;
    }
    /**
     * The exact time the message was created.
     * 
    */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * A value that indicates whether this queue has dead letter support when a message expires.
     * 
    */
    public Optional<Boolean> deadLetteringOnMessageExpiration() {
        return Optional.ofNullable(this.deadLetteringOnMessageExpiration);
    }
    /**
     * ISO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
    */
    public Optional<String> defaultMessageTimeToLive() {
        return Optional.ofNullable(this.defaultMessageTimeToLive);
    }
    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
    */
    public Optional<String> duplicateDetectionHistoryTimeWindow() {
        return Optional.ofNullable(this.duplicateDetectionHistoryTimeWindow);
    }
    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
    */
    public Optional<Boolean> enableBatchedOperations() {
        return Optional.ofNullable(this.enableBatchedOperations);
    }
    /**
     * A value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     * 
    */
    public Optional<Boolean> enableExpress() {
        return Optional.ofNullable(this.enableExpress);
    }
    /**
     * A value that indicates whether the queue is to be partitioned across multiple message brokers.
     * 
    */
    public Optional<Boolean> enablePartitioning() {
        return Optional.ofNullable(this.enablePartitioning);
    }
    /**
     * Queue/Topic name to forward the Dead Letter message
     * 
    */
    public Optional<String> forwardDeadLetteredMessagesTo() {
        return Optional.ofNullable(this.forwardDeadLetteredMessagesTo);
    }
    /**
     * Queue/Topic name to forward the messages
     * 
    */
    public Optional<String> forwardTo() {
        return Optional.ofNullable(this.forwardTo);
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     * 
    */
    public Optional<String> lockDuration() {
        return Optional.ofNullable(this.lockDuration);
    }
    /**
     * The maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10.
     * 
    */
    public Optional<Integer> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    /**
     * The maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024.
     * 
    */
    public Optional<Integer> maxSizeInMegabytes() {
        return Optional.ofNullable(this.maxSizeInMegabytes);
    }
    /**
     * The number of messages in the queue.
     * 
    */
    public Double messageCount() {
        return this.messageCount;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * A value indicating if this queue requires duplicate detection.
     * 
    */
    public Optional<Boolean> requiresDuplicateDetection() {
        return Optional.ofNullable(this.requiresDuplicateDetection);
    }
    /**
     * A value that indicates whether the queue supports the concept of sessions.
     * 
    */
    public Optional<Boolean> requiresSession() {
        return Optional.ofNullable(this.requiresSession);
    }
    /**
     * The size of the queue, in bytes.
     * 
    */
    public Double sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
    */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessedAt;
        private @Nullable String autoDeleteOnIdle;
        private MessageCountDetailsResponse countDetails;
        private String createdAt;
        private @Nullable Boolean deadLetteringOnMessageExpiration;
        private @Nullable String defaultMessageTimeToLive;
        private @Nullable String duplicateDetectionHistoryTimeWindow;
        private @Nullable Boolean enableBatchedOperations;
        private @Nullable Boolean enableExpress;
        private @Nullable Boolean enablePartitioning;
        private @Nullable String forwardDeadLetteredMessagesTo;
        private @Nullable String forwardTo;
        private String id;
        private @Nullable String lockDuration;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable Integer maxSizeInMegabytes;
        private Double messageCount;
        private String name;
        private @Nullable Boolean requiresDuplicateDetection;
        private @Nullable Boolean requiresSession;
        private Double sizeInBytes;
        private @Nullable String status;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessedAt = defaults.accessedAt;
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.countDetails = defaults.countDetails;
    	      this.createdAt = defaults.createdAt;
    	      this.deadLetteringOnMessageExpiration = defaults.deadLetteringOnMessageExpiration;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.forwardDeadLetteredMessagesTo = defaults.forwardDeadLetteredMessagesTo;
    	      this.forwardTo = defaults.forwardTo;
    	      this.id = defaults.id;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.messageCount = defaults.messageCount;
    	      this.name = defaults.name;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.requiresSession = defaults.requiresSession;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder accessedAt(String accessedAt) {
            this.accessedAt = Objects.requireNonNull(accessedAt);
            return this;
        }
        public Builder autoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }
        public Builder countDetails(MessageCountDetailsResponse countDetails) {
            this.countDetails = Objects.requireNonNull(countDetails);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder deadLetteringOnMessageExpiration(@Nullable Boolean deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            return this;
        }
        public Builder defaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }
        public Builder enableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }
        public Builder enableExpress(@Nullable Boolean enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }
        public Builder enablePartitioning(@Nullable Boolean enablePartitioning) {
            this.enablePartitioning = enablePartitioning;
            return this;
        }
        public Builder forwardDeadLetteredMessagesTo(@Nullable String forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            return this;
        }
        public Builder forwardTo(@Nullable String forwardTo) {
            this.forwardTo = forwardTo;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lockDuration(@Nullable String lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder maxSizeInMegabytes(@Nullable Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }
        public Builder messageCount(Double messageCount) {
            this.messageCount = Objects.requireNonNull(messageCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requiresDuplicateDetection(@Nullable Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }
        public Builder requiresSession(@Nullable Boolean requiresSession) {
            this.requiresSession = requiresSession;
            return this;
        }
        public Builder sizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetQueueResult build() {
            return new GetQueueResult(accessedAt, autoDeleteOnIdle, countDetails, createdAt, deadLetteringOnMessageExpiration, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, enableExpress, enablePartitioning, forwardDeadLetteredMessagesTo, forwardTo, id, lockDuration, maxDeliveryCount, maxSizeInMegabytes, messageCount, name, requiresDuplicateDetection, requiresSession, sizeInBytes, status, type, updatedAt);
        }
    }
}
