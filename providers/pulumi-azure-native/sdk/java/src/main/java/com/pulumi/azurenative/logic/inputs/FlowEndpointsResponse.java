// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.IpAddressResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The flow endpoints configuration.
 * 
 */
public final class FlowEndpointsResponse extends com.pulumi.resources.InvokeArgs {

    public static final FlowEndpointsResponse Empty = new FlowEndpointsResponse();

    /**
     * The access endpoint ip address.
     * 
     */
    @Import(name="accessEndpointIpAddresses")
      private final @Nullable List<IpAddressResponse> accessEndpointIpAddresses;

    public List<IpAddressResponse> accessEndpointIpAddresses() {
        return this.accessEndpointIpAddresses == null ? List.of() : this.accessEndpointIpAddresses;
    }

    /**
     * The outgoing ip address.
     * 
     */
    @Import(name="outgoingIpAddresses")
      private final @Nullable List<IpAddressResponse> outgoingIpAddresses;

    public List<IpAddressResponse> outgoingIpAddresses() {
        return this.outgoingIpAddresses == null ? List.of() : this.outgoingIpAddresses;
    }

    public FlowEndpointsResponse(
        @Nullable List<IpAddressResponse> accessEndpointIpAddresses,
        @Nullable List<IpAddressResponse> outgoingIpAddresses) {
        this.accessEndpointIpAddresses = accessEndpointIpAddresses;
        this.outgoingIpAddresses = outgoingIpAddresses;
    }

    private FlowEndpointsResponse() {
        this.accessEndpointIpAddresses = List.of();
        this.outgoingIpAddresses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpAddressResponse> accessEndpointIpAddresses;
        private @Nullable List<IpAddressResponse> outgoingIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpointIpAddresses = defaults.accessEndpointIpAddresses;
    	      this.outgoingIpAddresses = defaults.outgoingIpAddresses;
        }

        public Builder accessEndpointIpAddresses(@Nullable List<IpAddressResponse> accessEndpointIpAddresses) {
            this.accessEndpointIpAddresses = accessEndpointIpAddresses;
            return this;
        }
        public Builder accessEndpointIpAddresses(IpAddressResponse... accessEndpointIpAddresses) {
            return accessEndpointIpAddresses(List.of(accessEndpointIpAddresses));
        }
        public Builder outgoingIpAddresses(@Nullable List<IpAddressResponse> outgoingIpAddresses) {
            this.outgoingIpAddresses = outgoingIpAddresses;
            return this;
        }
        public Builder outgoingIpAddresses(IpAddressResponse... outgoingIpAddresses) {
            return outgoingIpAddresses(List.of(outgoingIpAddresses));
        }        public FlowEndpointsResponse build() {
            return new FlowEndpointsResponse(accessEndpointIpAddresses, outgoingIpAddresses);
        }
    }
}
