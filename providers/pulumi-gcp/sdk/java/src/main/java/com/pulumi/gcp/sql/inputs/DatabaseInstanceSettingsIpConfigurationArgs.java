// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsIpConfigurationArgs Empty = new DatabaseInstanceSettingsIpConfigurationArgs();

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://datatracker.ietf.org/doc/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    @Import(name="allocatedIpRange")
      private final @Nullable Output<String> allocatedIpRange;

    public Output<String> allocatedIpRange() {
        return this.allocatedIpRange == null ? Codegen.empty() : this.allocatedIpRange;
    }

    @Import(name="authorizedNetworks")
      private final @Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks;

    public Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks() {
        return this.authorizedNetworks == null ? Codegen.empty() : this.authorizedNetworks;
    }

    /**
     * Whether this Cloud SQL instance should be assigned
     * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
     * `private_network` must be configured.
     * 
     */
    @Import(name="ipv4Enabled")
      private final @Nullable Output<Boolean> ipv4Enabled;

    public Output<Boolean> ipv4Enabled() {
        return this.ipv4Enabled == null ? Codegen.empty() : this.ipv4Enabled;
    }

    /**
     * The VPC network from which the Cloud SQL
     * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * Specifying a network enables private IP.
     * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @Import(name="privateNetwork")
      private final @Nullable Output<String> privateNetwork;

    public Output<String> privateNetwork() {
        return this.privateNetwork == null ? Codegen.empty() : this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    @Import(name="requireSsl")
      private final @Nullable Output<Boolean> requireSsl;

    public Output<Boolean> requireSsl() {
        return this.requireSsl == null ? Codegen.empty() : this.requireSsl;
    }

    public DatabaseInstanceSettingsIpConfigurationArgs(
        @Nullable Output<String> allocatedIpRange,
        @Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks,
        @Nullable Output<Boolean> ipv4Enabled,
        @Nullable Output<String> privateNetwork,
        @Nullable Output<Boolean> requireSsl) {
        this.allocatedIpRange = allocatedIpRange;
        this.authorizedNetworks = authorizedNetworks;
        this.ipv4Enabled = ipv4Enabled;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    private DatabaseInstanceSettingsIpConfigurationArgs() {
        this.allocatedIpRange = Codegen.empty();
        this.authorizedNetworks = Codegen.empty();
        this.ipv4Enabled = Codegen.empty();
        this.privateNetwork = Codegen.empty();
        this.requireSsl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocatedIpRange;
        private @Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks;
        private @Nullable Output<Boolean> ipv4Enabled;
        private @Nullable Output<String> privateNetwork;
        private @Nullable Output<Boolean> requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsIpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder allocatedIpRange(@Nullable Output<String> allocatedIpRange) {
            this.allocatedIpRange = allocatedIpRange;
            return this;
        }
        public Builder allocatedIpRange(@Nullable String allocatedIpRange) {
            this.allocatedIpRange = Codegen.ofNullable(allocatedIpRange);
            return this;
        }
        public Builder authorizedNetworks(@Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }
        public Builder authorizedNetworks(@Nullable List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs> authorizedNetworks) {
            this.authorizedNetworks = Codegen.ofNullable(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder ipv4Enabled(@Nullable Output<Boolean> ipv4Enabled) {
            this.ipv4Enabled = ipv4Enabled;
            return this;
        }
        public Builder ipv4Enabled(@Nullable Boolean ipv4Enabled) {
            this.ipv4Enabled = Codegen.ofNullable(ipv4Enabled);
            return this;
        }
        public Builder privateNetwork(@Nullable Output<String> privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }
        public Builder privateNetwork(@Nullable String privateNetwork) {
            this.privateNetwork = Codegen.ofNullable(privateNetwork);
            return this;
        }
        public Builder requireSsl(@Nullable Output<Boolean> requireSsl) {
            this.requireSsl = requireSsl;
            return this;
        }
        public Builder requireSsl(@Nullable Boolean requireSsl) {
            this.requireSsl = Codegen.ofNullable(requireSsl);
            return this;
        }        public DatabaseInstanceSettingsIpConfigurationArgs build() {
            return new DatabaseInstanceSettingsIpConfigurationArgs(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
