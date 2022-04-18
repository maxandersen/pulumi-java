// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DNS Proxy Settings in Firewall Policy.
 * 
 */
public final class DnsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsSettingsArgs Empty = new DnsSettingsArgs();

    /**
     * Enable DNS Proxy on Firewalls attached to the Firewall Policy.
     * 
     */
    @Import(name="enableProxy")
      private final @Nullable Output<Boolean> enableProxy;

    public Output<Boolean> enableProxy() {
        return this.enableProxy == null ? Codegen.empty() : this.enableProxy;
    }

    /**
     * FQDNs in Network Rules are supported when set to true.
     * 
     */
    @Import(name="requireProxyForNetworkRules")
      private final @Nullable Output<Boolean> requireProxyForNetworkRules;

    public Output<Boolean> requireProxyForNetworkRules() {
        return this.requireProxyForNetworkRules == null ? Codegen.empty() : this.requireProxyForNetworkRules;
    }

    /**
     * List of Custom DNS Servers.
     * 
     */
    @Import(name="servers")
      private final @Nullable Output<List<String>> servers;

    public Output<List<String>> servers() {
        return this.servers == null ? Codegen.empty() : this.servers;
    }

    public DnsSettingsArgs(
        @Nullable Output<Boolean> enableProxy,
        @Nullable Output<Boolean> requireProxyForNetworkRules,
        @Nullable Output<List<String>> servers) {
        this.enableProxy = enableProxy;
        this.requireProxyForNetworkRules = requireProxyForNetworkRules;
        this.servers = servers;
    }

    private DnsSettingsArgs() {
        this.enableProxy = Codegen.empty();
        this.requireProxyForNetworkRules = Codegen.empty();
        this.servers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableProxy;
        private @Nullable Output<Boolean> requireProxyForNetworkRules;
        private @Nullable Output<List<String>> servers;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableProxy = defaults.enableProxy;
    	      this.requireProxyForNetworkRules = defaults.requireProxyForNetworkRules;
    	      this.servers = defaults.servers;
        }

        public Builder enableProxy(@Nullable Output<Boolean> enableProxy) {
            this.enableProxy = enableProxy;
            return this;
        }
        public Builder enableProxy(@Nullable Boolean enableProxy) {
            this.enableProxy = Codegen.ofNullable(enableProxy);
            return this;
        }
        public Builder requireProxyForNetworkRules(@Nullable Output<Boolean> requireProxyForNetworkRules) {
            this.requireProxyForNetworkRules = requireProxyForNetworkRules;
            return this;
        }
        public Builder requireProxyForNetworkRules(@Nullable Boolean requireProxyForNetworkRules) {
            this.requireProxyForNetworkRules = Codegen.ofNullable(requireProxyForNetworkRules);
            return this;
        }
        public Builder servers(@Nullable Output<List<String>> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(@Nullable List<String> servers) {
            this.servers = Codegen.ofNullable(servers);
            return this;
        }
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }        public DnsSettingsArgs build() {
            return new DnsSettingsArgs(enableProxy, requireProxyForNetworkRules, servers);
        }
    }
}
