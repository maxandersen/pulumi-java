// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.outputs;

import com.pulumi.azurenative.testbase.outputs.NotificationReceiverValueResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationEventReceiverResponse {
    /**
     * @return The type of the notification event receiver.
     * 
     */
    private final @Nullable String receiverType;
    /**
     * @return The notification event receiver value.
     * 
     */
    private final @Nullable NotificationReceiverValueResponse receiverValue;

    @CustomType.Constructor
    private NotificationEventReceiverResponse(
        @CustomType.Parameter("receiverType") @Nullable String receiverType,
        @CustomType.Parameter("receiverValue") @Nullable NotificationReceiverValueResponse receiverValue) {
        this.receiverType = receiverType;
        this.receiverValue = receiverValue;
    }

    /**
     * @return The type of the notification event receiver.
     * 
     */
    public Optional<String> receiverType() {
        return Optional.ofNullable(this.receiverType);
    }
    /**
     * @return The notification event receiver value.
     * 
     */
    public Optional<NotificationReceiverValueResponse> receiverValue() {
        return Optional.ofNullable(this.receiverValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEventReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String receiverType;
        private @Nullable NotificationReceiverValueResponse receiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEventReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiverType = defaults.receiverType;
    	      this.receiverValue = defaults.receiverValue;
        }

        public Builder receiverType(@Nullable String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public Builder receiverValue(@Nullable NotificationReceiverValueResponse receiverValue) {
            this.receiverValue = receiverValue;
            return this;
        }        public NotificationEventReceiverResponse build() {
            return new NotificationEventReceiverResponse(receiverType, receiverValue);
        }
    }
}
