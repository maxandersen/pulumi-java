// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionReceiverValueResponse {
    /**
     * The role of the notification receiver.
     * 
     */
    private final @Nullable String role;
    /**
     * The subscription id of the notification receiver.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * The subscription name of the notification receiver.
     * 
     */
    private final @Nullable String subscriptionName;

    @CustomType.Constructor
    private SubscriptionReceiverValueResponse(
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("subscriptionName") @Nullable String subscriptionName) {
        this.role = role;
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
    }

    /**
     * The role of the notification receiver.
     * 
    */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * The subscription id of the notification receiver.
     * 
    */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * The subscription name of the notification receiver.
     * 
    */
    public Optional<String> subscriptionName() {
        return Optional.ofNullable(this.subscriptionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String role;
        private @Nullable String subscriptionId;
        private @Nullable String subscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionReceiverValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.subscriptionName = defaults.subscriptionName;
        }

        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder subscriptionName(@Nullable String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }        public SubscriptionReceiverValueResponse build() {
            return new SubscriptionReceiverValueResponse(role, subscriptionId, subscriptionName);
        }
    }
}
