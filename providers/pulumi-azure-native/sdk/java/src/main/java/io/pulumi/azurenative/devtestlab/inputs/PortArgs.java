// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.TransportProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a network port.
 * 
 */
public final class PortArgs extends io.pulumi.resources.ResourceArgs {

    public static final PortArgs Empty = new PortArgs();

    /**
     * Backend port of the target virtual machine.
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Output<Integer> backendPort;

    public Output<Integer> backendPort() {
        return this.backendPort == null ? Codegen.empty() : this.backendPort;
    }

    /**
     * Protocol type of the port.
     * 
     */
    @Import(name="transportProtocol")
      private final @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

    public Output<Either<String,TransportProtocol>> transportProtocol() {
        return this.transportProtocol == null ? Codegen.empty() : this.transportProtocol;
    }

    public PortArgs(
        @Nullable Output<Integer> backendPort,
        @Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
        this.backendPort = backendPort;
        this.transportProtocol = transportProtocol;
    }

    private PortArgs() {
        this.backendPort = Codegen.empty();
        this.transportProtocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> backendPort;
        private @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(PortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = Codegen.ofNullable(backendPort);
            return this;
        }
        public Builder transportProtocol(@Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }
        public Builder transportProtocol(@Nullable Either<String,TransportProtocol> transportProtocol) {
            this.transportProtocol = Codegen.ofNullable(transportProtocol);
            return this;
        }        public PortArgs build() {
            return new PortArgs(backendPort, transportProtocol);
        }
    }
}
