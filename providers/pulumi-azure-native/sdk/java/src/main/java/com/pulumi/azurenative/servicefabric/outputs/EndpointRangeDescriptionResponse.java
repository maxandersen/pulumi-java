// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class EndpointRangeDescriptionResponse {
    /**
     * End port of a range of ports
     * 
     */
    private final Integer endPort;
    /**
     * Starting port of a range of ports
     * 
     */
    private final Integer startPort;

    @CustomType.Constructor
    private EndpointRangeDescriptionResponse(
        @CustomType.Parameter("endPort") Integer endPort,
        @CustomType.Parameter("startPort") Integer startPort) {
        this.endPort = endPort;
        this.startPort = startPort;
    }

    /**
     * End port of a range of ports
     * 
    */
    public Integer endPort() {
        return this.endPort;
    }
    /**
     * Starting port of a range of ports
     * 
    */
    public Integer startPort() {
        return this.startPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointRangeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endPort;
        private Integer startPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointRangeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.startPort = defaults.startPort;
        }

        public Builder endPort(Integer endPort) {
            this.endPort = Objects.requireNonNull(endPort);
            return this;
        }
        public Builder startPort(Integer startPort) {
            this.startPort = Objects.requireNonNull(startPort);
            return this;
        }        public EndpointRangeDescriptionResponse build() {
            return new EndpointRangeDescriptionResponse(endPort, startPort);
        }
    }
}
