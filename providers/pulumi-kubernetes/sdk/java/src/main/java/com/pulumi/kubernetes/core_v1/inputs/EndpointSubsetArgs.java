// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.EndpointAddressArgs;
import com.pulumi.kubernetes.core_v1.inputs.EndpointPortArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 *   {
 *     Addresses: [{&#34;ip&#34;: &#34;10.10.1.1&#34;}, {&#34;ip&#34;: &#34;10.10.2.2&#34;}],
 *     Ports:     [{&#34;name&#34;: &#34;a&#34;, &#34;port&#34;: 8675}, {&#34;name&#34;: &#34;b&#34;, &#34;port&#34;: 309}]
 *   }
 * The resulting set of endpoints can be viewed as:
 *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 * 
 */
public final class EndpointSubsetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointSubsetArgs Empty = new EndpointSubsetArgs();

    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    @Import(name="addresses")
      private final @Nullable Output<List<EndpointAddressArgs>> addresses;

    public Output<List<EndpointAddressArgs>> addresses() {
        return this.addresses == null ? Codegen.empty() : this.addresses;
    }

    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    @Import(name="notReadyAddresses")
      private final @Nullable Output<List<EndpointAddressArgs>> notReadyAddresses;

    public Output<List<EndpointAddressArgs>> notReadyAddresses() {
        return this.notReadyAddresses == null ? Codegen.empty() : this.notReadyAddresses;
    }

    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<EndpointPortArgs>> ports;

    public Output<List<EndpointPortArgs>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public EndpointSubsetArgs(
        @Nullable Output<List<EndpointAddressArgs>> addresses,
        @Nullable Output<List<EndpointAddressArgs>> notReadyAddresses,
        @Nullable Output<List<EndpointPortArgs>> ports) {
        this.addresses = addresses;
        this.notReadyAddresses = notReadyAddresses;
        this.ports = ports;
    }

    private EndpointSubsetArgs() {
        this.addresses = Codegen.empty();
        this.notReadyAddresses = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSubsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EndpointAddressArgs>> addresses;
        private @Nullable Output<List<EndpointAddressArgs>> notReadyAddresses;
        private @Nullable Output<List<EndpointPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSubsetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.notReadyAddresses = defaults.notReadyAddresses;
    	      this.ports = defaults.ports;
        }

        public Builder addresses(@Nullable Output<List<EndpointAddressArgs>> addresses) {
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(@Nullable List<EndpointAddressArgs> addresses) {
            this.addresses = Codegen.ofNullable(addresses);
            return this;
        }
        public Builder addresses(EndpointAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder notReadyAddresses(@Nullable Output<List<EndpointAddressArgs>> notReadyAddresses) {
            this.notReadyAddresses = notReadyAddresses;
            return this;
        }
        public Builder notReadyAddresses(@Nullable List<EndpointAddressArgs> notReadyAddresses) {
            this.notReadyAddresses = Codegen.ofNullable(notReadyAddresses);
            return this;
        }
        public Builder notReadyAddresses(EndpointAddressArgs... notReadyAddresses) {
            return notReadyAddresses(List.of(notReadyAddresses));
        }
        public Builder ports(@Nullable Output<List<EndpointPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<EndpointPortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(EndpointPortArgs... ports) {
            return ports(List.of(ports));
        }        public EndpointSubsetArgs build() {
            return new EndpointSubsetArgs(addresses, notReadyAddresses, ports);
        }
    }
}
