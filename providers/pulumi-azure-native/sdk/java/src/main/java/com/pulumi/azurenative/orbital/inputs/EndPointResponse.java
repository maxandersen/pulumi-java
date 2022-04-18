// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Customer End point to store/retrieve data during a contact.
 * 
 */
public final class EndPointResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndPointResponse Empty = new EndPointResponse();

    /**
     * Name of an end point.
     * 
     */
    @Import(name="endPointName", required=true)
      private final String endPointName;

    public String endPointName() {
        return this.endPointName;
    }

    /**
     * IP Address.
     * 
     */
    @Import(name="ipAddress", required=true)
      private final String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * TCP port to listen on to receive data.
     * 
     */
    @Import(name="port", required=true)
      private final String port;

    public String port() {
        return this.port;
    }

    /**
     * Protocol either UDP or TCP.
     * 
     */
    @Import(name="protocol", required=true)
      private final String protocol;

    public String protocol() {
        return this.protocol;
    }

    public EndPointResponse(
        String endPointName,
        String ipAddress,
        String port,
        String protocol) {
        this.endPointName = Objects.requireNonNull(endPointName, "expected parameter 'endPointName' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private EndPointResponse() {
        this.endPointName = null;
        this.ipAddress = null;
        this.port = null;
        this.protocol = null;
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
