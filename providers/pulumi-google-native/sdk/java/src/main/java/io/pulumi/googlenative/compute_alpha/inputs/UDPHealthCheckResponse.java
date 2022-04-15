// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class UDPHealthCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final UDPHealthCheckResponse Empty = new UDPHealthCheckResponse();

    /**
     * The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer port() {
        return this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName", required=true)
      private final String portName;

    public String portName() {
        return this.portName;
    }

    /**
     * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
     */
    @Import(name="request", required=true)
      private final String request;

    public String request() {
        return this.request;
    }

    /**
     * The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
     */
    @Import(name="response", required=true)
      private final String response;

    public String response() {
        return this.response;
    }

    public UDPHealthCheckResponse(
        Integer port,
        String portName,
        String request,
        String response) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private UDPHealthCheckResponse() {
        this.port = null;
        this.portName = null;
        this.request = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UDPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(UDPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder request(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public UDPHealthCheckResponse build() {
            return new UDPHealthCheckResponse(port, portName, request, response);
        }
    }
}
