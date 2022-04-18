// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the event hub destination for an event subscription.
 * 
 */
public final class EventHubEventSubscriptionDestinationResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventHubEventSubscriptionDestinationResponse Empty = new EventHubEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'EventHub'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final String endpointType;

    public String endpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public EventHubEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private EventHubEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public EventHubEventSubscriptionDestinationResponse build() {
            return new EventHubEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
