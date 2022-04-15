// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule for NAT - exposing a VM's port (backendPort) on the public IP address using a load balancer.
 * 
 */
public final class InboundNatRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final InboundNatRuleResponse Empty = new InboundNatRuleResponse();

    /**
     * The port to which the external traffic will be redirected.
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Integer backendPort;

    public Optional<Integer> backendPort() {
        return this.backendPort == null ? Optional.empty() : Optional.ofNullable(this.backendPort);
    }

    /**
     * The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    @Import(name="frontendPort")
      private final @Nullable Integer frontendPort;

    public Optional<Integer> frontendPort() {
        return this.frontendPort == null ? Optional.empty() : Optional.ofNullable(this.frontendPort);
    }

    /**
     * The transport protocol for the endpoint.
     * 
     */
    @Import(name="transportProtocol")
      private final @Nullable String transportProtocol;

    public Optional<String> transportProtocol() {
        return this.transportProtocol == null ? Optional.empty() : Optional.ofNullable(this.transportProtocol);
    }

    public InboundNatRuleResponse(
        @Nullable Integer backendPort,
        @Nullable Integer frontendPort,
        @Nullable String transportProtocol) {
        this.backendPort = backendPort;
        this.frontendPort = frontendPort;
        this.transportProtocol = transportProtocol;
    }

    private InboundNatRuleResponse() {
        this.backendPort = null;
        this.frontendPort = null;
        this.transportProtocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backendPort;
        private @Nullable Integer frontendPort;
        private @Nullable String transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Builder frontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Builder transportProtocol(@Nullable String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }        public InboundNatRuleResponse build() {
            return new InboundNatRuleResponse(backendPort, frontendPort, transportProtocol);
        }
    }
}
