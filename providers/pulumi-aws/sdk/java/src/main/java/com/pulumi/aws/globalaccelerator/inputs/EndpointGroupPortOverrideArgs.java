// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class EndpointGroupPortOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGroupPortOverrideArgs Empty = new EndpointGroupPortOverrideArgs();

    /**
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
     */
    @Import(name="endpointPort", required=true)
    private Output<Integer> endpointPort;

    public Output<Integer> endpointPort() {
        return this.endpointPort;
    }

    /**
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
     */
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
