// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.NotificationReceiverValueResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A notification event receivers.
 * 
 */
public final class NotificationEventReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationEventReceiverResponse Empty = new NotificationEventReceiverResponse();

    /**
     * The type of the notification event receiver.
     * 
     */
    @Import(name="receiverType")
      private final @Nullable String receiverType;

    public Optional<String> receiverType() {
        return this.receiverType == null ? Optional.empty() : Optional.ofNullable(this.receiverType);
    }

    /**
     * The notification event receiver value.
     * 
     */
    @Import(name="receiverValue")
      private final @Nullable NotificationReceiverValueResponse receiverValue;

    public Optional<NotificationReceiverValueResponse> receiverValue() {
        return this.receiverValue == null ? Optional.empty() : Optional.ofNullable(this.receiverValue);
    }

    public NotificationEventReceiverResponse(
        @Nullable String receiverType,
        @Nullable NotificationReceiverValueResponse receiverValue) {
        this.receiverType = receiverType;
        this.receiverValue = receiverValue;
    }

    private NotificationEventReceiverResponse() {
        this.receiverType = null;
        this.receiverValue = null;
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
