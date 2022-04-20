// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FirewallAllowedItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallAllowedItemResponse Empty = new FirewallAllowedItemResponse();

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * 
     */
    @Import(name="ipProtocol", required=true)
      private final String ipProtocol;

    public String ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;].
     * 
     */
    @Import(name="ports", required=true)
      private final List<String> ports;

    public List<String> ports() {
        return this.ports;
    }

    public FirewallAllowedItemResponse(
        String ipProtocol,
        List<String> ports) {
        this.ipProtocol = Objects.requireNonNull(ipProtocol, "expected parameter 'ipProtocol' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private FirewallAllowedItemResponse() {
        this.ipProtocol = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallAllowedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipProtocol;
        private List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallAllowedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        public Builder ports(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }        public FirewallAllowedItemResponse build() {
            return new FirewallAllowedItemResponse(ipProtocol, ports);
        }
    }
}
