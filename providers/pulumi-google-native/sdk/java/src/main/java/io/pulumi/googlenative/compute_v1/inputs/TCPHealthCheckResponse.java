// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class TCPHealthCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final TCPHealthCheckResponse Empty = new TCPHealthCheckResponse();

    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
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
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, TCP health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification", required=true)
      private final String portSpecification;

    public String portSpecification() {
        return this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader", required=true)
      private final String proxyHeader;

    public String proxyHeader() {
        return this.proxyHeader;
    }

    /**
     * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    @Import(name="request", required=true)
      private final String request;

    public String request() {
        return this.request;
    }

    /**
     * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    @Import(name="response", required=true)
      private final String response;

    public String response() {
        return this.response;
    }

    public TCPHealthCheckResponse(
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String request,
        String response) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
        this.proxyHeader = Objects.requireNonNull(proxyHeader, "expected parameter 'proxyHeader' to be non-null");
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private TCPHealthCheckResponse() {
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
        this.proxyHeader = null;
        this.request = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
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
        public Builder portSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }
        public Builder proxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }
        public Builder request(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public TCPHealthCheckResponse build() {
            return new TCPHealthCheckResponse(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
