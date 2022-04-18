// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusBrokeredMessagePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceBusBrokeredMessagePropertiesResponse Empty = new ServiceBusBrokeredMessagePropertiesResponse();

    /**
     * Gets or sets the content type.
     * 
     */
    @Import(name="contentType")
      private final @Nullable String contentType;

    public Optional<String> contentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * Gets or sets the correlation ID.
     * 
     */
    @Import(name="correlationId")
      private final @Nullable String correlationId;

    public Optional<String> correlationId() {
        return this.correlationId == null ? Optional.empty() : Optional.ofNullable(this.correlationId);
    }

    /**
     * Gets or sets the force persistence.
     * 
     */
    @Import(name="forcePersistence")
      private final @Nullable Boolean forcePersistence;

    public Optional<Boolean> forcePersistence() {
        return this.forcePersistence == null ? Optional.empty() : Optional.ofNullable(this.forcePersistence);
    }

    /**
     * Gets or sets the label.
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> label() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * Gets or sets the message ID.
     * 
     */
    @Import(name="messageId")
      private final @Nullable String messageId;

    public Optional<String> messageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    /**
     * Gets or sets the partition key.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable String partitionKey;

    public Optional<String> partitionKey() {
        return this.partitionKey == null ? Optional.empty() : Optional.ofNullable(this.partitionKey);
    }

    /**
     * Gets or sets the reply to.
     * 
     */
    @Import(name="replyTo")
      private final @Nullable String replyTo;

    public Optional<String> replyTo() {
        return this.replyTo == null ? Optional.empty() : Optional.ofNullable(this.replyTo);
    }

    /**
     * Gets or sets the reply to session ID.
     * 
     */
    @Import(name="replyToSessionId")
      private final @Nullable String replyToSessionId;

    public Optional<String> replyToSessionId() {
        return this.replyToSessionId == null ? Optional.empty() : Optional.ofNullable(this.replyToSessionId);
    }

    /**
     * Gets or sets the scheduled enqueue time UTC.
     * 
     */
    @Import(name="scheduledEnqueueTimeUtc")
      private final @Nullable String scheduledEnqueueTimeUtc;

    public Optional<String> scheduledEnqueueTimeUtc() {
        return this.scheduledEnqueueTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.scheduledEnqueueTimeUtc);
    }

    /**
     * Gets or sets the session ID.
     * 
     */
    @Import(name="sessionId")
      private final @Nullable String sessionId;

    public Optional<String> sessionId() {
        return this.sessionId == null ? Optional.empty() : Optional.ofNullable(this.sessionId);
    }

    /**
     * Gets or sets the time to live.
     * 
     */
    @Import(name="timeToLive")
      private final @Nullable String timeToLive;

    public Optional<String> timeToLive() {
        return this.timeToLive == null ? Optional.empty() : Optional.ofNullable(this.timeToLive);
    }

    /**
     * Gets or sets the to.
     * 
     */
    @Import(name="to")
      private final @Nullable String to;

    public Optional<String> to() {
        return this.to == null ? Optional.empty() : Optional.ofNullable(this.to);
    }

    /**
     * Gets or sets the via partition key.
     * 
     */
    @Import(name="viaPartitionKey")
      private final @Nullable String viaPartitionKey;

    public Optional<String> viaPartitionKey() {
        return this.viaPartitionKey == null ? Optional.empty() : Optional.ofNullable(this.viaPartitionKey);
    }

    public ServiceBusBrokeredMessagePropertiesResponse(
        @Nullable String contentType,
        @Nullable String correlationId,
        @Nullable Boolean forcePersistence,
        @Nullable String label,
        @Nullable String messageId,
        @Nullable String partitionKey,
        @Nullable String replyTo,
        @Nullable String replyToSessionId,
        @Nullable String scheduledEnqueueTimeUtc,
        @Nullable String sessionId,
        @Nullable String timeToLive,
        @Nullable String to,
        @Nullable String viaPartitionKey) {
        this.contentType = contentType;
        this.correlationId = correlationId;
        this.forcePersistence = forcePersistence;
        this.label = label;
        this.messageId = messageId;
        this.partitionKey = partitionKey;
        this.replyTo = replyTo;
        this.replyToSessionId = replyToSessionId;
        this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
        this.sessionId = sessionId;
        this.timeToLive = timeToLive;
        this.to = to;
        this.viaPartitionKey = viaPartitionKey;
    }

    private ServiceBusBrokeredMessagePropertiesResponse() {
        this.contentType = null;
        this.correlationId = null;
        this.forcePersistence = null;
        this.label = null;
        this.messageId = null;
        this.partitionKey = null;
        this.replyTo = null;
        this.replyToSessionId = null;
        this.scheduledEnqueueTimeUtc = null;
        this.sessionId = null;
        this.timeToLive = null;
        this.to = null;
        this.viaPartitionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String correlationId;
        private @Nullable Boolean forcePersistence;
        private @Nullable String label;
        private @Nullable String messageId;
        private @Nullable String partitionKey;
        private @Nullable String replyTo;
        private @Nullable String replyToSessionId;
        private @Nullable String scheduledEnqueueTimeUtc;
        private @Nullable String sessionId;
        private @Nullable String timeToLive;
        private @Nullable String to;
        private @Nullable String viaPartitionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.correlationId = defaults.correlationId;
    	      this.forcePersistence = defaults.forcePersistence;
    	      this.label = defaults.label;
    	      this.messageId = defaults.messageId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.replyTo = defaults.replyTo;
    	      this.replyToSessionId = defaults.replyToSessionId;
    	      this.scheduledEnqueueTimeUtc = defaults.scheduledEnqueueTimeUtc;
    	      this.sessionId = defaults.sessionId;
    	      this.timeToLive = defaults.timeToLive;
    	      this.to = defaults.to;
    	      this.viaPartitionKey = defaults.viaPartitionKey;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder correlationId(@Nullable String correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        public Builder forcePersistence(@Nullable Boolean forcePersistence) {
            this.forcePersistence = forcePersistence;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder messageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder replyTo(@Nullable String replyTo) {
            this.replyTo = replyTo;
            return this;
        }
        public Builder replyToSessionId(@Nullable String replyToSessionId) {
            this.replyToSessionId = replyToSessionId;
            return this;
        }
        public Builder scheduledEnqueueTimeUtc(@Nullable String scheduledEnqueueTimeUtc) {
            this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
            return this;
        }
        public Builder sessionId(@Nullable String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Builder timeToLive(@Nullable String timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = to;
            return this;
        }
        public Builder viaPartitionKey(@Nullable String viaPartitionKey) {
            this.viaPartitionKey = viaPartitionKey;
            return this;
        }        public ServiceBusBrokeredMessagePropertiesResponse build() {
            return new ServiceBusBrokeredMessagePropertiesResponse(contentType, correlationId, forcePersistence, label, messageId, partitionKey, replyTo, replyToSessionId, scheduledEnqueueTimeUtc, sessionId, timeToLive, to, viaPartitionKey);
        }
    }
}
