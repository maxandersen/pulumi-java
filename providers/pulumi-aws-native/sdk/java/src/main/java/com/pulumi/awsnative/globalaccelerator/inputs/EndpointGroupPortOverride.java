// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.globalaccelerator.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * listener to endpoint port mapping.
 * 
 */
public final class EndpointGroupPortOverride extends com.pulumi.resources.InvokeArgs {

    public static final EndpointGroupPortOverride Empty = new EndpointGroupPortOverride();

    @Import(name="endpointPort", required=true)
      private final Integer endpointPort;

    public Integer endpointPort() {
        return this.endpointPort;
    }

    @Import(name="listenerPort", required=true)
      private final Integer listenerPort;

    public Integer listenerPort() {
        return this.listenerPort;
    }

    public EndpointGroupPortOverride(
        Integer endpointPort,
        Integer listenerPort) {
        this.endpointPort = Objects.requireNonNull(endpointPort, "expected parameter 'endpointPort' to be non-null");
        this.listenerPort = Objects.requireNonNull(listenerPort, "expected parameter 'listenerPort' to be non-null");
    }

    private EndpointGroupPortOverride() {
        this.endpointPort = null;
        this.listenerPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endpointPort;
        private Integer listenerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupPortOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        public Builder endpointPort(Integer endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }        public EndpointGroupPortOverride build() {
            return new EndpointGroupPortOverride(endpointPort, listenerPort);
        }
    }
}
