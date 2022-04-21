// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.globalaccelerator.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * listener to endpoint port mapping.
 * 
 */
public final class EndpointGroupPortOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGroupPortOverrideArgs Empty = new EndpointGroupPortOverrideArgs();

    @Import(name="endpointPort", required=true)
    private Output<Integer> endpointPort;

    public Output<Integer> endpointPort() {
        return this.endpointPort;
    }

    @Import(name="listenerPort", required=true)
    private Output<Integer> listenerPort;

    public Output<Integer> listenerPort() {
        return this.listenerPort;
    }

    private EndpointGroupPortOverrideArgs() {}

    private EndpointGroupPortOverrideArgs(EndpointGroupPortOverrideArgs $) {
        this.endpointPort = $.endpointPort;
        this.listenerPort = $.listenerPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointGroupPortOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointGroupPortOverrideArgs $;

        public Builder() {
            $ = new EndpointGroupPortOverrideArgs();
        }

        public Builder(EndpointGroupPortOverrideArgs defaults) {
            $ = new EndpointGroupPortOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointPort(Output<Integer> endpointPort) {
            $.endpointPort = endpointPort;
            return this;
        }

        public Builder endpointPort(Integer endpointPort) {
            return endpointPort(Output.of(endpointPort));
        }

        public Builder listenerPort(Output<Integer> listenerPort) {
            $.listenerPort = listenerPort;
            return this;
        }

        public Builder listenerPort(Integer listenerPort) {
            return listenerPort(Output.of(listenerPort));
        }

        public EndpointGroupPortOverrideArgs build() {
            $.endpointPort = Objects.requireNonNull($.endpointPort, "expected parameter 'endpointPort' to be non-null");
            $.listenerPort = Objects.requireNonNull($.listenerPort, "expected parameter 'listenerPort' to be non-null");
            return $;
        }
    }

}
