// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ShareSynchronizationResponse {
    /**
     * Email of the user who created the synchronization
     * 
     */
    private final @Nullable String consumerEmail;
    /**
     * Name of the user who created the synchronization
     * 
     */
    private final @Nullable String consumerName;
    /**
     * Tenant name of the consumer who created the synchronization
     * 
     */
    private final @Nullable String consumerTenantName;
    /**
     * synchronization duration
     * 
     */
    private final @Nullable Integer durationMs;
    /**
     * End time of synchronization
     * 
     */
    private final @Nullable String endTime;
    /**
     * message of synchronization
     * 
     */
    private final @Nullable String message;
    /**
     * start time of synchronization
     * 
     */
    private final @Nullable String startTime;
    /**
     * Raw Status
     * 
     */
    private final @Nullable String status;
    /**
     * Synchronization id
     * 
     */
    private final @Nullable String synchronizationId;
    /**
     * Synchronization mode
     * 
     */
    private final String synchronizationMode;

    @CustomType.Constructor
    private ShareSynchronizationResponse(
        @CustomType.Parameter("consumerEmail") @Nullable String consumerEmail,
        @CustomType.Parameter("consumerName") @Nullable String consumerName,
        @CustomType.Parameter("consumerTenantName") @Nullable String consumerTenantName,
        @CustomType.Parameter("durationMs") @Nullable Integer durationMs,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("synchronizationId") @Nullable String synchronizationId,
        @CustomType.Parameter("synchronizationMode") String synchronizationMode) {
        this.consumerEmail = consumerEmail;
        this.consumerName = consumerName;
        this.consumerTenantName = consumerTenantName;
        this.durationMs = durationMs;
        this.endTime = endTime;
        this.message = message;
        this.startTime = startTime;
        this.status = status;
        this.synchronizationId = synchronizationId;
        this.synchronizationMode = synchronizationMode;
    }

    /**
     * Email of the user who created the synchronization
     * 
    */
    public Optional<String> consumerEmail() {
        return Optional.ofNullable(this.consumerEmail);
    }
    /**
     * Name of the user who created the synchronization
     * 
    */
    public Optional<String> consumerName() {
        return Optional.ofNullable(this.consumerName);
    }
    /**
     * Tenant name of the consumer who created the synchronization
     * 
    */
    public Optional<String> consumerTenantName() {
        return Optional.ofNullable(this.consumerTenantName);
    }
    /**
     * synchronization duration
     * 
    */
    public Optional<Integer> durationMs() {
        return Optional.ofNullable(this.durationMs);
    }
    /**
     * End time of synchronization
     * 
    */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * message of synchronization
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * start time of synchronization
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Raw Status
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Synchronization id
     * 
    */
    public Optional<String> synchronizationId() {
        return Optional.ofNullable(this.synchronizationId);
    }
    /**
     * Synchronization mode
     * 
    */
    public String synchronizationMode() {
        return this.synchronizationMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSynchronizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumerEmail;
        private @Nullable String consumerName;
        private @Nullable String consumerTenantName;
        private @Nullable Integer durationMs;
        private @Nullable String endTime;
        private @Nullable String message;
        private @Nullable String startTime;
        private @Nullable String status;
        private @Nullable String synchronizationId;
        private String synchronizationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSynchronizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerEmail = defaults.consumerEmail;
    	      this.consumerName = defaults.consumerName;
    	      this.consumerTenantName = defaults.consumerTenantName;
    	      this.durationMs = defaults.durationMs;
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.synchronizationId = defaults.synchronizationId;
    	      this.synchronizationMode = defaults.synchronizationMode;
        }

        public Builder consumerEmail(@Nullable String consumerEmail) {
            this.consumerEmail = consumerEmail;
            return this;
        }
        public Builder consumerName(@Nullable String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public Builder consumerTenantName(@Nullable String consumerTenantName) {
            this.consumerTenantName = consumerTenantName;
            return this;
        }
        public Builder durationMs(@Nullable Integer durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder synchronizationId(@Nullable String synchronizationId) {
            this.synchronizationId = synchronizationId;
            return this;
        }
        public Builder synchronizationMode(String synchronizationMode) {
            this.synchronizationMode = Objects.requireNonNull(synchronizationMode);
            return this;
        }        public ShareSynchronizationResponse build() {
            return new ShareSynchronizationResponse(consumerEmail, consumerName, consumerTenantName, durationMs, endTime, message, startTime, status, synchronizationId, synchronizationMode);
        }
    }
}
