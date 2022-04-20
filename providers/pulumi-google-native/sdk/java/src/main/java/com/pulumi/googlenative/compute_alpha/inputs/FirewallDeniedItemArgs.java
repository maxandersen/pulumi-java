// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallDeniedItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallDeniedItemArgs Empty = new FirewallDeniedItemArgs();

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * 
     */
    @Import(name="ipProtocol")
      private final @Nullable Output<String> ipProtocol;

    public Output<String> ipProtocol() {
        return this.ipProtocol == null ? Codegen.empty() : this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;].
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<String>> ports;

    public Output<List<String>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public FirewallDeniedItemArgs(
        @Nullable Output<String> ipProtocol,
        @Nullable Output<List<String>> ports) {
        this.ipProtocol = ipProtocol;
        this.ports = ports;
    }

    private FirewallDeniedItemArgs() {
        this.ipProtocol = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDeniedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipProtocol;
        private @Nullable Output<List<String>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallDeniedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder ipProtocol(@Nullable Output<String> ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public Builder ipProtocol(@Nullable String ipProtocol) {
            this.ipProtocol = Codegen.ofNullable(ipProtocol);
            return this;
        }
        public Builder ports(@Nullable Output<List<String>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<String> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }        public FirewallDeniedItemArgs build() {
            return new FirewallDeniedItemArgs(ipProtocol, ports);
        }
    }
}
