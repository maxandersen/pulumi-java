// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the event hub destination for an event subscription.
 * 
 */
public final class EventHubEventSubscriptionDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubEventSubscriptionDestinationArgs Empty = new EventHubEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'EventHub'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public EventHubEventSubscriptionDestinationArgs(
        Output<String> endpointType,
        @Nullable Output<String> resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private EventHubEventSubscriptionDestinationArgs() {
        this.endpointType = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpointType;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public EventHubEventSubscriptionDestinationArgs build() {
            return new EventHubEventSubscriptionDestinationArgs(endpointType, resourceId);
        }
    }
}
