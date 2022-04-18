// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.GRPCHealthCheckPortSpecification;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GRPCHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final GRPCHealthCheckArgs Empty = new GRPCHealthCheckArgs();

    /**
     * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
     * 
     */
    @Import(name="grpcServiceName")
      private final @Nullable Output<String> grpcServiceName;

    public Output<String> grpcServiceName() {
        return this.grpcServiceName == null ? Codegen.empty() : this.grpcServiceName;
    }

    /**
     * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> portName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification")
      private final @Nullable Output<GRPCHealthCheckPortSpecification> portSpecification;

    public Output<GRPCHealthCheckPortSpecification> portSpecification() {
        return this.portSpecification == null ? Codegen.empty() : this.portSpecification;
    }

    public GRPCHealthCheckArgs(
        @Nullable Output<String> grpcServiceName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> portName,
        @Nullable Output<GRPCHealthCheckPortSpecification> portSpecification) {
        this.grpcServiceName = grpcServiceName;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
    }

    private GRPCHealthCheckArgs() {
        this.grpcServiceName = Codegen.empty();
        this.port = Codegen.empty();
        this.portName = Codegen.empty();
        this.portSpecification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> grpcServiceName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> portName;
        private @Nullable Output<GRPCHealthCheckPortSpecification> portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(GRPCHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder grpcServiceName(@Nullable Output<String> grpcServiceName) {
            this.grpcServiceName = grpcServiceName;
            return this;
        }
        public Builder grpcServiceName(@Nullable String grpcServiceName) {
            this.grpcServiceName = Codegen.ofNullable(grpcServiceName);
            return this;
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
        public Builder portSpecification(@Nullable Output<GRPCHealthCheckPortSpecification> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public Builder portSpecification(@Nullable GRPCHealthCheckPortSpecification portSpecification) {
            this.portSpecification = Codegen.ofNullable(portSpecification);
            return this;
        }        public GRPCHealthCheckArgs build() {
            return new GRPCHealthCheckArgs(grpcServiceName, port, portName, portSpecification);
        }
    }
}
