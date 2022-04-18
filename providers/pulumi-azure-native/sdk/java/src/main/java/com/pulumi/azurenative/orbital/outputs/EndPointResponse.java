// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndPointResponse {
    /**
     * Name of an end point.
     * 
     */
    private final String endPointName;
    /**
     * IP Address.
     * 
     */
    private final String ipAddress;
    /**
     * TCP port to listen on to receive data.
     * 
     */
    private final String port;
    /**
     * Protocol either UDP or TCP.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private EndPointResponse(
        @CustomType.Parameter("endPointName") String endPointName,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("protocol") String protocol) {
        this.endPointName = endPointName;
        this.ipAddress = ipAddress;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * Name of an end point.
     * 
    */
    public String endPointName() {
        return this.endPointName;
    }
    /**
     * IP Address.
     * 
    */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * TCP port to listen on to receive data.
     * 
    */
    public String port() {
        return this.port;
    }
    /**
     * Protocol either UDP or TCP.
     * 
    */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndPointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endPointName;
        private String ipAddress;
        private String port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndPointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPointName = defaults.endPointName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder endPointName(String endPointName) {
            this.endPointName = Objects.requireNonNull(endPointName);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public EndPointResponse build() {
            return new EndPointResponse(endPointName, ipAddress, port, protocol);
        }
    }
}
