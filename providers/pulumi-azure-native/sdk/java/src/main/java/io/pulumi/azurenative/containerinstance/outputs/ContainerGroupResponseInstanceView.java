// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.EventResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContainerGroupResponseInstanceView {
    /**
     * The events of this container group.
     * 
     */
    private final List<EventResponse> events;
    /**
     * The state of the container group. Only valid in response.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private ContainerGroupResponseInstanceView(
        @CustomType.Parameter("events") List<EventResponse> events,
        @CustomType.Parameter("state") String state) {
        this.events = events;
        this.state = state;
    }

    /**
     * The events of this container group.
     * 
    */
    public List<EventResponse> events() {
        return this.events;
    }
    /**
     * The state of the container group. Only valid in response.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EventResponse> events;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.state = defaults.state;
        }

        public Builder events(List<EventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(EventResponse... events) {
            return events(List.of(events));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public ContainerGroupResponseInstanceView build() {
            return new ContainerGroupResponseInstanceView(events, state);
        }
    }
}
