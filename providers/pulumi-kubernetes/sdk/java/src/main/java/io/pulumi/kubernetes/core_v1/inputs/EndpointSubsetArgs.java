// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.EndpointAddressArgs;
import io.pulumi.kubernetes.core_v1.inputs.EndpointPortArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 *   {
 *     Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 *     Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 *   }
 * The resulting set of endpoints can be viewed as:
 *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 * 
 */
public final class EndpointSubsetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointSubsetArgs Empty = new EndpointSubsetArgs();

    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    @InputImport(name="addresses")
    private final @Nullable Input<List<EndpointAddressArgs>> addresses;

    public Input<List<EndpointAddressArgs>> getAddresses() {
        return this.addresses == null ? Input.empty() : this.addresses;
    }

    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    @InputImport(name="notReadyAddresses")
    private final @Nullable Input<List<EndpointAddressArgs>> notReadyAddresses;

    public Input<List<EndpointAddressArgs>> getNotReadyAddresses() {
        return this.notReadyAddresses == null ? Input.empty() : this.notReadyAddresses;
    }

    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<EndpointPortArgs>> ports;

    public Input<List<EndpointPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    public EndpointSubsetArgs(
        @Nullable Input<List<EndpointAddressArgs>> addresses,
        @Nullable Input<List<EndpointAddressArgs>> notReadyAddresses,
        @Nullable Input<List<EndpointPortArgs>> ports) {
        this.addresses = addresses;
        this.notReadyAddresses = notReadyAddresses;
        this.ports = ports;
    }

    private EndpointSubsetArgs() {
        this.addresses = Input.empty();
        this.notReadyAddresses = Input.empty();
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSubsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EndpointAddressArgs>> addresses;
        private @Nullable Input<List<EndpointAddressArgs>> notReadyAddresses;
        private @Nullable Input<List<EndpointPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSubsetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.notReadyAddresses = defaults.notReadyAddresses;
    	      this.ports = defaults.ports;
        }

        public Builder setAddresses(@Nullable Input<List<EndpointAddressArgs>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setAddresses(@Nullable List<EndpointAddressArgs> addresses) {
            this.addresses = Input.ofNullable(addresses);
            return this;
        }

        public Builder setNotReadyAddresses(@Nullable Input<List<EndpointAddressArgs>> notReadyAddresses) {
            this.notReadyAddresses = notReadyAddresses;
            return this;
        }

        public Builder setNotReadyAddresses(@Nullable List<EndpointAddressArgs> notReadyAddresses) {
            this.notReadyAddresses = Input.ofNullable(notReadyAddresses);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<EndpointPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<EndpointPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public EndpointSubsetArgs build() {
            return new EndpointSubsetArgs(addresses, notReadyAddresses, ports);
        }
    }
}
