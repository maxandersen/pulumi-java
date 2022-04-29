// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the event hub destination for an event subscription.
 * 
 */
public final class EventHubEventSubscriptionDestinationArgs extends ResourceArgs {

    public static final EventHubEventSubscriptionDestinationArgs Empty = new EventHubEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    /**
     * @return Type of the endpoint for the event subscription destination.
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private EventHubEventSubscriptionDestinationArgs() {}

    private EventHubEventSubscriptionDestinationArgs(EventHubEventSubscriptionDestinationArgs $) {
        this.endpointType = $.endpointType;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubEventSubscriptionDestinationArgs $;

        public Builder() {
            $ = new EventHubEventSubscriptionDestinationArgs();
        }

        public Builder(EventHubEventSubscriptionDestinationArgs defaults) {
            $ = new EventHubEventSubscriptionDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointType Type of the endpoint for the event subscription destination.
         * Expected value is &#39;EventHub&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType Type of the endpoint for the event subscription destination.
         * Expected value is &#39;EventHub&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param resourceId The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public EventHubEventSubscriptionDestinationArgs build() {
            $.endpointType = Codegen.stringProp("endpointType").output().arg($.endpointType).require();
            return $;
        }
    }

}
