// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @Import(name="network", required=true)
      private final Output<String> network;

    public Output<String> network() {
        return this.network;
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @Import(name="reservedPeeringRanges", required=true)
      private final Output<List<String>> reservedPeeringRanges;

    public Output<List<String>> reservedPeeringRanges() {
        return this.reservedPeeringRanges;
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    public ConnectionArgs(
        Output<String> network,
        Output<List<String>> reservedPeeringRanges,
        Output<String> service) {
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.reservedPeeringRanges = Objects.requireNonNull(reservedPeeringRanges, "expected parameter 'reservedPeeringRanges' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private ConnectionArgs() {
        this.network = Codegen.empty();
        this.reservedPeeringRanges = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> network;
        private Output<List<String>> reservedPeeringRanges;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.reservedPeeringRanges = defaults.reservedPeeringRanges;
    	      this.service = defaults.service;
        }

        public Builder network(Output<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder network(String network) {
            this.network = Output.of(Objects.requireNonNull(network));
            return this;
        }
        public Builder reservedPeeringRanges(Output<List<String>> reservedPeeringRanges) {
            this.reservedPeeringRanges = Objects.requireNonNull(reservedPeeringRanges);
            return this;
        }
        public Builder reservedPeeringRanges(List<String> reservedPeeringRanges) {
            this.reservedPeeringRanges = Output.of(Objects.requireNonNull(reservedPeeringRanges));
            return this;
        }
        public Builder reservedPeeringRanges(String... reservedPeeringRanges) {
            return reservedPeeringRanges(List.of(reservedPeeringRanges));
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(network, reservedPeeringRanges, service);
        }
    }
}
