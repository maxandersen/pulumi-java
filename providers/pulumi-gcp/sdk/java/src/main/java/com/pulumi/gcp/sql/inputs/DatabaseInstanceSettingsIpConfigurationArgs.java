// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsIpConfigurationArgs Empty = new DatabaseInstanceSettingsIpConfigurationArgs();

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the cloned instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    @Import(name="allocatedIpRange")
    private @Nullable Output<String> allocatedIpRange;

    /**
     * @return The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the cloned instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    public Optional<Output<String>> allocatedIpRange() {
        return Optional.ofNullable(this.allocatedIpRange);
    }

    @Import(name="authorizedNetworks")
    private @Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks;

    public Optional<Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>>> authorizedNetworks() {
        return Optional.ofNullable(this.authorizedNetworks);
    }

    /**
     * Whether this Cloud SQL instance should be assigned
     * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
     * `private_network` must be configured.
     * 
     */
    @Import(name="ipv4Enabled")
    private @Nullable Output<Boolean> ipv4Enabled;

    /**
     * @return Whether this Cloud SQL instance should be assigned
     * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
     * `private_network` must be configured.
     * 
     */
    public Optional<Output<Boolean>> ipv4Enabled() {
        return Optional.ofNullable(this.ipv4Enabled);
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
    private @Nullable Output<String> privateNetwork;

    /**
     * @return The VPC network from which the Cloud SQL
     * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * Specifying a network enables private IP.
     * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    public Optional<Output<String>> privateNetwork() {
        return Optional.ofNullable(this.privateNetwork);
    }

    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    @Import(name="requireSsl")
    private @Nullable Output<Boolean> requireSsl;

    /**
     * @return Whether SSL connections over IP are enforced or not.
     * 
     */
    public Optional<Output<Boolean>> requireSsl() {
        return Optional.ofNullable(this.requireSsl);
    }

    private DatabaseInstanceSettingsIpConfigurationArgs() {}

    private DatabaseInstanceSettingsIpConfigurationArgs(DatabaseInstanceSettingsIpConfigurationArgs $) {
        this.allocatedIpRange = $.allocatedIpRange;
        this.authorizedNetworks = $.authorizedNetworks;
        this.ipv4Enabled = $.ipv4Enabled;
        this.privateNetwork = $.privateNetwork;
        this.requireSsl = $.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsIpConfigurationArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsIpConfigurationArgs();
        }

        public Builder(DatabaseInstanceSettingsIpConfigurationArgs defaults) {
            $ = new DatabaseInstanceSettingsIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedIpRange The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the cloned instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
         * 
         * @return builder
         * 
         */
        public Builder allocatedIpRange(@Nullable Output<String> allocatedIpRange) {
            $.allocatedIpRange = allocatedIpRange;
            return this;
        }

        /**
         * @param allocatedIpRange The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the cloned instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
         * 
         * @return builder
         * 
         */
        public Builder allocatedIpRange(String allocatedIpRange) {
            return allocatedIpRange(Output.of(allocatedIpRange));
        }

        public Builder authorizedNetworks(@Nullable Output<List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs>> authorizedNetworks) {
            $.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder authorizedNetworks(List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs> authorizedNetworks) {
            return authorizedNetworks(Output.of(authorizedNetworks));
        }

        public Builder authorizedNetworks(DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }

        /**
         * @param ipv4Enabled Whether this Cloud SQL instance should be assigned
         * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
         * `private_network` must be configured.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Enabled(@Nullable Output<Boolean> ipv4Enabled) {
            $.ipv4Enabled = ipv4Enabled;
            return this;
        }

        /**
         * @param ipv4Enabled Whether this Cloud SQL instance should be assigned
         * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
         * `private_network` must be configured.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Enabled(Boolean ipv4Enabled) {
            return ipv4Enabled(Output.of(ipv4Enabled));
        }

        /**
         * @param privateNetwork The VPC network from which the Cloud SQL
         * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
         * Specifying a network enables private IP.
         * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
         * This setting can be updated, but it cannot be removed after it is set.
         * 
         * @return builder
         * 
         */
        public Builder privateNetwork(@Nullable Output<String> privateNetwork) {
            $.privateNetwork = privateNetwork;
            return this;
        }

        /**
         * @param privateNetwork The VPC network from which the Cloud SQL
         * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
         * Specifying a network enables private IP.
         * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
         * This setting can be updated, but it cannot be removed after it is set.
         * 
         * @return builder
         * 
         */
        public Builder privateNetwork(String privateNetwork) {
            return privateNetwork(Output.of(privateNetwork));
        }

        /**
         * @param requireSsl Whether SSL connections over IP are enforced or not.
         * 
         * @return builder
         * 
         */
        public Builder requireSsl(@Nullable Output<Boolean> requireSsl) {
            $.requireSsl = requireSsl;
            return this;
        }

        /**
         * @param requireSsl Whether SSL connections over IP are enforced or not.
         * 
         * @return builder
         * 
         */
        public Builder requireSsl(Boolean requireSsl) {
            return requireSsl(Output.of(requireSsl));
        }

        public DatabaseInstanceSettingsIpConfigurationArgs build() {
            return $;
        }
    }

}
