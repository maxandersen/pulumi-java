// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.EventSubscriptionIdentityResponse;
import com.pulumi.azurenative.eventgrid.outputs.StorageBlobDeadLetterDestinationResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeadLetterWithResourceIdentityResponse {
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
    /**
     * The identity to use when dead-lettering events.
     * 
     */
    private final @Nullable EventSubscriptionIdentityResponse identity;

    @CustomType.Constructor
    private DeadLetterWithResourceIdentityResponse(
        @CustomType.Parameter("deadLetterDestination") @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination,
        @CustomType.Parameter("identity") @Nullable EventSubscriptionIdentityResponse identity) {
        this.deadLetterDestination = deadLetterDestination;
        this.identity = identity;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<StorageBlobDeadLetterDestinationResponse> deadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }
    /**
     * The identity to use when dead-lettering events.
     * 
    */
    public Optional<EventSubscriptionIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeadLetterWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
        private @Nullable EventSubscriptionIdentityResponse identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeadLetterWithResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.identity = defaults.identity;
        }

        public Builder deadLetterDestination(@Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }
        public Builder identity(@Nullable EventSubscriptionIdentityResponse identity) {
            this.identity = identity;
            return this;
        }        public DeadLetterWithResourceIdentityResponse build() {
            return new DeadLetterWithResourceIdentityResponse(deadLetterDestination, identity);
        }
    }
}
