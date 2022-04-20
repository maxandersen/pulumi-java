// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    @Import(name="peering")
      private final @Nullable Output<String> peering;

    public Output<String> peering() {
        return this.peering == null ? Codegen.empty() : this.peering;
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @Import(name="reservedPeeringRanges")
      private final @Nullable Output<List<String>> reservedPeeringRanges;

    public Output<List<String>> reservedPeeringRanges() {
        return this.reservedPeeringRanges == null ? Codegen.empty() : this.reservedPeeringRanges;
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * &#39;servicenetworking.googleapis.com&#39;.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public ConnectionState(
        @Nullable Output<String> network,
        @Nullable Output<String> peering,
        @Nullable Output<List<String>> reservedPeeringRanges,
        @Nullable Output<String> service) {
        this.network = network;
        this.peering = peering;
        this.reservedPeeringRanges = reservedPeeringRanges;
        this.service = service;
    }

    private ConnectionState() {
        this.network = Codegen.empty();
        this.peering = Codegen.empty();
        this.reservedPeeringRanges = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> network;
        private @Nullable Output<String> peering;
        private @Nullable Output<List<String>> reservedPeeringRanges;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.peering = defaults.peering;
    	      this.reservedPeeringRanges = defaults.reservedPeeringRanges;
    	      this.service = defaults.service;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder peering(@Nullable Output<String> peering) {
            this.peering = peering;
            return this;
        }
        public Builder peering(@Nullable String peering) {
            this.peering = Codegen.ofNullable(peering);
            return this;
        }
        public Builder reservedPeeringRanges(@Nullable Output<List<String>> reservedPeeringRanges) {
            this.reservedPeeringRanges = reservedPeeringRanges;
            return this;
        }
        public Builder reservedPeeringRanges(@Nullable List<String> reservedPeeringRanges) {
            this.reservedPeeringRanges = Codegen.ofNullable(reservedPeeringRanges);
            return this;
        }
        public Builder reservedPeeringRanges(String... reservedPeeringRanges) {
            return reservedPeeringRanges(List.of(reservedPeeringRanges));
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public ConnectionState build() {
            return new ConnectionState(network, peering, reservedPeeringRanges, service);
        }
    }
}
