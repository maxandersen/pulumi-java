// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.azurenative.eventgrid.inputs.EventSubscriptionIdentityResponse;
import com.pulumi.azurenative.eventgrid.inputs.StorageBlobDeadLetterDestinationResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the deadletter destination with resource identity.
 * 
 */
public final class DeadLetterWithResourceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeadLetterWithResourceIdentityResponse Empty = new DeadLetterWithResourceIdentityResponse();

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deadLetterDestination")
    private @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;

    public Optional<StorageBlobDeadLetterDestinationResponse> deadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }

    /**
     * The identity to use when dead-lettering events.
     * 
     */
    @Import(name="identity")
    private @Nullable EventSubscriptionIdentityResponse identity;

    public Optional<EventSubscriptionIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }

    private DeadLetterWithResourceIdentityResponse() {}

    private DeadLetterWithResourceIdentityResponse(DeadLetterWithResourceIdentityResponse $) {
        this.deadLetterDestination = $.deadLetterDestination;
        this.identity = $.identity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeadLetterWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeadLetterWithResourceIdentityResponse $;

        public Builder() {
            $ = new DeadLetterWithResourceIdentityResponse();
        }

        public Builder(DeadLetterWithResourceIdentityResponse defaults) {
            $ = new DeadLetterWithResourceIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder deadLetterDestination(@Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination) {
            $.deadLetterDestination = deadLetterDestination;
            return this;
        }

        public Builder identity(@Nullable EventSubscriptionIdentityResponse identity) {
            $.identity = identity;
            return this;
        }

        public DeadLetterWithResourceIdentityResponse build() {
            return $;
        }
    }

}
