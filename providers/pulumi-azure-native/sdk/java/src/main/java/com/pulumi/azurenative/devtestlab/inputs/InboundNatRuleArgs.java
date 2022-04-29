// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.TransportProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule for NAT - exposing a VM&#39;s port (backendPort) on the public IP address using a load balancer.
 * 
 */
public final class InboundNatRuleArgs extends ResourceArgs {

    public static final InboundNatRuleArgs Empty = new InboundNatRuleArgs();

    /**
     * The port to which the external traffic will be redirected.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Output<Integer> backendPort;

    /**
     * @return The port to which the external traffic will be redirected.
     * 
     */
    public Optional<Output<Integer>> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Output<Integer> frontendPort;

    /**
     * @return The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    public Optional<Output<Integer>> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }

    /**
     * The transport protocol for the endpoint.
     * 
     */
    @Import(name="transportProtocol")
    private @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

    /**
     * @return The transport protocol for the endpoint.
     * 
     */
    public Optional<Output<Either<String,TransportProtocol>>> transportProtocol() {
        return Optional.ofNullable(this.transportProtocol);
    }

    private InboundNatRuleArgs() {}

    private InboundNatRuleArgs(InboundNatRuleArgs $) {
        this.backendPort = $.backendPort;
        this.frontendPort = $.frontendPort;
        this.transportProtocol = $.transportProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundNatRuleArgs $;

        public Builder() {
            $ = new InboundNatRuleArgs();
        }

        public Builder(InboundNatRuleArgs defaults) {
            $ = new InboundNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port to which the external traffic will be redirected.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port to which the external traffic will be redirected.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param frontendPort The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(@Nullable Output<Integer> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param frontendPort The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Integer frontendPort) {
            return frontendPort(Output.of(frontendPort));
        }

        /**
         * @param transportProtocol The transport protocol for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder transportProtocol(@Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
            $.transportProtocol = transportProtocol;
            return this;
        }

        /**
         * @param transportProtocol The transport protocol for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder transportProtocol(Either<String,TransportProtocol> transportProtocol) {
            return transportProtocol(Output.of(transportProtocol));
        }

        /**
         * @param transportProtocol The transport protocol for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder transportProtocol(String transportProtocol) {
            return transportProtocol(Either.ofLeft(transportProtocol));
        }

        /**
         * @param transportProtocol The transport protocol for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder transportProtocol(TransportProtocol transportProtocol) {
            return transportProtocol(Either.ofRight(transportProtocol));
        }

        public InboundNatRuleArgs build() {
            return $;
        }
    }

}
