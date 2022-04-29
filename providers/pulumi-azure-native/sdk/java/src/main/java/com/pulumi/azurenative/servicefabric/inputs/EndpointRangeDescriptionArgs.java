// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;


/**
 * Port range details
 * 
 */
public final class EndpointRangeDescriptionArgs extends ResourceArgs {

    public static final EndpointRangeDescriptionArgs Empty = new EndpointRangeDescriptionArgs();

    /**
     * End port of a range of ports
     * 
     */
    @Import(name="endPort", required=true)
    private Output<Integer> endPort;

    /**
     * @return End port of a range of ports
     * 
     */
    public Output<Integer> endPort() {
        return this.endPort;
    }

    /**
     * Starting port of a range of ports
     * 
     */
    @Import(name="startPort", required=true)
    private Output<Integer> startPort;

    /**
     * @return Starting port of a range of ports
     * 
     */
    public Output<Integer> startPort() {
        return this.startPort;
    }

    private EndpointRangeDescriptionArgs() {}

    private EndpointRangeDescriptionArgs(EndpointRangeDescriptionArgs $) {
        this.endPort = $.endPort;
        this.startPort = $.startPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointRangeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointRangeDescriptionArgs $;

        public Builder() {
            $ = new EndpointRangeDescriptionArgs();
        }

        public Builder(EndpointRangeDescriptionArgs defaults) {
            $ = new EndpointRangeDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endPort End port of a range of ports
         * 
         * @return builder
         * 
         */
        public Builder endPort(Output<Integer> endPort) {
            $.endPort = endPort;
            return this;
        }

        /**
         * @param endPort End port of a range of ports
         * 
         * @return builder
         * 
         */
        public Builder endPort(Integer endPort) {
            return endPort(Output.of(endPort));
        }

        /**
         * @param startPort Starting port of a range of ports
         * 
         * @return builder
         * 
         */
        public Builder startPort(Output<Integer> startPort) {
            $.startPort = startPort;
            return this;
        }

        /**
         * @param startPort Starting port of a range of ports
         * 
         * @return builder
         * 
         */
        public Builder startPort(Integer startPort) {
            return startPort(Output.of(startPort));
        }

        public EndpointRangeDescriptionArgs build() {
            $.endPort = Objects.requireNonNull($.endPort, "expected parameter 'endPort' to be non-null");
            $.startPort = Objects.requireNonNull($.startPort, "expected parameter 'startPort' to be non-null");
            return $;
        }
    }

}
