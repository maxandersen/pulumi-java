// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventSubscriptionIdentityResponse;
import io.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryWithResourceIdentityResponse {
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable Object destination;
    /**
     * The identity to use when delivering events.
     * 
     */
    private final @Nullable EventSubscriptionIdentityResponse identity;

    @CustomType.Constructor
    private DeliveryWithResourceIdentityResponse(
        @CustomType.Parameter("destination") @Nullable Object destination,
        @CustomType.Parameter("identity") @Nullable EventSubscriptionIdentityResponse identity) {
        this.destination = destination;
        this.identity = identity;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<Object> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * The identity to use when delivering events.
     * 
    */
    public Optional<EventSubscriptionIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object destination;
        private @Nullable EventSubscriptionIdentityResponse identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryWithResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.identity = defaults.identity;
        }

        public Builder destination(@Nullable Object destination) {
            this.destination = destination;
            return this;
        }
        public Builder identity(@Nullable EventSubscriptionIdentityResponse identity) {
            this.identity = identity;
            return this;
        }        public DeliveryWithResourceIdentityResponse build() {
            return new DeliveryWithResourceIdentityResponse(destination, identity);
        }
    }
}
