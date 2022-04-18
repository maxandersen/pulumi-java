// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class HTTPSHealthCheckResponse extends com.pulumi.resources.InvokeArgs {

    public static final HTTPSHealthCheckResponse Empty = new HTTPSHealthCheckResponse();

    /**
     * The value of the host header in the HTTPS health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String host() {
        return this.host;
    }

    /**
     * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
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
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTPS health check follows behavior specified in port and portName fields.
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
     * The request path of the HTTPS health check request. The default value is /.
     * 
     */
    @Import(name="requestPath", required=true)
      private final String requestPath;

    public String requestPath() {
        return this.requestPath;
    }

    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    @Import(name="response", required=true)
      private final String response;

    public String response() {
        return this.response;
    }

    public HTTPSHealthCheckResponse(
        String host,
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String requestPath,
        String response) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
        this.proxyHeader = Objects.requireNonNull(proxyHeader, "expected parameter 'proxyHeader' to be non-null");
        this.requestPath = Objects.requireNonNull(requestPath, "expected parameter 'requestPath' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private HTTPSHealthCheckResponse() {
        this.host = null;
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
        this.proxyHeader = null;
        this.requestPath = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPSHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String requestPath;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPSHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
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
        public Builder requestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public HTTPSHealthCheckResponse build() {
            return new HTTPSHealthCheckResponse(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
