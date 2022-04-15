// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.NotificationReceiverValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A notification event receivers.
 * 
 */
public final class NotificationEventReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationEventReceiverArgs Empty = new NotificationEventReceiverArgs();

    /**
     * The type of the notification event receiver.
     * 
     */
    @Import(name="receiverType")
      private final @Nullable Output<String> receiverType;

    public Output<String> receiverType() {
        return this.receiverType == null ? Codegen.empty() : this.receiverType;
    }

    /**
     * The notification event receiver value.
     * 
     */
    @Import(name="receiverValue")
      private final @Nullable Output<NotificationReceiverValueArgs> receiverValue;

    public Output<NotificationReceiverValueArgs> receiverValue() {
        return this.receiverValue == null ? Codegen.empty() : this.receiverValue;
    }

    public NotificationEventReceiverArgs(
        @Nullable Output<String> receiverType,
        @Nullable Output<NotificationReceiverValueArgs> receiverValue) {
        this.receiverType = receiverType;
        this.receiverValue = receiverValue;
    }

    private NotificationEventReceiverArgs() {
        this.receiverType = Codegen.empty();
        this.receiverValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEventReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> receiverType;
        private @Nullable Output<NotificationReceiverValueArgs> receiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEventReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiverType = defaults.receiverType;
    	      this.receiverValue = defaults.receiverValue;
        }

        public Builder receiverType(@Nullable Output<String> receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public Builder receiverType(@Nullable String receiverType) {
            this.receiverType = Codegen.ofNullable(receiverType);
            return this;
        }
        public Builder receiverValue(@Nullable Output<NotificationReceiverValueArgs> receiverValue) {
            this.receiverValue = receiverValue;
            return this;
        }
        public Builder receiverValue(@Nullable NotificationReceiverValueArgs receiverValue) {
            this.receiverValue = Codegen.ofNullable(receiverValue);
            return this;
        }        public NotificationEventReceiverArgs build() {
            return new NotificationEventReceiverArgs(receiverType, receiverValue);
        }
    }
}
