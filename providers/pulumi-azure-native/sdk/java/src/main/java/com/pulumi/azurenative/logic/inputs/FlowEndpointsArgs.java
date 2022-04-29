// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.IpAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The flow endpoints configuration.
 * 
 */
public final class FlowEndpointsArgs extends ResourceArgs {

    public static final FlowEndpointsArgs Empty = new FlowEndpointsArgs();

    /**
     * The access endpoint ip address.
     * 
     */
    @Import(name="accessEndpointIpAddresses")
    private @Nullable Output<List<IpAddressArgs>> accessEndpointIpAddresses;

    /**
     * @return The access endpoint ip address.
     * 
     */
    public Optional<Output<List<IpAddressArgs>>> accessEndpointIpAddresses() {
        return Optional.ofNullable(this.accessEndpointIpAddresses);
    }

    /**
     * The outgoing ip address.
     * 
     */
    @Import(name="outgoingIpAddresses")
    private @Nullable Output<List<IpAddressArgs>> outgoingIpAddresses;

    /**
     * @return The outgoing ip address.
     * 
     */
    public Optional<Output<List<IpAddressArgs>>> outgoingIpAddresses() {
        return Optional.ofNullable(this.outgoingIpAddresses);
    }

    private FlowEndpointsArgs() {}

    private FlowEndpointsArgs(FlowEndpointsArgs $) {
        this.accessEndpointIpAddresses = $.accessEndpointIpAddresses;
        this.outgoingIpAddresses = $.outgoingIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowEndpointsArgs $;

        public Builder() {
            $ = new FlowEndpointsArgs();
        }

        public Builder(FlowEndpointsArgs defaults) {
            $ = new FlowEndpointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessEndpointIpAddresses The access endpoint ip address.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpointIpAddresses(@Nullable Output<List<IpAddressArgs>> accessEndpointIpAddresses) {
            $.accessEndpointIpAddresses = accessEndpointIpAddresses;
            return this;
        }

        /**
         * @param accessEndpointIpAddresses The access endpoint ip address.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpointIpAddresses(List<IpAddressArgs> accessEndpointIpAddresses) {
            return accessEndpointIpAddresses(Output.of(accessEndpointIpAddresses));
        }

        /**
         * @param accessEndpointIpAddresses The access endpoint ip address.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpointIpAddresses(IpAddressArgs... accessEndpointIpAddresses) {
            return accessEndpointIpAddresses(List.of(accessEndpointIpAddresses));
        }

        /**
         * @param outgoingIpAddresses The outgoing ip address.
         * 
         * @return builder
         * 
         */
        public Builder outgoingIpAddresses(@Nullable Output<List<IpAddressArgs>> outgoingIpAddresses) {
            $.outgoingIpAddresses = outgoingIpAddresses;
            return this;
        }

        /**
         * @param outgoingIpAddresses The outgoing ip address.
         * 
         * @return builder
         * 
         */
        public Builder outgoingIpAddresses(List<IpAddressArgs> outgoingIpAddresses) {
            return outgoingIpAddresses(Output.of(outgoingIpAddresses));
        }

        /**
         * @param outgoingIpAddresses The outgoing ip address.
         * 
         * @return builder
         * 
         */
        public Builder outgoingIpAddresses(IpAddressArgs... outgoingIpAddresses) {
            return outgoingIpAddresses(List.of(outgoingIpAddresses));
        }

        public FlowEndpointsArgs build() {
            return $;
        }
    }

}
