// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MessagingEndpointPropertiesResponse {
    /**
     * The lock duration. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    private final @Nullable String lockDurationAsIso8601;
    /**
     * The number of times the IoT hub attempts to deliver a message. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;
    /**
     * The period of time for which a message is available to consume before it is expired by the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    private final @Nullable String ttlAsIso8601;

    @CustomType.Constructor
    private MessagingEndpointPropertiesResponse(
        @CustomType.Parameter("lockDurationAsIso8601") @Nullable String lockDurationAsIso8601,
        @CustomType.Parameter("maxDeliveryCount") @Nullable Integer maxDeliveryCount,
        @CustomType.Parameter("ttlAsIso8601") @Nullable String ttlAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        this.maxDeliveryCount = maxDeliveryCount;
        this.ttlAsIso8601 = ttlAsIso8601;
    }

    /**
     * The lock duration. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
    */
    public Optional<String> lockDurationAsIso8601() {
        return Optional.ofNullable(this.lockDurationAsIso8601);
    }
    /**
     * The number of times the IoT hub attempts to deliver a message. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
    */
    public Optional<Integer> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    /**
     * The period of time for which a message is available to consume before it is expired by the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
    */
    public Optional<String> ttlAsIso8601() {
        return Optional.ofNullable(this.ttlAsIso8601);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessagingEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lockDurationAsIso8601;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable String ttlAsIso8601;

        public Builder() {
    	      // Empty
        }

        public Builder(MessagingEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockDurationAsIso8601 = defaults.lockDurationAsIso8601;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.ttlAsIso8601 = defaults.ttlAsIso8601;
        }

        public Builder lockDurationAsIso8601(@Nullable String lockDurationAsIso8601) {
            this.lockDurationAsIso8601 = lockDurationAsIso8601;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder ttlAsIso8601(@Nullable String ttlAsIso8601) {
            this.ttlAsIso8601 = ttlAsIso8601;
            return this;
        }        public MessagingEndpointPropertiesResponse build() {
            return new MessagingEndpointPropertiesResponse(lockDurationAsIso8601, maxDeliveryCount, ttlAsIso8601);
        }
    }
}
