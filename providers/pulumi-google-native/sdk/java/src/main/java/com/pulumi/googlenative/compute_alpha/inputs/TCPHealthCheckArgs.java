// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.TCPHealthCheckPortSpecification;
import com.pulumi.googlenative.compute_alpha.enums.TCPHealthCheckProxyHeader;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TCPHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final TCPHealthCheckArgs Empty = new TCPHealthCheckArgs();

    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> portName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, TCP health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification")
      private final @Nullable Output<TCPHealthCheckPortSpecification> portSpecification;

    public Output<TCPHealthCheckPortSpecification> portSpecification() {
        return this.portSpecification == null ? Codegen.empty() : this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader")
      private final @Nullable Output<TCPHealthCheckProxyHeader> proxyHeader;

    public Output<TCPHealthCheckProxyHeader> proxyHeader() {
        return this.proxyHeader == null ? Codegen.empty() : this.proxyHeader;
    }

    /**
     * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    @Import(name="request")
      private final @Nullable Output<String> request;

    public Output<String> request() {
        return this.request == null ? Codegen.empty() : this.request;
    }

    /**
     * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    @Import(name="response")
      private final @Nullable Output<String> response;

    public Output<String> response() {
        return this.response == null ? Codegen.empty() : this.response;
    }

    public TCPHealthCheckArgs(
        @Nullable Output<Integer> port,
        @Nullable Output<String> portName,
        @Nullable Output<TCPHealthCheckPortSpecification> portSpecification,
        @Nullable Output<TCPHealthCheckProxyHeader> proxyHeader,
        @Nullable Output<String> request,
        @Nullable Output<String> response) {
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.request = request;
        this.response = response;
    }

    private TCPHealthCheckArgs() {
        this.port = Codegen.empty();
        this.portName = Codegen.empty();
        this.portSpecification = Codegen.empty();
        this.proxyHeader = Codegen.empty();
        this.request = Codegen.empty();
        this.response = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> portName;
        private @Nullable Output<TCPHealthCheckPortSpecification> portSpecification;
        private @Nullable Output<TCPHealthCheckProxyHeader> proxyHeader;
        private @Nullable Output<String> request;
        private @Nullable Output<String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder portName(@Nullable Output<String> portName) {
            this.portName = portName;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = Codegen.ofNullable(portName);
            return this;
        }
        public Builder portSpecification(@Nullable Output<TCPHealthCheckPortSpecification> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public Builder portSpecification(@Nullable TCPHealthCheckPortSpecification portSpecification) {
            this.portSpecification = Codegen.ofNullable(portSpecification);
            return this;
        }
        public Builder proxyHeader(@Nullable Output<TCPHealthCheckProxyHeader> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }
        public Builder proxyHeader(@Nullable TCPHealthCheckProxyHeader proxyHeader) {
            this.proxyHeader = Codegen.ofNullable(proxyHeader);
            return this;
        }
        public Builder request(@Nullable Output<String> request) {
            this.request = request;
            return this;
        }
        public Builder request(@Nullable String request) {
            this.request = Codegen.ofNullable(request);
            return this;
        }
        public Builder response(@Nullable Output<String> response) {
            this.response = response;
            return this;
        }
        public Builder response(@Nullable String response) {
            this.response = Codegen.ofNullable(response);
            return this;
        }        public TCPHealthCheckArgs build() {
            return new TCPHealthCheckArgs(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
