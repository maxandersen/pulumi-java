// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the service bus destination for an event subscription.
 * 
 */
public final class ServiceBusQueueEventSubscriptionDestinationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceBusQueueEventSubscriptionDestinationResponse Empty = new ServiceBusQueueEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is &#39;ServiceBusQueue&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
      private final String endpointType;

    public String endpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of the Service Bus destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public ServiceBusQueueEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String resourceId) {
        this.endpointType = Codegen.stringProp("endpointType").arg(endpointType).require();
        this.resourceId = resourceId;
    }

    private ServiceBusQueueEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueEventSubscriptionDestinationResponse defaults) {
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
        }        public ServiceBusQueueEventSubscriptionDestinationResponse build() {
            return new ServiceBusQueueEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
