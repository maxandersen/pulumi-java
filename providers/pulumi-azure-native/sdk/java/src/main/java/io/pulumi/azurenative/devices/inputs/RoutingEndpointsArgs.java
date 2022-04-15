// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.RoutingEventHubPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingServiceBusQueueEndpointPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingServiceBusTopicEndpointPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingStorageContainerPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties related to the custom endpoints to which your IoT hub routes messages based on the routing rules. A maximum of 10 custom endpoints are allowed across all endpoint types for paid hubs and only 1 custom endpoint is allowed across all endpoint types for free hubs.
 * 
 */
public final class RoutingEndpointsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingEndpointsArgs Empty = new RoutingEndpointsArgs();

    /**
     * The list of Event Hubs endpoints that IoT hub routes messages to, based on the routing rules. This list does not include the built-in Event Hubs endpoint.
     * 
     */
    @Import(name="eventHubs")
      private final @Nullable Output<List<RoutingEventHubPropertiesArgs>> eventHubs;

    public Output<List<RoutingEventHubPropertiesArgs>> eventHubs() {
        return this.eventHubs == null ? Codegen.empty() : this.eventHubs;
    }

    /**
     * The list of Service Bus queue endpoints that IoT hub routes the messages to, based on the routing rules.
     * 
     */
    @Import(name="serviceBusQueues")
      private final @Nullable Output<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues;

    public Output<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues() {
        return this.serviceBusQueues == null ? Codegen.empty() : this.serviceBusQueues;
    }

    /**
     * The list of Service Bus topic endpoints that the IoT hub routes the messages to, based on the routing rules.
     * 
     */
    @Import(name="serviceBusTopics")
      private final @Nullable Output<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics;

    public Output<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics() {
        return this.serviceBusTopics == null ? Codegen.empty() : this.serviceBusTopics;
    }

    /**
     * The list of storage container endpoints that IoT hub routes messages to, based on the routing rules.
     * 
     */
    @Import(name="storageContainers")
      private final @Nullable Output<List<RoutingStorageContainerPropertiesArgs>> storageContainers;

    public Output<List<RoutingStorageContainerPropertiesArgs>> storageContainers() {
        return this.storageContainers == null ? Codegen.empty() : this.storageContainers;
    }

    public RoutingEndpointsArgs(
        @Nullable Output<List<RoutingEventHubPropertiesArgs>> eventHubs,
        @Nullable Output<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues,
        @Nullable Output<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics,
        @Nullable Output<List<RoutingStorageContainerPropertiesArgs>> storageContainers) {
        this.eventHubs = eventHubs;
        this.serviceBusQueues = serviceBusQueues;
        this.serviceBusTopics = serviceBusTopics;
        this.storageContainers = storageContainers;
    }

    private RoutingEndpointsArgs() {
        this.eventHubs = Codegen.empty();
        this.serviceBusQueues = Codegen.empty();
        this.serviceBusTopics = Codegen.empty();
        this.storageContainers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RoutingEventHubPropertiesArgs>> eventHubs;
        private @Nullable Output<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues;
        private @Nullable Output<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics;
        private @Nullable Output<List<RoutingStorageContainerPropertiesArgs>> storageContainers;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingEndpointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubs = defaults.eventHubs;
    	      this.serviceBusQueues = defaults.serviceBusQueues;
    	      this.serviceBusTopics = defaults.serviceBusTopics;
    	      this.storageContainers = defaults.storageContainers;
        }

        public Builder eventHubs(@Nullable Output<List<RoutingEventHubPropertiesArgs>> eventHubs) {
            this.eventHubs = eventHubs;
            return this;
        }
        public Builder eventHubs(@Nullable List<RoutingEventHubPropertiesArgs> eventHubs) {
            this.eventHubs = Codegen.ofNullable(eventHubs);
            return this;
        }
        public Builder eventHubs(RoutingEventHubPropertiesArgs... eventHubs) {
            return eventHubs(List.of(eventHubs));
        }
        public Builder serviceBusQueues(@Nullable Output<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues) {
            this.serviceBusQueues = serviceBusQueues;
            return this;
        }
        public Builder serviceBusQueues(@Nullable List<RoutingServiceBusQueueEndpointPropertiesArgs> serviceBusQueues) {
            this.serviceBusQueues = Codegen.ofNullable(serviceBusQueues);
            return this;
        }
        public Builder serviceBusQueues(RoutingServiceBusQueueEndpointPropertiesArgs... serviceBusQueues) {
            return serviceBusQueues(List.of(serviceBusQueues));
        }
        public Builder serviceBusTopics(@Nullable Output<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics) {
            this.serviceBusTopics = serviceBusTopics;
            return this;
        }
        public Builder serviceBusTopics(@Nullable List<RoutingServiceBusTopicEndpointPropertiesArgs> serviceBusTopics) {
            this.serviceBusTopics = Codegen.ofNullable(serviceBusTopics);
            return this;
        }
        public Builder serviceBusTopics(RoutingServiceBusTopicEndpointPropertiesArgs... serviceBusTopics) {
            return serviceBusTopics(List.of(serviceBusTopics));
        }
        public Builder storageContainers(@Nullable Output<List<RoutingStorageContainerPropertiesArgs>> storageContainers) {
            this.storageContainers = storageContainers;
            return this;
        }
        public Builder storageContainers(@Nullable List<RoutingStorageContainerPropertiesArgs> storageContainers) {
            this.storageContainers = Codegen.ofNullable(storageContainers);
            return this;
        }
        public Builder storageContainers(RoutingStorageContainerPropertiesArgs... storageContainers) {
            return storageContainers(List.of(storageContainers));
        }        public RoutingEndpointsArgs build() {
            return new RoutingEndpointsArgs(eventHubs, serviceBusQueues, serviceBusTopics, storageContainers);
        }
    }
}
