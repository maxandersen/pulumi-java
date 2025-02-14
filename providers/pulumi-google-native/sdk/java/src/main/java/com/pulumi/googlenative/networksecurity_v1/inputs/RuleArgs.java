// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity_v1.inputs.DestinationArgs;
import com.pulumi.googlenative.networksecurity_v1.inputs.SourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of rules.
 * 
 */
public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<DestinationArgs>> destinations;

    /**
     * @return Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     * 
     */
    public Optional<Output<List<DestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<SourceArgs>> sources;

    /**
     * @return Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     * 
     */
    public Optional<Output<List<SourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    private RuleArgs() {}

    private RuleArgs(RuleArgs $) {
        this.destinations = $.destinations;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleArgs $;

        public Builder() {
            $ = new RuleArgs();
        }

        public Builder(RuleArgs defaults) {
            $ = new RuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<DestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<DestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(DestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param sources Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<SourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<SourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
         * 
         * @return builder
         * 
         */
        public Builder sources(SourceArgs... sources) {
            return sources(List.of(sources));
        }

        public RuleArgs build() {
            return $;
        }
    }

}
