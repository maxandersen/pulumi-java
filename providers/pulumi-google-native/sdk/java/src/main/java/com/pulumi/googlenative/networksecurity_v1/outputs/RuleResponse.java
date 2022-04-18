// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity_v1.outputs.DestinationResponse;
import com.pulumi.googlenative.networksecurity_v1.outputs.SourceResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleResponse {
    /**
     * Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
     * 
     */
    private final List<DestinationResponse> destinations;
    /**
     * Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
     * 
     */
    private final List<SourceResponse> sources;

    @CustomType.Constructor
    private RuleResponse(
        @CustomType.Parameter("destinations") List<DestinationResponse> destinations,
        @CustomType.Parameter("sources") List<SourceResponse> sources) {
        this.destinations = destinations;
        this.sources = sources;
    }

    /**
     * Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
     * 
    */
    public List<DestinationResponse> destinations() {
        return this.destinations;
    }
    /**
     * Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
     * 
    */
    public List<SourceResponse> sources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DestinationResponse> destinations;
        private List<SourceResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.sources = defaults.sources;
        }

        public Builder destinations(List<DestinationResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(DestinationResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder sources(List<SourceResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(SourceResponse... sources) {
            return sources(List.of(sources));
        }        public RuleResponse build() {
            return new RuleResponse(destinations, sources);
        }
    }
}
